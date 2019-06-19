package com.sumec.template.bean;

import java.io.Serializable;

public class Approval2Chatroom implements Serializable{

    private String id;	//chatroomid

    private Approval extend;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Approval getExtend() {
		return extend;
	}

	public void setExtend(Approval extend) {
		this.extend = extend;
	}

}
