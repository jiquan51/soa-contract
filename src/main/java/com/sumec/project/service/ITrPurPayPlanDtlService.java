package com.sumec.project.service;

import com.sumec.project.entity.TTrPurPayPlanDtl;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/16.
 */
public interface ITrPurPayPlanDtlService {

    List<TTrPurPayPlanDtl> selectByBcId(BigDecimal bcId,String bcType);
}
