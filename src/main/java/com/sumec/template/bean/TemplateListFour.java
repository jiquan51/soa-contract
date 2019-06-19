package com.sumec.template.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年1月15日 下午5:21:00<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class TemplateListFour extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = 4149738809053920836L;

    private String header;
    
    private List<Map<String,Object>> kvs;

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public List<Map<String,Object>> getKvs(){
        return kvs;
    }

    public void setKvs(List<Map<String,Object>> kvs){
        this.kvs = kvs;
    }
}
