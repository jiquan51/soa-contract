package com.sumec.project.service.impl;

import com.sumec.project.dao.ITrPurPayPlanDtlDao;
import com.sumec.project.entity.TTrPurPayPlanDtl;
import com.sumec.project.service.ITrPurPayPlanDtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/16.
 */
@Service
public class ITrPurPayPlanDtlServiceImpl implements ITrPurPayPlanDtlService {

    @Autowired
    private ITrPurPayPlanDtlDao trPurPayPlanDtlDao;

    @Override
    public List<TTrPurPayPlanDtl> selectByBcId(BigDecimal bcId,String bcType){
        return trPurPayPlanDtlDao.selectByBcId(bcId,bcType);
    }


}
