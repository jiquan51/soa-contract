package com.sumec.contract.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.ITrContractRelDao;
import com.sumec.contract.entity.TTrContractRel;
import com.sumec.contract.service.ITrContractRelService;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年11月16日 下午4:59:41<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class TrContractRelServiceImpl implements ITrContractRelService{

    @Autowired
    private ITrContractRelDao contractRelDao;
    
    @Override
    public List<TTrContractRel> selectByTobIdB(String tobTypeB, BigDecimal tobIdB){
        return contractRelDao.selectByTobIdB(tobTypeB,tobIdB);
    }

    @Override
    public List<TTrContractRel> selectByTobIdA(String tobTypeA, BigDecimal tobIdA){
        return contractRelDao.selectByTobIdA(tobTypeA,tobIdA);
    }

}
