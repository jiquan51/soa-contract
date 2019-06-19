package com.sumec.flow.dao;

import com.sumec.flow.entity.TSumecFlowDetails;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ISumecFlowDetailsDao{
    @Delete({"delete from T_SUMEC_FLOW_DETAILS","where INT_ID = #{intId,jdbcType=DECIMAL}"})
    int deleteByPrimaryKey(Long intId);

    @Insert({"insert into T_SUMEC_FLOW_DETAILS (INT_ID, FM_ID, ","REF_VALUE, FA_ID, ","FS_ID, USER_ID, DEAL_TIME, ",
            "DEAL_FLAG, DTL_STEP, ","NOTION, SEQ, FLAG, ","IS_GD, GD_INT_ID, GRANT_USER_ID, ","IS_READ, DTL_DESC, ",
            "IS_END, POST_TIME, ","SP_USER_ID, BAKED, ","FM_SEQ_ID, DEAL_WAY)",
            "values (#{intId,jdbcType=DECIMAL}, #{fmId,jdbcType=DECIMAL}, ",
            "#{refValue,jdbcType=VARCHAR}, #{faId,jdbcType=DECIMAL}, ",
            "#{fsId,jdbcType=DECIMAL}, #{userId,jdbcType=DECIMAL}, #{dealTime,jdbcType=TIMESTAMP}, ",
            "#{dealFlag,jdbcType=VARCHAR}, #{dtlStep,jdbcType=DECIMAL}, ",
            "#{notion,jdbcType=VARCHAR}, #{seq,jdbcType=DECIMAL}, #{flag,jdbcType=VARCHAR}, ",
            "#{isGd,jdbcType=VARCHAR}, #{gdIntId,jdbcType=DECIMAL}, #{grantUserId,jdbcType=DECIMAL}, ",
            "#{isRead,jdbcType=VARCHAR}, #{dtlDesc,jdbcType=VARCHAR}, ",
            "#{isEnd,jdbcType=VARCHAR}, #{postTime,jdbcType=TIMESTAMP}, ",
            "#{spUserId,jdbcType=DECIMAL}, #{baked,jdbcType=VARCHAR}, ",
            "#{fmSeqId,jdbcType=DECIMAL}, #{dealWay,jdbcType=VARCHAR})"})
    int insert(TSumecFlowDetails record);

    int insertSelective(TSumecFlowDetails record);

    @Select({"select","INT_ID, FM_ID, REF_VALUE, FA_ID, FS_ID, USER_ID, DEAL_TIME, DEAL_FLAG, DTL_STEP, ",
            "NOTION, SEQ, FLAG, IS_GD, GD_INT_ID, GRANT_USER_ID, IS_READ, DTL_DESC, IS_END, ",
            "POST_TIME, SP_USER_ID, BAKED, FM_SEQ_ID, DEAL_WAY","from T_SUMEC_FLOW_DETAILS",
            "where INT_ID = #{intId,jdbcType=DECIMAL}"})
    @ResultMap("com.sumec.flow.dao.ISumecFlowDetailsDao.BaseResultMap")
    TSumecFlowDetails selectByPrimaryKey(Long intId);

    @Select({"select","INT_ID, FM_ID, REF_VALUE, FA_ID, FS_ID, USER_ID, DEAL_TIME, DEAL_FLAG, DTL_STEP, ",
            "NOTION, SEQ, FLAG, IS_GD, GD_INT_ID, GRANT_USER_ID, IS_READ, DTL_DESC, IS_END, ",
            "POST_TIME, SP_USER_ID, BAKED, FM_SEQ_ID, DEAL_WAY","from T_SUMEC_FLOW_DETAILS",
            "where REF_VALUE = #{bcId,jdbcType=VARCHAR}"})
    @ResultMap("com.sumec.flow.dao.ISumecFlowDetailsDao.BaseResultMap")
    List<TSumecFlowDetails> selectByBcId(@Param("bcId") String bcId);

    @Select({"select","INT_ID, FM_ID, REF_VALUE, FA_ID, FS_ID, USER_ID, DEAL_TIME, DEAL_FLAG, DTL_STEP, ",
        "NOTION, SEQ, FLAG, IS_GD, GD_INT_ID, GRANT_USER_ID, IS_READ, DTL_DESC, IS_END, ",
        "POST_TIME, SP_USER_ID, BAKED, FM_SEQ_ID, DEAL_WAY","from T_SUMEC_FLOW_DETAILS",
        "where FLAG='1' and FM_ID = #{fmId,jdbcType=DECIMAL} and REF_VALUE = #{refValue,jdbcType=VARCHAR} order by DTL_STEP asc"})
    @ResultMap("com.sumec.flow.dao.ISumecFlowDetailsDao.BaseResultMap")
    List<TSumecFlowDetails> selectByFmId(@Param("fmId") Long fmId,@Param("refValue") String refValue);

    @Deprecated
    TSumecFlowDetails selectNextValidStep(TSumecFlowDetails sumecFlowDetails);
    List<TSumecFlowDetails> selectValidStep(TSumecFlowDetails sumecFlowDetails);

    int updateByPrimaryKeySelective(TSumecFlowDetails record);

    int updateBWorkFlowDetailsPass(TSumecFlowDetails record);

    int updateBWorkFlowBack(TSumecFlowDetails record);

    @Update({"update T_SUMEC_FLOW_DETAILS","set FM_ID = #{fmId,jdbcType=DECIMAL},",
            "REF_VALUE = #{refValue,jdbcType=VARCHAR},","FA_ID = #{faId,jdbcType=DECIMAL},",
            "FS_ID = #{fsId,jdbcType=DECIMAL},","USER_ID = #{userId,jdbcType=DECIMAL},",
            "DEAL_TIME = #{dealTime,jdbcType=TIMESTAMP},","DEAL_FLAG = #{dealFlag,jdbcType=VARCHAR},",
            "DTL_STEP = #{dtlStep,jdbcType=DECIMAL},","NOTION = #{notion,jdbcType=VARCHAR},",
            "SEQ = #{seq,jdbcType=DECIMAL},","FLAG = #{flag,jdbcType=VARCHAR},","IS_GD = #{isGd,jdbcType=VARCHAR},",
            "GD_INT_ID = #{gdIntId,jdbcType=DECIMAL},","GRANT_USER_ID = #{grantUserId,jdbcType=DECIMAL},",
            "IS_READ = #{isRead,jdbcType=VARCHAR},","DTL_DESC = #{dtlDesc,jdbcType=VARCHAR},",
            "IS_END = #{isEnd,jdbcType=VARCHAR},","POST_TIME = #{postTime,jdbcType=TIMESTAMP},",
            "SP_USER_ID = #{spUserId,jdbcType=DECIMAL},","BAKED = #{baked,jdbcType=VARCHAR},",
            "FM_SEQ_ID = #{fmSeqId,jdbcType=DECIMAL},","DEAL_WAY = #{dealWay,jdbcType=VARCHAR}",
            "where INT_ID = #{intId,jdbcType=DECIMAL}"})
    int updateByPrimaryKey(TSumecFlowDetails record);
}