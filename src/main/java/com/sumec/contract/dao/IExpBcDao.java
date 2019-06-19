package com.sumec.contract.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TTrOcuDivide;

public interface IExpBcDao {
    @Delete({
        "delete from T_EXP_BC",
        "where BC_ID = #{bcId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal bcId);

    @Insert({
        "insert into T_EXP_BC (BC_ID, C_NO, ",
        "M_DATE, C_TYPE, ",
        "FCT_NO, FIRST_PARTY, ",
        "PACK_TRM, QUALITY, ",
        "QUALITY_TIME, DEPATURE, ",
        "NOTE, DELI_D, MARKET, ",
        "P_QUANT, P_AMT, STATUS_PS, ",
        "END_ID, ROHS_BZ, YH, ",
        "IS_VALID, DEP_NO, ",
        "GROUP_NO, EMP_NO, ",
        "EMP_NAME, MAKER_NO, ",
        "MAKER_NAME, MODIFY_NO, ",
        "MODIFY_NAME, MODIFY_DATE, ",
        "CHECK_NO, CHECK_NAME, ",
        "CHECK_DATE, FROM_ID, ",
        "SERV_TAG, GOODS_SAMPLE, ",
        "SAMPLE_GET, DOCS, ",
        "CONFIRM, REASON, ",
        "FP_AMT, PAY_AMT, WH_NO, ",
        "N_NO, REAL_NO, MANUAL_NO, ",
        "PAY_TERM, OC_ID, IS_INSTALL, ",
        "TAG, GJ_TERM, NEED_CALC, ",
        "ACC_NO, ORG_ID, USER_ID, ",
        "CELL_ID, FCT_ID, KC_TYPE, ",
        "VIEW_SCOPE, PROMPT, ",
        "IS_NEED_SAMPLE, IS_GET_SAMPLE, ",
        "TRADEMODE, CURR_TYPE, ",
        "PRO_ID, PRO_TYPE, ",
        "SEND_OVER_TAG, SEND_OVER_DATE, ",
        "FCT_ORDER_NO, IS_JS_REAL, ",
        "CHECK_USER_ID, MODIFY_USER_ID, ",
        "COPY_PARTY_NO, COPY_PARTY_ID, ",
        "COPY_MOVE_NO, COPY_MOVE_ID, ",
        "IS_JQ_OVER, UNDO, ",
        "IS_ZY_OVER, PRODUCER_ID, ",
        "PRODUCER_NO, PRODUCER_NAME, ",
        "GD_TAG, GD_USER_ID, ",
        "GD_DATE, GJ_FCT_NO, ",
        "GJ_FCT_ID, OCU_ORG_ID, ",
        "SEND_TERM, SEND_DAY, ",
        "SENDOVER_DAY, SEND_DATE, ",
        "SENDOVER_DATE, WH_ID, ",
        "WH_NAME, BC_TYPE, ",
        "TRANS_WAY, SIGN_DATE, ",
        "C_TERM, CST_SHORT_NAME, ",
        "TRANS_CORP_ID, TRANS_CORP_NAME, ",
        "OTHER_REQ, IS_U8_PURCHARSE_REQ, ",
        "IS_MOVE, IS_CLOSE, ",
        "CLOSE_USER_ID, CLOSE_DATE, ",
        "IU_OCU_ID, INLAND_OR_OVERSEAS, ",
        "TYPE_OF_CON, CLOSE_CONFIRM, ",
        "DEP_ORG_ID, PURCHASER_ID, ",
        "CATA_OF_CON, PROP_OF_CON, ",
        "BIZ_MODE, REL_BC_ID, ",
        "CON_NAME, VALID_DATE, ",
        "SIGN_PLACE, CON_CONTENT, ",
        "SELLER_NATION_ID, SELLER_PROP, ",
        "SENDER_ID, LAND_NATION_ID, ",
        "LAND_PORT_ID, LAND_LOCATION, ",
        "RECER_ID, DEST_NATION_ID, ",
        "DEST_PORT_ID, DEST_LOCATION, ",
        "IS_BATCHES, IS_TRANSFER, ",
        "TRANSFER_PORT_ID, COMMISSION_ID, ",
        "COMMISSION_RATE, COMMISSION_CURR_TYPE, ",
        "COMMISSION_FEE, SHIPMENT_WAY, ",
        "BOX_DELIVERY_TYPE, DELIVERY_PLACE, ",
        "IS_PLAN_ST, PROXY_CORP_ID, ",
        "TRANS_RESP, TRANS_FEE_RESP, ",
        "TRANS_INSU_RESP, ARBITRATION_PLACE, ",
        "SUE_PLACE, IS_NEED_SPEC_DOCU, ",
        "PRICING_WAY, PRICE_STANDARD, ",
        "EXAM_STANDARD, CON_PERIOD, ",
        "BAIL_RATE, PROFIT_SCHEME, ",
        "COMM_QUANT_PACK, COMM_QUANT_STAT, ",
        "C_STATUS, CMD_CATA_ID, ",
        "PRICE_TERM, FCT_NAME, ",
        "PURCHASER_NAME, SENDER_NAME, ",
        "RECER_NAME, COMMISSION_NAME, ",
        "PROXY_CORP_NAME, AFFECT_INCOME, ",
        "AFFECT_INCOME_RATE, MANUFAC_ID, ",
        "MANUFAC_NAME, U8_OP_ID, ",
        "CNY_RATE, USD_RATE, ",
        "CURR_RATE, SHORT_OR_OVER, ",
        "CON_PERIOD_S_TYPE, COMM_UNIT, ",
        "TRADE_OR_SRV, TR_SRV_OR_GOODS, ",
        "PROFIT_SCHEME_DESC, COMPLEX_LEVEL, ",
        "COMM_NAME, COMM_ID, ",
        "PLAN_SALES_INL_OR_OS, GJ_FCT_NAME, ",
        "HOLDER_ID, HOLDER_NAME, ",
        "BIZ_TYPE)",
        "values (#{bcId,jdbcType=DECIMAL}, #{cNo,jdbcType=VARCHAR}, ",
        "#{mDate,jdbcType=TIMESTAMP}, #{cType,jdbcType=VARCHAR}, ",
        "#{fctNo,jdbcType=VARCHAR}, #{firstParty,jdbcType=VARCHAR}, ",
        "#{packTrm,jdbcType=VARCHAR}, #{quality,jdbcType=VARCHAR}, ",
        "#{qualityTime,jdbcType=VARCHAR}, #{depature,jdbcType=VARCHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{deliD,jdbcType=TIMESTAMP}, #{market,jdbcType=VARCHAR}, ",
        "#{pQuant,jdbcType=DECIMAL}, #{pAmt,jdbcType=DECIMAL}, #{statusPs,jdbcType=VARCHAR}, ",
        "#{endId,jdbcType=VARCHAR}, #{rohsBz,jdbcType=VARCHAR}, #{yh,jdbcType=VARCHAR}, ",
        "#{isValid,jdbcType=VARCHAR}, #{depNo,jdbcType=VARCHAR}, ",
        "#{groupNo,jdbcType=VARCHAR}, #{empNo,jdbcType=VARCHAR}, ",
        "#{empName,jdbcType=VARCHAR}, #{makerNo,jdbcType=VARCHAR}, ",
        "#{makerName,jdbcType=VARCHAR}, #{modifyNo,jdbcType=VARCHAR}, ",
        "#{modifyName,jdbcType=VARCHAR}, #{modifyDate,jdbcType=TIMESTAMP}, ",
        "#{checkNo,jdbcType=VARCHAR}, #{checkName,jdbcType=VARCHAR}, ",
        "#{checkDate,jdbcType=TIMESTAMP}, #{fromId,jdbcType=DECIMAL}, ",
        "#{servTag,jdbcType=VARCHAR}, #{goodsSample,jdbcType=VARCHAR}, ",
        "#{sampleGet,jdbcType=VARCHAR}, #{docs,jdbcType=VARCHAR}, ",
        "#{confirm,jdbcType=VARCHAR}, #{reason,jdbcType=VARCHAR}, ",
        "#{fpAmt,jdbcType=DECIMAL}, #{payAmt,jdbcType=DECIMAL}, #{whNo,jdbcType=VARCHAR}, ",
        "#{nNo,jdbcType=VARCHAR}, #{realNo,jdbcType=VARCHAR}, #{manualNo,jdbcType=VARCHAR}, ",
        "#{payTerm,jdbcType=VARCHAR}, #{ocId,jdbcType=DECIMAL}, #{isInstall,jdbcType=VARCHAR}, ",
        "#{tag,jdbcType=VARCHAR}, #{gjTerm,jdbcType=VARCHAR}, #{needCalc,jdbcType=VARCHAR}, ",
        "#{accNo,jdbcType=VARCHAR}, #{orgId,jdbcType=DECIMAL}, #{userId,jdbcType=DECIMAL}, ",
        "#{cellId,jdbcType=DECIMAL}, #{fctId,jdbcType=DECIMAL}, #{kcType,jdbcType=VARCHAR}, ",
        "#{viewScope,jdbcType=VARCHAR}, #{prompt,jdbcType=VARCHAR}, ",
        "#{isNeedSample,jdbcType=VARCHAR}, #{isGetSample,jdbcType=VARCHAR}, ",
        "#{trademode,jdbcType=VARCHAR}, #{currType,jdbcType=VARCHAR}, ",
        "#{proId,jdbcType=DECIMAL}, #{proType,jdbcType=VARCHAR}, ",
        "#{sendOverTag,jdbcType=VARCHAR}, #{sendOverDate,jdbcType=TIMESTAMP}, ",
        "#{fctOrderNo,jdbcType=VARCHAR}, #{isJsReal,jdbcType=VARCHAR}, ",
        "#{checkUserId,jdbcType=DECIMAL}, #{modifyUserId,jdbcType=DECIMAL}, ",
        "#{copyPartyNo,jdbcType=VARCHAR}, #{copyPartyId,jdbcType=DECIMAL}, ",
        "#{copyMoveNo,jdbcType=VARCHAR}, #{copyMoveId,jdbcType=DECIMAL}, ",
        "#{isJqOver,jdbcType=VARCHAR}, #{undo,jdbcType=VARCHAR}, ",
        "#{isZyOver,jdbcType=VARCHAR}, #{producerId,jdbcType=DECIMAL}, ",
        "#{producerNo,jdbcType=VARCHAR}, #{producerName,jdbcType=VARCHAR}, ",
        "#{gdTag,jdbcType=VARCHAR}, #{gdUserId,jdbcType=DECIMAL}, ",
        "#{gdDate,jdbcType=TIMESTAMP}, #{gjFctNo,jdbcType=VARCHAR}, ",
        "#{gjFctId,jdbcType=DECIMAL}, #{ocuOrgId,jdbcType=DECIMAL}, ",
        "#{sendTerm,jdbcType=VARCHAR}, #{sendDay,jdbcType=DECIMAL}, ",
        "#{sendoverDay,jdbcType=DECIMAL}, #{sendDate,jdbcType=TIMESTAMP}, ",
        "#{sendoverDate,jdbcType=TIMESTAMP}, #{whId,jdbcType=DECIMAL}, ",
        "#{whName,jdbcType=VARCHAR}, #{bcType,jdbcType=VARCHAR}, ",
        "#{transWay,jdbcType=VARCHAR}, #{signDate,jdbcType=TIMESTAMP}, ",
        "#{cTerm,jdbcType=VARCHAR}, #{cstShortName,jdbcType=VARCHAR}, ",
        "#{transCorpId,jdbcType=DECIMAL}, #{transCorpName,jdbcType=VARCHAR}, ",
        "#{otherReq,jdbcType=VARCHAR}, #{isU8PurcharseReq,jdbcType=VARCHAR}, ",
        "#{isMove,jdbcType=VARCHAR}, #{isClose,jdbcType=VARCHAR}, ",
        "#{closeUserId,jdbcType=DECIMAL}, #{closeDate,jdbcType=TIMESTAMP}, ",
        "#{iuOcuId,jdbcType=DECIMAL}, #{inlandOrOverseas,jdbcType=VARCHAR}, ",
        "#{typeOfCon,jdbcType=VARCHAR}, #{closeConfirm,jdbcType=VARCHAR}, ",
        "#{depOrgId,jdbcType=DECIMAL}, #{purchaserId,jdbcType=DECIMAL}, ",
        "#{cataOfCon,jdbcType=VARCHAR}, #{propOfCon,jdbcType=VARCHAR}, ",
        "#{bizMode,jdbcType=VARCHAR}, #{relBcId,jdbcType=DECIMAL}, ",
        "#{conName,jdbcType=VARCHAR}, #{validDate,jdbcType=TIMESTAMP}, ",
        "#{signPlace,jdbcType=VARCHAR}, #{conContent,jdbcType=VARCHAR}, ",
        "#{sellerNationId,jdbcType=DECIMAL}, #{sellerProp,jdbcType=VARCHAR}, ",
        "#{senderId,jdbcType=DECIMAL}, #{landNationId,jdbcType=DECIMAL}, ",
        "#{landPortId,jdbcType=DECIMAL}, #{landLocation,jdbcType=VARCHAR}, ",
        "#{recerId,jdbcType=DECIMAL}, #{destNationId,jdbcType=DECIMAL}, ",
        "#{destPortId,jdbcType=DECIMAL}, #{destLocation,jdbcType=VARCHAR}, ",
        "#{isBatches,jdbcType=VARCHAR}, #{isTransfer,jdbcType=VARCHAR}, ",
        "#{transferPortId,jdbcType=DECIMAL}, #{commissionId,jdbcType=DECIMAL}, ",
        "#{commissionRate,jdbcType=DECIMAL}, #{commissionCurrType,jdbcType=VARCHAR}, ",
        "#{commissionFee,jdbcType=DECIMAL}, #{shipmentWay,jdbcType=VARCHAR}, ",
        "#{boxDeliveryType,jdbcType=VARCHAR}, #{deliveryPlace,jdbcType=VARCHAR}, ",
        "#{isPlanSt,jdbcType=VARCHAR}, #{proxyCorpId,jdbcType=DECIMAL}, ",
        "#{transResp,jdbcType=VARCHAR}, #{transFeeResp,jdbcType=VARCHAR}, ",
        "#{transInsuResp,jdbcType=VARCHAR}, #{arbitrationPlace,jdbcType=VARCHAR}, ",
        "#{suePlace,jdbcType=VARCHAR}, #{isNeedSpecDocu,jdbcType=VARCHAR}, ",
        "#{pricingWay,jdbcType=VARCHAR}, #{priceStandard,jdbcType=VARCHAR}, ",
        "#{examStandard,jdbcType=VARCHAR}, #{conPeriod,jdbcType=DECIMAL}, ",
        "#{bailRate,jdbcType=DECIMAL}, #{profitScheme,jdbcType=VARCHAR}, ",
        "#{commQuantPack,jdbcType=DECIMAL}, #{commQuantStat,jdbcType=DECIMAL}, ",
        "#{cStatus,jdbcType=VARCHAR}, #{cmdCataId,jdbcType=DECIMAL}, ",
        "#{priceTerm,jdbcType=VARCHAR}, #{fctName,jdbcType=VARCHAR}, ",
        "#{purchaserName,jdbcType=VARCHAR}, #{senderName,jdbcType=VARCHAR}, ",
        "#{recerName,jdbcType=VARCHAR}, #{commissionName,jdbcType=VARCHAR}, ",
        "#{proxyCorpName,jdbcType=VARCHAR}, #{affectIncome,jdbcType=VARCHAR}, ",
        "#{affectIncomeRate,jdbcType=DECIMAL}, #{manufacId,jdbcType=DECIMAL}, ",
        "#{manufacName,jdbcType=VARCHAR}, #{u8OpId,jdbcType=DECIMAL}, ",
        "#{cnyRate,jdbcType=DECIMAL}, #{usdRate,jdbcType=DECIMAL}, ",
        "#{currRate,jdbcType=DECIMAL}, #{shortOrOver,jdbcType=DECIMAL}, ",
        "#{conPeriodSType,jdbcType=VARCHAR}, #{commUnit,jdbcType=DECIMAL}, ",
        "#{tradeOrSrv,jdbcType=VARCHAR}, #{trSrvOrGoods,jdbcType=VARCHAR}, ",
        "#{profitSchemeDesc,jdbcType=VARCHAR}, #{complexLevel,jdbcType=DECIMAL}, ",
        "#{commName,jdbcType=VARCHAR}, #{commId,jdbcType=DECIMAL}, ",
        "#{planSalesInlOrOs,jdbcType=VARCHAR}, #{gjFctName,jdbcType=VARCHAR}, ",
        "#{holderId,jdbcType=DECIMAL}, #{holderName,jdbcType=VARCHAR}, ",
        "#{bizType,jdbcType=VARCHAR})"
    })
    int insert(TExpBc record);

    int insertSelective(TExpBc record);

    @Select({
        "select",
        "BC_ID, C_NO, M_DATE, C_TYPE, FCT_NO, FIRST_PARTY, PACK_TRM, QUALITY, QUALITY_TIME, ",
        "DEPATURE, NOTE, DELI_D, MARKET, P_QUANT, P_AMT, STATUS_PS, END_ID, ROHS_BZ, ",
        "YH, IS_VALID, DEP_NO, GROUP_NO, EMP_NO, EMP_NAME, MAKER_NO, MAKER_NAME, MODIFY_NO, ",
        "MODIFY_NAME, MODIFY_DATE, CHECK_NO, CHECK_NAME, CHECK_DATE, FROM_ID, SERV_TAG, ",
        "GOODS_SAMPLE, SAMPLE_GET, DOCS, CONFIRM, REASON, FP_AMT, PAY_AMT, WH_NO, N_NO, ",
        "REAL_NO, MANUAL_NO, PAY_TERM, OC_ID, IS_INSTALL, TAG, GJ_TERM, NEED_CALC, ACC_NO, ",
        "ORG_ID, USER_ID, CELL_ID, FCT_ID, KC_TYPE, VIEW_SCOPE, PROMPT, IS_NEED_SAMPLE, ",
        "IS_GET_SAMPLE, TRADEMODE, CURR_TYPE, PRO_ID, PRO_TYPE, SEND_OVER_TAG, SEND_OVER_DATE, ",
        "FCT_ORDER_NO, IS_JS_REAL, CHECK_USER_ID, MODIFY_USER_ID, COPY_PARTY_NO, COPY_PARTY_ID, ",
        "COPY_MOVE_NO, COPY_MOVE_ID, IS_JQ_OVER, UNDO, IS_ZY_OVER, PRODUCER_ID, PRODUCER_NO, ",
        "PRODUCER_NAME, GD_TAG, GD_USER_ID, GD_DATE, GJ_FCT_NO, GJ_FCT_ID, OCU_ORG_ID, ",
        "SEND_TERM, SEND_DAY, SENDOVER_DAY, SEND_DATE, SENDOVER_DATE, WH_ID, WH_NAME, ",
        "BC_TYPE, TRANS_WAY, SIGN_DATE, C_TERM, CST_SHORT_NAME, TRANS_CORP_ID, TRANS_CORP_NAME, ",
        "OTHER_REQ, IS_U8_PURCHARSE_REQ, IS_MOVE, IS_CLOSE, CLOSE_USER_ID, CLOSE_DATE, ",
        "IU_OCU_ID, INLAND_OR_OVERSEAS, TYPE_OF_CON, CLOSE_CONFIRM, DEP_ORG_ID, PURCHASER_ID, ",
        "CATA_OF_CON, PROP_OF_CON, BIZ_MODE, REL_BC_ID, CON_NAME, VALID_DATE, SIGN_PLACE, ",
        "CON_CONTENT, SELLER_NATION_ID, SELLER_PROP, SENDER_ID, LAND_NATION_ID, LAND_PORT_ID, ",
        "LAND_LOCATION, RECER_ID, DEST_NATION_ID, DEST_PORT_ID, DEST_LOCATION, IS_BATCHES, ",
        "IS_TRANSFER, TRANSFER_PORT_ID, COMMISSION_ID, COMMISSION_RATE, COMMISSION_CURR_TYPE, ",
        "COMMISSION_FEE, SHIPMENT_WAY, BOX_DELIVERY_TYPE, DELIVERY_PLACE, IS_PLAN_ST, ",
        "PROXY_CORP_ID, TRANS_RESP, TRANS_FEE_RESP, TRANS_INSU_RESP, ARBITRATION_PLACE, ",
        "SUE_PLACE, IS_NEED_SPEC_DOCU, PRICING_WAY, PRICE_STANDARD, EXAM_STANDARD, CON_PERIOD, ",
        "BAIL_RATE, PROFIT_SCHEME, COMM_QUANT_PACK, COMM_QUANT_STAT, C_STATUS, CMD_CATA_ID, ",
        "PRICE_TERM, FCT_NAME, PURCHASER_NAME, SENDER_NAME, RECER_NAME, COMMISSION_NAME, ",
        "PROXY_CORP_NAME, AFFECT_INCOME, AFFECT_INCOME_RATE, MANUFAC_ID, MANUFAC_NAME, ",
        "U8_OP_ID, CNY_RATE, USD_RATE, CURR_RATE, SHORT_OR_OVER, CON_PERIOD_S_TYPE, COMM_UNIT, ",
        "TRADE_OR_SRV, TR_SRV_OR_GOODS, PROFIT_SCHEME_DESC, COMPLEX_LEVEL, COMM_NAME, ",
        "COMM_ID, PLAN_SALES_INL_OR_OS, GJ_FCT_NAME, HOLDER_ID, HOLDER_NAME, BIZ_TYPE, REMARK_CLERK",
        "from T_EXP_BC",
        "where BC_ID = #{bcId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpBcDao.BaseResultMap")
    TExpBc selectByPrimaryKey(BigDecimal bcId);

    @Select({
        "select 'P_ORDER' as tob_type,bc_id as tob_id,user_id as ocu_id",
        "from T_EXP_BC",
        "where c_no like concat(concat('%',#{keyWord}),'%') or con_name like concat(concat('%',#{keyWord}),'%')"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    List<TTrOcuDivide> selectByKeyWord(String keyWord);
    
    @Select({
        "<script>",
        "select 'P_ORDER' as tob_type,bc_id as tob_id,user_id as ocu_id",
        "from T_EXP_BC",
        "where USER_ID in",
        "<foreach collection='ocuIds' item='item' index='index' open='(' separator=',' close=')'>",
        "<if test='(index % 999) == 998'> NULL ) OR USER_ID IN (</if>#{item}",
        "</foreach>",
//        " and gd_tag !='1'",
        "</script>"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    List<TTrOcuDivide> selectByUserIds(@Param("ocuIds")List<Long> ocuIds);
    
    int updateByPrimaryKeySelective(TExpBc record);
    
    @Select("select f_link(bc.c_no) from MICHAEL.T_EXP_BC bc where bc.bc_id in (select cmd.bc_id "
            + "from michael.T_TR_INVOICE_NOTICE_DTL a, michael.T_TR_INVOICE_NOTICE_DTL_REL b, michael.t_tr_cbcs_cmd_cost cost, "
            + "MICHAEL.T_EXP_BC_CMD CMD where A.dtl_ID = B.DTL_ID and b.rel_type = 'T_TR_CBCS' and b.rel_dtl_id = cost.cost_id "
            + "and CMD.p_Id = cost.rel_cmd_id AND COST.REL_CMD_TYPE = 'P_ORDER_CMD' AND A.notice_id = #{noticeId,jdbcType=DECIMAL})")
    String selectNotesByNoticeId(BigDecimal noticeId);

    @Select("select cbcs_id as ll_cbcs_id from michael.t_tr_cbcs where tob_type = 'S_OUT' AND tob_id = #{soId}")
    BigDecimal selectCbcsIdBySoId(BigDecimal soId);

    @Select("select bgt_amt as ld_this from michael.t_tr_cbcs_index where cbcs_id = #{cbcsId} and index_id = 957")
    BigDecimal selectLdThisByCbcsId(BigDecimal cbcsId);

    @Select("Select Sum(Nvl(Sout.So_Amt, 0)) as ld_past From Michael.t_Tr_Sout Sout, Michael.t_Tr_Sales_So_Rel Rel " + 
    		" Where Rel.So_Id = Sout.So_Id And Rel.Tob_Type = 'S_ORDER' And Rel.Tob_Id = #{scId} And Rel.So_Type = 'S_OUT' And Sout.So_Id <> #{soId} And nvl(sout.confirm,'-') = '通过'")
    BigDecimal selectLdPastByCbcsId(@Param("scId")BigDecimal scId, @Param("soId")BigDecimal soId);

    @Select("Select sum(nvl(sout.so_amt,0)) as ld_sum_db from Michael.T_TR_SOUT sout,Michael.T_TR_SALES_SO_REL Rel " + 
    		" Where Rel.so_id = Sout.so_id And Rel.tob_type = 'S_ORDER' And Rel.Tob_Id = #{scId} And Rel.So_Type = 'S_OUT' And nvl(sout.confirm,'-') IN ('在审','通过','改单')")
    BigDecimal selectLdSumByScId(BigDecimal scId);

    @Select("SELECT SUM(NVL(A.So_Amt, 0)) as Ld_Db_Cst FROM Michael.T_Tr_Sout A, Michael.T_Tr_Sales_So_Rel B " + 
    		" WHERE A.So_Id = B.So_Id AND B.So_Type = 'S_OUT' AND B.Tob_Type = 'S_ORDER' AND B.Tob_Id = #{scId} AND A.Cst_Id = #{cstId} AND nvl(A.confirm,'-') IN ('在审','通过','改单')")
    BigDecimal selectLdCstByScId(@Param("scId")BigDecimal scId, @Param("cstId")BigDecimal cstId);

    ////代收代付
    @Select("SELECT DISTINCT Tol_Cmd.Tob_Id, Sum(Nvl(So_Cmd.Comm_Quant, 0)) Bc_Quant_Div FROM Michael.T_Tr_Sout_Cmd So_Cmd, Michael.View_Tr_Logi_Tree Tol_Cmd " + 
    		" WHERE So_Cmd.Ref_Id = Tol_Cmd.Inv_F_Cmd_Id And So_Cmd.Ref_Type = Tol_Cmd.Inv_F_Cmd_Type And Tol_Cmd.Tob_Type = 'P_ORDER' And So_Cmd.So_Id = #{soId} Group By Tol_Cmd.Tob_Id")
    List<Map<String,Object>> selectBcIdBcQuantDivBySoId(BigDecimal soId);

    @Select("SELECT SUM(NVL(Inv_Rel.Comm_Amt, 0)) as Ld_Df_Inv FROM Michael.T_Inv_Income Inv, Michael.T_Inv_Income_Docu_Rel Inv_Rel " + 
    		"	 WHERE Inv.Inv_Id = Inv_Rel.Inv_Id AND Inv_Rel.Dtl_Int_Id IS NULL AND Inv_Rel.Docu_Type = 'P_ORDER' AND Inv_Rel.Docu_Id = #{bcId} AND Nvl(Inv.Dsdf_Tag, '0') = '1'")
    BigDecimal selectLd_Df_InvBySoId(BigDecimal bcId);

    @Select("SELECT SUM(NVL(Pay_Rel.Fee_Amt, 0)) as Ld_Df_Fee FROM Michael.T_Pub_Pay_Apply Pay, Michael.T_Pub_Pay_Dtl Pay_Rel" + 
    		" WHERE Pay.Int_Id = Pay_Rel.Apply_Int_Id And Pay_Rel.Bc_Type = 'P_ORDER' And Pay_Rel.Bc_Id = #{bcId} And Nvl(Pay_Rel.Is_Dsdf_Tag, '0') = '1' AND (Nvl(Pay.Confirm, '-') In ('在审', '通过') Or Nvl(Pay.Deal_Tag, '0') = '1')")
    BigDecimal selectLd_Df_FeeBySoId(BigDecimal bcId);

    @Select("SELECT SUM(NVL(P_Quant, 0)) as Ld_Bc_Quant FROM Michael.T_Exp_Bc_Cmd WHERE Bc_Id = #{bcId}")
    BigDecimal selectLd_Bc_QuantBySoId(BigDecimal bcId);
    
    @Select({
        "SELECT " + 
        "MICHAEL.T_TR_SOUT_CMD.SO_ID, " + 
        "MICHAEL.T_TR_SOUT_CMD.REF_TYPE, " + 
        "MICHAEL.T_TR_SOUT_CMD.COMM_NAME, " + 
        "MICHAEL.T_TR_SOUT_CMD.COMM_SPEC, " + 
        "MICHAEL.VIEW_TR_TOB.TOB_NO, " + 
        "MICHAEL.VIEW_TR_TOB.TOB_TYPE, " + 
        "MICHAEL.VIEW_TR_TOB.TOB_ID, " + 
        "SUM(MICHAEL.T_TR_SOUT_CMD.COMM_QUANT) AS COMM_QUANT, "
       +"SUM(MICHAEL.T_TR_SOUT_CMD.COMM_QUANT_PACK) AS COMM_QUANT_PACK, "
       + "SUM(MICHAEL.T_TR_SOUT_CMD.COMM_QUANT_STAT) AS COMM_QUANT_STAT, "
       + "SUM(MICHAEL.T_TR_SOUT_CMD.COMM_AMT) AS COMM_AMT, "
       + "SUM(MICHAEL.T_TR_SOUT_CMD.OUT_QUANT) AS OUT_QUANT, "
       + "SUM(MICHAEL.T_TR_SOUT_CMD.OUT_QUANT_PACK) AS OUT_QUANT_PACK, "
       + "SUM(MICHAEL.T_TR_SOUT_CMD.OUT_QUANT_STAT) AS OUT_QUANT_STAT, " + 
        "'' AS SELECTED " + 
        "FROM MICHAEL.T_TR_SOUT_CMD, " + 
        "MICHAEL.VIEW_TR_LOGI_TREE, " + 
        "MICHAEL.VIEW_TR_TOB " + 
        "WHERE MICHAEL.T_TR_SOUT_CMD.REF_TYPE <> 'T_EXP_SC_CMD' " + 
        "AND MICHAEL.T_TR_SOUT_CMD.REF_TYPE = MICHAEL.VIEW_TR_LOGI_TREE.INV_F_CMD_TYPE(+) "
        + "AND MICHAEL.T_TR_SOUT_CMD.REF_ID = MICHAEL.VIEW_TR_LOGI_TREE.INV_F_CMD_ID(+) " + 
        "AND MICHAEL.VIEW_TR_LOGI_TREE.TOB_TYPE = MICHAEL.VIEW_TR_TOB.TOB_TYPE(+) "
        + "AND MICHAEL.VIEW_TR_LOGI_TREE.TOB_ID = MICHAEL.VIEW_TR_TOB.TOB_ID(+) " + 
        "AND MICHAEL.T_TR_SOUT_CMD.SO_ID = #{soId} " + 
        "GROUP BY " + 
        "MICHAEL.T_TR_SOUT_CMD.SO_ID, MICHAEL.T_TR_SOUT_CMD.REF_TYPE, MICHAEL.T_TR_SOUT_CMD.COMM_NAME, MICHAEL.T_TR_SOUT_CMD.COMM_SPEC, MICHAEL.VIEW_TR_TOB.TOB_NO, MICHAEL.VIEW_TR_TOB.TOB_TYPE, MICHAEL.VIEW_TR_TOB.TOB_ID "
    })
    List<Map<String, Object>> selectBcListBySoId(BigDecimal soId); 
}