package com.sumec.contract.dao;

import com.sumec.contract.entity.TTrQrbarType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ITrQrbarTypeDao {
    @Delete({
        "delete from T_TR_QRBAR_TYPE",
        "where T_ID = #{tId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String tId);

    @Insert({
        "insert into T_TR_QRBAR_TYPE (T_ID, T_NAME, ",
        "F_T_ID, T_CODE)",
        "values (#{tId,jdbcType=VARCHAR}, #{tName,jdbcType=VARCHAR}, ",
        "#{fTId,jdbcType=VARCHAR}, #{tCode,jdbcType=VARCHAR})"
    })
    int insert(TTrQrbarType record);

    int insertSelective(TTrQrbarType record);

    @Select({
        "select",
        "T_ID, T_NAME, F_T_ID, T_CODE",
        "from T_TR_QRBAR_TYPE",
        "where T_ID = #{tId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.ITrQrbarTypeDao.BaseResultMap")
    TTrQrbarType selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TTrQrbarType record);

    @Update({
        "update T_TR_QRBAR_TYPE",
        "set T_NAME = #{tName,jdbcType=VARCHAR},",
          "F_T_ID = #{fTId,jdbcType=VARCHAR},",
          "T_CODE = #{tCode,jdbcType=VARCHAR}",
        "where T_ID = #{tId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrQrbarType record);
}