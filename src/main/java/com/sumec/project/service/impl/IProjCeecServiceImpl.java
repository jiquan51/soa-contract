package com.sumec.project.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.project.dao.IProjCeecDao;
import com.sumec.project.entity.TProjCeec;
import com.sumec.project.service.IProjCeecService;

/**
 * 功能描述：项目信息相关接口.<br/>
 * 
 * #date： 2017年11月13日 上午10:49:01<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class IProjCeecServiceImpl implements IProjCeecService{

    @Autowired
    private IProjCeecDao projCeecDao;
    
    
    @Override
    public TProjCeec selectByPrimaryKey(BigDecimal projId){
        return projCeecDao.selectByPrimaryKey(projId);
    }

}
