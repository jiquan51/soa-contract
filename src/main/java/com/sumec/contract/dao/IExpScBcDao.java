package com.sumec.contract.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.sumec.contract.entity.TExpScBc;

public interface IExpScBcDao {
    @Delete({
        "delete from T_EXP_SC_BC",
        "where SC_ID = #{scId,jdbcType=DECIMAL}",
          "and BC_ID = #{bcId,jdbcType=DECIMAL}",
          "and SC_P_ID = #{scPId,jdbcType=DECIMAL}",
          "and BC_P_ID = #{bcPId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(TExpScBc key);

    @Insert({
        "insert into T_EXP_SC_BC (SC_ID, BC_ID, ",
        "SC_P_ID, BC_P_ID, SC_NO, ",
        "BC_NO, P_NO, P_QUANT, ",
        "P_UNIT, C_TYPE, COMM_ID, ",
        "COMM_UNIT)",
        "values (#{scId,jdbcType=DECIMAL}, #{bcId,jdbcType=DECIMAL}, ",
        "#{scPId,jdbcType=DECIMAL}, #{bcPId,jdbcType=DECIMAL}, #{scNo,jdbcType=VARCHAR}, ",
        "#{bcNo,jdbcType=VARCHAR}, #{pNo,jdbcType=VARCHAR}, #{pQuant,jdbcType=DECIMAL}, ",
        "#{pUnit,jdbcType=VARCHAR}, #{cType,jdbcType=VARCHAR}, #{commId,jdbcType=DECIMAL}, ",
        "#{commUnit,jdbcType=DECIMAL})"
    })
    int insert(TExpScBc record);

    int insertSelective(TExpScBc record);

    @Select({
        "select",
        "SC_ID, BC_ID, SC_P_ID, BC_P_ID, SC_NO, BC_NO, P_NO, P_QUANT, P_UNIT, C_TYPE, ",
        "COMM_ID, COMM_UNIT",
        "from T_EXP_SC_BC",
        "where SC_ID = #{scId,jdbcType=DECIMAL}",
          "and BC_ID = #{bcId,jdbcType=DECIMAL}",
          "and SC_P_ID = #{scPId,jdbcType=DECIMAL}",
          "and BC_P_ID = #{bcPId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.IExpScBcDao.BaseResultMap")
    TExpScBc selectByPrimaryKey(TExpScBc key);

    int updateByPrimaryKeySelective(TExpScBc record);
}