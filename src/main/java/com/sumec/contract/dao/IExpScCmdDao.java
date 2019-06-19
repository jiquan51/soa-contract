package com.sumec.contract.dao;

import com.sumec.contract.entity.TExpScCmd;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IExpScCmdDao {
    @Delete({
        "delete from T_EXP_SC_CMD",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal pId);

    @Insert({
        "insert into T_EXP_SC_CMD (P_ID, C_NO, ",
        "P_NO, P_ORDER, P_NAME, ",
        "TECH_NO, P_DESC, P_UNIT, ",
        "P_QUANT, TAX_PRICE, ",
        "P_UNIT2, P_QUANT2, ",
        "TAX_PRICE2, OUTLOOK, ",
        "N_W, G_W, STAT_COD, ",
        "SHIP_D, PACKING, ",
        "PACKMODE, SC_ID, ",
        "BRAND, TAX_RATE, ",
        "QUOTE_NO, CUSTOMER_NO, ",
        "IS_2UNIT, SUB_ID, ",
        "ORDER_NO, DELIVERY_D, ",
        "ERP_NO, COST_PRICE, ",
        "DISCOUNT_RATE, RTN_QUANT, ",
        "DEVELOP_YN, P_RATE, ",
        "COMM_ID, PRO_CMD_ID, ",
        "CMD_TYPE, ET, PCD, ",
        "CB, COLOR, BC_P_ID, ",
        "OUT_QUANT, OUT_QUANT2, ",
        "P_AMT, REMARK, PROTOCOL_DATE, ",
        "PROTOCOL_NO, WHEEL_SIZE, ",
        "SUMEC_CODE, QUOTATION_ID, ",
        "COMM_UNIT, COMM_UNIT_PACK, ",
        "COMM_UNIT_STAT, COMM_QUANT_STAT, ",
        "PACK_RATE, STAT_RATE, ",
        "P_PRICE, OBJ_PRICE, ",
        "RTN_RATE, TARIFF_RATE, ",
        "IS_SUB_PUR, COMM_QUANT_PACK, ",
        "LACK_LOAD_RATE, OVER_LOAD_RATE, ",
        "COMM_UNIT_AUX, AUX_RATE, ",
        "COMM_QUANT_AUX, IS_SH_EQUIP, ",
        "TEXTURE, REF_TYPE, ",
        "REF_ID)",
        "values (#{pId,jdbcType=DECIMAL}, #{cNo,jdbcType=VARCHAR}, ",
        "#{pNo,jdbcType=VARCHAR}, #{pOrder,jdbcType=DECIMAL}, #{pName,jdbcType=VARCHAR}, ",
        "#{techNo,jdbcType=VARCHAR}, #{pDesc,jdbcType=VARCHAR}, #{pUnit,jdbcType=VARCHAR}, ",
        "#{pQuant,jdbcType=DECIMAL}, #{taxPrice,jdbcType=DECIMAL}, ",
        "#{pUnit2,jdbcType=VARCHAR}, #{pQuant2,jdbcType=DECIMAL}, ",
        "#{taxPrice2,jdbcType=DECIMAL}, #{outlook,jdbcType=VARCHAR}, ",
        "#{nW,jdbcType=DECIMAL}, #{gW,jdbcType=DECIMAL}, #{statCod,jdbcType=VARCHAR}, ",
        "#{shipD,jdbcType=TIMESTAMP}, #{packing,jdbcType=DECIMAL}, ",
        "#{packmode,jdbcType=VARCHAR}, #{scId,jdbcType=DECIMAL}, ",
        "#{brand,jdbcType=VARCHAR}, #{taxRate,jdbcType=DECIMAL}, ",
        "#{quoteNo,jdbcType=VARCHAR}, #{customerNo,jdbcType=VARCHAR}, ",
        "#{is2unit,jdbcType=VARCHAR}, #{subId,jdbcType=DECIMAL}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{deliveryD,jdbcType=TIMESTAMP}, ",
        "#{erpNo,jdbcType=VARCHAR}, #{costPrice,jdbcType=DECIMAL}, ",
        "#{discountRate,jdbcType=DECIMAL}, #{rtnQuant,jdbcType=DECIMAL}, ",
        "#{developYn,jdbcType=VARCHAR}, #{pRate,jdbcType=DECIMAL}, ",
        "#{commId,jdbcType=DECIMAL}, #{proCmdId,jdbcType=DECIMAL}, ",
        "#{cmdType,jdbcType=VARCHAR}, #{et,jdbcType=DECIMAL}, #{pcd,jdbcType=VARCHAR}, ",
        "#{cb,jdbcType=DECIMAL}, #{color,jdbcType=VARCHAR}, #{bcPId,jdbcType=DECIMAL}, ",
        "#{outQuant,jdbcType=DECIMAL}, #{outQuant2,jdbcType=DECIMAL}, ",
        "#{pAmt,jdbcType=DECIMAL}, #{remark,jdbcType=VARCHAR}, #{protocolDate,jdbcType=TIMESTAMP}, ",
        "#{protocolNo,jdbcType=VARCHAR}, #{wheelSize,jdbcType=DECIMAL}, ",
        "#{sumecCode,jdbcType=VARCHAR}, #{quotationId,jdbcType=DECIMAL}, ",
        "#{commUnit,jdbcType=DECIMAL}, #{commUnitPack,jdbcType=DECIMAL}, ",
        "#{commUnitStat,jdbcType=DECIMAL}, #{commQuantStat,jdbcType=DECIMAL}, ",
        "#{packRate,jdbcType=DECIMAL}, #{statRate,jdbcType=DECIMAL}, ",
        "#{pPrice,jdbcType=DECIMAL}, #{objPrice,jdbcType=DECIMAL}, ",
        "#{rtnRate,jdbcType=DECIMAL}, #{tariffRate,jdbcType=DECIMAL}, ",
        "#{isSubPur,jdbcType=VARCHAR}, #{commQuantPack,jdbcType=DECIMAL}, ",
        "#{lackLoadRate,jdbcType=DECIMAL}, #{overLoadRate,jdbcType=DECIMAL}, ",
        "#{commUnitAux,jdbcType=DECIMAL}, #{auxRate,jdbcType=DECIMAL}, ",
        "#{commQuantAux,jdbcType=DECIMAL}, #{isShEquip,jdbcType=VARCHAR}, ",
        "#{texture,jdbcType=VARCHAR}, #{refType,jdbcType=VARCHAR}, ",
        "#{refId,jdbcType=VARCHAR})"
    })
    int insert(TExpScCmd record);

    int insertSelective(TExpScCmd record);

    @Select({
        "select",
        "P_ID, C_NO, P_NO, P_ORDER, P_NAME, TECH_NO, P_DESC, P_UNIT, P_QUANT, TAX_PRICE, ",
        "P_UNIT2, P_QUANT2, TAX_PRICE2, OUTLOOK, N_W, G_W, STAT_COD, SHIP_D, PACKING, ",
        "PACKMODE, SC_ID, BRAND, TAX_RATE, QUOTE_NO, CUSTOMER_NO, IS_2UNIT, SUB_ID, ORDER_NO, ",
        "DELIVERY_D, ERP_NO, COST_PRICE, DISCOUNT_RATE, RTN_QUANT, DEVELOP_YN, P_RATE, ",
        "COMM_ID, PRO_CMD_ID, CMD_TYPE, ET, PCD, CB, COLOR, BC_P_ID, OUT_QUANT, OUT_QUANT2, ",
        "P_AMT, REMARK, PROTOCOL_DATE, PROTOCOL_NO, WHEEL_SIZE, SUMEC_CODE, QUOTATION_ID, ",
        "COMM_UNIT, COMM_UNIT_PACK, COMM_UNIT_STAT, COMM_QUANT_STAT, PACK_RATE, STAT_RATE, ",
        "P_PRICE, OBJ_PRICE, RTN_RATE, TARIFF_RATE, IS_SUB_PUR, COMM_QUANT_PACK, LACK_LOAD_RATE, ",
        "OVER_LOAD_RATE, COMM_UNIT_AUX, AUX_RATE, COMM_QUANT_AUX, IS_SH_EQUIP, TEXTURE, ",
        "REF_TYPE, REF_ID",
        "from T_EXP_SC_CMD",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpScCmdDao.BaseResultMap")
    TExpScCmd selectByPrimaryKey(BigDecimal pId);
    
    @Select({
        "select",
        "P_ID, C_NO, P_NO, P_ORDER, P_NAME, TECH_NO, P_DESC, P_UNIT, P_QUANT, TAX_PRICE, ",
        "P_UNIT2, P_QUANT2, TAX_PRICE2, OUTLOOK, N_W, G_W, STAT_COD, SHIP_D, PACKING, ",
        "PACKMODE, SC_ID, BRAND, TAX_RATE, QUOTE_NO, CUSTOMER_NO, IS_2UNIT, SUB_ID, ORDER_NO, ",
        "DELIVERY_D, ERP_NO, COST_PRICE, DISCOUNT_RATE, RTN_QUANT, DEVELOP_YN, P_RATE, ",
        "COMM_ID, PRO_CMD_ID, CMD_TYPE, ET, PCD, CB, COLOR, BC_P_ID, OUT_QUANT, OUT_QUANT2, ",
        "P_AMT, REMARK, PROTOCOL_DATE, PROTOCOL_NO, WHEEL_SIZE, SUMEC_CODE, QUOTATION_ID, ",
        "COMM_UNIT, COMM_UNIT_PACK, COMM_UNIT_STAT, COMM_QUANT_STAT, PACK_RATE, STAT_RATE, ",
        "P_PRICE, OBJ_PRICE, RTN_RATE, TARIFF_RATE, IS_SUB_PUR, COMM_QUANT_PACK, LACK_LOAD_RATE, ",
        "OVER_LOAD_RATE, COMM_UNIT_AUX, AUX_RATE, COMM_QUANT_AUX, IS_SH_EQUIP, TEXTURE, ",
        "REF_TYPE, REF_ID",
        "from T_EXP_SC_CMD",
        "where SC_ID = #{scId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpScCmdDao.BaseResultMap")
    List<TExpScCmd> selectByScId(BigDecimal scId);
    
    int updateByPrimaryKeySelective(TExpScCmd record);

    @Update({
        "update T_EXP_SC_CMD",
        "set C_NO = #{cNo,jdbcType=VARCHAR},",
          "P_NO = #{pNo,jdbcType=VARCHAR},",
          "P_ORDER = #{pOrder,jdbcType=DECIMAL},",
          "P_NAME = #{pName,jdbcType=VARCHAR},",
          "TECH_NO = #{techNo,jdbcType=VARCHAR},",
          "P_DESC = #{pDesc,jdbcType=VARCHAR},",
          "P_UNIT = #{pUnit,jdbcType=VARCHAR},",
          "P_QUANT = #{pQuant,jdbcType=DECIMAL},",
          "TAX_PRICE = #{taxPrice,jdbcType=DECIMAL},",
          "P_UNIT2 = #{pUnit2,jdbcType=VARCHAR},",
          "P_QUANT2 = #{pQuant2,jdbcType=DECIMAL},",
          "TAX_PRICE2 = #{taxPrice2,jdbcType=DECIMAL},",
          "OUTLOOK = #{outlook,jdbcType=VARCHAR},",
          "N_W = #{nW,jdbcType=DECIMAL},",
          "G_W = #{gW,jdbcType=DECIMAL},",
          "STAT_COD = #{statCod,jdbcType=VARCHAR},",
          "SHIP_D = #{shipD,jdbcType=TIMESTAMP},",
          "PACKING = #{packing,jdbcType=DECIMAL},",
          "PACKMODE = #{packmode,jdbcType=VARCHAR},",
          "SC_ID = #{scId,jdbcType=DECIMAL},",
          "BRAND = #{brand,jdbcType=VARCHAR},",
          "TAX_RATE = #{taxRate,jdbcType=DECIMAL},",
          "QUOTE_NO = #{quoteNo,jdbcType=VARCHAR},",
          "CUSTOMER_NO = #{customerNo,jdbcType=VARCHAR},",
          "IS_2UNIT = #{is2unit,jdbcType=VARCHAR},",
          "SUB_ID = #{subId,jdbcType=DECIMAL},",
          "ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "DELIVERY_D = #{deliveryD,jdbcType=TIMESTAMP},",
          "ERP_NO = #{erpNo,jdbcType=VARCHAR},",
          "COST_PRICE = #{costPrice,jdbcType=DECIMAL},",
          "DISCOUNT_RATE = #{discountRate,jdbcType=DECIMAL},",
          "RTN_QUANT = #{rtnQuant,jdbcType=DECIMAL},",
          "DEVELOP_YN = #{developYn,jdbcType=VARCHAR},",
          "P_RATE = #{pRate,jdbcType=DECIMAL},",
          "COMM_ID = #{commId,jdbcType=DECIMAL},",
          "PRO_CMD_ID = #{proCmdId,jdbcType=DECIMAL},",
          "CMD_TYPE = #{cmdType,jdbcType=VARCHAR},",
          "ET = #{et,jdbcType=DECIMAL},",
          "PCD = #{pcd,jdbcType=VARCHAR},",
          "CB = #{cb,jdbcType=DECIMAL},",
          "COLOR = #{color,jdbcType=VARCHAR},",
          "BC_P_ID = #{bcPId,jdbcType=DECIMAL},",
          "OUT_QUANT = #{outQuant,jdbcType=DECIMAL},",
          "OUT_QUANT2 = #{outQuant2,jdbcType=DECIMAL},",
          "P_AMT = #{pAmt,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "PROTOCOL_DATE = #{protocolDate,jdbcType=TIMESTAMP},",
          "PROTOCOL_NO = #{protocolNo,jdbcType=VARCHAR},",
          "WHEEL_SIZE = #{wheelSize,jdbcType=DECIMAL},",
          "SUMEC_CODE = #{sumecCode,jdbcType=VARCHAR},",
          "QUOTATION_ID = #{quotationId,jdbcType=DECIMAL},",
          "COMM_UNIT = #{commUnit,jdbcType=DECIMAL},",
          "COMM_UNIT_PACK = #{commUnitPack,jdbcType=DECIMAL},",
          "COMM_UNIT_STAT = #{commUnitStat,jdbcType=DECIMAL},",
          "COMM_QUANT_STAT = #{commQuantStat,jdbcType=DECIMAL},",
          "PACK_RATE = #{packRate,jdbcType=DECIMAL},",
          "STAT_RATE = #{statRate,jdbcType=DECIMAL},",
          "P_PRICE = #{pPrice,jdbcType=DECIMAL},",
          "OBJ_PRICE = #{objPrice,jdbcType=DECIMAL},",
          "RTN_RATE = #{rtnRate,jdbcType=DECIMAL},",
          "TARIFF_RATE = #{tariffRate,jdbcType=DECIMAL},",
          "IS_SUB_PUR = #{isSubPur,jdbcType=VARCHAR},",
          "COMM_QUANT_PACK = #{commQuantPack,jdbcType=DECIMAL},",
          "LACK_LOAD_RATE = #{lackLoadRate,jdbcType=DECIMAL},",
          "OVER_LOAD_RATE = #{overLoadRate,jdbcType=DECIMAL},",
          "COMM_UNIT_AUX = #{commUnitAux,jdbcType=DECIMAL},",
          "AUX_RATE = #{auxRate,jdbcType=DECIMAL},",
          "COMM_QUANT_AUX = #{commQuantAux,jdbcType=DECIMAL},",
          "IS_SH_EQUIP = #{isShEquip,jdbcType=VARCHAR},",
          "TEXTURE = #{texture,jdbcType=VARCHAR},",
          "REF_TYPE = #{refType,jdbcType=VARCHAR},",
          "REF_ID = #{refId,jdbcType=VARCHAR}",
        "where P_ID = #{pId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TExpScCmd record);
}