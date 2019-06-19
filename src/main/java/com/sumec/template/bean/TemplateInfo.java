package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年1月12日 下午3:00:16<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class TemplateInfo extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -7816449928063492471L;

    private String header;
    
    private Map<String,String> kvs;

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public Map<String,String> getKvs(){
        return kvs;
    }

    public void setKvs(Map<String,String> kvs){
        this.kvs = kvs;
    }
}
