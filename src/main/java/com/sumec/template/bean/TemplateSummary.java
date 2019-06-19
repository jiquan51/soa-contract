package com.sumec.template.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：第一个概要页面.<br/>
 * 
 * #date： 2017年12月7日 上午11:08:08<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateSummary extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -5060938057621279588L;
    
    /** 编号 */
    private String no;
    /** 状态 */
    private String status;
    /** 状态标签 */
    private List<String> tags;
    
    private Map<String,Object> kvs;
    
    private Map<String,String> hiddenKvs; 
    
    private String date;
    
    private String person;

    public String getNo(){
        return no;
    }

    public void setNo(String no){
        this.no = no;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public List<String> getTags(){
        return tags;
    }

    public void setTags(List<String> tags){
        this.tags = tags;
    }

    public Map<String,Object> getKvs(){
        return kvs;
    }

    public void setKvs(Map<String,Object> kvs){
        this.kvs = kvs;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getPerson(){
        return person;
    }

    public void setPerson(String person){
        this.person = person;
    }

    public Map<String,String> getHiddenKvs(){
        return hiddenKvs;
    }

    public void setHiddenKvs(Map<String,String> hiddenKvs){
        this.hiddenKvs = hiddenKvs;
    }
}
