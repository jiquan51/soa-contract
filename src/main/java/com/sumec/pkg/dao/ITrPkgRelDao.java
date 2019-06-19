package com.sumec.pkg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.pkg.entity.TTrPkgRel;

public interface ITrPkgRelDao {
    @Delete({
        "delete from T_TR_PKG_REL",
        "where REL_ID = #{relId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String relId);

    @Insert({
        "insert into T_TR_PKG_REL (REL_ID, PKG_ID, ",
        "TOB_TYPE, TOB_ID, ",
        "REL_DATE)",
        "values (#{relId,jdbcType=VARCHAR}, #{pkgId,jdbcType=VARCHAR}, ",
        "#{tobType,jdbcType=VARCHAR}, #{tobId,jdbcType=VARCHAR}, ",
        "#{relDate,jdbcType=TIMESTAMP})"
    })
    int insert(TTrPkgRel record);

    int insertSelective(TTrPkgRel record);

    @Select({
        "select",
        "REL_ID, PKG_ID, TOB_TYPE, TOB_ID, REL_DATE",
        "from T_TR_PKG_REL",
        "where PKG_ID = #{pkgId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgRelDao.BaseResultMap")
    List<TTrPkgRel> selectByPkgId(String pkgId);

    @Select({
        "select",
        "REL_ID, PKG_ID, TOB_TYPE, TOB_ID, REL_DATE",
        "from T_TR_PKG_REL",
        "where PKG_ID = #{pkgId,jdbcType=VARCHAR} and TOB_TYPE = #{tobType,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgRelDao.BaseResultMap")
    List<TTrPkgRel> selectByPkgIdAndType(@Param("pkgId")String pkgId, @Param("tobType")String tobType);

    @Select({
    	"select",
    	"REL_ID, PKG_ID, TOB_TYPE, TOB_ID, REL_DATE",
    	"from T_TR_PKG_REL",
    	"where TOB_ID = #{tobId,jdbcType=VARCHAR} and TOB_TYPE = #{tobType,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgRelDao.BaseResultMap")
    List<TTrPkgRel> selectByTobIdAndType(@Param("tobId")String tobId, @Param("tobType")String tobType);

    @Select({
    	"select",
    	"REL_ID, TOB_TYPE_A as TOB_TYPE, TOB_ID_A as TOB_ID",
    	"from T_TR_CONTRACT_REL",
    	"where TOB_ID_B = #{tobId,jdbcType=VARCHAR} and TOB_TYPE_A = #{tobType,jdbcType=VARCHAR} ",
    	"AND REL_TYPE='MODEL'"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgRelDao.BaseResultMap")
    List<TTrPkgRel> selectSOrderByPkgIdAndType(@Param("tobId")String tobId, @Param("tobType")String tobType);
    
    @Select({
        "<script>",
        "select distinct pkg_id",
        "from t_tr_pkg_rel ",
        "where tob_type||tob_id in",
        "<foreach collection='res' item='item' index='index' open='(' separator=',' close=')'>",
        "<if test='(index % 999) == 998'> NULL ) OR tob_type||tob_id IN (</if>'${item.tobType}${item.tobId}'",
        "</foreach>",
        "</script>"
    })
    List<String> selectPkgIds(@Param("res")List<TTrOcuDivide> res);
    
    int updateByPrimaryKeySelective(TTrPkgRel record);

    @Update({
        "update T_TR_PKG_REL",
        "set PKG_ID = #{pkgId,jdbcType=VARCHAR},",
          "TOB_TYPE = #{tobType,jdbcType=VARCHAR},",
          "TOB_ID = #{tobId,jdbcType=VARCHAR},",
          "REL_DATE = #{relDate,jdbcType=TIMESTAMP}",
        "where REL_ID = #{relId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrPkgRel record);
}