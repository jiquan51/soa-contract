package com.sumec.contract.service;

import com.sumec.contract.entity.TTrQrbarType;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月9日 上午10:35:29<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ITrQrbarTypeService{

    TTrQrbarType selectByPrimaryKey(String tId);
}
