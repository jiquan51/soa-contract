package com.sumec.contract.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.IExpBcCmdDao;
import com.sumec.contract.entity.TExpBcCmd;
import com.sumec.contract.service.IExpBcCmdService;

/**
 * 功能描述：采购合同从表操作Service.<br/>
 * 
 * #date： 2017年8月29日 下午3:03:34<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class ExpBcCmdServiceImpl implements IExpBcCmdService{

    @Autowired
    private IExpBcCmdDao expBcCmdDao;
    
    @Override
    public List<TExpBcCmd> selectByBcId(BigDecimal bcId){
        return expBcCmdDao.selectByBcId(bcId);
    }

}
