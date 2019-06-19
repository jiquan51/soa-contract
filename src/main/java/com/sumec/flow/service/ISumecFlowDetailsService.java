package com.sumec.flow.service;

import java.util.List;

import com.sumec.flow.bean.ReqConfirm;
import com.sumec.flow.entity.TSumecFlowDetails;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年11月17日 下午1:59:12<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface ISumecFlowDetailsService{

    String pass(ReqConfirm reqConfirm);
    
    String back(ReqConfirm reqConfirm);
    
    TSumecFlowDetails selectByPrimaryKey(Long intId);
    
    List<TSumecFlowDetails> selectByBcId(String bcId);
    
    TSumecFlowDetails selectNextValidStep(TSumecFlowDetails sumecFlowDetails);
    /**
     * 
     * <p>方法描述：根据审批模块id与关联值查询审批列表</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年3月1日 上午11:24:57<br/>
     * @param fmId
     * @param refValue
     * @return
     */
    List<TSumecFlowDetails> selectByFmId(Long fmId,String refValue);

}
