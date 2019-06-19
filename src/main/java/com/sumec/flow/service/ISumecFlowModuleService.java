package com.sumec.flow.service;

import com.sumec.flow.entity.TSumecFlowModule;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年2月24日 下午2:32:20<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ISumecFlowModuleService{

    TSumecFlowModule selectByPrimaryKey(Long fmId);
}
