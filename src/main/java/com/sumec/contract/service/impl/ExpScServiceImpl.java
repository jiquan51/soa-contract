package com.sumec.contract.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.IExpScDao;
import com.sumec.contract.entity.TExpSc;
import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.contract.service.IExpScService;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年8月31日 上午11:06:11<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class ExpScServiceImpl implements IExpScService{

    @Autowired
    private IExpScDao expScDao;
    
    @Override
    public BigDecimal selectCstIdByBcPId(BigDecimal bcPId){
        return expScDao.selectCstIdByBcPId(bcPId);
    }

    @Override
    public TExpSc selectByPrimaryKey(BigDecimal scId){
        return expScDao.selectByPrimaryKey(scId);
    }

    @Override
    public List<TTrOcuDivide> selectByUserIds(List<Long> ocuIds){
        return expScDao.selectByUserIds(ocuIds);
    }

    @Override
    public List<TTrOcuDivide> selectByKeyWord(String keyWord){
        return expScDao.selectByKeyWord(keyWord);
    }

}
