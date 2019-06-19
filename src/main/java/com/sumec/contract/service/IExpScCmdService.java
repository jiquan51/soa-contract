package com.sumec.contract.service;

import java.math.BigDecimal;
import java.util.List;

import com.sumec.contract.entity.TExpScCmd;

/**
 * 功能描述：销售合同从表操作DAO.<br/>
 * 
 * #date： 2017年8月29日 下午2:53:47<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IExpScCmdService{
    /**
     * 
     * 方法描述：根据Sc_id获取销售合同订单从表信息 <br/>
     *
     * #author SunTow_J<br/>
     * #date 2017年8月29日 下午3:03:04<br/>
     * #since 1.0.0<br/>
     * @param bcId
     * @return
     */
    List<TExpScCmd> selectByScId(BigDecimal scId);
}
