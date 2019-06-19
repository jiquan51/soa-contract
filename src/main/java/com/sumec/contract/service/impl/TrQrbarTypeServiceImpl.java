package com.sumec.contract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.ITrQrbarTypeDao;
import com.sumec.contract.entity.TTrQrbarType;
import com.sumec.contract.service.ITrQrbarTypeService;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月9日 上午10:35:57<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class TrQrbarTypeServiceImpl implements ITrQrbarTypeService{

    @Autowired
    private ITrQrbarTypeDao qrbarTypeDao;
    
    @Override
    public TTrQrbarType selectByPrimaryKey(String tId){
        return qrbarTypeDao.selectByPrimaryKey(tId);
    }

}
