package com.sumec.contract.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.IExpScCmdDao;
import com.sumec.contract.entity.TExpScCmd;
import com.sumec.contract.service.IExpScCmdService;

/**
 * 功能描述：销售合同从表操作Service.<br/>
 * 
 * #date： 2017年8月29日 下午3:03:34<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class ExpScCmdServiceImpl implements IExpScCmdService{

    @Autowired
    private IExpScCmdDao expScCmdDao;
    
    @Override
    public List<TExpScCmd> selectByScId(BigDecimal scId){
        return expScCmdDao.selectByScId(scId);
    }

}
