package com.sumec.contract.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.contract.entity.TTrPurchaseTrack;

public interface ITrPurchaseTrackDao {
    @Delete({
        "delete from T_TR_PURCHASE_TRACK",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String trkGuid);

    @Insert({
        "insert into T_TR_PURCHASE_TRACK (TRK_GUID, SRC_PUR_TYPE, ",
        "SRC_PUR_ID, BC_AMT_ACC, ",
        "BC_AMT_USD, BC_AMT_CNY, ",
        "SEND_QUANT, SEND_AMT, ",
        "UN_SEND_QUANT, UN_SEND_AMT, ",
        "OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
        "HAS_SEND_OVER, CSTS_RELS_QUANT, ",
        "CSTS_RELS_AMT, CSTS_RELS_AMT_USD, ",
        "PAYED_AMT, PAYED_AMT_HK, ",
        "PAYED_AMT_HK_USD, PAYED_AMT_HK_ACC, ",
        "PAYED_AMT_FEE_ACC, PAYED_AMT_TAX_ACC, ",
        "PRE_PAYED_AMT, HAS_PAY_OVER, ",
        "PAYABLE_AMT, PAYABLE_AMT_OVER, ",
        "COLL_INV_QUANT, COLL_INV_AMT, ",
        "COLL_INV_AMT_COST, COLL_INV_AMT_FEE, ",
        "COLL_INV_AMT_FEE_COST, HAS_INV_OVER, ",
        "FCT_LEFT_AMT, CHARGE_CNT, ",
        "CHARGE_AMT, ST_QUANT, ",
        "ST_AMT, ST_AMT_COST, ",
        "CLOSE_STATUS, SYNC_TIME, ",
        "ST_PROC_QUANT, ST_PROC_AMT, ",
        "ST_SA_QUANT, ST_SA_AMT, ",
        "ST_BL_QUANT, ST_BL_AMT, ",
        "ST_TR_QUANT, ST_TR_AMT, ",
        "ST_RK_QUANT, ST_RK_AMT, ",
        "ST_CK_QUANT, ST_CK_AMT, ",
        "ST_PKG_QUANT, ST_PKG_AMT, ",
        "BC_EXEC_QUANT, BC_EXEC_AMT, ",
        "BC_EXEC_AMT_ACC, BC_EXEC_AMT_USD, ",
        "BC_EXEC_AMT_CNY, SALES_QUANT, ",
        "SALES_AMT, INV_PRICE)",
        "values (#{trkGuid,jdbcType=VARCHAR}, #{srcPurType,jdbcType=VARCHAR}, ",
        "#{srcPurId,jdbcType=VARCHAR}, #{bcAmtAcc,jdbcType=DECIMAL}, ",
        "#{bcAmtUsd,jdbcType=DECIMAL}, #{bcAmtCny,jdbcType=DECIMAL}, ",
        "#{sendQuant,jdbcType=DECIMAL}, #{sendAmt,jdbcType=DECIMAL}, ",
        "#{unSendQuant,jdbcType=DECIMAL}, #{unSendAmt,jdbcType=DECIMAL}, ",
        "#{overdueUnSendQuant,jdbcType=DECIMAL}, #{overdueUnSendAmt,jdbcType=DECIMAL}, ",
        "#{hasSendOver,jdbcType=VARCHAR}, #{cstsRelsQuant,jdbcType=DECIMAL}, ",
        "#{cstsRelsAmt,jdbcType=DECIMAL}, #{cstsRelsAmtUsd,jdbcType=DECIMAL}, ",
        "#{payedAmt,jdbcType=DECIMAL}, #{payedAmtHk,jdbcType=DECIMAL}, ",
        "#{payedAmtHkUsd,jdbcType=DECIMAL}, #{payedAmtHkAcc,jdbcType=DECIMAL}, ",
        "#{payedAmtFeeAcc,jdbcType=DECIMAL}, #{payedAmtTaxAcc,jdbcType=DECIMAL}, ",
        "#{prePayedAmt,jdbcType=DECIMAL}, #{hasPayOver,jdbcType=VARCHAR}, ",
        "#{payableAmt,jdbcType=DECIMAL}, #{payableAmtOver,jdbcType=DECIMAL}, ",
        "#{collInvQuant,jdbcType=DECIMAL}, #{collInvAmt,jdbcType=DECIMAL}, ",
        "#{collInvAmtCost,jdbcType=DECIMAL}, #{collInvAmtFee,jdbcType=DECIMAL}, ",
        "#{collInvAmtFeeCost,jdbcType=DECIMAL}, #{hasInvOver,jdbcType=VARCHAR}, ",
        "#{fctLeftAmt,jdbcType=DECIMAL}, #{chargeCnt,jdbcType=DECIMAL}, ",
        "#{chargeAmt,jdbcType=DECIMAL}, #{stQuant,jdbcType=DECIMAL}, ",
        "#{stAmt,jdbcType=DECIMAL}, #{stAmtCost,jdbcType=DECIMAL}, ",
        "#{closeStatus,jdbcType=VARCHAR}, #{syncTime,jdbcType=TIMESTAMP}, ",
        "#{stProcQuant,jdbcType=DECIMAL}, #{stProcAmt,jdbcType=DECIMAL}, ",
        "#{stSaQuant,jdbcType=DECIMAL}, #{stSaAmt,jdbcType=DECIMAL}, ",
        "#{stBlQuant,jdbcType=DECIMAL}, #{stBlAmt,jdbcType=DECIMAL}, ",
        "#{stTrQuant,jdbcType=DECIMAL}, #{stTrAmt,jdbcType=DECIMAL}, ",
        "#{stRkQuant,jdbcType=DECIMAL}, #{stRkAmt,jdbcType=DECIMAL}, ",
        "#{stCkQuant,jdbcType=DECIMAL}, #{stCkAmt,jdbcType=DECIMAL}, ",
        "#{stPkgQuant,jdbcType=DECIMAL}, #{stPkgAmt,jdbcType=DECIMAL}, ",
        "#{bcExecQuant,jdbcType=DECIMAL}, #{bcExecAmt,jdbcType=DECIMAL}, ",
        "#{bcExecAmtAcc,jdbcType=DECIMAL}, #{bcExecAmtUsd,jdbcType=DECIMAL}, ",
        "#{bcExecAmtCny,jdbcType=DECIMAL}, #{salesQuant,jdbcType=DECIMAL}, ",
        "#{salesAmt,jdbcType=DECIMAL}, #{invPrice,jdbcType=DECIMAL})"
    })
    int insert(TTrPurchaseTrack record);

    int insertSelective(TTrPurchaseTrack record);

    @Select({
        "select",
        "TRK_GUID, SRC_PUR_TYPE, SRC_PUR_ID, BC_AMT_ACC, BC_AMT_USD, BC_AMT_CNY, SEND_QUANT, ",
        "SEND_AMT, UN_SEND_QUANT, UN_SEND_AMT, OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
        "HAS_SEND_OVER, CSTS_RELS_QUANT, CSTS_RELS_AMT, CSTS_RELS_AMT_USD, PAYED_AMT, ",
        "PAYED_AMT_HK, PAYED_AMT_HK_USD, PAYED_AMT_HK_ACC, PAYED_AMT_FEE_ACC, PAYED_AMT_TAX_ACC, ",
        "PRE_PAYED_AMT, HAS_PAY_OVER, PAYABLE_AMT, PAYABLE_AMT_OVER, COLL_INV_QUANT, ",
        "COLL_INV_AMT, COLL_INV_AMT_COST, COLL_INV_AMT_FEE, COLL_INV_AMT_FEE_COST, HAS_INV_OVER, ",
        "FCT_LEFT_AMT, CHARGE_CNT, CHARGE_AMT, ST_QUANT, ST_AMT, ST_AMT_COST, CLOSE_STATUS, ",
        "SYNC_TIME, ST_PROC_QUANT, ST_PROC_AMT, ST_SA_QUANT, ST_SA_AMT, ST_BL_QUANT, ",
        "ST_BL_AMT, ST_TR_QUANT, ST_TR_AMT, ST_RK_QUANT, ST_RK_AMT, ST_CK_QUANT, ST_CK_AMT, ",
        "ST_PKG_QUANT, ST_PKG_AMT, BC_EXEC_QUANT, BC_EXEC_AMT, BC_EXEC_AMT_ACC, BC_EXEC_AMT_USD, ",
        "BC_EXEC_AMT_CNY, SALES_QUANT, SALES_AMT, INV_PRICE",
        "from T_TR_PURCHASE_TRACK",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.ITrPurchaseTrackDao.BaseResultMap")
    TTrPurchaseTrack selectByPrimaryKey(String trkGuid);

    @Select({
        "select",
        "TRK_GUID, SRC_PUR_TYPE, SRC_PUR_ID, BC_AMT_ACC, BC_AMT_USD, BC_AMT_CNY, SEND_QUANT, ",
        "SEND_AMT, UN_SEND_QUANT, UN_SEND_AMT, OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
        "HAS_SEND_OVER, CSTS_RELS_QUANT, CSTS_RELS_AMT, CSTS_RELS_AMT_USD, PAYED_AMT, ",
        "PAYED_AMT_HK, PAYED_AMT_HK_USD, PAYED_AMT_HK_ACC, PAYED_AMT_FEE_ACC, PAYED_AMT_TAX_ACC, ",
        "PRE_PAYED_AMT, HAS_PAY_OVER, PAYABLE_AMT, PAYABLE_AMT_OVER, COLL_INV_QUANT, ",
        "COLL_INV_AMT, COLL_INV_AMT_COST, COLL_INV_AMT_FEE, COLL_INV_AMT_FEE_COST, HAS_INV_OVER, ",
        "FCT_LEFT_AMT, CHARGE_CNT, CHARGE_AMT, ST_QUANT, ST_AMT, ST_AMT_COST, CLOSE_STATUS, ",
        "SYNC_TIME, ST_PROC_QUANT, ST_PROC_AMT, ST_SA_QUANT, ST_SA_AMT, ST_BL_QUANT, ",
        "ST_BL_AMT, ST_TR_QUANT, ST_TR_AMT, ST_RK_QUANT, ST_RK_AMT, ST_CK_QUANT, ST_CK_AMT, ",
        "ST_PKG_QUANT, ST_PKG_AMT, BC_EXEC_QUANT, BC_EXEC_AMT, BC_EXEC_AMT_ACC, BC_EXEC_AMT_USD, ",
        "BC_EXEC_AMT_CNY, SALES_QUANT, SALES_AMT, INV_PRICE",
        "from T_TR_PURCHASE_TRACK",
        "where SRC_PUR_TYPE = #{purType,jdbcType=VARCHAR} and SRC_PUR_ID = #{purId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.ITrPurchaseTrackDao.BaseResultMap")
    TTrPurchaseTrack selectById(@Param("purType")String purType, @Param("purId")String purId);
    
    @Select({
        "<script>",
            "select",
            "sum(nvl(BC_AMT_ACC, 0)) as BC_AMT_ACC,sum(nvl(BC_AMT_USD, 0)) as BC_AMT_USD, ",
            "sum(nvl(BC_AMT_CNY, 0)) as BC_AMT_CNY,sum(nvl(SEND_QUANT, 0)) as SEND_QUANT, ",
            "sum(nvl(SEND_AMT, 0)) as SEND_AMT,sum(nvl(UN_SEND_QUANT, 0)) as UN_SEND_QUANT, ",
            "sum(nvl(UN_SEND_AMT, 0)) as UN_SEND_AMT,sum(nvl(OVERDUE_UN_SEND_QUANT, 0)) as OVERDUE_UN_SEND_QUANT, ",
            "sum(nvl(OVERDUE_UN_SEND_AMT, 0)) as OVERDUE_UN_SEND_AMT,sum(nvl(CSTS_RELS_QUANT, 0)) as CSTS_RELS_QUANT,",
            "sum(nvl(CSTS_RELS_AMT, 0)) as CSTS_RELS_AMT,sum(nvl(CSTS_RELS_AMT_USD, 0)) as CSTS_RELS_AMT_USD,",
            "sum(nvl(PAYED_AMT, 0)) as PAYED_AMT,sum(nvl(PAYED_AMT_HK, 0)) as PAYED_AMT_HK,",
            "sum(nvl(PAYED_AMT_HK_USD, 0)) as PAYED_AMT_HK_USD,sum(nvl(PAYED_AMT_HK_ACC, 0)) as PAYED_AMT_HK_ACC,",
            "sum(nvl(PAYED_AMT_FEE_ACC, 0)) as PAYED_AMT_FEE_ACC,sum(nvl(PAYED_AMT_TAX_ACC, 0)) as PAYED_AMT_TAX_ACC,",
            "sum(nvl(PRE_PAYED_AMT, 0)) as PRE_PAYED_AMT,sum(nvl(PAYABLE_AMT, 0)) as PAYABLE_AMT,",
            "sum(nvl(PAYABLE_AMT_OVER, 0)) as PAYABLE_AMT_OVER,sum(nvl(COLL_INV_QUANT, 0)) as COLL_INV_QUANT,",
            "sum(nvl(COLL_INV_AMT, 0)) as COLL_INV_AMT,sum(nvl(COLL_INV_AMT_COST, 0)) as COLL_INV_AMT_COST,  ",
            "sum(nvl(COLL_INV_AMT_FEE, 0)) as COLL_INV_AMT_FEE,sum(nvl(COLL_INV_AMT_FEE_COST, 0)) as COLL_INV_AMT_FEE_COST,  ",
            "sum(nvl(FCT_LEFT_AMT, 0)) as FCT_LEFT_AMT,sum(nvl(CHARGE_CNT, 0)) as CHARGE_CNT,",
            "sum(nvl(CHARGE_AMT, 0)) as CHARGE_AMT,sum(nvl(ST_QUANT, 0)) as ST_QUANT,",
            "sum(nvl(ST_AMT, 0)) as ST_AMT,sum(nvl(ST_AMT_COST, 0)) as ST_AMT_COST,",
            "sum(nvl(ST_PROC_QUANT, 0)) as ST_PROC_QUANT,sum(nvl(ST_PROC_AMT, 0)) as ST_PROC_AMT,",
            "sum(nvl(ST_SA_QUANT, 0)) as ST_SA_QUANT,sum(nvl(ST_SA_AMT, 0)) as ST_SA_AMT,",
            "sum(nvl(ST_BL_QUANT, 0)) as ST_BL_QUANT,sum(nvl(ST_BL_AMT, 0)) as ST_BL_AMT,",
            "sum(nvl(ST_TR_QUANT, 0)) as ST_TR_QUANT,sum(nvl(ST_TR_AMT, 0)) as ST_TR_AMT,",
            "sum(nvl(ST_RK_QUANT, 0)) as ST_RK_QUANT,sum(nvl(ST_RK_AMT, 0)) as ST_RK_AMT,",
            "sum(nvl(ST_CK_QUANT, 0)) as ST_CK_QUANT,sum(nvl(ST_CK_AMT, 0)) as ST_CK_AMT,",
            "sum(nvl(ST_PKG_QUANT, 0)) as ST_PKG_QUANT,sum(nvl(ST_PKG_AMT, 0)) as ST_PKG_AMT,",
            "sum(nvl(BC_EXEC_QUANT, 0)) as BC_EXEC_QUANT,sum(nvl(BC_EXEC_AMT, 0)) as BC_EXEC_AMT,",
            "sum(nvl(BC_EXEC_AMT_ACC, 0)) as BC_EXEC_AMT_ACC,sum(nvl(BC_EXEC_AMT_USD, 0)) as BC_EXEC_AMT_USD,",
            "sum(nvl(BC_EXEC_AMT_CNY, 0)) as BC_EXEC_AMT_CNY,sum(nvl(SALES_QUANT, 0)) as SALES_QUANT,",
            "sum(nvl(SALES_AMT, 0)) as SALES_AMT,sum(nvl(INV_PRICE, 0)) as INV_PRICE,",
            "sum(nvl(SHOULD_SEND_QUANT, 0)) as SHOULD_SEND_QUANT,sum(nvl(ORD_SHOULD_SEND_QUANT, 0)) as ORD_SHOULD_SEND_QUANT,",
            "sum(nvl(ORD_UN_SEND_QUANT, 0)) as ORD_UN_SEND_QUANT,sum(nvl(ORD_UN_SEND_AMT, 0)) as ORD_UN_SEND_AMT ",
            "from T_TR_PURCHASE_TRACK",
            "where SRC_PUR_TYPE = #{purType,jdbcType=VARCHAR} and SRC_PUR_ID in",
            "<foreach collection='ids' item='item' open='(' separator=',' close=')'>",
                "#{item} ",
            "</foreach>",
        "</script>"
    })
    @ResultMap("com.sumec.contract.dao.ITrPurchaseTrackDao.BaseResultMap")
    TTrPurchaseTrack selectByIds(@Param("purType")String purType, @Param("ids")List<String> ids);
    
    int updateByPrimaryKeySelective(TTrPurchaseTrack record);

    @Update({
        "update T_TR_PURCHASE_TRACK",
        "set SRC_PUR_TYPE = #{srcPurType,jdbcType=VARCHAR},",
          "SRC_PUR_ID = #{srcPurId,jdbcType=VARCHAR},",
          "BC_AMT_ACC = #{bcAmtAcc,jdbcType=DECIMAL},",
          "BC_AMT_USD = #{bcAmtUsd,jdbcType=DECIMAL},",
          "BC_AMT_CNY = #{bcAmtCny,jdbcType=DECIMAL},",
          "SEND_QUANT = #{sendQuant,jdbcType=DECIMAL},",
          "SEND_AMT = #{sendAmt,jdbcType=DECIMAL},",
          "UN_SEND_QUANT = #{unSendQuant,jdbcType=DECIMAL},",
          "UN_SEND_AMT = #{unSendAmt,jdbcType=DECIMAL},",
          "OVERDUE_UN_SEND_QUANT = #{overdueUnSendQuant,jdbcType=DECIMAL},",
          "OVERDUE_UN_SEND_AMT = #{overdueUnSendAmt,jdbcType=DECIMAL},",
          "HAS_SEND_OVER = #{hasSendOver,jdbcType=VARCHAR},",
          "CSTS_RELS_QUANT = #{cstsRelsQuant,jdbcType=DECIMAL},",
          "CSTS_RELS_AMT = #{cstsRelsAmt,jdbcType=DECIMAL},",
          "CSTS_RELS_AMT_USD = #{cstsRelsAmtUsd,jdbcType=DECIMAL},",
          "PAYED_AMT = #{payedAmt,jdbcType=DECIMAL},",
          "PAYED_AMT_HK = #{payedAmtHk,jdbcType=DECIMAL},",
          "PAYED_AMT_HK_USD = #{payedAmtHkUsd,jdbcType=DECIMAL},",
          "PAYED_AMT_HK_ACC = #{payedAmtHkAcc,jdbcType=DECIMAL},",
          "PAYED_AMT_FEE_ACC = #{payedAmtFeeAcc,jdbcType=DECIMAL},",
          "PAYED_AMT_TAX_ACC = #{payedAmtTaxAcc,jdbcType=DECIMAL},",
          "PRE_PAYED_AMT = #{prePayedAmt,jdbcType=DECIMAL},",
          "HAS_PAY_OVER = #{hasPayOver,jdbcType=VARCHAR},",
          "PAYABLE_AMT = #{payableAmt,jdbcType=DECIMAL},",
          "PAYABLE_AMT_OVER = #{payableAmtOver,jdbcType=DECIMAL},",
          "COLL_INV_QUANT = #{collInvQuant,jdbcType=DECIMAL},",
          "COLL_INV_AMT = #{collInvAmt,jdbcType=DECIMAL},",
          "COLL_INV_AMT_COST = #{collInvAmtCost,jdbcType=DECIMAL},",
          "COLL_INV_AMT_FEE = #{collInvAmtFee,jdbcType=DECIMAL},",
          "COLL_INV_AMT_FEE_COST = #{collInvAmtFeeCost,jdbcType=DECIMAL},",
          "HAS_INV_OVER = #{hasInvOver,jdbcType=VARCHAR},",
          "FCT_LEFT_AMT = #{fctLeftAmt,jdbcType=DECIMAL},",
          "CHARGE_CNT = #{chargeCnt,jdbcType=DECIMAL},",
          "CHARGE_AMT = #{chargeAmt,jdbcType=DECIMAL},",
          "ST_QUANT = #{stQuant,jdbcType=DECIMAL},",
          "ST_AMT = #{stAmt,jdbcType=DECIMAL},",
          "ST_AMT_COST = #{stAmtCost,jdbcType=DECIMAL},",
          "CLOSE_STATUS = #{closeStatus,jdbcType=VARCHAR},",
          "SYNC_TIME = #{syncTime,jdbcType=TIMESTAMP},",
          "ST_PROC_QUANT = #{stProcQuant,jdbcType=DECIMAL},",
          "ST_PROC_AMT = #{stProcAmt,jdbcType=DECIMAL},",
          "ST_SA_QUANT = #{stSaQuant,jdbcType=DECIMAL},",
          "ST_SA_AMT = #{stSaAmt,jdbcType=DECIMAL},",
          "ST_BL_QUANT = #{stBlQuant,jdbcType=DECIMAL},",
          "ST_BL_AMT = #{stBlAmt,jdbcType=DECIMAL},",
          "ST_TR_QUANT = #{stTrQuant,jdbcType=DECIMAL},",
          "ST_TR_AMT = #{stTrAmt,jdbcType=DECIMAL},",
          "ST_RK_QUANT = #{stRkQuant,jdbcType=DECIMAL},",
          "ST_RK_AMT = #{stRkAmt,jdbcType=DECIMAL},",
          "ST_CK_QUANT = #{stCkQuant,jdbcType=DECIMAL},",
          "ST_CK_AMT = #{stCkAmt,jdbcType=DECIMAL},",
          "ST_PKG_QUANT = #{stPkgQuant,jdbcType=DECIMAL},",
          "ST_PKG_AMT = #{stPkgAmt,jdbcType=DECIMAL},",
          "BC_EXEC_QUANT = #{bcExecQuant,jdbcType=DECIMAL},",
          "BC_EXEC_AMT = #{bcExecAmt,jdbcType=DECIMAL},",
          "BC_EXEC_AMT_ACC = #{bcExecAmtAcc,jdbcType=DECIMAL},",
          "BC_EXEC_AMT_USD = #{bcExecAmtUsd,jdbcType=DECIMAL},",
          "BC_EXEC_AMT_CNY = #{bcExecAmtCny,jdbcType=DECIMAL},",
          "SALES_QUANT = #{salesQuant,jdbcType=DECIMAL},",
          "SALES_AMT = #{salesAmt,jdbcType=DECIMAL},",
          "INV_PRICE = #{invPrice,jdbcType=DECIMAL}",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrPurchaseTrack record);
}