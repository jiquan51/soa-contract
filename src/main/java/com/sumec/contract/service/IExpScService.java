package com.sumec.contract.service;

import java.math.BigDecimal;
import java.util.List;

import com.sumec.contract.entity.TExpSc;
import com.sumec.contract.entity.TTrOcuDivide;

/**
 * 功能描述：销售合同操作.<br/>
 * 
 * #date： 2017年8月31日 上午11:03:33<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IExpScService{
    /**
     * 
     * 
     * 方法描述：根据销售明细与收购明细关联表中bcPId来查询客户Id <br/>
     *
     * #author SunTow_J<br/>
     * #date 2017年8月31日 上午11:04:35<br/>
     * #since 1.0.0<br/>
     * @param bcPId
     * @return
     */
    BigDecimal selectCstIdByBcPId(BigDecimal bcPId);
    /**
     * 
     * <p>方法描述：根据scId获取对于的销售合同信息</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年1月2日 上午10:59:26<br/>
     * @param scId
     * @return
     */
    TExpSc selectByPrimaryKey(BigDecimal scId);
    
    List<TTrOcuDivide> selectByUserIds(List<Long> ocuIds);
    
    List<TTrOcuDivide> selectByKeyWord(String keyWord);
}
