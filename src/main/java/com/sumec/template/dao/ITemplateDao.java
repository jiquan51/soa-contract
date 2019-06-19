package com.sumec.template.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sumec.api.pay.bean.PayApplyBean;
import com.sumec.template.bean.ChatBean;

public interface ITemplateDao {

	@Select({
        "select" + 
        " SUM(NVL(T_EXP_BC.P_QUANT,0)) AS QUANT_PURCED" + 
        "  from T_EXP_SC,T_EXP_BC,T_TR_CONTRACT_REL rel" + 
        "  where rel.REL_TYPE (+)= 'MODEL'" + 
        "  and rel.TOB_TYPE_A (+)= 'S_ORDER'" + 
        "  and rel.TOB_TYPE_B (+)= 'P_ORDER'" + 
        "  and rel.TOB_ID_A(+) = T_EXP_SC.SC_ID" + 
        "  and rel.TOB_ID_B = T_EXP_BC.BC_ID(+)" + 
        "  and T_EXP_SC.SC_ID = #{scId}" + 
        " GROUP BY T_EXP_SC.SC_ID," + 
        "     T_EXP_SC.ACC_NO," + 
        "       T_EXP_SC.DEP_ORG_ID," + 
        "       T_EXP_SC.OCU_ORG_ID," + 
        "       T_EXP_SC.CELL_ID," + 
        "       T_EXP_SC.USER_ID," + 
        "     T_EXP_SC.SIGN_DATE," + 
        "       T_EXP_SC.C_NO," + 
        "       T_EXP_SC.CST_NAME," + 
        "       T_EXP_SC.BIZ_MODE," + 
        "       T_EXP_SC.CON_NAME," + 
        "       T_EXP_SC.PRICING_WAY," + 
        "       T_EXP_SC.P_QUANT," + 
        "       T_EXP_SC.PRICE_TERM," + 
        "       T_EXP_SC.DELIVERY_PLACE," + 
        "     T_EXP_SC.SEND_TERM," + 
        "     T_EXP_SC.PR_FEE_TYPE," + 
        "       T_EXP_SC.CON_PERIOD_S_TYPE," + 
        "       T_EXP_SC.CON_PERIOD," + 
        "       T_EXP_SC.TRANS_RESP," + 
        "       T_EXP_SC.TRANS_INSU_RESP," + 
        "       T_EXP_SC.TRANS_CORP_NAME," + 
        "       T_EXP_BC.WH_NAME," + 
        "       T_EXP_SC.PAY_TERM," + 
        "       T_EXP_SC.BAIL_RATE," + 
        "     T_EXP_SC.PROFIT_SCHEME_DESC," + 
        "       T_EXP_SC.IS_OA"
    })
    BigDecimal selectQUANT_PURCED(BigDecimal scId);

	@Select({
		"SELECT " + 
		"     (SELECT SUM(MICHAEL.T_EXP_SC.P_QUANT) FROM MICHAEL.T_EXP_SC,MICHAEL.T_EXP_BC,MICHAEL.T_TR_CONTRACT_REL rel " + 
		"     WHERE MICHAEL.T_EXP_BC.BC_ID = #{bcId}" + 
		"     and  MICHAEL.T_EXP_BC.BC_ID = rel.Tob_Id_b(+)" + 
		"   and  MICHAEL.T_EXP_SC.SC_ID(+) = rel.Tob_Id_a" + 
		"   and 'S_ORDER' = Rel.Tob_Type_A" + 
		"   and 'P_ORDER' = Rel.Tob_Type_B" + 
		"   and 'MODEL' = Rel.Rel_Type) AS QUANT_SOLD" + 
		"    FROM MICHAEL.T_EXP_BC" + 
		"   WHERE MICHAEL.T_EXP_BC.BC_ID = #{bcId}"
	})
	BigDecimal selectQUANT_SOLD(BigDecimal bcId);

	/////计算老系统数据----供应商在手
	@Select({
		"SELECT NVL(SUM(NVL(d.total_quant, 0)), 0) as ld_total_quant_old, NVL(SUM(NVL(d.wdh_quant, 0)), 0) as ld_unsend_quant_old, NVL(SUM(NVL(d.wdh_quant, 0) * NVL(d.total_price, 0)), 0) / 10000 as ld_unsend_amt_old" + 
		"  FROM t_nm_project p, t_nm_dynamic d " + 
		" WHERE p.pro_id = d.pro_id AND p.fac_no = (SELECT cst_no FROM michael.t_factory WHERE int_id = (SELECT fct_id  FROM michael.t_exp_bc WHERE bc_id = #{bcId})) AND NVL(p.gd_tag, 'N') = 'N' AND NVL(p.undo, '0') = '0' AND TO_CHAR(d.end_day, 'yyyy-mm-dd') > TO_CHAR(SYSDATE, 'yyyy-mm-dd') AND (d.claim_amt + d.yfk_amt) < d.payed_amt" 
	})
	Map<String,BigDecimal> selectQuantOld(BigDecimal bcId);

	@Select({
		"SELECT COUNT(DISTINCT p.cst_no)  as ll_cst_count_old FROM t_nm_project p, t_nm_dynamic d" + 
		" WHERE p.pro_id = d.pro_id AND p.fac_no = (SELECT cst_no FROM michael.t_factory WHERE int_id = (SELECT fct_id  FROM michael.t_exp_bc WHERE bc_id = #{bcId})) AND NVL(p.gd_tag, 'N') = 'N' AND NVL(p.undo, '0') = '0' AND TO_CHAR(d.end_day, 'yyyy-mm-dd') > TO_CHAR(SYSDATE, 'yyyy-mm-dd') AND (d.claim_amt + d.yfk_amt) < d.payed_amt" 
	})
	BigDecimal selectCountOld(BigDecimal bcId);
	
	////计算新系统数据---供应商在手
	@Select({
		"SELECT NVL(SUM(NVL(a.p_quant, 0)), 0) as ld_total_quant_new, NVL(SUM(NVL(b.un_send_quant, 0)), 0) as ld_unsend_quant_new, NVL(SUM(NVL(b.un_send_amt, 0)), 0) / 10000 as ld_unsend_amt_new" + 
		"  FROM michael.t_exp_bc a, michael.t_tr_purchase_track b" + 
		" WHERE TO_CHAR(a.bc_id) = b.src_pur_id AND 'T_EXP_BC' = b.src_pur_type AND a.bc_id <> #{bcid} AND a.fct_id = (SELECT fct_id  FROM michael.t_exp_bc WHERE bc_id = #{bcId}) AND NVL(a.c_status, '0') = '1' AND a.acc_no LIKE (SELECT concat(substr(acc_no,1,3),'%') FROM michael.t_exp_bc WHERE bc_id = #{bcId})"
	})
	Map<String,BigDecimal> selectQuantNew(BigDecimal bcId);
	
	@Select({
		"SELECT COUNT(DISTINCT c.cst_id)" + 
		"  FROM michael.t_exp_bc a, michael.t_tr_contract_rel b, michael.t_exp_sc c" + 
		" WHERE a.bc_id = b.tob_id_b AND 'P_ORDER' = b.tob_type_b AND 'S_ORDER' = b.tob_type_a AND a.bc_id <> #{bcId} AND b.tob_id_a = c.sc_id AND b.rel_type = 'MODEL' AND a.fct_id = (SELECT fct_id  FROM michael.t_exp_bc WHERE bc_id = #{bcId}) AND NVL(a.c_status, '0') = '1' AND a.acc_no LIKE (SELECT concat(substr(acc_no,1,3),'%') FROM michael.t_exp_bc WHERE bc_id = #{bcId})"
	})
	BigDecimal selectCountNew(BigDecimal bcId); 
	
	/////////客户在手
	////计算老系统数据
	@Select({
		"SELECT NVL(SUM(NVL(d.total_quant, 0)), 0) as ld_total_quant_old, NVL(SUM(NVL(d.got_quant, 0) - NVL(d.ck_quant, 0)), 0) as ld_kc_quant_old, NVL(SUM(NVL(d.cst_should_pay, 0)), 0)/10000 as ld_dk_amt_old" + 
		"  FROM t_nm_project p, t_nm_dynamic d" + 
		" WHERE p.pro_id = d.pro_id AND p.cst_no = (SELECT cst_no FROM solution.t_customer WHERE cst_id = (SELECT cst_id FROM michael.t_exp_sc WHERE sc_id = #{scId})) AND NVL(p.gd_tag, 'N') = 'N' AND NVL(p.undo, '0') = '0' AND TO_CHAR(d.end_day, 'yyyy-mm-dd') > TO_CHAR(SYSDATE, 'yyyy-mm-dd') AND (d.claim_amt + d.yfk_amt) < d.payed_amt"
	})
	Map<String,BigDecimal> selectOldSc(BigDecimal scId); 
	
	//////计算新系统数据
	@Select({
		"SELECT NVL(SUM(NVL(a.p_quant, 0)), 0) as ld_total_quant_new " + 
		"  FROM michael.t_exp_sc a, michael.t_tr_sales_track b" + 
		" WHERE TO_CHAR(a.sc_id) = b.src_sc_id AND 'T_EXP_SC' = b.src_sc_type AND a.sc_id <> #{scId} AND a.cst_id = (SELECT cst_id FROM michael.t_exp_sc WHERE sc_id = #{scId}) AND NVL(a.c_status, '0') = '1' AND a.acc_no LIKE (SELECT concat(substr(acc_no,1,3),'%') FROM michael.t_exp_sc WHERE sc_id = #{scId})"
	})
	BigDecimal selectQuantNewSc(BigDecimal scId); 
	
	//广义库存
	@Select({
		"SELECT NVL(un_send_quant, 0) + NVL(st_quant, 0) as ld_kc_quant_new" + 
		"  FROM michael.t_exp_bc a, michael.t_tr_purchase_track b, michael.t_tr_contract_rel c" + 
		" WHERE a.bc_id = b.src_pur_id AND b.src_pur_type = 'T_EXP_BC' AND c.rel_type = 'MODEL' AND c.tob_type_b = 'P_ORDER' AND c.tob_id_b = a.bc_id AND c.tob_type_a = 'S_ORDER' AND c.tob_id_a = #{scId} AND rownum = 1"
	})
	BigDecimal selectKc_quant_newSc(BigDecimal scId); 

	///
	@Select({
		"SELECT NVL(pay_kind, '-') as ls_pay_kind FROM michael.t_pub_pay_apply WHERE int_id = #{payId}"
	})
	String selectLs_pay_kind(String payId); 

	///
	@Select({
		"SELECT count(*) as ll_rc FROM michael.t_pub_pay_dtl WHERE apply_int_id = #{payId} AND fk_id = 1"
	})
	long selectRc(String payId); 

	///
	@Select({
		"select sum(pay_amt)" + 
		"  from view_tr_io_dtl_classic" + 
		"  where action_type <> 'T_TR_SALES_INV_APPLY'" + 
		"  and io_tag = 'O'" + 
		"  and tob_type = #{tobType}" + 
		"  and tob_id = #{tobId}"
	})
	BigDecimal selectAmt(@Param("tobType")String tobType, @Param("tobId")String tobId); 
	///fu kuan
	@Select({
		"select curr_type, io_amt as fee_amt,io_date as m_date, pw_id, pat_name as cst_name, pay_kind as fee_kind, io_status as confirm, fee_kind_id as fk_id" + 
				"  from view_tr_io_dtl_classic" + 
				"  where action_type <> 'T_TR_SALES_INV_APPLY'" + 
				"  and io_tag = 'O'" + 
				"  and tob_type = #{tobType}" + 
				"  and tob_id = #{tobId}"
	})
	List<PayApplyBean> selectItemFk(@Param("tobType")String tobType, @Param("tobId")String tobId); 
	///wu liu
	@Select({
		"select logi_doc_type," + 
		"        comm_name," + 
		"        to_char(r_date, 'yyyy-mm-dd') as r_date," + 
		"        tol_comm_quant, inv_price," + 
		"        comm_unit" + 
		"  from view_tr_logi_flow" + 
		" where tob_type = #{tobType}   " + 
		"   and tob_id = #{tobId}" + 
		"   and ref_type = 'T_EXP_BC_CMD'"
	})
	List<Map<String,Object>> selectItemWl(@Param("tobType")String tobType, @Param("tobId")String tobId); 
	
	@Select({
		"select sum(coll_amt)" + 
		"  from view_tr_io_dtl_classic" + 
		"  where action_type <> 'T_TR_SALES_INV_APPLY'" + 
		"  and io_tag = 'I'" + 
		"  and tob_type = #{tobType}" + 
		"  and tob_id = #{tobId}"
	})
	BigDecimal selectCollAmt(@Param("tobType")String tobType, @Param("tobId")String tobId); 
	
	
	@Select({
		"select sum(pay_amt)" + 
		"  from view_tr_io_dtl_classic" + 
		"  where action_type <> 'T_TR_SALES_INV_APPLY'" + 
		"  and io_tag = 'O'" + 
		"  and tob_type = #{tobType}" + 
		"  and tob_id = #{tobId}" + 
		"  and action_type = 'T_PUB_PAY_APPLY'" + 
		"  and action_id <> #{intId} " + 
		"  and pat_id = #{patId} " +
		"  and fee_kind_id <> #{fkId} "
	})
	BigDecimal selectPayAmt4Hint(@Param("tobType")String tobType, @Param("tobId")String tobId, @Param("intId")String intId,@Param("patId")BigDecimal patId,@Param("fkId")BigDecimal fkId); 

	@Select({
		"select sum(pay_amt)" + 
		"  from view_tr_io_dtl_classic" + 
		"  where action_type <> 'T_TR_SALES_INV_APPLY'" + 
		"  and io_tag = 'O'" + 
		"  and tob_type = #{tobType}" + 
		"  and tob_id = #{tobId}" + 
		"  and action_type = 'T_PUB_PAY_APPLY'" + 
		"  and fee_kind_id = #{fkId} "
	})
	BigDecimal selectPayAmt4HintHk(@Param("tobType")String tobType, @Param("tobId")String tobId, @Param("fkId")BigDecimal fkId); 

	@Select({
		"	SELECT a.c_no, a.curr_type, a.p_amt, a.comm_id, a.p_quant, a.comm_unit, a.dep_org_id, a.ocu_org_id, a.cell_id, a.user_id" + 
		"	  FROM michael.t_exp_bc a, michael.t_tr_pkg_rel b WHERE a.bc_id = b.tob_id AND b.tob_type = 'P_ORDER' AND b.pkg_id = #{pkgId}"
	})
	List<ChatBean> selectChatBean(@Param("pkgId")String pkgId); 

}
