package com.sumec.template.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.sumec.base.BaseEntity;
import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TExpSc;
import com.sumec.pkg.entity.TTrPkg;
import com.sumec.template.bean.ChatBean;
import com.sumec.template.bean.TemplateSummary;


/**
 * <p>功能描述：模板服务接口.</p><br/>
 * 
 * @date： 2018年3月19日 下午1:44:15<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public interface ITemplateService{
    /**
     * 
     * <p>方法描述：根据类型获取包的汇总信息</p>
     *
     * @author SunTow_J <br />
     * @date： 2018年3月19日 下午1:46:18<br/>
     * @return
     */
    Map<String,Object> queryPgkSum(TTrPkg trPkg,Map<String,List<String>> ids,String type);

    Map<String,Object> queryPgkDetail(TTrPkg trPkg,String pkgId,String tobType);
    
    Map<String,List<BaseEntity>> getContractEntity(String pkgId,String tobType);
    
    TemplateSummary getPkgTemplateOne(TTrPkg trPkg, TExpSc expSc, TExpBc expBc, String type);
    
    String getExpScDepartMent(TExpSc expSc);
    
    String getExpBcDepartMent(TExpBc expBc);
    
    int selectLLCount(BigDecimal tobIdB, String relType, String tobTypeA, String tobTypeB);
    
    BigDecimal selectQUANT_PURCED(BigDecimal scId);
    BigDecimal selectQUANT_SOLD(BigDecimal bcId);
    
    ////供应商在手
    Map<String,BigDecimal> selectQuantOld(BigDecimal bcId);
    BigDecimal selectCountOld(BigDecimal bcId);
	Map<String, BigDecimal> selectQuantNew(BigDecimal bcId);
	BigDecimal selectCountNew(BigDecimal bcId); 
	
	String supplierInhand(BigDecimal bcId);
	
	//////客户 在手
	Map<String,BigDecimal> selectOldSc(BigDecimal scId); 
	BigDecimal selectQuantNewSc(BigDecimal scId); 
	BigDecimal selectKc_quant_newSc(BigDecimal scId); 
	
	String customerInHand(BigDecimal scId);

	List<ChatBean> selectChatBean(String pkgId); 
	
	Map<String, Object> queryScSum(TExpSc expSc, int ii);
	Map<String, Object> queryBcSum(TExpBc expBc, int ii);
	
	Map<String, String> queryIncomeExpenditure(BigDecimal soId, BigDecimal cstId);

	BigDecimal selectOriginalScId(BigDecimal scId); //获取转卖的原合同号
}
