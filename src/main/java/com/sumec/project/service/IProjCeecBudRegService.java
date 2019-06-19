package com.sumec.project.service;

import com.sumec.project.entity.TProjCeecBudReg;

/**
 * 功能描述：项目预算相关接口.<br/>
 * 
 * #date： 2017年11月13日 下午2:36:04<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IProjCeecBudRegService{
    /**
     * 方法描述：根据项目类型与项目流水号获取预算信息<br/>
     *
     * #author SunTow_J<br/>
     * #date 2017年11月13日 下午2:46:48<br/>
     * #since 1.0.0<br/>
     * @param projType
     * @param projId
     * @return
     */
    TProjCeecBudReg selectByProjId(String projType,String projId);
}
