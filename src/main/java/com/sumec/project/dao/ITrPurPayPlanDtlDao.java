package com.sumec.project.dao;

import com.sumec.project.entity.TTrPurPayPlanDtl;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

public interface ITrPurPayPlanDtlDao {

    @Select({
        "select",
        "T_TR_PUR_PAY_PLAN_DTL.PLAN_DTL_ID, T_TR_PUR_PAY_PLAN_DTL.PLAN_ID, T_TR_PUR_PAY_PLAN_DTL.ORDER_ID, T_TR_PUR_PAY_PLAN_DTL.PAY_PROP, T_TR_PUR_PAY_PLAN_DTL.BEF_OR_AFT_GOODS, T_TR_PUR_PAY_PLAN_DTL.PW_ID, T_TR_PUR_PAY_PLAN_DTL.DATE_TRM, ",
        "T_TR_PUR_PAY_PLAN_DTL.DAYS, T_TR_PUR_PAY_PLAN_DTL.PLAN_PAY_DATE, T_TR_PUR_PAY_PLAN_DTL.CURR_TYPE, T_TR_PUR_PAY_PLAN_DTL.IS_FIXED_CURR_RATE, T_TR_PUR_PAY_PLAN_DTL.PAY_RATE, T_TR_PUR_PAY_PLAN_DTL.AMT_REF_TYPE, ",
        "T_TR_PUR_PAY_PLAN_DTL.PAY_AMT, T_TR_PUR_PAY_PLAN_DTL.REMARK, T_TR_PUR_PAY_PLAN_DTL.PAY_DESC",
        "from T_TR_PUR_PAY_PLAN_DTL,T_TR_PUR_PAY_PLAN",
        "where T_TR_PUR_PAY_PLAN_DTL.PLAN_ID=T_TR_PUR_PAY_PLAN.PLAN_ID ",
        "and T_TR_PUR_PAY_PLAN.TOB_ID = #{bcId,jdbcType=DECIMAL}",
        "and T_TR_PUR_PAY_PLAN.TOB_TYPE = #{bcType,jdbcType=VARCHAR} "
    })
    @ResultMap("com.sumec.project.dao.ITrPurPayPlanDtlDao.BaseResultMap")
    List<TTrPurPayPlanDtl> selectByBcId( @Param("bcId") BigDecimal bcId, @Param("bcType")String bcType);

}