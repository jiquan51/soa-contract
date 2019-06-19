package com.sumec.project.dao;

import com.sumec.project.entity.TProjCeecBudUse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IProjCeecBudUseDao {
    @Delete({
        "delete from T_PROJ_CEEC_BUD_USE",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String intId);

    @Insert({
        "insert into T_PROJ_CEEC_BUD_USE (INT_ID, BASIC_USE_ID, ",
        "BASIC_BUD_ID, TOB_TYPE, ",
        "TOB_ID, USE_AMT, CURR_TYPE, ",
        "CURR_RATE, USE_AMT_RMB, ",
        "CREATE_DATE, IS_BUD_CONTROL, ",
        "PROJ_ID)",
        "values (#{intId,jdbcType=VARCHAR}, #{basicUseId,jdbcType=VARCHAR}, ",
        "#{basicBudId,jdbcType=VARCHAR}, #{tobType,jdbcType=VARCHAR}, ",
        "#{tobId,jdbcType=VARCHAR}, #{useAmt,jdbcType=DECIMAL}, #{currType,jdbcType=VARCHAR}, ",
        "#{currRate,jdbcType=DECIMAL}, #{useAmtRmb,jdbcType=DECIMAL}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{isBudControl,jdbcType=VARCHAR}, ",
        "#{projId,jdbcType=VARCHAR})"
    })
    int insert(TProjCeecBudUse record);

    int insertSelective(TProjCeecBudUse record);

    @Select({
        "select",
        "INT_ID, BASIC_USE_ID, BASIC_BUD_ID, TOB_TYPE, TOB_ID, USE_AMT, CURR_TYPE, CURR_RATE, ",
        "USE_AMT_RMB, CREATE_DATE, IS_BUD_CONTROL, PROJ_ID",
        "from T_PROJ_CEEC_BUD_USE",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecBudUseDao.BaseResultMap")
    TProjCeecBudUse selectByPrimaryKey(String intId);

    int updateByPrimaryKeySelective(TProjCeecBudUse record);

    @Update({
        "update T_PROJ_CEEC_BUD_USE",
        "set BASIC_USE_ID = #{basicUseId,jdbcType=VARCHAR},",
          "BASIC_BUD_ID = #{basicBudId,jdbcType=VARCHAR},",
          "TOB_TYPE = #{tobType,jdbcType=VARCHAR},",
          "TOB_ID = #{tobId,jdbcType=VARCHAR},",
          "USE_AMT = #{useAmt,jdbcType=DECIMAL},",
          "CURR_TYPE = #{currType,jdbcType=VARCHAR},",
          "CURR_RATE = #{currRate,jdbcType=DECIMAL},",
          "USE_AMT_RMB = #{useAmtRmb,jdbcType=DECIMAL},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "IS_BUD_CONTROL = #{isBudControl,jdbcType=VARCHAR},",
          "PROJ_ID = #{projId,jdbcType=VARCHAR}",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TProjCeecBudUse record);
}