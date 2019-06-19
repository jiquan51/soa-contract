package com.sumec.template.service;

import java.math.BigDecimal;
import java.util.List;

import com.sumec.template.entity.TSumecBusiGroup;

/**
 * <p>功能描述：业务与群关系表.</p><br/>
 * 
 * @date： 2018年2月12日 上午10:50:29<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ISumecBusiGroupService{
    
    /**
     * 
     * <p>方法描述：添加方法功能描述</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年2月12日 上午11:05:10<br/>
     * @param record
     * @return
     */
    int insertSelective(TSumecBusiGroup record);
    /**
     * 
     * <p>方法描述：根据组id与组类型，获取对应的群-组关系</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年2月28日 下午2:32:20<br/>
     * @param groupId
     * @param groupType
     * @return
     */
    TSumecBusiGroup queryBusiGroup(String groupId,String groupType);
    
    List<String> queryAllBusiGroup();
    
    List<String> selectChatIdByGroupIds(List<String> groupIds);
    
    int queryAccNoCount(BigDecimal payId);
    
    int queryCstidCount(BigDecimal payId);
}
