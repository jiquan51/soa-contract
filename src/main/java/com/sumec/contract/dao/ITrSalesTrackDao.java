package com.sumec.contract.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.contract.entity.TTrSalesTrack;

public interface ITrSalesTrackDao {
    @Delete({
        "delete from T_TR_SALES_TRACK",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String trkGuid);

    @Insert({
        "insert into T_TR_SALES_TRACK (TRK_GUID, SRC_SC_TYPE, ",
        "SRC_SC_ID, SC_AMT_ACC, ",
        "SC_AMT_USD, SC_AMT_CNY, ",
        "SEND_QUANT, SEND_AMT, ",
        "UN_SEND_QUANT, UN_SEND_AMT, ",
        "OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
        "HAS_SEND_OVER, CST_SIGN_QUANT, ",
        "CST_SIGN_AMT, HAS_SIGN_OVER, ",
        "PUR_QUANT, PUR_AMT, ",
        "HAS_PUR_OVER, COLL_AMT, ",
        "COLL_AMT_BAIL, COLL_AMT_HK, ",
        "COLL_AMT_FEE, COLL_AMT_OTHER, ",
        "PRE_COLL_AMT, CST_LEFT_AMT, ",
        "RECEIVABLE_AMT, OVERDUE_RECEIVABLE_AMT, ",
        "HAS_COLL_OVER, KP_QUANT, ",
        "KP_AMT, HAS_KP_OVER, ",
        "SETTLE_QUANT, SETTLE_AMT, ",
        "HAS_SETTLE_OVER, CLOSE_STATUS, ",
        "BIZ_SELL_IN_AMT, BIZ_COST_AMT, ",
        "BIZ_FEE_AMT, BIZ_PROFIT_AMT, ",
        "ACC_SELL_IN_AMT, ACC_COST_AMT, ",
        "ACC_FEE_AMT, ACC_PROFIT_AMT, ",
        "SYNC_TIME, SC_EXEC_QUANT, ",
        "SC_EXEC_AMT, SC_EXEC_AMT_ACC, ",
        "SC_EXEC_AMT_USD, SC_EXEC_AMT_CNY, ",
        "PUR_PRICE, PUR_INV_PRICE, ",
        "FIRST_PAY_DATE, LAST_PAY_DATE, ",
        "CALC_PR_FEE, PUR_SEND_QUANT, ",
        "PUR_SEND_AMT, ST_QUANT, ",
        "ST_AMT)",
        "values (#{trkGuid,jdbcType=VARCHAR}, #{srcScType,jdbcType=VARCHAR}, ",
        "#{srcScId,jdbcType=VARCHAR}, #{scAmtAcc,jdbcType=DECIMAL}, ",
        "#{scAmtUsd,jdbcType=DECIMAL}, #{scAmtCny,jdbcType=DECIMAL}, ",
        "#{sendQuant,jdbcType=DECIMAL}, #{sendAmt,jdbcType=DECIMAL}, ",
        "#{unSendQuant,jdbcType=DECIMAL}, #{unSendAmt,jdbcType=DECIMAL}, ",
        "#{overdueUnSendQuant,jdbcType=DECIMAL}, #{overdueUnSendAmt,jdbcType=DECIMAL}, ",
        "#{hasSendOver,jdbcType=VARCHAR}, #{cstSignQuant,jdbcType=DECIMAL}, ",
        "#{cstSignAmt,jdbcType=DECIMAL}, #{hasSignOver,jdbcType=VARCHAR}, ",
        "#{purQuant,jdbcType=DECIMAL}, #{purAmt,jdbcType=DECIMAL}, ",
        "#{hasPurOver,jdbcType=VARCHAR}, #{collAmt,jdbcType=DECIMAL}, ",
        "#{collAmtBail,jdbcType=DECIMAL}, #{collAmtHk,jdbcType=DECIMAL}, ",
        "#{collAmtFee,jdbcType=DECIMAL}, #{collAmtOther,jdbcType=DECIMAL}, ",
        "#{preCollAmt,jdbcType=DECIMAL}, #{cstLeftAmt,jdbcType=DECIMAL}, ",
        "#{receivableAmt,jdbcType=DECIMAL}, #{overdueReceivableAmt,jdbcType=DECIMAL}, ",
        "#{hasCollOver,jdbcType=VARCHAR}, #{kpQuant,jdbcType=DECIMAL}, ",
        "#{kpAmt,jdbcType=DECIMAL}, #{hasKpOver,jdbcType=VARCHAR}, ",
        "#{settleQuant,jdbcType=DECIMAL}, #{settleAmt,jdbcType=DECIMAL}, ",
        "#{hasSettleOver,jdbcType=VARCHAR}, #{closeStatus,jdbcType=VARCHAR}, ",
        "#{bizSellInAmt,jdbcType=DECIMAL}, #{bizCostAmt,jdbcType=DECIMAL}, ",
        "#{bizFeeAmt,jdbcType=DECIMAL}, #{bizProfitAmt,jdbcType=DECIMAL}, ",
        "#{accSellInAmt,jdbcType=DECIMAL}, #{accCostAmt,jdbcType=DECIMAL}, ",
        "#{accFeeAmt,jdbcType=DECIMAL}, #{accProfitAmt,jdbcType=DECIMAL}, ",
        "#{syncTime,jdbcType=TIMESTAMP}, #{scExecQuant,jdbcType=DECIMAL}, ",
        "#{scExecAmt,jdbcType=DECIMAL}, #{scExecAmtAcc,jdbcType=DECIMAL}, ",
        "#{scExecAmtUsd,jdbcType=DECIMAL}, #{scExecAmtCny,jdbcType=DECIMAL}, ",
        "#{purPrice,jdbcType=DECIMAL}, #{purInvPrice,jdbcType=DECIMAL}, ",
        "#{firstPayDate,jdbcType=TIMESTAMP}, #{lastPayDate,jdbcType=TIMESTAMP}, ",
        "#{calcPrFee,jdbcType=DECIMAL}, #{purSendQuant,jdbcType=DECIMAL}, ",
        "#{purSendAmt,jdbcType=DECIMAL}, #{stQuant,jdbcType=DECIMAL}, ",
        "#{stAmt,jdbcType=DECIMAL})"
    })
    int insert(TTrSalesTrack record);

    int insertSelective(TTrSalesTrack record);

    @Select({
        "select",
        "TRK_GUID, SRC_SC_TYPE, SRC_SC_ID, SC_AMT_ACC, SC_AMT_USD, SC_AMT_CNY, SEND_QUANT, ",
        "SEND_AMT, UN_SEND_QUANT, UN_SEND_AMT, OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
        "HAS_SEND_OVER, CST_SIGN_QUANT, CST_SIGN_AMT, HAS_SIGN_OVER, PUR_QUANT, PUR_AMT, ",
        "HAS_PUR_OVER, COLL_AMT, COLL_AMT_BAIL, COLL_AMT_HK, COLL_AMT_FEE, COLL_AMT_OTHER, ",
        "PRE_COLL_AMT, CST_LEFT_AMT, RECEIVABLE_AMT, OVERDUE_RECEIVABLE_AMT, HAS_COLL_OVER, ",
        "KP_QUANT, KP_AMT, HAS_KP_OVER, SETTLE_QUANT, SETTLE_AMT, HAS_SETTLE_OVER, CLOSE_STATUS, ",
        "BIZ_SELL_IN_AMT, BIZ_COST_AMT, BIZ_FEE_AMT, BIZ_PROFIT_AMT, ACC_SELL_IN_AMT, ",
        "ACC_COST_AMT, ACC_FEE_AMT, ACC_PROFIT_AMT, SYNC_TIME, SC_EXEC_QUANT, SC_EXEC_AMT, ",
        "SC_EXEC_AMT_ACC, SC_EXEC_AMT_USD, SC_EXEC_AMT_CNY, PUR_PRICE, PUR_INV_PRICE, ",
        "FIRST_PAY_DATE, LAST_PAY_DATE, CALC_PR_FEE, PUR_SEND_QUANT, PUR_SEND_AMT, ST_QUANT, ",
        "ST_AMT",
        "from T_TR_SALES_TRACK",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.TTrSalesTrackMapper.BaseResultMap")
    TTrSalesTrack selectByPrimaryKey(String trkGuid);

    @Select({
    	"select",
    	"TRK_GUID, SRC_SC_TYPE, SRC_SC_ID, SC_AMT_ACC, SC_AMT_USD, SC_AMT_CNY, SEND_QUANT, ",
    	"SEND_AMT, UN_SEND_QUANT, UN_SEND_AMT, OVERDUE_UN_SEND_QUANT, OVERDUE_UN_SEND_AMT, ",
    	"HAS_SEND_OVER, CST_SIGN_QUANT, CST_SIGN_AMT, HAS_SIGN_OVER, PUR_QUANT, PUR_AMT, ",
    	"HAS_PUR_OVER, COLL_AMT, COLL_AMT_BAIL, COLL_AMT_HK, COLL_AMT_FEE, COLL_AMT_OTHER, ",
    	"PRE_COLL_AMT, CST_LEFT_AMT, RECEIVABLE_AMT, OVERDUE_RECEIVABLE_AMT, HAS_COLL_OVER, ",
    	"KP_QUANT, KP_AMT, HAS_KP_OVER, SETTLE_QUANT, SETTLE_AMT, HAS_SETTLE_OVER, CLOSE_STATUS, ",
    	"BIZ_SELL_IN_AMT, BIZ_COST_AMT, BIZ_FEE_AMT, BIZ_PROFIT_AMT, ACC_SELL_IN_AMT, ",
    	"ACC_COST_AMT, ACC_FEE_AMT, ACC_PROFIT_AMT, SYNC_TIME, SC_EXEC_QUANT, SC_EXEC_AMT, ",
    	"SC_EXEC_AMT_ACC, SC_EXEC_AMT_USD, SC_EXEC_AMT_CNY, PUR_PRICE, PUR_INV_PRICE, ",
    	"FIRST_PAY_DATE, LAST_PAY_DATE, CALC_PR_FEE, PUR_SEND_QUANT, PUR_SEND_AMT, ST_QUANT, ",
    	"ST_AMT",
    	"from T_TR_SALES_TRACK",
        "where SRC_SC_TYPE = #{salType,jdbcType=VARCHAR} and SRC_SC_ID = #{salId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.TTrSalesTrackMapper.BaseResultMap")
    TTrSalesTrack selectById(@Param("salType")String salType, @Param("salId")String salId);

    int updateByPrimaryKeySelective(TTrSalesTrack record);

    @Update({
        "update T_TR_SALES_TRACK",
        "set SRC_SC_TYPE = #{srcScType,jdbcType=VARCHAR},",
          "SRC_SC_ID = #{srcScId,jdbcType=VARCHAR},",
          "SC_AMT_ACC = #{scAmtAcc,jdbcType=DECIMAL},",
          "SC_AMT_USD = #{scAmtUsd,jdbcType=DECIMAL},",
          "SC_AMT_CNY = #{scAmtCny,jdbcType=DECIMAL},",
          "SEND_QUANT = #{sendQuant,jdbcType=DECIMAL},",
          "SEND_AMT = #{sendAmt,jdbcType=DECIMAL},",
          "UN_SEND_QUANT = #{unSendQuant,jdbcType=DECIMAL},",
          "UN_SEND_AMT = #{unSendAmt,jdbcType=DECIMAL},",
          "OVERDUE_UN_SEND_QUANT = #{overdueUnSendQuant,jdbcType=DECIMAL},",
          "OVERDUE_UN_SEND_AMT = #{overdueUnSendAmt,jdbcType=DECIMAL},",
          "HAS_SEND_OVER = #{hasSendOver,jdbcType=VARCHAR},",
          "CST_SIGN_QUANT = #{cstSignQuant,jdbcType=DECIMAL},",
          "CST_SIGN_AMT = #{cstSignAmt,jdbcType=DECIMAL},",
          "HAS_SIGN_OVER = #{hasSignOver,jdbcType=VARCHAR},",
          "PUR_QUANT = #{purQuant,jdbcType=DECIMAL},",
          "PUR_AMT = #{purAmt,jdbcType=DECIMAL},",
          "HAS_PUR_OVER = #{hasPurOver,jdbcType=VARCHAR},",
          "COLL_AMT = #{collAmt,jdbcType=DECIMAL},",
          "COLL_AMT_BAIL = #{collAmtBail,jdbcType=DECIMAL},",
          "COLL_AMT_HK = #{collAmtHk,jdbcType=DECIMAL},",
          "COLL_AMT_FEE = #{collAmtFee,jdbcType=DECIMAL},",
          "COLL_AMT_OTHER = #{collAmtOther,jdbcType=DECIMAL},",
          "PRE_COLL_AMT = #{preCollAmt,jdbcType=DECIMAL},",
          "CST_LEFT_AMT = #{cstLeftAmt,jdbcType=DECIMAL},",
          "RECEIVABLE_AMT = #{receivableAmt,jdbcType=DECIMAL},",
          "OVERDUE_RECEIVABLE_AMT = #{overdueReceivableAmt,jdbcType=DECIMAL},",
          "HAS_COLL_OVER = #{hasCollOver,jdbcType=VARCHAR},",
          "KP_QUANT = #{kpQuant,jdbcType=DECIMAL},",
          "KP_AMT = #{kpAmt,jdbcType=DECIMAL},",
          "HAS_KP_OVER = #{hasKpOver,jdbcType=VARCHAR},",
          "SETTLE_QUANT = #{settleQuant,jdbcType=DECIMAL},",
          "SETTLE_AMT = #{settleAmt,jdbcType=DECIMAL},",
          "HAS_SETTLE_OVER = #{hasSettleOver,jdbcType=VARCHAR},",
          "CLOSE_STATUS = #{closeStatus,jdbcType=VARCHAR},",
          "BIZ_SELL_IN_AMT = #{bizSellInAmt,jdbcType=DECIMAL},",
          "BIZ_COST_AMT = #{bizCostAmt,jdbcType=DECIMAL},",
          "BIZ_FEE_AMT = #{bizFeeAmt,jdbcType=DECIMAL},",
          "BIZ_PROFIT_AMT = #{bizProfitAmt,jdbcType=DECIMAL},",
          "ACC_SELL_IN_AMT = #{accSellInAmt,jdbcType=DECIMAL},",
          "ACC_COST_AMT = #{accCostAmt,jdbcType=DECIMAL},",
          "ACC_FEE_AMT = #{accFeeAmt,jdbcType=DECIMAL},",
          "ACC_PROFIT_AMT = #{accProfitAmt,jdbcType=DECIMAL},",
          "SYNC_TIME = #{syncTime,jdbcType=TIMESTAMP},",
          "SC_EXEC_QUANT = #{scExecQuant,jdbcType=DECIMAL},",
          "SC_EXEC_AMT = #{scExecAmt,jdbcType=DECIMAL},",
          "SC_EXEC_AMT_ACC = #{scExecAmtAcc,jdbcType=DECIMAL},",
          "SC_EXEC_AMT_USD = #{scExecAmtUsd,jdbcType=DECIMAL},",
          "SC_EXEC_AMT_CNY = #{scExecAmtCny,jdbcType=DECIMAL},",
          "PUR_PRICE = #{purPrice,jdbcType=DECIMAL},",
          "PUR_INV_PRICE = #{purInvPrice,jdbcType=DECIMAL},",
          "FIRST_PAY_DATE = #{firstPayDate,jdbcType=TIMESTAMP},",
          "LAST_PAY_DATE = #{lastPayDate,jdbcType=TIMESTAMP},",
          "CALC_PR_FEE = #{calcPrFee,jdbcType=DECIMAL},",
          "PUR_SEND_QUANT = #{purSendQuant,jdbcType=DECIMAL},",
          "PUR_SEND_AMT = #{purSendAmt,jdbcType=DECIMAL},",
          "ST_QUANT = #{stQuant,jdbcType=DECIMAL},",
          "ST_AMT = #{stAmt,jdbcType=DECIMAL}",
        "where TRK_GUID = #{trkGuid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrSalesTrack record);
}