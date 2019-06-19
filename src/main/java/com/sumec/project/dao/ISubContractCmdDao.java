package com.sumec.project.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.project.entity.TSubContractCmd;

public interface ISubContractCmdDao {
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
        "SUMEC_CODE, COMM_UNIT, ",
        "COMM_UNIT_PACK, COMM_UNIT_STAT, ",
        "COMM_QUANT_STAT, PACK_RATE, ",
        "STAT_RATE, TARIFF_RATE, ",
        "EXCISE_RATE, OBJ_PRICE, ",
        "COMM_UNIT2, COMM_QUANT_PACK, ",
        "INCOME_AMT, INCOME_CURR_TYPE, ",
        "COMM_AMT, IS_LOGI, ",
        "INCOME_PRICE, IS_THIRD_INSPECT, ",
        "HS_CODE, IS_NEED_INSPECT, ",
        "COMM_NAME_EN, ANTI_DUMP_RATE, ",
        "RTN_RATE, MARKET_PRICE, ",
        "IS_SH_EQUIP)",
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
        "#{commNameEn,jdbcType=VARCHAR}, #{antiDumpRate,jdbcType=DECIMAL}, ",
        "#{rtnRate,jdbcType=DECIMAL}, #{marketPrice,jdbcType=DECIMAL}, ",
        "#{isShEquip,jdbcType=VARCHAR})"
    })
    int insert(TSubContractCmd record);

    int insertSelective(TSubContractCmd record);

    @Select({
        "select",
        "P_ID, BC_ID, C_NO, P_NO, P_ORDER, TECH_NO, CUSTOMER_NO, BRAND, P_NAME, P_DESC, ",
        "P_UNIT, P_QUANT, TAX_PRICE, REAL_COST_PRICE, P_UNIT2, P_QUANT2, TAX_PRICE2, ",
        "TAX_RATE, N_NO, DELI_D, IS_PRICE_FIX, PRICE_LIMIT, FAC_CODE, P_PRICE, P_PRICE2, ",
        "STANDARD_NO, IS_PROM, IS_2UNIT, SUB_ID, ERP_NO, TREATY_ID, SC_P_ID, TREATY_NO, ",
        "P_RATE, CUT_DATE, P_DESC2, FAC_SEND_QUANT, COMM_ID, PRO_CMD_ID, PRO_ID, PRO_TYPE, ",
        "CMD_TYPE, N_W, ET, PCD, CB, COLOR, ITEM_ID, FAC_SEND_QUANT2, FROM_TYPE, WHEEL_SIZE, ",
        "SUMEC_CODE, COMM_UNIT, COMM_UNIT_PACK, COMM_UNIT_STAT, COMM_QUANT_STAT, PACK_RATE, ",
        "STAT_RATE, TARIFF_RATE, EXCISE_RATE, OBJ_PRICE, COMM_UNIT2, COMM_QUANT_PACK, ",
        "INCOME_AMT, INCOME_CURR_TYPE, COMM_AMT, IS_LOGI, INCOME_PRICE, IS_THIRD_INSPECT, ",
        "HS_CODE, IS_NEED_INSPECT, COMM_NAME_EN, ANTI_DUMP_RATE, RTN_RATE, MARKET_PRICE, ",
        "IS_SH_EQUIP",
        "from T_EXP_BC_CMD",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.ISubContractCmdDao.BaseResultMap")
    TSubContractCmd selectByPrimaryKey(BigDecimal pId);

    int updateByPrimaryKeySelective(TSubContractCmd record);

    @Update({
        "update T_EXP_BC_CMD",
        "set BC_ID = #{bcId,jdbcType=DECIMAL},",
          "C_NO = #{cNo,jdbcType=VARCHAR},",
          "P_NO = #{pNo,jdbcType=VARCHAR},",
          "P_ORDER = #{pOrder,jdbcType=DECIMAL},",
          "TECH_NO = #{techNo,jdbcType=VARCHAR},",
          "CUSTOMER_NO = #{customerNo,jdbcType=VARCHAR},",
          "BRAND = #{brand,jdbcType=VARCHAR},",
          "P_NAME = #{pName,jdbcType=VARCHAR},",
          "P_DESC = #{pDesc,jdbcType=VARCHAR},",
          "P_UNIT = #{pUnit,jdbcType=VARCHAR},",
          "P_QUANT = #{pQuant,jdbcType=DECIMAL},",
          "TAX_PRICE = #{taxPrice,jdbcType=DECIMAL},",
          "REAL_COST_PRICE = #{realCostPrice,jdbcType=DECIMAL},",
          "P_UNIT2 = #{pUnit2,jdbcType=VARCHAR},",
          "P_QUANT2 = #{pQuant2,jdbcType=DECIMAL},",
          "TAX_PRICE2 = #{taxPrice2,jdbcType=DECIMAL},",
          "TAX_RATE = #{taxRate,jdbcType=DECIMAL},",
          "N_NO = #{nNo,jdbcType=VARCHAR},",
          "DELI_D = #{deliD,jdbcType=TIMESTAMP},",
          "IS_PRICE_FIX = #{isPriceFix,jdbcType=VARCHAR},",
          "PRICE_LIMIT = #{priceLimit,jdbcType=DECIMAL},",
          "FAC_CODE = #{facCode,jdbcType=VARCHAR},",
          "P_PRICE = #{pPrice,jdbcType=DECIMAL},",
          "P_PRICE2 = #{pPrice2,jdbcType=DECIMAL},",
          "STANDARD_NO = #{standardNo,jdbcType=VARCHAR},",
          "IS_PROM = #{isProm,jdbcType=VARCHAR},",
          "IS_2UNIT = #{is2unit,jdbcType=VARCHAR},",
          "SUB_ID = #{subId,jdbcType=DECIMAL},",
          "ERP_NO = #{erpNo,jdbcType=VARCHAR},",
          "TREATY_ID = #{treatyId,jdbcType=DECIMAL},",
          "SC_P_ID = #{scPId,jdbcType=DECIMAL},",
          "TREATY_NO = #{treatyNo,jdbcType=VARCHAR},",
          "P_RATE = #{pRate,jdbcType=DECIMAL},",
          "CUT_DATE = #{cutDate,jdbcType=TIMESTAMP},",
          "P_DESC2 = #{pDesc2,jdbcType=VARCHAR},",
          "FAC_SEND_QUANT = #{facSendQuant,jdbcType=DECIMAL},",
          "COMM_ID = #{commId,jdbcType=DECIMAL},",
          "PRO_CMD_ID = #{proCmdId,jdbcType=DECIMAL},",
          "PRO_ID = #{proId,jdbcType=DECIMAL},",
          "PRO_TYPE = #{proType,jdbcType=VARCHAR},",
          "CMD_TYPE = #{cmdType,jdbcType=VARCHAR},",
          "N_W = #{nW,jdbcType=DECIMAL},",
          "ET = #{et,jdbcType=DECIMAL},",
          "PCD = #{pcd,jdbcType=VARCHAR},",
          "CB = #{cb,jdbcType=DECIMAL},",
          "COLOR = #{color,jdbcType=VARCHAR},",
          "ITEM_ID = #{itemId,jdbcType=DECIMAL},",
          "FAC_SEND_QUANT2 = #{facSendQuant2,jdbcType=DECIMAL},",
          "FROM_TYPE = #{fromType,jdbcType=VARCHAR},",
          "WHEEL_SIZE = #{wheelSize,jdbcType=DECIMAL},",
          "SUMEC_CODE = #{sumecCode,jdbcType=VARCHAR},",
          "COMM_UNIT = #{commUnit,jdbcType=DECIMAL},",
          "COMM_UNIT_PACK = #{commUnitPack,jdbcType=DECIMAL},",
          "COMM_UNIT_STAT = #{commUnitStat,jdbcType=DECIMAL},",
          "COMM_QUANT_STAT = #{commQuantStat,jdbcType=DECIMAL},",
          "PACK_RATE = #{packRate,jdbcType=DECIMAL},",
          "STAT_RATE = #{statRate,jdbcType=DECIMAL},",
          "TARIFF_RATE = #{tariffRate,jdbcType=DECIMAL},",
          "EXCISE_RATE = #{exciseRate,jdbcType=DECIMAL},",
          "OBJ_PRICE = #{objPrice,jdbcType=DECIMAL},",
          "COMM_UNIT2 = #{commUnit2,jdbcType=DECIMAL},",
          "COMM_QUANT_PACK = #{commQuantPack,jdbcType=DECIMAL},",
          "INCOME_AMT = #{incomeAmt,jdbcType=DECIMAL},",
          "INCOME_CURR_TYPE = #{incomeCurrType,jdbcType=VARCHAR},",
          "COMM_AMT = #{commAmt,jdbcType=DECIMAL},",
          "IS_LOGI = #{isLogi,jdbcType=VARCHAR},",
          "INCOME_PRICE = #{incomePrice,jdbcType=DECIMAL},",
          "IS_THIRD_INSPECT = #{isThirdInspect,jdbcType=VARCHAR},",
          "HS_CODE = #{hsCode,jdbcType=VARCHAR},",
          "IS_NEED_INSPECT = #{isNeedInspect,jdbcType=VARCHAR},",
          "COMM_NAME_EN = #{commNameEn,jdbcType=VARCHAR},",
          "ANTI_DUMP_RATE = #{antiDumpRate,jdbcType=DECIMAL},",
          "RTN_RATE = #{rtnRate,jdbcType=DECIMAL},",
          "MARKET_PRICE = #{marketPrice,jdbcType=DECIMAL},",
          "IS_SH_EQUIP = #{isShEquip,jdbcType=VARCHAR}",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSubContractCmd record);

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
    @ResultMap("com.sumec.project.dao.ISubContractCmdDao.BaseResultMap")
    List<TSubContractCmd> selectByBcId(BigDecimal bcId);


}