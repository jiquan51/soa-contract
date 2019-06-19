package com.sumec.project.dao;

import com.sumec.project.entity.TProjCeecBudBasic;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

public interface IProjCeecBudBasicDao {


    @Select({
            "select",
            "T_PROJ_CEEC_BUD_BASIC.INT_ID AS INT_ID, T_PROJ_CEEC_BUD_BASIC.BBUD_TYPE AS BBUD_TYPE, ",
            "T_PROJ_CEEC_BUD_BASIC.BBUD_CODE AS BBUD_CODE, T_PROJ_CEEC_BUD_BASIC.BBUD_NAME AS BBUD_NAME, ",
            "T_PROJ_CEEC_BUD_BASIC.BBUD_DEF_CURR AS BBUD_DEF_CURR, T_PROJ_CEEC_BUD_BASIC.BBUD_REMARK AS BBUD_REMARK, ",
            "T_PROJ_CEEC_BUD_BASIC.F_INT_ID AS F_INT_ID, T_PROJ_CEEC_BUD_BASIC.IS_BUD AS IS_BUD, T_PROJ_CEEC_BUD_BASIC.IS_USE AS IS_USE, ",
            "T_PROJ_CEEC_BUD_BASIC.BBUD_TYPE_CATA AS BBUD_TYPE_CATA, T_PROJ_CEEC_BUD_BASIC.ADD_MINUS_TAG AS ADD_MINUS_TAG, ",
            "T_PROJ_CEEC_BUD_BASIC.IS_SIGN AS IS_SIGN",
            "from T_PROJ_CEEC_BUD_BASIC,T_PROJ_CEEC_BUD_USE_REVIEW",
            "where T_PROJ_CEEC_BUD_BASIC.INT_ID = T_PROJ_CEEC_BUD_USE_REVIEW.BASIC_USE_ID and  T_PROJ_CEEC_BUD_USE_REVIEW.TOB_ID= #{bcId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecBudBasicDao.BaseResultMap")
    TProjCeecBudBasic selectByBcId(BigDecimal bcId);


}