package com.sumec.template.bean;

import java.io.Serializable;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年4月28日 下午2:54:35<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class ModifyChanmember implements Serializable{

    private static final long serialVersionUID = -5999750798855264100L;

    private Long userId;
    
    private Long chatroomId;
    
    private String action;

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getChatroomId(){
        return chatroomId;
    }

    public void setChatroomId(Long chatroomId){
        this.chatroomId = chatroomId;
    }

    public String getAction(){
        return action;
    }

    public void setAction(String action){
        this.action = action;
    }
    
}
