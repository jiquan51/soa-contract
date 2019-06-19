package com.sumec.contract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.ITrSalesTrackDao;
import com.sumec.contract.entity.TTrSalesTrack;
import com.sumec.contract.service.ISalesTrackService;

/**
 * 功能描述：合同跟踪信息表.<br/>
 * 
 * #date： 2017年11月10日 下午3:35:28<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class SalesTrackServiceImpl implements ISalesTrackService{

    @Autowired
    private ITrSalesTrackDao salesTrackDao;

	@Override
	public TTrSalesTrack selectByScId(String salType, String salId) {
		return salesTrackDao.selectById(salType,salId);	
	}

}
