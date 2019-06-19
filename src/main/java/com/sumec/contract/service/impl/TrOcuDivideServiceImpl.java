package com.sumec.contract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.ITrOcuDivideDao;
import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.contract.service.ITrOcuDivideService;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月7日 下午4:12:40<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class TrOcuDivideServiceImpl implements ITrOcuDivideService{

    @Autowired
    private ITrOcuDivideDao ocuDivideDao;
    
    @Override
    public List<TTrOcuDivide> selectByOcuIds(List<Long> ocuIds){
        return ocuDivideDao.selectByOcuIds(ocuIds);
    }

}
