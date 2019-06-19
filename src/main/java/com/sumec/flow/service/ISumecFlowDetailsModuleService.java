package com.sumec.flow.service;

import com.sumec.flow.bean.TSumecFlowDetailsModule;

import java.util.List;

/**
 * 功能描述：查询ISumecFlowDetailsModule专用service
 * Created by sunhc on 2018/2/28.
 */
public interface ISumecFlowDetailsModuleService {

	List<TSumecFlowDetailsModule> selectCheckedByUserId(Long userId);

	List<TSumecFlowDetailsModule> selectPostByUserId(Long userId);

	List<TSumecFlowDetailsModule> selectPendingByUserId(Long userId);
}
