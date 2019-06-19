package com.sumec.template.bean;

import java.io.Serializable;

/**
 * 功能描述：流程模板.<br/>
 * 
 * #date： 2017年12月7日 上午11:08:08<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateFlowDetail extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -5060938057621279588L;
    /**  */
    private String id;
    /** 列数 */
    private int colCount;
    /** 列内容 */
    private String[] content;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public int getColCount(){
        return colCount;
    }
    public void setColCount(int colCount){
        this.colCount = colCount;
    }
    public String[] getContent(){
        return content;
    }
    public void setContent(String... content){
        this.content = content;
    }
    
}
