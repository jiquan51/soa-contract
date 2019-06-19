package com.sumec.project.service;


import com.sumec.project.entity.TSubContract;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/15.
 */
public interface ISubContractService {

    List<TSubContract> selectListByProjId(BigDecimal projId);

    TSubContract selecByPrimaryKey(BigDecimal bcId);
}
