package com.sumec.contract.dao;

import com.sumec.contract.entity.TTrOcuDivide;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ITrOcuDivideDao {
    @Delete({
        "delete from T_TR_OCU_DIVIDE",
        "where DIV_ID = #{divId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String divId);

    @Insert({
        "insert into T_TR_OCU_DIVIDE (DIV_ID, DIV_TYPE, ",
        "TOB_TYPE, TOB_ID, ",
        "OCU_ID, DIV_RATE, ",
        "REMARK)",
        "values (#{divId,jdbcType=VARCHAR}, #{divType,jdbcType=VARCHAR}, ",
        "#{tobType,jdbcType=VARCHAR}, #{tobId,jdbcType=DECIMAL}, ",
        "#{ocuId,jdbcType=DECIMAL}, #{divRate,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(TTrOcuDivide record);

    int insertSelective(TTrOcuDivide record);

    @Select({
        "select",
        "DIV_ID, DIV_TYPE, TOB_TYPE, TOB_ID, OCU_ID, DIV_RATE, REMARK",
        "from T_TR_OCU_DIVIDE",
        "where DIV_ID = #{divId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    TTrOcuDivide selectByPrimaryKey(String divId);

    @Select({
        "<script>",
        "select DISTINCT",
        "TOB_TYPE, TOB_ID, OCU_ID",
        "from T_TR_OCU_DIVIDE",
        "where OCU_ID in",
        "<foreach collection='ocuIds' item='item' index='index' open='(' separator=',' close=')'>",
            "<if test='(index % 999) == 998'> NULL ) OR OCU_ID IN (</if>#{item}",
        "</foreach>",
        "</script>"
    })
    @ResultMap("com.sumec.contract.dao.ITrOcuDivideDao.BaseResultMap")
    List<TTrOcuDivide> selectByOcuIds(@Param("ocuIds")List<Long> ocuIds);
    
    int updateByPrimaryKeySelective(TTrOcuDivide record);

    @Update({
        "update T_TR_OCU_DIVIDE",
        "set DIV_TYPE = #{divType,jdbcType=VARCHAR},",
          "TOB_TYPE = #{tobType,jdbcType=VARCHAR},",
          "TOB_ID = #{tobId,jdbcType=DECIMAL},",
          "OCU_ID = #{ocuId,jdbcType=DECIMAL},",
          "DIV_RATE = #{divRate,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where DIV_ID = #{divId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrOcuDivide record);
}