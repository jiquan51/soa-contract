package com.sumec.pkg.service;

import java.util.List;

import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.pkg.entity.TTrPkg;
import com.sumec.pkg.entity.TTrPkgRel;

public interface ITrPkgRelService{

    TTrPkg selectByPrimaryKey(String pkgId);

    TTrPkg selectByPkgCode(String pkgCode);
    
    List<TTrPkgRel> selectByPkgId(String pkgId);

    List<TTrPkgRel> selectByPkgIdAndType(String pkgId,String tobType);
    List<TTrPkgRel> selectByTobIdAndType(String tobId,String tobType);
    
    List<String> selectPkgIds(List<TTrOcuDivide> res);
    
    List<String> selectAllPkgId();
    
}
