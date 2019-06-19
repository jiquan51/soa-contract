package com.sumec.contract.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.sumec.contract.entity.TExpBcCmd;

public interface IExpBcCmdDao {
    @Delete({
        "delete from T_EXP_BC_CMD",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal pId);

    @Insert({
        "insert into T_EXP_BC_CMD (P_ID, BC_ID, ",
        "C_NO, P_NO, P_ORDER, ",
        "TECH_NO, CUSTOMER_NO, ",
        "BRAND, P_NAME, P_DESC, ",
        "P_UNIT, P_QUANT, TAX_PRICE, ",
        "REAL_COST_PRICE, P_UNIT2, ",
        "P_QUANT2, TAX_PRICE2, ",
        "TAX_RATE, N_NO, DELI_D, ",
        "IS_PRICE_FIX, PRICE_LIMIT, ",
        "FAC_CODE, P_PRICE, ",
        "P_PRICE2, STANDARD_NO, ",
        "IS_PROM, IS_2UNIT, ",
        "SUB_ID, ERP_NO, TREATY_ID, ",
        "SC_P_ID, TREATY_NO, ",
        "P_RATE, CUT_DATE, ",
        "P_DESC2, FAC_SEND_QUANT, ",
        "COMM_ID, PRO_CMD_ID, ",
        "PRO_ID, PRO_TYPE, ",
        "CMD_TYPE, N_W, ET, ",
        "PCD, CB, COLOR, ",
        "ITEM_ID, FAC_SEND_QUANT2, ",
        "FROM_TYPE, WHEEL_SIZE, ",
        "SUMEC_CODE, ",
        "COMM_UNIT, ",
        "COMM_UNIT_PACK, COMM_UNIT_STAT, ",
        "COMM_QUANT_STAT, PACK_RATE, ",
        "STAT_RATE, TARIFF_RATE, ",
        "EXCISE_RATE, OBJ_PRICE, ",
        "COMM_UNIT2, COMM_QUANT_PACK, ",
        "INCOME_AMT, INCOME_CURR_TYPE, ",
        "COMM_AMT, IS_LOGI, ",
        "INCOME_PRICE, IS_THIRD_INSPECT, ",
        "HS_CODE, IS_NEED_INSPECT, ",
        "COMM_NAME_EN)",
        "values (#{pId,jdbcType=DECIMAL}, #{bcId,jdbcType=DECIMAL}, ",
        "#{cNo,jdbcType=VARCHAR}, #{pNo,jdbcType=VARCHAR}, #{pOrder,jdbcType=DECIMAL}, ",
        "#{techNo,jdbcType=VARCHAR}, #{customerNo,jdbcType=VARCHAR}, ",
        "#{brand,jdbcType=VARCHAR}, #{pName,jdbcType=VARCHAR}, #{pDesc,jdbcType=VARCHAR}, ",
        "#{pUnit,jdbcType=VARCHAR}, #{pQuant,jdbcType=DECIMAL}, #{taxPrice,jdbcType=DECIMAL}, ",
        "#{realCostPrice,jdbcType=DECIMAL}, #{pUnit2,jdbcType=VARCHAR}, ",
        "#{pQuant2,jdbcType=DECIMAL}, #{taxPrice2,jdbcType=DECIMAL}, ",
        "#{taxRate,jdbcType=DECIMAL}, #{nNo,jdbcType=VARCHAR}, #{deliD,jdbcType=TIMESTAMP}, ",
        "#{isPriceFix,jdbcType=VARCHAR}, #{priceLimit,jdbcType=DECIMAL}, ",
        "#{facCode,jdbcType=VARCHAR}, #{pPrice,jdbcType=DECIMAL}, ",
        "#{pPrice2,jdbcType=DECIMAL}, #{standardNo,jdbcType=VARCHAR}, ",
        "#{isProm,jdbcType=VARCHAR}, #{is2unit,jdbcType=VARCHAR}, ",
        "#{subId,jdbcType=DECIMAL}, #{erpNo,jdbcType=VARCHAR}, #{treatyId,jdbcType=DECIMAL}, ",
        "#{scPId,jdbcType=DECIMAL}, #{treatyNo,jdbcType=VARCHAR}, ",
        "#{pRate,jdbcType=DECIMAL}, #{cutDate,jdbcType=TIMESTAMP}, ",
        "#{pDesc2,jdbcType=VARCHAR}, #{facSendQuant,jdbcType=DECIMAL}, ",
        "#{commId,jdbcType=DECIMAL}, #{proCmdId,jdbcType=DECIMAL}, ",
        "#{proId,jdbcType=DECIMAL}, #{proType,jdbcType=VARCHAR}, ",
        "#{cmdType,jdbcType=VARCHAR}, #{nW,jdbcType=DECIMAL}, #{et,jdbcType=DECIMAL}, ",
        "#{pcd,jdbcType=VARCHAR}, #{cb,jdbcType=DECIMAL}, #{color,jdbcType=VARCHAR}, ",
        "#{itemId,jdbcType=DECIMAL}, #{facSendQuant2,jdbcType=DECIMAL}, ",
        "#{fromType,jdbcType=VARCHAR}, #{wheelSize,jdbcType=DECIMAL}, ",
        "#{sumecCode,jdbcType=VARCHAR}, #{commUnit,jdbcType=DECIMAL}, ",
        "#{commUnitPack,jdbcType=DECIMAL}, #{commUnitStat,jdbcType=DECIMAL}, ",
        "#{commQuantStat,jdbcType=DECIMAL}, #{packRate,jdbcType=DECIMAL}, ",
        "#{statRate,jdbcType=DECIMAL}, #{tariffRate,jdbcType=DECIMAL}, ",
        "#{exciseRate,jdbcType=DECIMAL}, #{objPrice,jdbcType=DECIMAL}, ",
        "#{commUnit2,jdbcType=DECIMAL}, #{commQuantPack,jdbcType=DECIMAL}, ",
        "#{incomeAmt,jdbcType=DECIMAL}, #{incomeCurrType,jdbcType=VARCHAR}, ",
        "#{commAmt,jdbcType=DECIMAL}, #{isLogi,jdbcType=VARCHAR}, ",
        "#{incomePrice,jdbcType=DECIMAL}, #{isThirdInspect,jdbcType=VARCHAR}, ",
        "#{hsCode,jdbcType=VARCHAR}, #{isNeedInspect,jdbcType=VARCHAR}, ",
        "#{commNameEn,jdbcType=VARCHAR})"
    })
    int insert(TExpBcCmd record);

    int insertSelective(TExpBcCmd record);

    @Select({
        "select",
        "P_ID, BC_ID, C_NO, P_NO, P_ORDER, TECH_NO, CUSTOMER_NO, BRAND, P_NAME, P_DESC, ",
        "P_UNIT, P_QUANT, TAX_PRICE, REAL_COST_PRICE, P_UNIT2, P_QUANT2, TAX_PRICE2, ",
        "TAX_RATE, N_NO, DELI_D, IS_PRICE_FIX, PRICE_LIMIT, FAC_CODE, P_PRICE, P_PRICE2, ",
        "STANDARD_NO, IS_PROM, IS_2UNIT, SUB_ID, ERP_NO, TREATY_ID, SC_P_ID, TREATY_NO, ",
        "P_RATE, CUT_DATE, P_DESC2, FAC_SEND_QUANT, COMM_ID, PRO_CMD_ID, PRO_ID, PRO_TYPE, ",
        "CMD_TYPE, N_W, ET, PCD, CB, COLOR, ITEM_ID, FAC_SEND_QUANT2, FROM_TYPE, WHEEL_SIZE, ",
        "SUMEC_CODE,",
        " COMM_UNIT, COMM_UNIT_PACK, COMM_UNIT_STAT, COMM_QUANT_STAT, PACK_RATE, ",
        "STAT_RATE, TARIFF_RATE, EXCISE_RATE, OBJ_PRICE, COMM_UNIT2, COMM_QUANT_PACK, ",
        "INCOME_AMT, INCOME_CURR_TYPE, COMM_AMT, IS_LOGI, INCOME_PRICE, IS_THIRD_INSPECT, ",
        "HS_CODE, IS_NEED_INSPECT, COMM_NAME_EN",
        "from T_EXP_BC_CMD",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpBcCmdDao.BaseResultMap")
    TExpBcCmd selectByPrimaryKey(BigDecimal pId);
    
    @Select({
        "select",
        "P_ID, BC_ID, C_NO, P_NO, P_ORDER, TECH_NO, CUSTOMER_NO, BRAND, P_NAME, P_DESC, ",
        "P_UNIT, P_QUANT, TAX_PRICE, REAL_COST_PRICE, P_UNIT2, P_QUANT2, TAX_PRICE2, ",
        "TAX_RATE, N_NO, DELI_D, IS_PRICE_FIX, PRICE_LIMIT, FAC_CODE, P_PRICE, P_PRICE2, ",
        "STANDARD_NO, IS_PROM, IS_2UNIT, SUB_ID, ERP_NO, TREATY_ID, SC_P_ID, TREATY_NO, ",
        "P_RATE, CUT_DATE, P_DESC2, FAC_SEND_QUANT, COMM_ID, PRO_CMD_ID, PRO_ID, PRO_TYPE, ",
        "CMD_TYPE, N_W, ET, PCD, CB, COLOR, ITEM_ID, FAC_SEND_QUANT2, FROM_TYPE, WHEEL_SIZE, ",
        "SUMEC_CODE, ",
        " COMM_UNIT, COMM_UNIT_PACK, COMM_UNIT_STAT, COMM_QUANT_STAT, PACK_RATE, ",
        "STAT_RATE, TARIFF_RATE, EXCISE_RATE, OBJ_PRICE, COMM_UNIT2, COMM_QUANT_PACK, ",
        "INCOME_AMT, INCOME_CURR_TYPE, COMM_AMT, IS_LOGI, INCOME_PRICE, IS_THIRD_INSPECT, ",
        "HS_CODE, IS_NEED_INSPECT, COMM_NAME_EN",
        "from T_EXP_BC_CMD",
        "where BC_ID = #{bcId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpBcCmdDao.BaseResultMap")
    List<TExpBcCmd> selectByBcId(BigDecimal bcId);
    int updateByPrimaryKeySelective(TExpBcCmd record);

}