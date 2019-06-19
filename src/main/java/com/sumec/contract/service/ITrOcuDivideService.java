package com.sumec.contract.service;

import java.util.List;

import com.sumec.contract.entity.TTrOcuDivide;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月7日 下午4:11:35<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ITrOcuDivideService{

    List<TTrOcuDivide> selectByOcuIds(List<Long> ocuIds);
}
