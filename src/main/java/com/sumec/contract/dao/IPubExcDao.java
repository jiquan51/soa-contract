package com.sumec.contract.dao;

import com.sumec.contract.entity.TPubExc;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IPubExcDao {
    @Delete({
        "delete from T_PUB_EXC",
        "where EXC_ID = #{excId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal excId);

    @Insert({
        "insert into T_PUB_EXC (EXC_ID, PRO_ID_FROM, ",
        "PRO_ID_TO, PRO_TYPE_FROM, ",
        "PRO_TYPE_TO, PRO_CODE_FROM, ",
        "PRO_CODE_TO, C_ID_FROM, ",
        "C_ID_TO, C_TYPE_FROM, ",
        "C_TYPE_TO, C_NO_FROM, ",
        "C_NO_TO, CST_ID_FROM, ",
        "CST_ID_TO, CST_NO_FROM, ",
        "CST_NO_TO, CST_NAME_FROM, ",
        "CST_NAME_TO, NOTES, ",
        "CONFIRM, M_DATE, ",
        "ORG_ID, OCU_ID, USER_ID, ",
        "MODIFY_USER_ID, MODIFY_DATE, ",
        "CHECK_USER_ID, CHECK_DATE, ",
        "EXC_TYPE, CURR_TYPE, ",
        "CURR_RATE, EXC_AMT, ",
        "EXC_FROM_TYPE, EXC_TO_TYPE, ",
        "CALC_AGENT, EXC_PAY_TRM, ",
        "EXC_PAY_CD_OPEN_DATE, EXC_PAY_CD_END_DATE, ",
        "EXC_PAY_CD_PAY_TYPE, INV_STATUS, ",
        "OVER_TAG, DSF_TYPE, ",
        "ORI_ID, PZ_TAG, EXC_DATE)",
        "values (#{excId,jdbcType=DECIMAL}, #{proIdFrom,jdbcType=DECIMAL}, ",
        "#{proIdTo,jdbcType=DECIMAL}, #{proTypeFrom,jdbcType=VARCHAR}, ",
        "#{proTypeTo,jdbcType=VARCHAR}, #{proCodeFrom,jdbcType=VARCHAR}, ",
        "#{proCodeTo,jdbcType=VARCHAR}, #{cIdFrom,jdbcType=DECIMAL}, ",
        "#{cIdTo,jdbcType=DECIMAL}, #{cTypeFrom,jdbcType=VARCHAR}, ",
        "#{cTypeTo,jdbcType=VARCHAR}, #{cNoFrom,jdbcType=VARCHAR}, ",
        "#{cNoTo,jdbcType=VARCHAR}, #{cstIdFrom,jdbcType=DECIMAL}, ",
        "#{cstIdTo,jdbcType=DECIMAL}, #{cstNoFrom,jdbcType=VARCHAR}, ",
        "#{cstNoTo,jdbcType=VARCHAR}, #{cstNameFrom,jdbcType=VARCHAR}, ",
        "#{cstNameTo,jdbcType=VARCHAR}, #{notes,jdbcType=VARCHAR}, ",
        "#{confirm,jdbcType=VARCHAR}, #{mDate,jdbcType=TIMESTAMP}, ",
        "#{orgId,jdbcType=DECIMAL}, #{ocuId,jdbcType=DECIMAL}, #{userId,jdbcType=DECIMAL}, ",
        "#{modifyUserId,jdbcType=DECIMAL}, #{modifyDate,jdbcType=TIMESTAMP}, ",
        "#{checkUserId,jdbcType=DECIMAL}, #{checkDate,jdbcType=TIMESTAMP}, ",
        "#{excType,jdbcType=VARCHAR}, #{currType,jdbcType=VARCHAR}, ",
        "#{currRate,jdbcType=DECIMAL}, #{excAmt,jdbcType=DECIMAL}, ",
        "#{excFromType,jdbcType=VARCHAR}, #{excToType,jdbcType=VARCHAR}, ",
        "#{calcAgent,jdbcType=VARCHAR}, #{excPayTrm,jdbcType=VARCHAR}, ",
        "#{excPayCdOpenDate,jdbcType=TIMESTAMP}, #{excPayCdEndDate,jdbcType=TIMESTAMP}, ",
        "#{excPayCdPayType,jdbcType=VARCHAR}, #{invStatus,jdbcType=VARCHAR}, ",
        "#{overTag,jdbcType=VARCHAR}, #{dsfType,jdbcType=VARCHAR}, ",
        "#{oriId,jdbcType=DECIMAL}, #{pzTag,jdbcType=DECIMAL}, #{excDate,jdbcType=TIMESTAMP})"
    })
    int insert(TPubExc record);

    int insertSelective(TPubExc record);

    @Select({
        "select",
        "EXC_ID, PRO_ID_FROM, PRO_ID_TO, PRO_TYPE_FROM, PRO_TYPE_TO, PRO_CODE_FROM, PRO_CODE_TO, ",
        "C_ID_FROM, C_ID_TO, C_TYPE_FROM, C_TYPE_TO, C_NO_FROM, C_NO_TO, CST_ID_FROM, ",
        "CST_ID_TO, CST_NO_FROM, CST_NO_TO, CST_NAME_FROM, CST_NAME_TO, NOTES, CONFIRM, ",
        "M_DATE, ORG_ID, OCU_ID, USER_ID, MODIFY_USER_ID, MODIFY_DATE, CHECK_USER_ID, ",
        "CHECK_DATE, EXC_TYPE, CURR_TYPE, CURR_RATE, EXC_AMT, EXC_FROM_TYPE, EXC_TO_TYPE, ",
        "CALC_AGENT, EXC_PAY_TRM, EXC_PAY_CD_OPEN_DATE, EXC_PAY_CD_END_DATE, EXC_PAY_CD_PAY_TYPE, ",
        "INV_STATUS, OVER_TAG, DSF_TYPE, ORI_ID, PZ_TAG, EXC_DATE",
        "from T_PUB_EXC",
        "where EXC_ID = #{excId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.TPubExcMapper.BaseResultMap")
    TPubExc selectByPrimaryKey(BigDecimal excId);

    int updateByPrimaryKeySelective(TPubExc record);

    @Update({
        "update T_PUB_EXC",
        "set PRO_ID_FROM = #{proIdFrom,jdbcType=DECIMAL},",
          "PRO_ID_TO = #{proIdTo,jdbcType=DECIMAL},",
          "PRO_TYPE_FROM = #{proTypeFrom,jdbcType=VARCHAR},",
          "PRO_TYPE_TO = #{proTypeTo,jdbcType=VARCHAR},",
          "PRO_CODE_FROM = #{proCodeFrom,jdbcType=VARCHAR},",
          "PRO_CODE_TO = #{proCodeTo,jdbcType=VARCHAR},",
          "C_ID_FROM = #{cIdFrom,jdbcType=DECIMAL},",
          "C_ID_TO = #{cIdTo,jdbcType=DECIMAL},",
          "C_TYPE_FROM = #{cTypeFrom,jdbcType=VARCHAR},",
          "C_TYPE_TO = #{cTypeTo,jdbcType=VARCHAR},",
          "C_NO_FROM = #{cNoFrom,jdbcType=VARCHAR},",
          "C_NO_TO = #{cNoTo,jdbcType=VARCHAR},",
          "CST_ID_FROM = #{cstIdFrom,jdbcType=DECIMAL},",
          "CST_ID_TO = #{cstIdTo,jdbcType=DECIMAL},",
          "CST_NO_FROM = #{cstNoFrom,jdbcType=VARCHAR},",
          "CST_NO_TO = #{cstNoTo,jdbcType=VARCHAR},",
          "CST_NAME_FROM = #{cstNameFrom,jdbcType=VARCHAR},",
          "CST_NAME_TO = #{cstNameTo,jdbcType=VARCHAR},",
          "NOTES = #{notes,jdbcType=VARCHAR},",
          "CONFIRM = #{confirm,jdbcType=VARCHAR},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "ORG_ID = #{orgId,jdbcType=DECIMAL},",
          "OCU_ID = #{ocuId,jdbcType=DECIMAL},",
          "USER_ID = #{userId,jdbcType=DECIMAL},",
          "MODIFY_USER_ID = #{modifyUserId,jdbcType=DECIMAL},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "CHECK_USER_ID = #{checkUserId,jdbcType=DECIMAL},",
          "CHECK_DATE = #{checkDate,jdbcType=TIMESTAMP},",
          "EXC_TYPE = #{excType,jdbcType=VARCHAR},",
          "CURR_TYPE = #{currType,jdbcType=VARCHAR},",
          "CURR_RATE = #{currRate,jdbcType=DECIMAL},",
          "EXC_AMT = #{excAmt,jdbcType=DECIMAL},",
          "EXC_FROM_TYPE = #{excFromType,jdbcType=VARCHAR},",
          "EXC_TO_TYPE = #{excToType,jdbcType=VARCHAR},",
          "CALC_AGENT = #{calcAgent,jdbcType=VARCHAR},",
          "EXC_PAY_TRM = #{excPayTrm,jdbcType=VARCHAR},",
          "EXC_PAY_CD_OPEN_DATE = #{excPayCdOpenDate,jdbcType=TIMESTAMP},",
          "EXC_PAY_CD_END_DATE = #{excPayCdEndDate,jdbcType=TIMESTAMP},",
          "EXC_PAY_CD_PAY_TYPE = #{excPayCdPayType,jdbcType=VARCHAR},",
          "INV_STATUS = #{invStatus,jdbcType=VARCHAR},",
          "OVER_TAG = #{overTag,jdbcType=VARCHAR},",
          "DSF_TYPE = #{dsfType,jdbcType=VARCHAR},",
          "ORI_ID = #{oriId,jdbcType=DECIMAL},",
          "PZ_TAG = #{pzTag,jdbcType=DECIMAL},",
          "EXC_DATE = #{excDate,jdbcType=TIMESTAMP}",
        "where EXC_ID = #{excId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPubExc record);
}