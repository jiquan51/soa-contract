package com.sumec.template.service;

import com.sumec.contract.entity.TTrQrbarType;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月9日 上午8:55:09<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface IQrDecodeService{
    
    TTrQrbarType selectByPrimaryKey(String tId);
}
