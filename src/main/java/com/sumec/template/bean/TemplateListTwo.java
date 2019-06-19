package com.sumec.template.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年1月11日 上午11:25:15<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class TemplateListTwo extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -8624642602313608733L;

    private String header;
    private List<Map<String,Object>> kvs;
    private String left;
    private String right;
    
    
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
    public String getLeft(){
        return left;
    }
    public void setLeft(String left){
        this.left = left;
    }
    public String getRight(){
        return right;
    }
    public void setRight(String right){
        this.right = right;
    }
}
