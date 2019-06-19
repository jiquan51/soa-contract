package com.sumec.contract.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TTrOcuDivide;

/**
 * 功能描述：采购合同操作DAO.<br/>
 * 
 * #date： 2017年8月29日 下午1:57:50<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public interface IExpBcService{
    /**
     * 
     * 方法描述：根据bc_id获取采购合同订单信息 <br/>
     *
     * #author SunTow_J<br/>
     * #date 2017年8月29日 下午1:58:16<br/>
     * #since 1.0.0<br/>
     * @param bcId
     * @return
     */
    TExpBc selectByPrimaryKey(BigDecimal bcId);

    int updateByExpBc(TExpBc record);
    
    String selectNotesByNoticeId(BigDecimal noticeId);
    
    List<TTrOcuDivide> selectByUserIds(List<Long> ocuIds);
    
    List<TTrOcuDivide> selectByKeyWord(String keyWord);
    
    BigDecimal selectCbcsIdBySoId(BigDecimal soId);
    ///////
    BigDecimal selectLdThisByCbcsId(BigDecimal cbcsId);

    BigDecimal selectLdPastByCbcsId(BigDecimal scId, BigDecimal soId);

    BigDecimal selectLdSumByScId(BigDecimal scId);

    BigDecimal selectLdCstByScId(BigDecimal scId, BigDecimal cstId);

    ////代收代付
    List<Map<String,Object>> selectBcIdBcQuantDivBySoId(BigDecimal soId);

    BigDecimal selectLd_Df_InvBySoId(BigDecimal bcId);

    BigDecimal selectLd_Df_FeeBySoId(BigDecimal bcId);

    BigDecimal selectLd_Bc_QuantBySoId(BigDecimal bcId);
    
    List<Map<String, Object>> selectBcListBySoId(BigDecimal soId); 
}
