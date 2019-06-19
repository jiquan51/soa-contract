package com.sumec.pkg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.pkg.entity.TTrPkg;

public interface ITrPkgDao {
    @Delete({
        "delete from T_TR_PKG",
        "where PKG_ID = #{pkgId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String pkgId);

    @Insert({
        "insert into T_TR_PKG (PKG_ID, PKG_CODE, ",
        "PKG_NAME, M_DATE, ",
        "M_USER_ID, PKG_TYPE)",
        "values (#{pkgId,jdbcType=VARCHAR}, #{pkgCode,jdbcType=VARCHAR}, ",
        "#{pkgName,jdbcType=VARCHAR}, #{mDate,jdbcType=TIMESTAMP}, ",
        "#{mUserId,jdbcType=DECIMAL}, #{pkgType,jdbcType=VARCHAR})"
    })
    int insert(TTrPkg record);

    int insertSelective(TTrPkg record);

    @Select({
        "select",
        "PKG_ID, PKG_CODE, PKG_NAME, M_DATE, M_USER_ID, PKG_TYPE",
        "from T_TR_PKG",
        "where PKG_ID = #{pkgId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgDao.BaseResultMap")
    TTrPkg selectByPrimaryKey(String pkgId);

    @Select({
    	"select",
    	"PKG_ID, PKG_CODE, PKG_NAME, M_DATE, M_USER_ID, PKG_TYPE",
    	"from T_TR_PKG",
    	"where PKG_CODE = #{pkgCode,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.pkg.dao.ITrPkgDao.BaseResultMap")
    TTrPkg selectByPkgCode(String pkgCode);

    @Select({
    	"select",
    	"PKG_ID",
    	"from T_TR_PKG",
    })
    List<String> selectAllPkgId();

    int updateByPrimaryKeySelective(TTrPkg record);

    @Update({
        "update T_TR_PKG",
        "set PKG_CODE = #{pkgCode,jdbcType=VARCHAR},",
          "PKG_NAME = #{pkgName,jdbcType=VARCHAR},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "M_USER_ID = #{mUserId,jdbcType=DECIMAL},",
          "PKG_TYPE = #{pkgType,jdbcType=VARCHAR}",
        "where PKG_ID = #{pkgId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrPkg record);
}