package com.sumec.project.dao;

import com.sumec.project.entity.TProjKind;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ITProjKindDao {
    @Delete({
        "delete from T_PROJ_KIND",
        "where K_ID = #{kId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal kId);

    @Insert({
        "insert into T_PROJ_KIND (K_ID, K_CODE, ",
        "K_NAME, INLAND_OR_OVERSEAS)",
        "values (#{kId,jdbcType=DECIMAL}, #{kCode,jdbcType=VARCHAR}, ",
        "#{kName,jdbcType=VARCHAR}, #{inlandOrOverseas,jdbcType=VARCHAR})"
    })
    int insert(TProjKind record);

    int insertSelective(TProjKind record);

    @Select({
        "select",
        "K_ID, K_CODE, K_NAME, INLAND_OR_OVERSEAS",
        "from T_PROJ_KIND",
        "where K_ID = #{kId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.ITProjKindDao.BaseResultMap")
    TProjKind selectByPrimaryKey(BigDecimal kId);

    int updateByPrimaryKeySelective(TProjKind record);

    @Update({
        "update T_PROJ_KIND",
        "set K_CODE = #{kCode,jdbcType=VARCHAR},",
          "K_NAME = #{kName,jdbcType=VARCHAR},",
          "INLAND_OR_OVERSEAS = #{inlandOrOverseas,jdbcType=VARCHAR}",
        "where K_ID = #{kId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TProjKind record);
}