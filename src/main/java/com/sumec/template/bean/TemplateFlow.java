package com.sumec.template.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述：流程模板.<br/>
 * 
 * #date： 2017年12月7日 上午11:08:08<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TemplateFlow extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -5060938057621279588L;
    /**  */
    private String header;
    
    private List<TemplateFlowDetail> flows;

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public List<TemplateFlowDetail> getFlows(){
        return flows;
    }

    public void setFlows(List<TemplateFlowDetail> flows){
        this.flows = flows;
    }
    
}
