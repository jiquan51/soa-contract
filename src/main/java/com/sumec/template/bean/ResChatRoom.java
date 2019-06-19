package com.sumec.template.bean;

import java.io.Serializable;

/**
 * <p>功能描述：创建聊天室参数.</p><br/>
 * 
 * @date： 2018年2月2日 上午10:41:11<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
public class ResChatRoom implements Serializable{

    private static final long serialVersionUID = -3416246115868948971L;

    private Long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
}
