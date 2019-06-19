package com.sumec.project.dao;

import com.sumec.project.entity.TProjCeecBudUseReview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

public interface IProjCeecBudUseReviewDao {
    @Insert({
        "insert into T_PROJ_CEEC_BUD_USE_REVIEW (INT_ID, PROJ_ID, ",
        "BASIC_USE_ID, BASIC_BUD_ID, ",
        "TOB_TYPE, TOB_ID, ",
        "CREATE_DATE, USE_AMT, ",
        "USE_CURR_TYPE, USE_CURR_RATE, ",
        "USE_AMT_RMB, TAG_TYPE)",
        "values (#{intId,jdbcType=VARCHAR}, #{projId,jdbcType=VARCHAR}, ",
        "#{basicUseId,jdbcType=VARCHAR}, #{basicBudId,jdbcType=VARCHAR}, ",
        "#{tobType,jdbcType=VARCHAR}, #{tobId,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{useAmt,jdbcType=DECIMAL}, ",
        "#{useCurrType,jdbcType=VARCHAR}, #{useCurrRate,jdbcType=DECIMAL}, ",
        "#{useAmtRmb,jdbcType=DECIMAL}, #{tagType,jdbcType=VARCHAR})"
    })
    int insert(TProjCeecBudUseReview record);

    int insertSelective(TProjCeecBudUseReview record);

    @Select({
            "select",
            "INT_ID, PROJ_ID, ",
            "BASIC_USE_ID, BASIC_BUD_ID, ",
            "TOB_TYPE, TOB_ID, ",
            "CREATE_DATE, USE_AMT, ",
            "USE_CURR_TYPE, USE_CURR_RATE, ",
            "USE_AMT_RMB, TAG_TYPE",
            "from T_PROJ_CEEC_BUD_USE_REVIEW",
            "where  T_PROJ_CEEC_BUD_USE_REVIEW.TOB_ID= #{bcId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecBudUseReviewDao.BaseResultMap")
    TProjCeecBudUseReview selectByBcId(BigDecimal bcId);
}