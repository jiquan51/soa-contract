package com.sumec.project.service;

import com.sumec.project.entity.TProjCeecBudBasic;
import com.sumec.project.entity.TProjCeecBudUseReview;
import com.sumec.project.entity.TTrPurchaseReview;

import java.math.BigDecimal;

/**
 * Created by daitiantian on 2017/11/17.
 */
public interface ITrPurchaseReviewService {

    TTrPurchaseReview selectUsedIncomeByBcId(BigDecimal bcId);

    TProjCeecBudUseReview selectUsedBudByBcId(BigDecimal bcId);

    TProjCeecBudBasic selectUsedBudNameByBcId(BigDecimal bcId);

}
