package com.sumec.template.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>功能描述：创建聊天室参数.</p><br/>
 * 
 * @date： 2018年2月2日 上午10:41:11<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class ChatRoom implements Serializable{

    private static final long serialVersionUID = -3416246115868948971L;

    private String name;
    private String description;
    private Long ownerid;
    private List<Long> members;
    private Map<String,Object> agent;
    private String remark;	//备注
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Long getOwnerid(){
        return ownerid;
    }
    public void setOwnerid(Long ownerid){
        this.ownerid = ownerid;
    }
    public List<Long> getMembers(){
        return members;
    }
    public void setMembers(List<Long> members){
        this.members = members;
    }
    public Map<String,Object> getAgent(){
        return agent;
    }
    public void setAgent(Map<String,Object> agent){
        this.agent = agent;
    }
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}
