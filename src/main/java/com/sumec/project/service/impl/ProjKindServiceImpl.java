package com.sumec.project.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.project.dao.ITProjKindDao;
import com.sumec.project.entity.TProjKind;
import com.sumec.project.service.ITProjKindService;

/**
 * <p>功能描述：项目类型相关操作接口.</p><br/>
 * 
 * @date： 2018年1月2日 下午1:46:06<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class ProjKindServiceImpl implements ITProjKindService{

    @Autowired
    private ITProjKindDao projKindDao;
    
    @Override
    public TProjKind selectByPrimaryKey(BigDecimal kId){
        return projKindDao.selectByPrimaryKey(kId);
    }

}
