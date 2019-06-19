package com.sumec.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.project.dao.IProjCeecBudRegDao;
import com.sumec.project.entity.TProjCeecBudReg;
import com.sumec.project.service.IProjCeecBudRegService;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年11月13日 下午2:47:21<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class IProjCeecBudRegServiceImpl implements IProjCeecBudRegService{

    @Autowired
    private IProjCeecBudRegDao projCeecBudRegDao;
    
    @Override
    public TProjCeecBudReg selectByProjId(String projType, String projId){
        return projCeecBudRegDao.selectByProjId(projType,projId);
    }

}
