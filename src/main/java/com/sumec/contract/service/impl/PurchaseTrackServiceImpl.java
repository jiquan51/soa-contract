package com.sumec.contract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.ITrPurchaseTrackDao;
import com.sumec.contract.entity.TTrPurchaseTrack;
import com.sumec.contract.service.IPurchaseTrackService;

/**
 * 功能描述：合同跟踪信息表.<br/>
 * 
 * #date： 2017年11月10日 下午3:35:28<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class PurchaseTrackServiceImpl implements IPurchaseTrackService{

    @Autowired
    private ITrPurchaseTrackDao purchaseTrackDao;
    
    @Override
    public TTrPurchaseTrack selectByBcId(String purType, String purId){
        return purchaseTrackDao.selectById(purType,purId);
    }

}
