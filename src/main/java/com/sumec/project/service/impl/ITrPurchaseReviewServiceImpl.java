package com.sumec.project.service.impl;

import com.sumec.project.dao.IProjCeecBudBasicDao;
import com.sumec.project.dao.IProjCeecBudUseReviewDao;
import com.sumec.project.dao.ITrPurchaseReviewDao;
import com.sumec.project.entity.TProjCeecBudBasic;
import com.sumec.project.entity.TProjCeecBudUseReview;
import com.sumec.project.entity.TTrPurchaseReview;
import com.sumec.project.service.ITrPurchaseReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by daitiantian on 2017/11/17.
 */
@Service
public class ITrPurchaseReviewServiceImpl implements ITrPurchaseReviewService{

    @Autowired
    private  IProjCeecBudBasicDao projCeecBudBasicDao ;

    @Autowired
    private IProjCeecBudUseReviewDao projCeecBudUseReviewDao;

    @Autowired
    private ITrPurchaseReviewDao trPurchaseReviewDao;

    @Override
    public TTrPurchaseReview selectUsedIncomeByBcId(BigDecimal bcId) {
        return trPurchaseReviewDao.selectByBcId(bcId);
    }

    @Override
    public TProjCeecBudUseReview selectUsedBudByBcId(BigDecimal bcId) {
        return projCeecBudUseReviewDao.selectByBcId(bcId);
    }

    @Override
    public TProjCeecBudBasic selectUsedBudNameByBcId(BigDecimal bcId) {
        return projCeecBudBasicDao.selectByBcId(bcId);
    }
}
