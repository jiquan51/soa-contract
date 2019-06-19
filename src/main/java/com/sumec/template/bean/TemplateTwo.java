package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * 功能描述：模板二.<br/>
 * 
 * #date： 2017年12月7日 上午11:08:08<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateTwo extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -5060938057621279588L;
    
    private String header;
    private String status;
    
    private Map<String,Object> kvs;
    private Map<String,String> hiddenKvs;

    public Map<String,Object> getKvs(){
        return kvs;
    }

    public void setKvs(Map<String,Object> kvs){
        this.kvs = kvs;
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
    
}
