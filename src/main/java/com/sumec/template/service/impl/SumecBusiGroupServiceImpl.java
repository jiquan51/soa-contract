package com.sumec.template.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.config.TargetDataSource;
import com.sumec.template.dao.ISumecBusiGroupDao;
import com.sumec.template.entity.TSumecBusiGroup;
import com.sumec.template.service.ISumecBusiGroupService;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年2月12日 上午10:51:23<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class SumecBusiGroupServiceImpl implements ISumecBusiGroupService{

    @Autowired
    private ISumecBusiGroupDao sumecBusiGroupDao;
    
    @Override
    @TargetDataSource(name="sumec3rd")
    public int insertSelective(TSumecBusiGroup record){
        return sumecBusiGroupDao.insertSelective(record);
    }

    @Override
    @TargetDataSource(name="sumec3rd")
    public TSumecBusiGroup queryBusiGroup(String groupId, String groupType){
        return sumecBusiGroupDao.queryBusiGroup(groupId,groupType);
    }

    @Override
    @TargetDataSource(name="sumec3rd")
    public List<String> queryAllBusiGroup(){
    	return sumecBusiGroupDao.queryAllBusiGroup();
    }

    @Override
    @TargetDataSource(name="sumec3rd")
    public List<String> selectChatIdByGroupIds(List<String> groupIds){
        return sumecBusiGroupDao.selectChatIdByGroupIds(groupIds);
    }

    @Override
    public int queryAccNoCount(BigDecimal payId){
        return sumecBusiGroupDao.queryAccNoCount(payId);
    }

    @Override
    public int queryCstidCount(BigDecimal payId){
        return sumecBusiGroupDao.queryCstidCount(payId);
    }

}
