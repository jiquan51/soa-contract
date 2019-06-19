package com.sumec.contract.service;

import java.math.BigDecimal;

import com.sumec.contract.entity.TPubExc;

public interface IPubExcService {
	TPubExc selectByPrimaryKey(BigDecimal excId);
}
