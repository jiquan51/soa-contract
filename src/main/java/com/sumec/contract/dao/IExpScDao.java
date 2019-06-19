package com.sumec.contract.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.contract.entity.TExpSc;
import com.sumec.contract.entity.TTrOcuDivide;

public interface IExpScDao {
    @Delete({
        "delete from T_EXP_SC",
        "where SC_ID = #{scId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal scId);

    @Insert({
        "insert into T_EXP_SC (SC_ID, C_NO, ",
        "M_DATE, C_STATUS, ",
        "CST_NO, CURR_TYP, ",
        "TRADEMODE, ADVANCE_DAY, ",
        "PRICE_TERM, PAYMENT, ",
        "PAY_DAY, SHIP_D, ",
        "DEPATURE_NO, DEPATURE_NAME, ",
        "DEST_NO, DEST_NAME, ",
        "PACK_TERM, INSU_TERM, ",
        "T_AMT, P_AMT, INSU_FEE, ",
        "TRANS_FEE, PACK_FEE, ",
        "COMMISSION_FEE, DISCOUNT_FEE, ",
        "DISCOUNT_NOTE, DEP_NO, ",
        "NOTES, ORDER_NO, ",
        "QUALITY_TIME, SUPPLY_SCOPE, ",
        "CORP_RES, IS_COOP, ",
        "PAY_COOP_TERM, COOP_AMT, ",
        "EMP_NO, EMP_NAME, ",
        "MAKER_NO, MAKER_NAME, ",
        "GROUP_NO, MODIFY_NO, ",
        "MODIFY_NAME, MODIFY_DATE, ",
        "CHECK_NO, CHECK_NAME, ",
        "CHECK_DATE, END_ID, ",
        "TAG, IS_VALID, CONFIRM, ",
        "FROM_ID, C_TYPE, USD_RATE, ",
        "RMB_RATE, COPY_NUM, ",
        "TRADE_TYPE, PAY_TERM, ",
        "OC_ID, USDAMT, PRE_NO, ",
        "ACC_NO, KC_TYPE, GROSS_PROFIT, ",
        "DISCOUNT_RATE, INSTALL_DATE, ",
        "C_TAG, DOC_BS, DOC_SC, ",
        "DOC_BC, DOC_YJ, DOC_CERT, ",
        "DOC_YS, SD_AMT, YQ_AMT, ",
        "KP_QUANT, KP_AMT, ",
        "FP_QUANT, FP_AMT, ",
        "ORG_ID, USER_ID, CELL_ID, ",
        "CST_ID, GUARANTEE, ",
        "CST_NAME, CREDIT_LEFT, ",
        "PRO_NAME, P_QUANT, ",
        "CONFIRM_CONDITION, YQ_NOTES, ",
        "QUALITY_YEAR, YJ_INSTALL_DATE, ",
        "JH_LATE_TERM, YH_TERM, ",
        "PRO_ID, PRO_TYPE, ",
        "OUT_OVER_TAG, OUT_OVER_DATE, ",
        "VALID_DATE, UNDO, ",
        "END_TAG, YS_DATE, ",
        "SJ_DATE, QUALITY_UNIT, ",
        "TB_TYPE, GURANTEE_TRACKDAY, ",
        "DB_CHECK_USER_ID, DB_CHECK_DATE, ",
        "COMMISSION_ID, COMMISSION_NO, ",
        "COMMISSION_NAME, BUYER_ID, ",
        "BUYER_NO, BUYER_NAME, ",
        "DB_CHECK_TAG, GD_TAG, ",
        "GD_USER_ID, GD_DATE, ",
        "REF_ID, REF_TYPE, ",
        "OCU_ORG_ID, IMPORT_NATION, ",
        "GROSS_RATE, SC_TYPE, ",
        "SIGN_DATE, IS_XYX, ",
        "IS_HYX, IS_FH_END, ",
        "TS_DATE, IU_OCU_ID, ",
        "DEPATURE_ID, DEST_ID, ",
        "N_NO, INLAND_OR_OVERSEAS, ",
        "TYPE_OF_CON, CATA_OF_CON, ",
        "PROP_OF_CON, BIZ_MODE, ",
        "REL_SC_ID, CON_NAME, ",
        "SIGN_PLACE, CON_CONTENT, ",
        "SELLER_ID, CST_NATION_ID, ",
        "SENDER_ID, LAND_NATION_ID, ",
        "LAND_PORT_ID, LAND_LOCATION, ",
        "RECER_ID, DEST_NATION_ID, ",
        "DEST_PORT_ID, DEST_LOCATION, ",
        "IS_BATCHES, IS_TRANSFER, ",
        "TRANSFER_PORT_ID, COMMISSION_RATE, ",
        "COMMISSION_CURR_TYPE, SHIPMENT_WAY, ",
        "BOX_DELIVERY_TYPE, DELIVERY_PLACE, ",
        "PROXY_CORP_ID, IS_ARRIGN_PROXY, ",
        "TRANS_RESP, TRANS_WAY, ",
        "TRANS_CORP_ID, IS_ARRIGN_TRANS, ",
        "TRANS_FEE_RESP, TRANS_INSU_RESP, ",
        "SEND_TERM, ARBITRATION_PLACE, ",
        "SUE_PLACE, IS_NEED_SPEC_DOCU, ",
        "PRICING_WAY, SETTLE_WAY, ",
        "SELF_SETTLE_WAY, DK_STANDARD, ",
        "DK_INT_RATE, IS_AGREE_DK, ",
        "CON_PERIOD, BAIL_RATE, ",
        "PROFIT_SCHEME, COMM_QUANT_PACK, ",
        "COMM_QUANT_STAT, DEP_ORG_ID, ",
        "PRICE_STANDARD, CST_PROP, ",
        "CMD_CATA_ID, SELLER_NAME, ",
        "SENDER_NAME, RECER_NAME, ",
        "TRANS_CORP_NAME, PROXY_CORP_NAME, ",
        "IS_CLOSE, CLOSE_USER_ID, ",
        "CLOSE_DATE, SHORT_OR_OVER, ",
        "CON_PERIOD_S_TYPE, COMM_UNIT, ",
        "IS_OA, COMM_PER_UNIT, ",
        "LACK_LOAD_RATE, OVER_LOAD_RATE, ",
        "TRADE_OR_SRV, TR_SRV_OR_GOODS, ",
        "PROFIT_SCHEME_DESC, LEASE_CORP_ID, ",
        "LEASE_CORP_NAME, PR_FEE_TYPE, ",
        "PR_FEE_RATE, PR_FEE_CURR_TYPE, ",
        "PR_FEE_AMT, LEASE_MODE, ",
        "PLAN_FCT_ID, PLAN_FCT_NAME, ",
        "PLAN_MANUFAC_ID, PLAN_MANUFAC_NAME, ",
        "COMPLEX_LEVEL, COMM_NAME, ",
        "COMM_ID, PLAN_PUR_INL_OR_OS, ",
        "BAIL_RATE_TYPE, BIZ_TYPE)",
        "values (#{scId,jdbcType=DECIMAL}, #{cNo,jdbcType=VARCHAR}, ",
        "#{mDate,jdbcType=TIMESTAMP}, #{cStatus,jdbcType=VARCHAR}, ",
        "#{cstNo,jdbcType=VARCHAR}, #{currTyp,jdbcType=VARCHAR}, ",
        "#{trademode,jdbcType=VARCHAR}, #{advanceDay,jdbcType=DECIMAL}, ",
        "#{priceTerm,jdbcType=VARCHAR}, #{payment,jdbcType=VARCHAR}, ",
        "#{payDay,jdbcType=DECIMAL}, #{shipD,jdbcType=TIMESTAMP}, ",
        "#{depatureNo,jdbcType=VARCHAR}, #{depatureName,jdbcType=VARCHAR}, ",
        "#{destNo,jdbcType=VARCHAR}, #{destName,jdbcType=VARCHAR}, ",
        "#{packTerm,jdbcType=VARCHAR}, #{insuTerm,jdbcType=VARCHAR}, ",
        "#{tAmt,jdbcType=DECIMAL}, #{pAmt,jdbcType=DECIMAL}, #{insuFee,jdbcType=DECIMAL}, ",
        "#{transFee,jdbcType=DECIMAL}, #{packFee,jdbcType=DECIMAL}, ",
        "#{commissionFee,jdbcType=DECIMAL}, #{discountFee,jdbcType=DECIMAL}, ",
        "#{discountNote,jdbcType=VARCHAR}, #{depNo,jdbcType=VARCHAR}, ",
        "#{notes,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{qualityTime,jdbcType=VARCHAR}, #{supplyScope,jdbcType=VARCHAR}, ",
        "#{corpRes,jdbcType=VARCHAR}, #{isCoop,jdbcType=VARCHAR}, ",
        "#{payCoopTerm,jdbcType=VARCHAR}, #{coopAmt,jdbcType=DECIMAL}, ",
        "#{empNo,jdbcType=VARCHAR}, #{empName,jdbcType=VARCHAR}, ",
        "#{makerNo,jdbcType=VARCHAR}, #{makerName,jdbcType=VARCHAR}, ",
        "#{groupNo,jdbcType=VARCHAR}, #{modifyNo,jdbcType=VARCHAR}, ",
        "#{modifyName,jdbcType=VARCHAR}, #{modifyDate,jdbcType=TIMESTAMP}, ",
        "#{checkNo,jdbcType=VARCHAR}, #{checkName,jdbcType=VARCHAR}, ",
        "#{checkDate,jdbcType=TIMESTAMP}, #{endId,jdbcType=VARCHAR}, ",
        "#{tag,jdbcType=VARCHAR}, #{isValid,jdbcType=VARCHAR}, #{confirm,jdbcType=VARCHAR}, ",
        "#{fromId,jdbcType=VARCHAR}, #{cType,jdbcType=VARCHAR}, #{usdRate,jdbcType=DECIMAL}, ",
        "#{rmbRate,jdbcType=DECIMAL}, #{copyNum,jdbcType=VARCHAR}, ",
        "#{tradeType,jdbcType=VARCHAR}, #{payTerm,jdbcType=VARCHAR}, ",
        "#{ocId,jdbcType=DECIMAL}, #{usdamt,jdbcType=DECIMAL}, #{preNo,jdbcType=VARCHAR}, ",
        "#{accNo,jdbcType=VARCHAR}, #{kcType,jdbcType=VARCHAR}, #{grossProfit,jdbcType=DECIMAL}, ",
        "#{discountRate,jdbcType=DECIMAL}, #{installDate,jdbcType=TIMESTAMP}, ",
        "#{cTag,jdbcType=VARCHAR}, #{docBs,jdbcType=VARCHAR}, #{docSc,jdbcType=VARCHAR}, ",
        "#{docBc,jdbcType=VARCHAR}, #{docYj,jdbcType=VARCHAR}, #{docCert,jdbcType=VARCHAR}, ",
        "#{docYs,jdbcType=VARCHAR}, #{sdAmt,jdbcType=DECIMAL}, #{yqAmt,jdbcType=DECIMAL}, ",
        "#{kpQuant,jdbcType=DECIMAL}, #{kpAmt,jdbcType=DECIMAL}, ",
        "#{fpQuant,jdbcType=DECIMAL}, #{fpAmt,jdbcType=DECIMAL}, ",
        "#{orgId,jdbcType=DECIMAL}, #{userId,jdbcType=DECIMAL}, #{cellId,jdbcType=DECIMAL}, ",
        "#{cstId,jdbcType=DECIMAL}, #{guarantee,jdbcType=VARCHAR}, ",
        "#{cstName,jdbcType=VARCHAR}, #{creditLeft,jdbcType=DECIMAL}, ",
        "#{proName,jdbcType=VARCHAR}, #{pQuant,jdbcType=DECIMAL}, ",
        "#{confirmCondition,jdbcType=VARCHAR}, #{yqNotes,jdbcType=VARCHAR}, ",
        "#{qualityYear,jdbcType=DECIMAL}, #{yjInstallDate,jdbcType=TIMESTAMP}, ",
        "#{jhLateTerm,jdbcType=VARCHAR}, #{yhTerm,jdbcType=VARCHAR}, ",
        "#{proId,jdbcType=DECIMAL}, #{proType,jdbcType=VARCHAR}, ",
        "#{outOverTag,jdbcType=VARCHAR}, #{outOverDate,jdbcType=TIMESTAMP}, ",
        "#{validDate,jdbcType=TIMESTAMP}, #{undo,jdbcType=VARCHAR}, ",
        "#{endTag,jdbcType=VARCHAR}, #{ysDate,jdbcType=TIMESTAMP}, ",
        "#{sjDate,jdbcType=TIMESTAMP}, #{qualityUnit,jdbcType=VARCHAR}, ",
        "#{tbType,jdbcType=VARCHAR}, #{guranteeTrackday,jdbcType=TIMESTAMP}, ",
        "#{dbCheckUserId,jdbcType=DECIMAL}, #{dbCheckDate,jdbcType=TIMESTAMP}, ",
        "#{commissionId,jdbcType=DECIMAL}, #{commissionNo,jdbcType=VARCHAR}, ",
        "#{commissionName,jdbcType=VARCHAR}, #{buyerId,jdbcType=DECIMAL}, ",
        "#{buyerNo,jdbcType=VARCHAR}, #{buyerName,jdbcType=VARCHAR}, ",
        "#{dbCheckTag,jdbcType=VARCHAR}, #{gdTag,jdbcType=VARCHAR}, ",
        "#{gdUserId,jdbcType=DECIMAL}, #{gdDate,jdbcType=TIMESTAMP}, ",
        "#{refId,jdbcType=DECIMAL}, #{refType,jdbcType=VARCHAR}, ",
        "#{ocuOrgId,jdbcType=DECIMAL}, #{importNation,jdbcType=VARCHAR}, ",
        "#{grossRate,jdbcType=DECIMAL}, #{scType,jdbcType=VARCHAR}, ",
        "#{signDate,jdbcType=TIMESTAMP}, #{isXyx,jdbcType=VARCHAR}, ",
        "#{isHyx,jdbcType=VARCHAR}, #{isFhEnd,jdbcType=VARCHAR}, ",
        "#{tsDate,jdbcType=TIMESTAMP}, #{iuOcuId,jdbcType=DECIMAL}, ",
        "#{depatureId,jdbcType=DECIMAL}, #{destId,jdbcType=DECIMAL}, ",
        "#{nNo,jdbcType=VARCHAR}, #{inlandOrOverseas,jdbcType=VARCHAR}, ",
        "#{typeOfCon,jdbcType=VARCHAR}, #{cataOfCon,jdbcType=VARCHAR}, ",
        "#{propOfCon,jdbcType=VARCHAR}, #{bizMode,jdbcType=VARCHAR}, ",
        "#{relScId,jdbcType=DECIMAL}, #{conName,jdbcType=VARCHAR}, ",
        "#{signPlace,jdbcType=VARCHAR}, #{conContent,jdbcType=VARCHAR}, ",
        "#{sellerId,jdbcType=DECIMAL}, #{cstNationId,jdbcType=DECIMAL}, ",
        "#{senderId,jdbcType=DECIMAL}, #{landNationId,jdbcType=DECIMAL}, ",
        "#{landPortId,jdbcType=DECIMAL}, #{landLocation,jdbcType=VARCHAR}, ",
        "#{recerId,jdbcType=DECIMAL}, #{destNationId,jdbcType=DECIMAL}, ",
        "#{destPortId,jdbcType=DECIMAL}, #{destLocation,jdbcType=VARCHAR}, ",
        "#{isBatches,jdbcType=VARCHAR}, #{isTransfer,jdbcType=VARCHAR}, ",
        "#{transferPortId,jdbcType=DECIMAL}, #{commissionRate,jdbcType=DECIMAL}, ",
        "#{commissionCurrType,jdbcType=VARCHAR}, #{shipmentWay,jdbcType=VARCHAR}, ",
        "#{boxDeliveryType,jdbcType=VARCHAR}, #{deliveryPlace,jdbcType=VARCHAR}, ",
        "#{proxyCorpId,jdbcType=DECIMAL}, #{isArrignProxy,jdbcType=VARCHAR}, ",
        "#{transResp,jdbcType=VARCHAR}, #{transWay,jdbcType=VARCHAR}, ",
        "#{transCorpId,jdbcType=DECIMAL}, #{isArrignTrans,jdbcType=VARCHAR}, ",
        "#{transFeeResp,jdbcType=VARCHAR}, #{transInsuResp,jdbcType=VARCHAR}, ",
        "#{sendTerm,jdbcType=VARCHAR}, #{arbitrationPlace,jdbcType=VARCHAR}, ",
        "#{suePlace,jdbcType=VARCHAR}, #{isNeedSpecDocu,jdbcType=VARCHAR}, ",
        "#{pricingWay,jdbcType=VARCHAR}, #{settleWay,jdbcType=VARCHAR}, ",
        "#{selfSettleWay,jdbcType=VARCHAR}, #{dkStandard,jdbcType=VARCHAR}, ",
        "#{dkIntRate,jdbcType=DECIMAL}, #{isAgreeDk,jdbcType=VARCHAR}, ",
        "#{conPeriod,jdbcType=DECIMAL}, #{bailRate,jdbcType=DECIMAL}, ",
        "#{profitScheme,jdbcType=VARCHAR}, #{commQuantPack,jdbcType=DECIMAL}, ",
        "#{commQuantStat,jdbcType=DECIMAL}, #{depOrgId,jdbcType=DECIMAL}, ",
        "#{priceStandard,jdbcType=VARCHAR}, #{cstProp,jdbcType=VARCHAR}, ",
        "#{cmdCataId,jdbcType=DECIMAL}, #{sellerName,jdbcType=VARCHAR}, ",
        "#{senderName,jdbcType=VARCHAR}, #{recerName,jdbcType=VARCHAR}, ",
        "#{transCorpName,jdbcType=VARCHAR}, #{proxyCorpName,jdbcType=VARCHAR}, ",
        "#{isClose,jdbcType=VARCHAR}, #{closeUserId,jdbcType=DECIMAL}, ",
        "#{closeDate,jdbcType=TIMESTAMP}, #{shortOrOver,jdbcType=DECIMAL}, ",
        "#{conPeriodSType,jdbcType=VARCHAR}, #{commUnit,jdbcType=DECIMAL}, ",
        "#{isOa,jdbcType=VARCHAR}, #{commPerUnit,jdbcType=DECIMAL}, ",
        "#{lackLoadRate,jdbcType=DECIMAL}, #{overLoadRate,jdbcType=DECIMAL}, ",
        "#{tradeOrSrv,jdbcType=VARCHAR}, #{trSrvOrGoods,jdbcType=VARCHAR}, ",
        "#{profitSchemeDesc,jdbcType=VARCHAR}, #{leaseCorpId,jdbcType=DECIMAL}, ",
        "#{leaseCorpName,jdbcType=VARCHAR}, #{prFeeType,jdbcType=VARCHAR}, ",
        "#{prFeeRate,jdbcType=DECIMAL}, #{prFeeCurrType,jdbcType=VARCHAR}, ",
        "#{prFeeAmt,jdbcType=DECIMAL}, #{leaseMode,jdbcType=VARCHAR}, ",
        "#{planFctId,jdbcType=DECIMAL}, #{planFctName,jdbcType=VARCHAR}, ",
        "#{planManufacId,jdbcType=DECIMAL}, #{planManufacName,jdbcType=VARCHAR}, ",
        "#{complexLevel,jdbcType=DECIMAL}, #{commName,jdbcType=VARCHAR}, ",
        "#{commId,jdbcType=DECIMAL}, #{planPurInlOrOs,jdbcType=VARCHAR}, ",
        "#{bailRateType,jdbcType=VARCHAR}, #{bizType,jdbcType=VARCHAR})"
    })
    int insert(TExpSc record);

    int insertSelective(TExpSc record);

    @Select({
        "select",
        "SC_ID, C_NO, M_DATE, C_STATUS, CST_NO, CURR_TYP, TRADEMODE, ADVANCE_DAY, PRICE_TERM, ",
        "PAYMENT, PAY_DAY, SHIP_D, DEPATURE_NO, DEPATURE_NAME, DEST_NO, DEST_NAME, PACK_TERM, ",
        "INSU_TERM, T_AMT, P_AMT, INSU_FEE, TRANS_FEE, PACK_FEE, COMMISSION_FEE, DISCOUNT_FEE, ",
        "DISCOUNT_NOTE, DEP_NO, NOTES, ORDER_NO, QUALITY_TIME, SUPPLY_SCOPE, CORP_RES, ",
        "IS_COOP, PAY_COOP_TERM, COOP_AMT, EMP_NO, EMP_NAME, MAKER_NO, MAKER_NAME, GROUP_NO, ",
        "MODIFY_NO, MODIFY_NAME, MODIFY_DATE, CHECK_NO, CHECK_NAME, CHECK_DATE, END_ID, ",
        "TAG, IS_VALID, CONFIRM, FROM_ID, C_TYPE, USD_RATE, RMB_RATE, COPY_NUM, TRADE_TYPE, ",
        "PAY_TERM, OC_ID, USDAMT, PRE_NO, ACC_NO, KC_TYPE, GROSS_PROFIT, DISCOUNT_RATE, ",
        "INSTALL_DATE, C_TAG, DOC_BS, DOC_SC, DOC_BC, DOC_YJ, DOC_CERT, DOC_YS, SD_AMT, ",
        "YQ_AMT, KP_QUANT, KP_AMT, FP_QUANT, FP_AMT, ORG_ID, USER_ID, CELL_ID, CST_ID, ",
        "GUARANTEE, CST_NAME, CREDIT_LEFT, PRO_NAME, P_QUANT, CONFIRM_CONDITION, YQ_NOTES, ",
        "QUALITY_YEAR, YJ_INSTALL_DATE, JH_LATE_TERM, YH_TERM, PRO_ID, PRO_TYPE, OUT_OVER_TAG, ",
        "OUT_OVER_DATE, VALID_DATE, UNDO, END_TAG, YS_DATE, SJ_DATE, QUALITY_UNIT, TB_TYPE, ",
        "GURANTEE_TRACKDAY, DB_CHECK_USER_ID, DB_CHECK_DATE, COMMISSION_ID, COMMISSION_NO, ",
        "COMMISSION_NAME, BUYER_ID, BUYER_NO, BUYER_NAME, DB_CHECK_TAG, GD_TAG, GD_USER_ID, ",
        "GD_DATE, REF_ID, REF_TYPE, OCU_ORG_ID, IMPORT_NATION, GROSS_RATE, SC_TYPE, SIGN_DATE, ",
        "IS_XYX, IS_HYX, IS_FH_END, TS_DATE, IU_OCU_ID, DEPATURE_ID, DEST_ID, N_NO, INLAND_OR_OVERSEAS, ",
        "TYPE_OF_CON, CATA_OF_CON, PROP_OF_CON, BIZ_MODE, REL_SC_ID, CON_NAME, SIGN_PLACE, ",
        "CON_CONTENT, SELLER_ID, CST_NATION_ID, SENDER_ID, LAND_NATION_ID, LAND_PORT_ID, ",
        "LAND_LOCATION, RECER_ID, DEST_NATION_ID, DEST_PORT_ID, DEST_LOCATION, IS_BATCHES, ",
        "IS_TRANSFER, TRANSFER_PORT_ID, COMMISSION_RATE, COMMISSION_CURR_TYPE, SHIPMENT_WAY, ",
        "BOX_DELIVERY_TYPE, DELIVERY_PLACE, PROXY_CORP_ID, IS_ARRIGN_PROXY, TRANS_RESP, ",
        "TRANS_WAY, TRANS_CORP_ID, IS_ARRIGN_TRANS, TRANS_FEE_RESP, TRANS_INSU_RESP, ",
        "SEND_TERM, ARBITRATION_PLACE, SUE_PLACE, IS_NEED_SPEC_DOCU, PRICING_WAY, SETTLE_WAY, ",
        "SELF_SETTLE_WAY, DK_STANDARD, DK_INT_RATE, IS_AGREE_DK, CON_PERIOD, BAIL_RATE, ",
        "PROFIT_SCHEME, COMM_QUANT_PACK, COMM_QUANT_STAT, DEP_ORG_ID, PRICE_STANDARD, ",
        "CST_PROP, CMD_CATA_ID, SELLER_NAME, SENDER_NAME, RECER_NAME, TRANS_CORP_NAME, ",
        "PROXY_CORP_NAME, IS_CLOSE, CLOSE_USER_ID, CLOSE_DATE, SHORT_OR_OVER, CON_PERIOD_S_TYPE, ",
        "COMM_UNIT, IS_OA, COMM_PER_UNIT, LACK_LOAD_RATE, OVER_LOAD_RATE, TRADE_OR_SRV, ",
        "TR_SRV_OR_GOODS, PROFIT_SCHEME_DESC, LEASE_CORP_ID, LEASE_CORP_NAME, PR_FEE_TYPE, ",
        "PR_FEE_RATE, PR_FEE_CURR_TYPE, PR_FEE_AMT, LEASE_MODE, PLAN_FCT_ID, PLAN_FCT_NAME, ",
        "PLAN_MANUFAC_ID, PLAN_MANUFAC_NAME, COMPLEX_LEVEL, COMM_NAME, COMM_ID, PLAN_PUR_INL_OR_OS, ",
        "BAIL_RATE_TYPE, BIZ_TYPE, REMARK_CLERK, WH_NAME",
        "from T_EXP_SC",
        "where SC_ID = #{scId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpScDao.BaseResultMap")
    TExpSc selectByPrimaryKey(BigDecimal scId);

    @Select("SELECT SC.CST_ID FROM T_EXP_SC SC, T_EXP_SC_BC SC_BC WHERE SC_BC.SC_ID = SC.SC_ID"
            + " AND SC_BC.BC_P_ID = #{bcPId,jdbcType=DECIMAL} AND ROWNUM < 2")
    BigDecimal selectCstIdByBcPId(BigDecimal bcPId);
    
    @Select({
        "select 'S_ORDER' as tob_type,sc_id as tob_id,user_id as ocu_id",
        "from T_EXP_SC",
        "where c_no like concat(concat('%',#{keyWord}),'%') or con_name like concat(concat('%',#{keyWord}),'%')"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    List<TTrOcuDivide> selectByKeyWord(String keyWord);
    @Select({
        "<script>",
        "select 'S_ORDER' as tob_type,sc_id as tob_id,user_id as ocu_id",
        "from T_EXP_SC",
        "where USER_ID in",
        "<foreach collection='ocuIds' item='item' index='index' open='(' separator=',' close=')'>",
        "<if test='(index % 999) == 998'> NULL ) OR USER_ID IN (</if>#{item}",
        "</foreach>",
//        " and gd_tag !='1'",
        "</script>"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    List<TTrOcuDivide> selectByUserIds(@Param("ocuIds")List<Long> ocuIds);
    
    int updateByPrimaryKeySelective(TExpSc record);
    
    @Select("select f_link(bc.c_no) from MICHAEL.T_EXP_BC bc where bc.bc_id in (select cmd.bc_id "
            + "from michael.T_TR_INVOICE_NOTICE_DTL a, michael.T_TR_INVOICE_NOTICE_DTL_REL b, michael.t_tr_cbcs_cmd_cost cost, "
            + "MICHAEL.T_EXP_BC_CMD CMD where A.dtl_ID = B.DTL_ID and b.rel_type = 'T_TR_CBCS' and b.rel_dtl_id = cost.cost_id "
            + "and CMD.p_Id = cost.rel_cmd_id AND COST.REL_CMD_TYPE = 'P_ORDER_CMD' AND A.notice_id = #{noticeId,jdbcType=DECIMAL})")
    String selectNotesByNoticeId(BigDecimal noticeId);
    
    @Update({
        "update T_EXP_SC",
        "set C_NO = #{cNo,jdbcType=VARCHAR},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "C_STATUS = #{cStatus,jdbcType=VARCHAR},",
          "CST_NO = #{cstNo,jdbcType=VARCHAR},",
          "CURR_TYP = #{currTyp,jdbcType=VARCHAR},",
          "TRADEMODE = #{trademode,jdbcType=VARCHAR},",
          "ADVANCE_DAY = #{advanceDay,jdbcType=DECIMAL},",
          "PRICE_TERM = #{priceTerm,jdbcType=VARCHAR},",
          "PAYMENT = #{payment,jdbcType=VARCHAR},",
          "PAY_DAY = #{payDay,jdbcType=DECIMAL},",
          "SHIP_D = #{shipD,jdbcType=TIMESTAMP},",
          "DEPATURE_NO = #{depatureNo,jdbcType=VARCHAR},",
          "DEPATURE_NAME = #{depatureName,jdbcType=VARCHAR},",
          "DEST_NO = #{destNo,jdbcType=VARCHAR},",
          "DEST_NAME = #{destName,jdbcType=VARCHAR},",
          "PACK_TERM = #{packTerm,jdbcType=VARCHAR},",
          "INSU_TERM = #{insuTerm,jdbcType=VARCHAR},",
          "T_AMT = #{tAmt,jdbcType=DECIMAL},",
          "P_AMT = #{pAmt,jdbcType=DECIMAL},",
          "INSU_FEE = #{insuFee,jdbcType=DECIMAL},",
          "TRANS_FEE = #{transFee,jdbcType=DECIMAL},",
          "PACK_FEE = #{packFee,jdbcType=DECIMAL},",
          "COMMISSION_FEE = #{commissionFee,jdbcType=DECIMAL},",
          "DISCOUNT_FEE = #{discountFee,jdbcType=DECIMAL},",
          "DISCOUNT_NOTE = #{discountNote,jdbcType=VARCHAR},",
          "DEP_NO = #{depNo,jdbcType=VARCHAR},",
          "NOTES = #{notes,jdbcType=VARCHAR},",
          "ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "QUALITY_TIME = #{qualityTime,jdbcType=VARCHAR},",
          "SUPPLY_SCOPE = #{supplyScope,jdbcType=VARCHAR},",
          "CORP_RES = #{corpRes,jdbcType=VARCHAR},",
          "IS_COOP = #{isCoop,jdbcType=VARCHAR},",
          "PAY_COOP_TERM = #{payCoopTerm,jdbcType=VARCHAR},",
          "COOP_AMT = #{coopAmt,jdbcType=DECIMAL},",
          "EMP_NO = #{empNo,jdbcType=VARCHAR},",
          "EMP_NAME = #{empName,jdbcType=VARCHAR},",
          "MAKER_NO = #{makerNo,jdbcType=VARCHAR},",
          "MAKER_NAME = #{makerName,jdbcType=VARCHAR},",
          "GROUP_NO = #{groupNo,jdbcType=VARCHAR},",
          "MODIFY_NO = #{modifyNo,jdbcType=VARCHAR},",
          "MODIFY_NAME = #{modifyName,jdbcType=VARCHAR},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "CHECK_NO = #{checkNo,jdbcType=VARCHAR},",
          "CHECK_NAME = #{checkName,jdbcType=VARCHAR},",
          "CHECK_DATE = #{checkDate,jdbcType=TIMESTAMP},",
          "END_ID = #{endId,jdbcType=VARCHAR},",
          "TAG = #{tag,jdbcType=VARCHAR},",
          "IS_VALID = #{isValid,jdbcType=VARCHAR},",
          "CONFIRM = #{confirm,jdbcType=VARCHAR},",
          "FROM_ID = #{fromId,jdbcType=VARCHAR},",
          "C_TYPE = #{cType,jdbcType=VARCHAR},",
          "USD_RATE = #{usdRate,jdbcType=DECIMAL},",
          "RMB_RATE = #{rmbRate,jdbcType=DECIMAL},",
          "COPY_NUM = #{copyNum,jdbcType=VARCHAR},",
          "TRADE_TYPE = #{tradeType,jdbcType=VARCHAR},",
          "PAY_TERM = #{payTerm,jdbcType=VARCHAR},",
          "OC_ID = #{ocId,jdbcType=DECIMAL},",
          "USDAMT = #{usdamt,jdbcType=DECIMAL},",
          "PRE_NO = #{preNo,jdbcType=VARCHAR},",
          "ACC_NO = #{accNo,jdbcType=VARCHAR},",
          "KC_TYPE = #{kcType,jdbcType=VARCHAR},",
          "GROSS_PROFIT = #{grossProfit,jdbcType=DECIMAL},",
          "DISCOUNT_RATE = #{discountRate,jdbcType=DECIMAL},",
          "INSTALL_DATE = #{installDate,jdbcType=TIMESTAMP},",
          "C_TAG = #{cTag,jdbcType=VARCHAR},",
          "DOC_BS = #{docBs,jdbcType=VARCHAR},",
          "DOC_SC = #{docSc,jdbcType=VARCHAR},",
          "DOC_BC = #{docBc,jdbcType=VARCHAR},",
          "DOC_YJ = #{docYj,jdbcType=VARCHAR},",
          "DOC_CERT = #{docCert,jdbcType=VARCHAR},",
          "DOC_YS = #{docYs,jdbcType=VARCHAR},",
          "SD_AMT = #{sdAmt,jdbcType=DECIMAL},",
          "YQ_AMT = #{yqAmt,jdbcType=DECIMAL},",
          "KP_QUANT = #{kpQuant,jdbcType=DECIMAL},",
          "KP_AMT = #{kpAmt,jdbcType=DECIMAL},",
          "FP_QUANT = #{fpQuant,jdbcType=DECIMAL},",
          "FP_AMT = #{fpAmt,jdbcType=DECIMAL},",
          "ORG_ID = #{orgId,jdbcType=DECIMAL},",
          "USER_ID = #{userId,jdbcType=DECIMAL},",
          "CELL_ID = #{cellId,jdbcType=DECIMAL},",
          "CST_ID = #{cstId,jdbcType=DECIMAL},",
          "GUARANTEE = #{guarantee,jdbcType=VARCHAR},",
          "CST_NAME = #{cstName,jdbcType=VARCHAR},",
          "CREDIT_LEFT = #{creditLeft,jdbcType=DECIMAL},",
          "PRO_NAME = #{proName,jdbcType=VARCHAR},",
          "P_QUANT = #{pQuant,jdbcType=DECIMAL},",
          "CONFIRM_CONDITION = #{confirmCondition,jdbcType=VARCHAR},",
          "YQ_NOTES = #{yqNotes,jdbcType=VARCHAR},",
          "QUALITY_YEAR = #{qualityYear,jdbcType=DECIMAL},",
          "YJ_INSTALL_DATE = #{yjInstallDate,jdbcType=TIMESTAMP},",
          "JH_LATE_TERM = #{jhLateTerm,jdbcType=VARCHAR},",
          "YH_TERM = #{yhTerm,jdbcType=VARCHAR},",
          "PRO_ID = #{proId,jdbcType=DECIMAL},",
          "PRO_TYPE = #{proType,jdbcType=VARCHAR},",
          "OUT_OVER_TAG = #{outOverTag,jdbcType=VARCHAR},",
          "OUT_OVER_DATE = #{outOverDate,jdbcType=TIMESTAMP},",
          "VALID_DATE = #{validDate,jdbcType=TIMESTAMP},",
          "UNDO = #{undo,jdbcType=VARCHAR},",
          "END_TAG = #{endTag,jdbcType=VARCHAR},",
          "YS_DATE = #{ysDate,jdbcType=TIMESTAMP},",
          "SJ_DATE = #{sjDate,jdbcType=TIMESTAMP},",
          "QUALITY_UNIT = #{qualityUnit,jdbcType=VARCHAR},",
          "TB_TYPE = #{tbType,jdbcType=VARCHAR},",
          "GURANTEE_TRACKDAY = #{guranteeTrackday,jdbcType=TIMESTAMP},",
          "DB_CHECK_USER_ID = #{dbCheckUserId,jdbcType=DECIMAL},",
          "DB_CHECK_DATE = #{dbCheckDate,jdbcType=TIMESTAMP},",
          "COMMISSION_ID = #{commissionId,jdbcType=DECIMAL},",
          "COMMISSION_NO = #{commissionNo,jdbcType=VARCHAR},",
          "COMMISSION_NAME = #{commissionName,jdbcType=VARCHAR},",
          "BUYER_ID = #{buyerId,jdbcType=DECIMAL},",
          "BUYER_NO = #{buyerNo,jdbcType=VARCHAR},",
          "BUYER_NAME = #{buyerName,jdbcType=VARCHAR},",
          "DB_CHECK_TAG = #{dbCheckTag,jdbcType=VARCHAR},",
          "GD_TAG = #{gdTag,jdbcType=VARCHAR},",
          "GD_USER_ID = #{gdUserId,jdbcType=DECIMAL},",
          "GD_DATE = #{gdDate,jdbcType=TIMESTAMP},",
          "REF_ID = #{refId,jdbcType=DECIMAL},",
          "REF_TYPE = #{refType,jdbcType=VARCHAR},",
          "OCU_ORG_ID = #{ocuOrgId,jdbcType=DECIMAL},",
          "IMPORT_NATION = #{importNation,jdbcType=VARCHAR},",
          "GROSS_RATE = #{grossRate,jdbcType=DECIMAL},",
          "SC_TYPE = #{scType,jdbcType=VARCHAR},",
          "SIGN_DATE = #{signDate,jdbcType=TIMESTAMP},",
          "IS_XYX = #{isXyx,jdbcType=VARCHAR},",
          "IS_HYX = #{isHyx,jdbcType=VARCHAR},",
          "IS_FH_END = #{isFhEnd,jdbcType=VARCHAR},",
          "TS_DATE = #{tsDate,jdbcType=TIMESTAMP},",
          "IU_OCU_ID = #{iuOcuId,jdbcType=DECIMAL},",
          "DEPATURE_ID = #{depatureId,jdbcType=DECIMAL},",
          "DEST_ID = #{destId,jdbcType=DECIMAL},",
          "N_NO = #{nNo,jdbcType=VARCHAR},",
          "INLAND_OR_OVERSEAS = #{inlandOrOverseas,jdbcType=VARCHAR},",
          "TYPE_OF_CON = #{typeOfCon,jdbcType=VARCHAR},",
          "CATA_OF_CON = #{cataOfCon,jdbcType=VARCHAR},",
          "PROP_OF_CON = #{propOfCon,jdbcType=VARCHAR},",
          "BIZ_MODE = #{bizMode,jdbcType=VARCHAR},",
          "REL_SC_ID = #{relScId,jdbcType=DECIMAL},",
          "CON_NAME = #{conName,jdbcType=VARCHAR},",
          "SIGN_PLACE = #{signPlace,jdbcType=VARCHAR},",
          "CON_CONTENT = #{conContent,jdbcType=VARCHAR},",
          "SELLER_ID = #{sellerId,jdbcType=DECIMAL},",
          "CST_NATION_ID = #{cstNationId,jdbcType=DECIMAL},",
          "SENDER_ID = #{senderId,jdbcType=DECIMAL},",
          "LAND_NATION_ID = #{landNationId,jdbcType=DECIMAL},",
          "LAND_PORT_ID = #{landPortId,jdbcType=DECIMAL},",
          "LAND_LOCATION = #{landLocation,jdbcType=VARCHAR},",
          "RECER_ID = #{recerId,jdbcType=DECIMAL},",
          "DEST_NATION_ID = #{destNationId,jdbcType=DECIMAL},",
          "DEST_PORT_ID = #{destPortId,jdbcType=DECIMAL},",
          "DEST_LOCATION = #{destLocation,jdbcType=VARCHAR},",
          "IS_BATCHES = #{isBatches,jdbcType=VARCHAR},",
          "IS_TRANSFER = #{isTransfer,jdbcType=VARCHAR},",
          "TRANSFER_PORT_ID = #{transferPortId,jdbcType=DECIMAL},",
          "COMMISSION_RATE = #{commissionRate,jdbcType=DECIMAL},",
          "COMMISSION_CURR_TYPE = #{commissionCurrType,jdbcType=VARCHAR},",
          "SHIPMENT_WAY = #{shipmentWay,jdbcType=VARCHAR},",
          "BOX_DELIVERY_TYPE = #{boxDeliveryType,jdbcType=VARCHAR},",
          "DELIVERY_PLACE = #{deliveryPlace,jdbcType=VARCHAR},",
          "PROXY_CORP_ID = #{proxyCorpId,jdbcType=DECIMAL},",
          "IS_ARRIGN_PROXY = #{isArrignProxy,jdbcType=VARCHAR},",
          "TRANS_RESP = #{transResp,jdbcType=VARCHAR},",
          "TRANS_WAY = #{transWay,jdbcType=VARCHAR},",
          "TRANS_CORP_ID = #{transCorpId,jdbcType=DECIMAL},",
          "IS_ARRIGN_TRANS = #{isArrignTrans,jdbcType=VARCHAR},",
          "TRANS_FEE_RESP = #{transFeeResp,jdbcType=VARCHAR},",
          "TRANS_INSU_RESP = #{transInsuResp,jdbcType=VARCHAR},",
          "SEND_TERM = #{sendTerm,jdbcType=VARCHAR},",
          "ARBITRATION_PLACE = #{arbitrationPlace,jdbcType=VARCHAR},",
          "SUE_PLACE = #{suePlace,jdbcType=VARCHAR},",
          "IS_NEED_SPEC_DOCU = #{isNeedSpecDocu,jdbcType=VARCHAR},",
          "PRICING_WAY = #{pricingWay,jdbcType=VARCHAR},",
          "SETTLE_WAY = #{settleWay,jdbcType=VARCHAR},",
          "SELF_SETTLE_WAY = #{selfSettleWay,jdbcType=VARCHAR},",
          "DK_STANDARD = #{dkStandard,jdbcType=VARCHAR},",
          "DK_INT_RATE = #{dkIntRate,jdbcType=DECIMAL},",
          "IS_AGREE_DK = #{isAgreeDk,jdbcType=VARCHAR},",
          "CON_PERIOD = #{conPeriod,jdbcType=DECIMAL},",
          "BAIL_RATE = #{bailRate,jdbcType=DECIMAL},",
          "PROFIT_SCHEME = #{profitScheme,jdbcType=VARCHAR},",
          "COMM_QUANT_PACK = #{commQuantPack,jdbcType=DECIMAL},",
          "COMM_QUANT_STAT = #{commQuantStat,jdbcType=DECIMAL},",
          "DEP_ORG_ID = #{depOrgId,jdbcType=DECIMAL},",
          "PRICE_STANDARD = #{priceStandard,jdbcType=VARCHAR},",
          "CST_PROP = #{cstProp,jdbcType=VARCHAR},",
          "CMD_CATA_ID = #{cmdCataId,jdbcType=DECIMAL},",
          "SELLER_NAME = #{sellerName,jdbcType=VARCHAR},",
          "SENDER_NAME = #{senderName,jdbcType=VARCHAR},",
          "RECER_NAME = #{recerName,jdbcType=VARCHAR},",
          "TRANS_CORP_NAME = #{transCorpName,jdbcType=VARCHAR},",
          "PROXY_CORP_NAME = #{proxyCorpName,jdbcType=VARCHAR},",
          "IS_CLOSE = #{isClose,jdbcType=VARCHAR},",
          "CLOSE_USER_ID = #{closeUserId,jdbcType=DECIMAL},",
          "CLOSE_DATE = #{closeDate,jdbcType=TIMESTAMP},",
          "SHORT_OR_OVER = #{shortOrOver,jdbcType=DECIMAL},",
          "CON_PERIOD_S_TYPE = #{conPeriodSType,jdbcType=VARCHAR},",
          "COMM_UNIT = #{commUnit,jdbcType=DECIMAL},",
          "IS_OA = #{isOa,jdbcType=VARCHAR},",
          "COMM_PER_UNIT = #{commPerUnit,jdbcType=DECIMAL},",
          "LACK_LOAD_RATE = #{lackLoadRate,jdbcType=DECIMAL},",
          "OVER_LOAD_RATE = #{overLoadRate,jdbcType=DECIMAL},",
          "TRADE_OR_SRV = #{tradeOrSrv,jdbcType=VARCHAR},",
          "TR_SRV_OR_GOODS = #{trSrvOrGoods,jdbcType=VARCHAR},",
          "PROFIT_SCHEME_DESC = #{profitSchemeDesc,jdbcType=VARCHAR},",
          "LEASE_CORP_ID = #{leaseCorpId,jdbcType=DECIMAL},",
          "LEASE_CORP_NAME = #{leaseCorpName,jdbcType=VARCHAR},",
          "PR_FEE_TYPE = #{prFeeType,jdbcType=VARCHAR},",
          "PR_FEE_RATE = #{prFeeRate,jdbcType=DECIMAL},",
          "PR_FEE_CURR_TYPE = #{prFeeCurrType,jdbcType=VARCHAR},",
          "PR_FEE_AMT = #{prFeeAmt,jdbcType=DECIMAL},",
          "LEASE_MODE = #{leaseMode,jdbcType=VARCHAR},",
          "PLAN_FCT_ID = #{planFctId,jdbcType=DECIMAL},",
          "PLAN_FCT_NAME = #{planFctName,jdbcType=VARCHAR},",
          "PLAN_MANUFAC_ID = #{planManufacId,jdbcType=DECIMAL},",
          "PLAN_MANUFAC_NAME = #{planManufacName,jdbcType=VARCHAR},",
          "COMPLEX_LEVEL = #{complexLevel,jdbcType=DECIMAL},",
          "COMM_NAME = #{commName,jdbcType=VARCHAR},",
          "COMM_ID = #{commId,jdbcType=DECIMAL},",
          "PLAN_PUR_INL_OR_OS = #{planPurInlOrOs,jdbcType=VARCHAR},",
          "BAIL_RATE_TYPE = #{bailRateType,jdbcType=VARCHAR},",
          "BIZ_TYPE = #{bizType,jdbcType=VARCHAR}",
        "where SC_ID = #{scId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TExpSc record);
}