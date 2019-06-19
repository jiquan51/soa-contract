package com.sumec.flow.dao;

import com.sumec.flow.bean.TSumecFlowDetailsModule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/2/28.
 */
public interface ISumecFlowDetailsModuleDao {

	List<TSumecFlowDetailsModule> selectCheckedByUserId(@Param("userId") Long userId);

	List<TSumecFlowDetailsModule> selectPostByUserId(@Param("userId") Long userId);

	List<TSumecFlowDetailsModule> selectPendingByUserId(@Param("userId") Long userId);
}
