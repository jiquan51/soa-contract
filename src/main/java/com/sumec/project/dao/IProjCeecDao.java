package com.sumec.project.dao;

import com.sumec.project.entity.TProjCeec;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IProjCeecDao {
    @Delete({
        "delete from T_PROJ_CEEC",
        "where PROJ_ID = #{projId,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal projId);

    @Insert({
        "insert into T_PROJ_CEEC (PROJ_ID, PROJ_NO, ",
        "PROJ_NAME, PROJ_ADDRESS, ",
        "K_ID, INLAND_OR_OVERSEAS, ",
        "PROJ_NATION_ID, OWNER_ID, ",
        "OWNER_NAME, FUND_TYPE, ",
        "SIGN_C_NO, SIGN_DATE, ",
        "SIGN_ADDRESS, SIGNER_ID, ",
        "ACC_NO, SIGN_AMT_INFO, ",
        "EFFECT_DATE, PROJ_ORG_ID, ",
        "PM_USER_ID, Y_START_DATE, ",
        "Y_END_DATE, PROJ_TL, ",
        "PROJ_TL_UNIT, REMARK, ",
        "PROJ_STATUS, M_USER_ID, ",
        "M_DATE, MU_ORG_ID, ",
        "U_USER_ID, U_DATE, ",
        "CONFIRM, RGE_TMPL_ID, ",
        "DET_TMPL_ID, BUD_TMPL_ID, ",
        "CELL_ID, SIGNER_NAME, ",
        "PROJ_CODE, START_ID, ",
        "T_ID, OWNER_C_NO, PROJ_BUSS_TYPE, ",
        "IS_MIG)",
        "values (#{projId,jdbcType=DECIMAL}, #{projNo,jdbcType=VARCHAR}, ",
        "#{projName,jdbcType=VARCHAR}, #{projAddress,jdbcType=VARCHAR}, ",
        "#{kId,jdbcType=DECIMAL}, #{inlandOrOverseas,jdbcType=VARCHAR}, ",
        "#{projNationId,jdbcType=DECIMAL}, #{ownerId,jdbcType=DECIMAL}, ",
        "#{ownerName,jdbcType=VARCHAR}, #{fundType,jdbcType=VARCHAR}, ",
        "#{signCNo,jdbcType=VARCHAR}, #{signDate,jdbcType=TIMESTAMP}, ",
        "#{signAddress,jdbcType=VARCHAR}, #{signerId,jdbcType=DECIMAL}, ",
        "#{accNo,jdbcType=VARCHAR}, #{signAmtInfo,jdbcType=VARCHAR}, ",
        "#{effectDate,jdbcType=TIMESTAMP}, #{projOrgId,jdbcType=DECIMAL}, ",
        "#{pmUserId,jdbcType=DECIMAL}, #{yStartDate,jdbcType=TIMESTAMP}, ",
        "#{yEndDate,jdbcType=TIMESTAMP}, #{projTl,jdbcType=DECIMAL}, ",
        "#{projTlUnit,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{projStatus,jdbcType=VARCHAR}, #{mUserId,jdbcType=DECIMAL}, ",
        "#{mDate,jdbcType=TIMESTAMP}, #{muOrgId,jdbcType=DECIMAL}, ",
        "#{uUserId,jdbcType=DECIMAL}, #{uDate,jdbcType=TIMESTAMP}, ",
        "#{confirm,jdbcType=VARCHAR}, #{rgeTmplId,jdbcType=DECIMAL}, ",
        "#{detTmplId,jdbcType=DECIMAL}, #{budTmplId,jdbcType=DECIMAL}, ",
        "#{cellId,jdbcType=DECIMAL}, #{signerName,jdbcType=VARCHAR}, ",
        "#{projCode,jdbcType=VARCHAR}, #{startId,jdbcType=DECIMAL}, ",
        "#{tId,jdbcType=DECIMAL}, #{ownerCNo,jdbcType=VARCHAR}, #{projBussType,jdbcType=VARCHAR}, ",
        "#{isMig,jdbcType=VARCHAR})"
    })
    int insert(TProjCeec record);

    int insertSelective(TProjCeec record);

    @Select({
        "select",
        "PROJ_ID, PROJ_NO, PROJ_NAME, PROJ_ADDRESS, K_ID, INLAND_OR_OVERSEAS, PROJ_NATION_ID, ",
        "OWNER_ID, OWNER_NAME, FUND_TYPE, SIGN_C_NO, SIGN_DATE, SIGN_ADDRESS, SIGNER_ID, ",
        "ACC_NO, SIGN_AMT_INFO, EFFECT_DATE, PROJ_ORG_ID, PM_USER_ID, Y_START_DATE, Y_END_DATE, ",
        "PROJ_TL, PROJ_TL_UNIT, REMARK, PROJ_STATUS, M_USER_ID, M_DATE, MU_ORG_ID, U_USER_ID, ",
        "U_DATE, CONFIRM, RGE_TMPL_ID, DET_TMPL_ID, BUD_TMPL_ID, CELL_ID, SIGNER_NAME, ",
        "PROJ_CODE, START_ID, T_ID, OWNER_C_NO, PROJ_BUSS_TYPE, IS_MIG",
        "from T_PROJ_CEEC",
        "where PROJ_ID = #{projId,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.project.dao.IProjCeecDao.BaseResultMap")
    TProjCeec selectByPrimaryKey(BigDecimal projId);

    int updateByPrimaryKeySelective(TProjCeec record);

    @Update({
        "update T_PROJ_CEEC",
        "set PROJ_NO = #{projNo,jdbcType=VARCHAR},",
          "PROJ_NAME = #{projName,jdbcType=VARCHAR},",
          "PROJ_ADDRESS = #{projAddress,jdbcType=VARCHAR},",
          "K_ID = #{kId,jdbcType=DECIMAL},",
          "INLAND_OR_OVERSEAS = #{inlandOrOverseas,jdbcType=VARCHAR},",
          "PROJ_NATION_ID = #{projNationId,jdbcType=DECIMAL},",
          "OWNER_ID = #{ownerId,jdbcType=DECIMAL},",
          "OWNER_NAME = #{ownerName,jdbcType=VARCHAR},",
          "FUND_TYPE = #{fundType,jdbcType=VARCHAR},",
          "SIGN_C_NO = #{signCNo,jdbcType=VARCHAR},",
          "SIGN_DATE = #{signDate,jdbcType=TIMESTAMP},",
          "SIGN_ADDRESS = #{signAddress,jdbcType=VARCHAR},",
          "SIGNER_ID = #{signerId,jdbcType=DECIMAL},",
          "ACC_NO = #{accNo,jdbcType=VARCHAR},",
          "SIGN_AMT_INFO = #{signAmtInfo,jdbcType=VARCHAR},",
          "EFFECT_DATE = #{effectDate,jdbcType=TIMESTAMP},",
          "PROJ_ORG_ID = #{projOrgId,jdbcType=DECIMAL},",
          "PM_USER_ID = #{pmUserId,jdbcType=DECIMAL},",
          "Y_START_DATE = #{yStartDate,jdbcType=TIMESTAMP},",
          "Y_END_DATE = #{yEndDate,jdbcType=TIMESTAMP},",
          "PROJ_TL = #{projTl,jdbcType=DECIMAL},",
          "PROJ_TL_UNIT = #{projTlUnit,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "PROJ_STATUS = #{projStatus,jdbcType=VARCHAR},",
          "M_USER_ID = #{mUserId,jdbcType=DECIMAL},",
          "M_DATE = #{mDate,jdbcType=TIMESTAMP},",
          "MU_ORG_ID = #{muOrgId,jdbcType=DECIMAL},",
          "U_USER_ID = #{uUserId,jdbcType=DECIMAL},",
          "U_DATE = #{uDate,jdbcType=TIMESTAMP},",
          "CONFIRM = #{confirm,jdbcType=VARCHAR},",
          "RGE_TMPL_ID = #{rgeTmplId,jdbcType=DECIMAL},",
          "DET_TMPL_ID = #{detTmplId,jdbcType=DECIMAL},",
          "BUD_TMPL_ID = #{budTmplId,jdbcType=DECIMAL},",
          "CELL_ID = #{cellId,jdbcType=DECIMAL},",
          "SIGNER_NAME = #{signerName,jdbcType=VARCHAR},",
          "PROJ_CODE = #{projCode,jdbcType=VARCHAR},",
          "START_ID = #{startId,jdbcType=DECIMAL},",
          "T_ID = #{tId,jdbcType=DECIMAL},",
          "OWNER_C_NO = #{ownerCNo,jdbcType=VARCHAR},",
          "PROJ_BUSS_TYPE = #{projBussType,jdbcType=VARCHAR},",
          "IS_MIG = #{isMig,jdbcType=VARCHAR}",
        "where PROJ_ID = #{projId,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TProjCeec record);
}