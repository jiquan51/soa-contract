package com.sumec.contract.service;

import java.math.BigDecimal;
import java.util.List;

import com.sumec.contract.entity.TTrContractRel;

/**
 * 功能描述：合同关联相关接口.<br/>
 * 
 * #date： 2017年11月16日 下午4:58:54<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface ITrContractRelService{

    List<TTrContractRel> selectByTobIdB(String tobTypeB,BigDecimal tobIdB);
    
    List<TTrContractRel> selectByTobIdA(String tobTypeA,BigDecimal tobIdA);
}
