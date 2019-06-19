package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>功能描述：按钮模板.</p><br/>
 * 
 * @date： 2018年6月15日<br/>
 * @author zhoujiquan<br/>
 * @since 1.0.0<br/>
 */
public class TemplateBtn extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -7816449928063492471L;

    private String header;
    
    private Map<String,String> hiddenKvs;

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

	public Map<String, String> getHiddenKvs() {
		return hiddenKvs;
	}

	public void setHiddenKvs(Map<String, String> hiddenKvs) {
		this.hiddenKvs = hiddenKvs;
	}

}
