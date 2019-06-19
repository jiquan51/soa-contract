package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * 功能描述：第一个概要页面.<br/>
 * 
 * #date： 2017年12月7日 上午11:08:08<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateOne extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -5060938057621279588L;
    
    private String left;
    private String right;
    
    private Map<String,Object> kvs;
    
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

    public Map<String,Object> getKvs(){
        return kvs;
    }

    public void setKvs(Map<String,Object> kvs){
        this.kvs = kvs;
    }
    
}
