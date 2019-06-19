package com.sumec.flow.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sumec.flow.entity.TSumecFlowModule;

public interface ISumecFlowModuleDao {
    @Delete({
        "delete from T_SUMEC_FLOW_MODULE",
        "where FM_ID = #{fmId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long fmId);

    @Insert({
        "insert into T_SUMEC_FLOW_MODULE (FM_ID, FM_CODE, ",
        "FM_NAME, TABLE_NAME, ",
        "PK_COLUMN, FM_VIEW_NAME, ",
        "DW_OBJECT, WINFORM_NAME, ",
        "CONFIRM_COLUMN, ALLOW_GENE, ",
        "IS_DEL, ORDER_ID, ",
        "MA_ID, GRANT_DIR, ",
        "DISPLAY_COLUMN, DISPLAY_DW, ",
        "MOBILE_FM_ID, CALLBACKHANDLER, ",
        "ASSIST_OBJECT)",
        "values (#{fmId,jdbcType=DECIMAL}, #{fmCode,jdbcType=VARCHAR}, ",
        "#{fmName,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{pkColumn,jdbcType=VARCHAR}, #{fmViewName,jdbcType=VARCHAR}, ",
        "#{dwObject,jdbcType=VARCHAR}, #{winformName,jdbcType=VARCHAR}, ",
        "#{confirmColumn,jdbcType=VARCHAR}, #{allowGene,jdbcType=VARCHAR}, ",
        "#{isDel,jdbcType=VARCHAR}, #{orderId,jdbcType=DECIMAL}, ",
        "#{maId,jdbcType=DECIMAL}, #{grantDir,jdbcType=VARCHAR}, ",
        "#{displayColumn,jdbcType=VARCHAR}, #{displayDw,jdbcType=VARCHAR}, ",
        "#{mobileFmId,jdbcType=DECIMAL}, #{callbackhandler,jdbcType=VARCHAR}, ",
        "#{assistObject,jdbcType=VARCHAR})"
    })
    int insert(TSumecFlowModule record);

    int insertSelective(TSumecFlowModule record);

    @Select({
        "select",
        "FM_ID, FM_CODE, FM_NAME, TABLE_NAME, PK_COLUMN, FM_VIEW_NAME, DW_OBJECT, WINFORM_NAME, ",
        "CONFIRM_COLUMN, ALLOW_GENE, IS_DEL, ORDER_ID, MA_ID, GRANT_DIR, DISPLAY_COLUMN, ",
        "DISPLAY_DW, MOBILE_FM_ID, CALLBACKHANDLER, ASSIST_OBJECT",
        "from T_SUMEC_FLOW_MODULE",
        "where FM_ID = #{fmId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.flow.dao.ISumecFlowModuleDao.BaseResultMap")
    TSumecFlowModule selectByPrimaryKey(Long fmId);

    int updateByPrimaryKeySelective(TSumecFlowModule record);

    int updateBTableConfirm(HashMap<String,String> map);
    
    @Update({
        "update T_SUMEC_FLOW_MODULE",
        "set FM_CODE = #{fmCode,jdbcType=VARCHAR},",
          "FM_NAME = #{fmName,jdbcType=VARCHAR},",
          "TABLE_NAME = #{tableName,jdbcType=VARCHAR},",
          "PK_COLUMN = #{pkColumn,jdbcType=VARCHAR},",
          "FM_VIEW_NAME = #{fmViewName,jdbcType=VARCHAR},",
          "DW_OBJECT = #{dwObject,jdbcType=VARCHAR},",
          "WINFORM_NAME = #{winformName,jdbcType=VARCHAR},",
          "CONFIRM_COLUMN = #{confirmColumn,jdbcType=VARCHAR},",
          "ALLOW_GENE = #{allowGene,jdbcType=VARCHAR},",
          "IS_DEL = #{isDel,jdbcType=VARCHAR},",
          "ORDER_ID = #{orderId,jdbcType=DECIMAL},",
          "MA_ID = #{maId,jdbcType=DECIMAL},",
          "GRANT_DIR = #{grantDir,jdbcType=VARCHAR},",
          "DISPLAY_COLUMN = #{displayColumn,jdbcType=VARCHAR},",
          "DISPLAY_DW = #{displayDw,jdbcType=VARCHAR},",
          "MOBILE_FM_ID = #{mobileFmId,jdbcType=DECIMAL},",
          "CALLBACKHANDLER = #{callbackhandler,jdbcType=VARCHAR},",
          "ASSIST_OBJECT = #{assistObject,jdbcType=VARCHAR}",
        "where FM_ID = #{fmId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSumecFlowModule record);
}