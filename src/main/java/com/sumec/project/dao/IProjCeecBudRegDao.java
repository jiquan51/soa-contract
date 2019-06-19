package com.sumec.project.dao;

import com.sumec.project.entity.TProjCeecBudReg;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IProjCeecBudRegDao {
    @Delete({
        "delete from T_PROJ_CEEC_BUD_REG",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String intId);

    @Insert({
        "insert into T_PROJ_CEEC_BUD_REG (INT_ID, PRE_INT_ID, ",
        "REG_ORDER, PROJ_TYPE, ",
        "PROJ_ID, PROJ_NO, ",
        "PROJ_NAME, PROJ_INCOME_RMB, ",
        "PROJ_COST_RMB, PROJ_PROFIT_RMB, ",
        "IS_VALID, M_DATE, ",
        "M_USER_ID, U_USER_ID, ",
        "U_DATE, REMARK, ",
        "PRE_PROJ_INCOME_RMB, PRE_PROJ_COST_RMB, ",
        "PRE_PROJ_PROFIT_RMB, CONFIRM)",
        "values (#{intId,jdbcType=VARCHAR}, #{preIntId,jdbcType=VARCHAR}, ",
        "#{regOrder,jdbcType=DECIMAL}, #{projType,jdbcType=VARCHAR}, ",
        "#{projId,jdbcType=VARCHAR}, #{projNo,jdbcType=VARCHAR}, ",
        "#{projName,jdbcType=VARCHAR}, #{projIncomeRmb,jdbcType=DECIMAL}, ",
        "#{projCostRmb,jdbcType=DECIMAL}, #{projProfitRmb,jdbcType=DECIMAL}, ",
        "#{isValid,jdbcType=VARCHAR}, #{mDate,jdbcType=TIMESTAMP}, ",
        "#{mUserId,jdbcType=DECIMAL}, #{uUserId,jdbcType=DECIMAL}, ",
        "#{uDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{preProjIncomeRmb,jdbcType=DECIMAL}, #{preProjCostRmb,jdbcType=DECIMAL}, ",
        "#{preProjProfitRmb,jdbcType=DECIMAL}, #{confirm,jdbcType=VARCHAR})"
    })
    int insert(TProjCeecBudReg record);

    int insertSelective(TProjCeecBudReg record);

    @Select({
        "select",
        "INT_ID, PRE_INT_ID, REG_ORDER, PROJ_TYPE, PROJ_ID, PROJ_NO, PROJ_NAME, PROJ_INCOME_RMB, ",
        "PROJ_COST_RMB, PROJ_PROFIT_RMB, IS_VALID, M_DATE, M_USER_ID, U_USER_ID, U_DATE, ",
        "REMARK, PRE_PROJ_INCOME_RMB, PRE_PROJ_COST_RMB, PRE_PROJ_PROFIT_RMB, CONFIRM",
        "from T_PROJ_CEEC_BUD_REG",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecBudRegDao.BaseResultMap")
    TProjCeecBudReg selectByPrimaryKey(String intId);

    @Select({
        "select",
        "INT_ID, PRE_INT_ID, REG_ORDER, PROJ_TYPE, PROJ_ID, PROJ_NO, PROJ_NAME, PROJ_INCOME_RMB, ",
        "PROJ_COST_RMB, PROJ_PROFIT_RMB, IS_VALID, M_DATE, M_USER_ID, U_USER_ID, U_DATE, ",
        "REMARK, PRE_PROJ_INCOME_RMB, PRE_PROJ_COST_RMB, PRE_PROJ_PROFIT_RMB, CONFIRM",
        "from T_PROJ_CEEC_BUD_REG",
        "where IS_VALID = '1' and PROJ_TYPE = #{projType,jdbcType=VARCHAR} and PROJ_ID = #{projId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecBudRegDao.BaseResultMap")
    TProjCeecBudReg selectByProjId(@Param("projType")String projType,@Param("projId")String projId);
    
    int updateByPrimaryKeySelective(TProjCeecBudReg record);

    @Update({
        "update T_PROJ_CEEC_BUD_REG",
        "set PRE_INT_ID = #{preIntId,jdbcType=VARCHAR},",
          "REG_ORDER = #{regOrder,jdbcType=DECIMAL},",
          "PROJ_TYPE = #{projType,jdbcType=VARCHAR},",
          "PROJ_ID = #{projId,jdbcType=VARCHAR},",
          "PROJ_NO = #{projNo,jdbcType=VARCHAR},",
          "PROJ_NAME = #{projName,jdbcType=VARCHAR},",
          "PROJ_INCOME_RMB = #{projIncomeRmb,jdbcType=DECIMAL},",
          "PROJ_COST_RMB = #{projCostRmb,jdbcType=DECIMAL},",
          "PROJ_PROFIT_RMB = #{projProfitRmb,jdbcType=DECIMAL},",
          "IS_VALID = #{isValid,jdbcType=VARCHAR},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "M_USER_ID = #{mUserId,jdbcType=DECIMAL},",
          "U_USER_ID = #{uUserId,jdbcType=DECIMAL},",
          "U_DATE = #{uDate,jdbcType=TIMESTAMP},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "PRE_PROJ_INCOME_RMB = #{preProjIncomeRmb,jdbcType=DECIMAL},",
          "PRE_PROJ_COST_RMB = #{preProjCostRmb,jdbcType=DECIMAL},",
          "PRE_PROJ_PROFIT_RMB = #{preProjProfitRmb,jdbcType=DECIMAL},",
          "CONFIRM = #{confirm,jdbcType=VARCHAR}",
        "where INT_ID = #{intId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TProjCeecBudReg record);
}