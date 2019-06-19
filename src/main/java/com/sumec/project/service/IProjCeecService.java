package com.sumec.project.service;

import java.math.BigDecimal;

import com.sumec.project.entity.TProjCeec;

/**
 * 功能描述：项目相关接口.<br/>
 * 
 * #date： 2017年11月13日 上午10:47:51<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IProjCeecService{
    /**
     * 
     * 方法描述：根据项目流水号获取项目信息 <br/>
     *
     * #author SunTow_J<br/>
     * #date 2017年11月13日 上午10:48:28<br/>
     * #since 1.0.0<br/>
     * @param projId
     * @return
     */
    TProjCeec selectByPrimaryKey(BigDecimal projId);
}
