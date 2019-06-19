package com.sumec.project.service;

import com.sumec.project.entity.TSubContractCmd;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/17.
 */
public interface ISubContractCmdService {

    List<TSubContractCmd> selectByBcId(BigDecimal bcId);
}
