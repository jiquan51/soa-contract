package com.sumec.contract.service;

import com.sumec.contract.entity.TTrPurchaseTrack;

/**
 * 功能描述：合同跟踪信息表.<br/>
 * 
 * #date： 2017年11月10日 下午3:25:25<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IPurchaseTrackService{
    
    TTrPurchaseTrack selectByBcId(String purType, String purId); 
}
