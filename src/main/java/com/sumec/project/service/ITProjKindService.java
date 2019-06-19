package com.sumec.project.service;

import java.math.BigDecimal;

import com.sumec.project.entity.TProjKind;

/**
 * <p>功能描述：项目类型字典接口.</p><br/>
 * 
 * @date： 2018年1月2日 下午1:44:46<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ITProjKindService{

    /**
     * 
     * <p>方法描述：根据项目类型ID获取项目类型信息</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年1月2日 下午1:45:28<br/>
     * @param kId
     * @return
     */
    TProjKind selectByPrimaryKey(BigDecimal kId);
}
