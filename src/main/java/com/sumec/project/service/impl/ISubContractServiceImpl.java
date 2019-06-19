package com.sumec.project.service.impl;

import com.sumec.project.dao.ISubContractDao;
import com.sumec.project.entity.TSubContract;
import com.sumec.project.service.ISubContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by daitiantian on 2017/11/15.
 */

@Service
public class ISubContractServiceImpl implements ISubContractService {

    @Autowired
    private ISubContractDao subContractDao;


    @Override
    public List<TSubContract> selectListByProjId(BigDecimal projId) {

            return subContractDao.selectListByProjId(projId);

    }

    @Override
    public TSubContract selecByPrimaryKey(BigDecimal bcId) {
        return subContractDao.selectByPrimaryKey(bcId);
    }


}
