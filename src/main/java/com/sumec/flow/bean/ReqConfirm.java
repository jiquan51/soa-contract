package com.sumec.flow.bean;

import java.io.Serializable;

/**
 * 功能描述：审批请求实体.<br/>
 * 
 * #date： 2017年11月17日 下午1:37:59<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class ReqConfirm implements Serializable{

    private static final long serialVersionUID = -4180428613198481743L;
    /** 审批流水号 */
    private Long intId;
    /** 意见 */
    private String notion;
    public Long getIntId(){
        return intId;
    }
    public void setIntId(Long intId){
        this.intId = intId;
    }
    public String getNotion(){
        return notion;
    }
    public void setNotion(String notion){
        this.notion = notion;
    }
}
