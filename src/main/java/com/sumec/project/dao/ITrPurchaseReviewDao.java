package com.sumec.project.dao;

import com.sumec.project.entity.TTrPurchaseReview;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

public interface ITrPurchaseReviewDao {
    @Delete({
        "delete from T_TR_PURCHASE_REVIEW",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String intId);

    @Insert({
        "insert into T_TR_PURCHASE_REVIEW (INT_ID, FM_SEQ_ID, ",
        "USER_NAME, M_DATE, ",
        "OCU_NAME, OCU_ORG_NAME, ",
        "REF_TYPE, REF_ID, ",
        "BC_NO, SIGN_DATE, ",
        "ACC_NAME, FCT_SHORT_NAME, ",
        "FCT_NAME, DELI_DATE, ",
        "AMT, CURR_TYPE, QUANT, ",
        "PAY_TERM, PRO_ID, ",
        "PRO_NO, PRO_NAME, ",
        "PRO_TYPE, PRO_CUST, ",
        "PRO_AMT, PRO_SIGN_AMT, ",
        "PRO_INCOME, PRO_COST, ",
        "PRO_PROFIT, PRO_PROFIT_RATE, ",
        "COMM_DESC, COMM_MAT, ",
        "DH_RATE, PAY_RATE, ",
        "INV_RATE, TYPE_OF_CON, ",
        "SC_NO, SC_CURR_TYPE, ",
        "SC_AMT, SC_PAT_NAME, ",
        "SC_PROFIT_AMT, SC_EXCHANGECOST, ",
        "INHAND_CON_NUM, INHAND_AMT, ",
        "OVERDUE_QUANT, OVERDUE_AMT, ",
        "IS_VALID, BUD_NAME, ",
        "CON_NAME)",
        "values (#{intId,jdbcType=VARCHAR}, #{fmSeqId,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{mDate,jdbcType=TIMESTAMP}, ",
        "#{ocuName,jdbcType=VARCHAR}, #{ocuOrgName,jdbcType=VARCHAR}, ",
        "#{refType,jdbcType=VARCHAR}, #{refId,jdbcType=VARCHAR}, ",
        "#{bcNo,jdbcType=VARCHAR}, #{signDate,jdbcType=TIMESTAMP}, ",
        "#{accName,jdbcType=VARCHAR}, #{fctShortName,jdbcType=VARCHAR}, ",
        "#{fctName,jdbcType=VARCHAR}, #{deliDate,jdbcType=TIMESTAMP}, ",
        "#{amt,jdbcType=DECIMAL}, #{currType,jdbcType=VARCHAR}, #{quant,jdbcType=DECIMAL}, ",
        "#{payTerm,jdbcType=VARCHAR}, #{proId,jdbcType=VARCHAR}, ",
        "#{proNo,jdbcType=VARCHAR}, #{proName,jdbcType=VARCHAR}, ",
        "#{proType,jdbcType=VARCHAR}, #{proCust,jdbcType=VARCHAR}, ",
        "#{proAmt,jdbcType=DECIMAL}, #{proSignAmt,jdbcType=DECIMAL}, ",
        "#{proIncome,jdbcType=DECIMAL}, #{proCost,jdbcType=DECIMAL}, ",
        "#{proProfit,jdbcType=DECIMAL}, #{proProfitRate,jdbcType=DECIMAL}, ",
        "#{commDesc,jdbcType=VARCHAR}, #{commMat,jdbcType=VARCHAR}, ",
        "#{dhRate,jdbcType=DECIMAL}, #{payRate,jdbcType=DECIMAL}, ",
        "#{invRate,jdbcType=DECIMAL}, #{typeOfCon,jdbcType=VARCHAR}, ",
        "#{scNo,jdbcType=VARCHAR}, #{scCurrType,jdbcType=VARCHAR}, ",
        "#{scAmt,jdbcType=DECIMAL}, #{scPatName,jdbcType=VARCHAR}, ",
        "#{scProfitAmt,jdbcType=DECIMAL}, #{scExchangecost,jdbcType=DECIMAL}, ",
        "#{inhandConNum,jdbcType=DECIMAL}, #{inhandAmt,jdbcType=DECIMAL}, ",
        "#{overdueQuant,jdbcType=DECIMAL}, #{overdueAmt,jdbcType=DECIMAL}, ",
        "#{isValid,jdbcType=VARCHAR}, #{budName,jdbcType=VARCHAR}, ",
        "#{conName,jdbcType=VARCHAR})"
    })
    int insert(TTrPurchaseReview record);

    int insertSelective(TTrPurchaseReview record);

    @Select({
        "select",
        "INT_ID, FM_SEQ_ID, USER_NAME, M_DATE, OCU_NAME, OCU_ORG_NAME, REF_TYPE, REF_ID, ",
        "BC_NO, SIGN_DATE, ACC_NAME, FCT_SHORT_NAME, FCT_NAME, DELI_DATE, AMT, CURR_TYPE, ",
        "QUANT, PAY_TERM, PRO_ID, PRO_NO, PRO_NAME, PRO_TYPE, PRO_CUST, PRO_AMT, PRO_SIGN_AMT, ",
        "PRO_INCOME, PRO_COST, PRO_PROFIT, PRO_PROFIT_RATE, COMM_DESC, COMM_MAT, DH_RATE, ",
        "PAY_RATE, INV_RATE, TYPE_OF_CON, SC_NO, SC_CURR_TYPE, SC_AMT, SC_PAT_NAME, SC_PROFIT_AMT, ",
        "SC_EXCHANGECOST, INHAND_CON_NUM, INHAND_AMT, OVERDUE_QUANT, OVERDUE_AMT, IS_VALID, ",
        "BUD_NAME, CON_NAME",
        "from T_TR_PURCHASE_REVIEW",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.project.dao.ITrPurchaseReviewDao.BaseResultMap")
    TTrPurchaseReview selectByPrimaryKey(String intId);

    int updateByPrimaryKeySelective(TTrPurchaseReview record);

    @Update({
        "update T_TR_PURCHASE_REVIEW",
        "set FM_SEQ_ID = #{fmSeqId,jdbcType=VARCHAR},",
          "USER_NAME = #{userName,jdbcType=VARCHAR},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "OCU_NAME = #{ocuName,jdbcType=VARCHAR},",
          "OCU_ORG_NAME = #{ocuOrgName,jdbcType=VARCHAR},",
          "REF_TYPE = #{refType,jdbcType=VARCHAR},",
          "REF_ID = #{refId,jdbcType=VARCHAR},",
          "BC_NO = #{bcNo,jdbcType=VARCHAR},",
          "SIGN_DATE = #{signDate,jdbcType=TIMESTAMP},",
          "ACC_NAME = #{accName,jdbcType=VARCHAR},",
          "FCT_SHORT_NAME = #{fctShortName,jdbcType=VARCHAR},",
          "FCT_NAME = #{fctName,jdbcType=VARCHAR},",
          "DELI_DATE = #{deliDate,jdbcType=TIMESTAMP},",
          "AMT = #{amt,jdbcType=DECIMAL},",
          "CURR_TYPE = #{currType,jdbcType=VARCHAR},",
          "QUANT = #{quant,jdbcType=DECIMAL},",
          "PAY_TERM = #{payTerm,jdbcType=VARCHAR},",
          "PRO_ID = #{proId,jdbcType=VARCHAR},",
          "PRO_NO = #{proNo,jdbcType=VARCHAR},",
          "PRO_NAME = #{proName,jdbcType=VARCHAR},",
          "PRO_TYPE = #{proType,jdbcType=VARCHAR},",
          "PRO_CUST = #{proCust,jdbcType=VARCHAR},",
          "PRO_AMT = #{proAmt,jdbcType=DECIMAL},",
          "PRO_SIGN_AMT = #{proSignAmt,jdbcType=DECIMAL},",
          "PRO_INCOME = #{proIncome,jdbcType=DECIMAL},",
          "PRO_COST = #{proCost,jdbcType=DECIMAL},",
          "PRO_PROFIT = #{proProfit,jdbcType=DECIMAL},",
          "PRO_PROFIT_RATE = #{proProfitRate,jdbcType=DECIMAL},",
          "COMM_DESC = #{commDesc,jdbcType=VARCHAR},",
          "COMM_MAT = #{commMat,jdbcType=VARCHAR},",
          "DH_RATE = #{dhRate,jdbcType=DECIMAL},",
          "PAY_RATE = #{payRate,jdbcType=DECIMAL},",
          "INV_RATE = #{invRate,jdbcType=DECIMAL},",
          "TYPE_OF_CON = #{typeOfCon,jdbcType=VARCHAR},",
          "SC_NO = #{scNo,jdbcType=VARCHAR},",
          "SC_CURR_TYPE = #{scCurrType,jdbcType=VARCHAR},",
          "SC_AMT = #{scAmt,jdbcType=DECIMAL},",
          "SC_PAT_NAME = #{scPatName,jdbcType=VARCHAR},",
          "SC_PROFIT_AMT = #{scProfitAmt,jdbcType=DECIMAL},",
          "SC_EXCHANGECOST = #{scExchangecost,jdbcType=DECIMAL},",
          "INHAND_CON_NUM = #{inhandConNum,jdbcType=DECIMAL},",
          "INHAND_AMT = #{inhandAmt,jdbcType=DECIMAL},",
          "OVERDUE_QUANT = #{overdueQuant,jdbcType=DECIMAL},",
          "OVERDUE_AMT = #{overdueAmt,jdbcType=DECIMAL},",
          "IS_VALID = #{isValid,jdbcType=VARCHAR},",
          "BUD_NAME = #{budName,jdbcType=VARCHAR},",
          "CON_NAME = #{conName,jdbcType=VARCHAR}",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrPurchaseReview record);

    @Select({
            "select",
            "INT_ID, FM_SEQ_ID, USER_NAME, M_DATE, OCU_NAME, OCU_ORG_NAME, REF_TYPE, REF_ID, ",
            "BC_NO, SIGN_DATE, ACC_NAME, FCT_SHORT_NAME, FCT_NAME, DELI_DATE, AMT, CURR_TYPE, ",
            "QUANT, PAY_TERM, PRO_ID, PRO_NO, PRO_NAME, PRO_TYPE, PRO_CUST, PRO_AMT, PRO_SIGN_AMT, ",
            "PRO_INCOME, PRO_COST, PRO_PROFIT, PRO_PROFIT_RATE, COMM_DESC, COMM_MAT, DH_RATE, ",
            "PAY_RATE, INV_RATE, TYPE_OF_CON, SC_NO, SC_CURR_TYPE, SC_AMT, SC_PAT_NAME, SC_PROFIT_AMT, ",
            "SC_EXCHANGECOST, INHAND_CON_NUM, INHAND_AMT, OVERDUE_QUANT, OVERDUE_AMT, IS_VALID, ",
            "BUD_NAME, CON_NAME",
            "from T_TR_PURCHASE_REVIEW",
            "where REF_ID = #{bcId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.ITrPurchaseReviewDao.BaseResultMap")
    TTrPurchaseReview selectByBcId(BigDecimal bcId);
}