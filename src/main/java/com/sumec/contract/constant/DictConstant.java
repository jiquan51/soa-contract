package com.sumec.contract.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：字典宏.<br/>
 * 
 * #date： 2017年12月13日 下午2:37:09<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class DictConstant{

    /** 合同状态字典 */
    public static Map<String,String> C_STATUS = new HashMap<>();
    
    public static Map<String,String> PROJ_STATUS = new HashMap<>();
 
    static{
//        0:未签约 1:执行中 2:已终止 3:已关闭
        C_STATUS.put("","未签约");
        C_STATUS.put("0","未签约");
        C_STATUS.put("1","执行中");
        C_STATUS.put("2","已终止");
        C_STATUS.put("3","已关闭");
        // 1 已完成
        PROJ_STATUS.put("","执行中");
        PROJ_STATUS.put("1","已完成");
        
    }
}
