package com.sumec.contract.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.dao.IExpBcDao;
import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.contract.service.IExpBcService;

/**
 * 功能描述：采购合同操作Service.<br/>
 * 
 * #date： 2017年8月29日 下午1:58:49<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class ExpBcServiceImpl implements IExpBcService{

    @Autowired
    private IExpBcDao expBcDao;
    
    @Override
    public TExpBc selectByPrimaryKey(BigDecimal bcId){
        return expBcDao.selectByPrimaryKey(bcId);
    }

    @Override
    public int updateByExpBc(TExpBc record){
        return expBcDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public String selectNotesByNoticeId(BigDecimal noticeId){
        return expBcDao.selectNotesByNoticeId(noticeId);
    }

    @Override
    public List<TTrOcuDivide> selectByUserIds(List<Long> ocuIds){
        return expBcDao.selectByUserIds(ocuIds);
    }

    @Override
    public List<TTrOcuDivide> selectByKeyWord(String keyWord){
        return expBcDao.selectByKeyWord(keyWord);
    }

	@Override
	public BigDecimal selectCbcsIdBySoId(BigDecimal soId) {
		return expBcDao.selectCbcsIdBySoId(soId); 
	}

	@Override
	public BigDecimal selectLdThisByCbcsId(BigDecimal cbcsId) {
		return expBcDao.selectLdThisByCbcsId(cbcsId); 
	}

	@Override
	public BigDecimal selectLdPastByCbcsId(BigDecimal scId, BigDecimal soId) {
		return expBcDao.selectLdPastByCbcsId(scId, soId);
	}

	@Override
	public BigDecimal selectLdSumByScId(BigDecimal scId) {
		return expBcDao.selectLdSumByScId(scId);
	}

	@Override
	public BigDecimal selectLdCstByScId(BigDecimal scId, BigDecimal cstId) {
		return expBcDao.selectLdCstByScId(scId, cstId); 
	}

	@Override
	public List<Map<String, Object>> selectBcIdBcQuantDivBySoId(BigDecimal soId) {
		return expBcDao.selectBcIdBcQuantDivBySoId(soId);
	}

	@Override
	public BigDecimal selectLd_Df_InvBySoId(BigDecimal bcId) {
		return expBcDao.selectLd_Df_InvBySoId(bcId);
	}

	@Override
	public BigDecimal selectLd_Df_FeeBySoId(BigDecimal bcId) {
		return expBcDao.selectLd_Df_FeeBySoId(bcId);
	}

	@Override
	public BigDecimal selectLd_Bc_QuantBySoId(BigDecimal bcId) {
		return expBcDao.selectLd_Bc_QuantBySoId(bcId);
	}

	@Override
	public List<Map<String, Object>> selectBcListBySoId(BigDecimal soId) {
		return expBcDao.selectBcListBySoId(soId);
	}
}
