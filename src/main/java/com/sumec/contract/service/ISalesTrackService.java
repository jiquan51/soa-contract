package com.sumec.contract.service;

import com.sumec.contract.entity.TTrSalesTrack;

/**
 * 功能描述：合同跟踪信息表.<br/>
 * 
 * #date： 2017年11月10日 下午3:25:25<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface ISalesTrackService{
    
    TTrSalesTrack selectByScId(String salType, String salId); 
}
