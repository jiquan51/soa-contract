package com.sumec.project.service.impl;

import com.sumec.project.dao.ISubContractCmdDao;
import com.sumec.project.entity.TSubContractCmd;
import com.sumec.project.service.ISubContractCmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/17.
 */
@Service
public class ISubContractCmdServiceImpl implements ISubContractCmdService{

    @Autowired
    private ISubContractCmdDao subContractCmdDao;

    @Override
    public List<TSubContractCmd> selectByBcId(BigDecimal bcId){
        return subContractCmdDao.selectByBcId(bcId);
    }

}
