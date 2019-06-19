package com.sumec.template.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年1月11日 上午11:25:15<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class TemplateListOne extends BaseTemplate implements Serializable{

    private static final long serialVersionUID = -8624642602313608733L;

    private String no;
    private String content;
    private String amount;
    private String status;
    private String money;
    private String department;
    private Map<String,String> hiddenKvs;
    
    
    public String getNo(){
        return no;
    }
    public void setNo(String no){
        this.no = no;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getAmount(){
        return amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getMoney(){
        return money;
    }
    public void setMoney(String money){
        this.money = money;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public Map<String,String> getHiddenKvs(){
        return hiddenKvs;
    }
    public void setHiddenKvs(Map<String,String> hiddenKvs){
        this.hiddenKvs = hiddenKvs;
    }
}
