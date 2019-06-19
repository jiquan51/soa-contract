package com.sumec.template.dao;

import com.sumec.template.entity.TSumecBusiGroup;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ISumecBusiGroupDao {
	@Delete({ "delete from T_SUMEC_BUSI_GROUP", "where ID = #{id,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String id);

	@Insert({ "insert into T_SUMEC_BUSI_GROUP (ID, CHAT_ID, ", "GROUP_ID, GROUP_TYPE, ", "CREATE_AT)",
			"values (#{id,jdbcType=VARCHAR}, #{chatId,jdbcType=VARCHAR}, ",
			"#{groupId,jdbcType=VARCHAR}, #{groupType,jdbcType=VARCHAR}, ", "#{createAt,jdbcType=TIMESTAMP})" })
	int insert(TSumecBusiGroup record);

	int insertSelective(TSumecBusiGroup record);

	@Select({ "select", "ID, CHAT_ID, GROUP_ID, GROUP_TYPE, CREATE_AT", "from T_SUMEC_BUSI_GROUP",
			"where ID = #{id,jdbcType=VARCHAR}" })
	@ResultMap("com.sumec.template.dao.ISumecBusiGroupDao.BaseResultMap")
	TSumecBusiGroup selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(TSumecBusiGroup record);

	@Update({ "update T_SUMEC_BUSI_GROUP", "set CHAT_ID = #{chatId,jdbcType=VARCHAR},",
			"GROUP_ID = #{groupId,jdbcType=VARCHAR},", "GROUP_TYPE = #{groupType,jdbcType=VARCHAR},",
			"CREATE_AT = #{createAt,jdbcType=TIMESTAMP}", "where ID = #{id,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(TSumecBusiGroup record);

	@Select({ "select", "ID, CHAT_ID, GROUP_ID, GROUP_TYPE, CREATE_AT", "from T_SUMEC_BUSI_GROUP",
			"where GROUP_ID = #{groupId,jdbcType=VARCHAR} and GROUP_TYPE = #{groupType,jdbcType=VARCHAR}" })
	@ResultMap("com.sumec.template.dao.ISumecBusiGroupDao.BaseResultMap")
	TSumecBusiGroup queryBusiGroup(@Param("groupId") String groupId, @Param("groupType") String groupType);

	@Select({ "select GROUP_ID from T_SUMEC_BUSI_GROUP" })
	List<String> queryAllBusiGroup();

	@Select({ "<script>", "select distinct CHAT_ID", "from T_SUMEC_BUSI_GROUP ", "where GROUP_ID in",
			"<foreach collection='groupIds' item='item' index='index' open='(' separator=',' close=')'>",
			"<if test='(index % 999) == 998'> NULL ) OR GROUP_ID in (</if>#{item}", "</foreach>", "</script>" })
	List<String> selectChatIdByGroupIds(@Param("groupIds") List<String> groupIds);

	@Select({ "SELECT count(*) FROM michael.t_pub_pay_apply a,michael.t_io_pay_coll_rel b, michael.t_exp_bc c ",
			"WHERE a.acc_no <> c.acc_no AND b.topc_type = 'T_PUB_PAY_APPLY' AND a.int_id = b.topc_id ",
			"AND a.int_id = #{payId,jdbcType=DECIMAL} AND b.tob_type = 'P_ORDER' AND b.tob_id = c.bc_id" })
	int queryAccNoCount(BigDecimal payId);

	@Select({ "SELECT count(*) FROM michael.t_pub_pay_apply a,michael.t_io_pay_coll_rel b, michael.t_exp_bc c ",
			"WHERE a.cst_id <> c.fct_id AND b.topc_type = 'T_PUB_PAY_APPLY' AND a.int_id = b.topc_id ",
			"AND a.int_id = #{payId,jdbcType=DECIMAL} AND b.tob_type = 'P_ORDER' AND b.tob_id = c.bc_id" })
	int queryCstidCount(BigDecimal payId);
}