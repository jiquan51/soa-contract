package com.sumec.template.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>功能描述：发送审批消息参数.</p><br/>
 * 
 * @date： 2018年2月2日 上午10:41:11<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class Approval implements Serializable{

    private static final long serialVersionUID = -3416246115868948971L;

    private Long touserid;
    
    private String header;
    
    private String status;
    
    private LinkedHashMap<String,String> kvs;
    
    private Map<String,String> hiddenKvs;

    public Long getTouserid(){
        return touserid;
    }

    public void setTouserid(Long touserid){
        this.touserid = touserid;
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public Map<String,String> getHiddenKvs(){
        return hiddenKvs;
    }

    public void setHiddenKvs(Map<String,String> hiddenKvs){
        this.hiddenKvs = hiddenKvs;
    }

	public LinkedHashMap<String, String> getKvs() {
		return kvs;
	}

	public void setKvs(LinkedHashMap<String, String> kvs) {
		this.kvs = kvs;
	}
}
