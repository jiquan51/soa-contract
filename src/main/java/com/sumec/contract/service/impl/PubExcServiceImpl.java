package com.sumec.contract.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.IPubExcDao;
import com.sumec.contract.entity.TPubExc;
import com.sumec.contract.service.IPubExcService;

@Service
public class PubExcServiceImpl implements IPubExcService {

    @Autowired
    private IPubExcDao pubExcDao;
    
	@Override
	public TPubExc selectByPrimaryKey(BigDecimal excId) {
		// TODO Auto-generated method stub
		return pubExcDao.selectByPrimaryKey(excId); 
	}

}
