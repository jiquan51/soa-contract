package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年12月13日 上午10:25:37<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateCard extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -6698718375655451566L;
    /** 标题 */
    private String header;
    /** 图表 */
    private String chart;
    /**  */
    private Map<String,String> kvs;
    
    private Map<String,String> hiddenKvs; 
    public String getHeader(){
        return header;
    }
    public void setHeader(String header){
        this.header = header;
    }
    public String getChart(){
        return chart;
    }
    public void setChart(String chart){
        this.chart = chart;
    }
    public Map<String,String> getKvs(){
        return kvs;
    }
    public void setKvs(Map<String,String> kvs){
        this.kvs = kvs;
    }
    public Map<String,String> getHiddenKvs(){
        return hiddenKvs;
    }
    public void setHiddenKvs(Map<String,String> hiddenKvs){
        this.hiddenKvs = hiddenKvs;
    }
    
}
