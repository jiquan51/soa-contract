package com.sumec.flow.service.impl;

import com.sumec.flow.bean.TSumecFlowDetailsModule;
import com.sumec.flow.dao.ISumecFlowDetailsModuleDao;
import com.sumec.flow.service.ISumecFlowDetailsModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：此方法根据
 * Created by user on 2018/2/28.
 */
@Service
public class ISumecFlowDetailsModuleServiceImpl implements ISumecFlowDetailsModuleService {

	@Autowired
	private ISumecFlowDetailsModuleDao iSumecFlowDetailsModuleDao;

	@Override
	public List<TSumecFlowDetailsModule> selectCheckedByUserId(Long userId) {
		return iSumecFlowDetailsModuleDao.selectCheckedByUserId(userId);
	}

	@Override
	public List<TSumecFlowDetailsModule> selectPostByUserId(Long userId) {
		return iSumecFlowDetailsModuleDao.selectPostByUserId(userId);
	}

    @Override
    public List<TSumecFlowDetailsModule> selectPendingByUserId(Long userId){
        return iSumecFlowDetailsModuleDao.selectPendingByUserId(userId);
    }
}
