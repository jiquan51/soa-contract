package com.sumec.flow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.flow.dao.ISumecFlowModuleDao;
import com.sumec.flow.entity.TSumecFlowModule;
import com.sumec.flow.service.ISumecFlowModuleService;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年2月24日 下午2:32:51<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class ISumecFlowModuleServiceImpl implements ISumecFlowModuleService{

    @Autowired
    private ISumecFlowModuleDao sumecFlowModuleDao;
    
    @Override
    public TSumecFlowModule selectByPrimaryKey(Long fmId){
        return sumecFlowModuleDao.selectByPrimaryKey(fmId);
    }

}
