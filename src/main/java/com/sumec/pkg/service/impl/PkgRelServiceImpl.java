package com.sumec.pkg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.pkg.dao.ITrPkgDao;
import com.sumec.pkg.dao.ITrPkgRelDao;
import com.sumec.pkg.entity.TTrPkg;
import com.sumec.pkg.entity.TTrPkgRel;
import com.sumec.pkg.service.ITrPkgRelService;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月19日 上午11:02:12<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class PkgRelServiceImpl implements ITrPkgRelService{
    
    @Autowired
    private ITrPkgRelDao pkgRelDao;
    @Autowired
    private ITrPkgDao pkgDao;
    
    @Override
    public TTrPkg selectByPrimaryKey(String pkgId){
        return pkgDao.selectByPrimaryKey(pkgId);
    }
    @Override
    public TTrPkg selectByPkgCode(String pkgCode){
    	return pkgDao.selectByPkgCode(pkgCode);
    }
    @Override
    public List<TTrPkgRel> selectByPkgId(String pkgId){
        return pkgRelDao.selectByPkgId(pkgId);
    }
    @Override
    public List<TTrPkgRel> selectByPkgIdAndType(String pkgId, String tobType){
        return pkgRelDao.selectByPkgIdAndType(pkgId,tobType);
    }
    @Override
    public List<TTrPkgRel> selectByTobIdAndType(String tobId, String tobType){
    	return pkgRelDao.selectByTobIdAndType(tobId,tobType);
    }
    @Override
    public List<String> selectPkgIds(List<TTrOcuDivide> res){
        return pkgRelDao.selectPkgIds(res);
    }
	@Override
	public List<String> selectAllPkgId() {
		return pkgDao.selectAllPkgId();
	}
    
}
