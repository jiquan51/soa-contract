package com.sumec.contract.dao;

import com.sumec.contract.entity.TTrContractRel;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ITrContractRelDao {
    @Delete({
        "delete from T_TR_CONTRACT_REL",
        "where REL_ID = #{relId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String relId);

    @Insert({
        "insert into T_TR_CONTRACT_REL (REL_ID, REL_TYPE, ",
        "TOB_TYPE_A, TOB_ID_A, ",
        "TOB_TYPE_B, TOB_ID_B)",
        "values (#{relId,jdbcType=VARCHAR}, #{relType,jdbcType=VARCHAR}, ",
        "#{tobTypeA,jdbcType=VARCHAR}, #{tobIdA,jdbcType=DECIMAL}, ",
        "#{tobTypeB,jdbcType=VARCHAR}, #{tobIdB,jdbcType=DECIMAL})"
    })
    int insert(TTrContractRel record);

    int insertSelective(TTrContractRel record);

    @Select({
        "select",
        "REL_ID, REL_TYPE, TOB_TYPE_A, TOB_ID_A, TOB_TYPE_B, TOB_ID_B",
        "from T_TR_CONTRACT_REL",
        "where REL_ID = #{relId,jdbcType=VARCHAR}"
    })
    @ResultMap("com.sumec.contract.dao.ITrContractRelDao.BaseResultMap")
    TTrContractRel selectByPrimaryKey(String relId);

    @Select({
    	"SELECT tob_id_a From michael.t_tr_contract_rel Where tob_type_a = 'S_ORDER' And tob_type_b = 'S_ORDER' And tob_id_b = #{scId} And rel_type = 'EXC'"
    })
    BigDecimal selectOriginalScId(BigDecimal scId);

    @Select({
        "select",
        "REL_ID, REL_TYPE, TOB_TYPE_A, TOB_ID_A, TOB_TYPE_B, TOB_ID_B",
        "from T_TR_CONTRACT_REL",
        "where REL_TYPE ='MODEL' and TOB_TYPE_B = #{tobTypeB,jdbcType=VARCHAR} and TOB_ID_B = #{tobIdB,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.ITrContractRelDao.BaseResultMap")
    List<TTrContractRel> selectByTobIdB(@Param("tobTypeB")String tobTypeB,@Param("tobIdB")BigDecimal tobIdB);
    
    @Select({
        "select",
        "REL_ID, REL_TYPE, TOB_TYPE_A, TOB_ID_A, TOB_TYPE_B, TOB_ID_B",
        "from T_TR_CONTRACT_REL",
        "where REL_TYPE ='MODEL' and TOB_TYPE_A = #{tobTypeA,jdbcType=VARCHAR} and TOB_ID_A = #{tobIdA,jdbcType=DECIMAL}"
    })
    @ResultMap("com.sumec.contract.dao.ITrContractRelDao.BaseResultMap")
    List<TTrContractRel> selectByTobIdA(@Param("tobTypeA")String tobTypeA,@Param("tobIdA")BigDecimal tobIdA);

    @Select({
    	"select count(rel.rel_id) as ll_count from T_TR_CONTRACT_REL rel  where rel.TOB_ID_B(+) = #{tobIdB,jdbcType=DECIMAL}",
    	"and rel.REL_TYPE (+)= #{relType,jdbcType=VARCHAR}  and rel.TOB_TYPE_A (+)= #{tobTypeA,jdbcType=VARCHAR}  ",
    	"and rel.TOB_TYPE_B (+)= #{tobTypeB,jdbcType=VARCHAR}"
    })
    int selectLLCount(@Param("tobIdB")BigDecimal tobIdB, @Param("relType")String relType, @Param("tobTypeA")String tobTypeA, @Param("tobTypeB")String tobTypeB);
    
    int updateByPrimaryKeySelective(TTrContractRel record);

    @Update({
        "update T_TR_CONTRACT_REL",
        "set REL_TYPE = #{relType,jdbcType=VARCHAR},",
          "TOB_TYPE_A = #{tobTypeA,jdbcType=VARCHAR},",
          "TOB_ID_A = #{tobIdA,jdbcType=DECIMAL},",
          "TOB_TYPE_B = #{tobTypeB,jdbcType=VARCHAR},",
          "TOB_ID_B = #{tobIdB,jdbcType=DECIMAL}",
        "where REL_ID = #{relId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TTrContractRel record);
}