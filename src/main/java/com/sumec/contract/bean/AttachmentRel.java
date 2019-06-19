package com.sumec.contract.bean;

import java.io.Serializable;

/**
 * 功能描述：合同附件实体.<br/>
 * 
 * #date： 2017年11月16日 下午4:16:11<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class AttachmentRel implements Serializable{

    private static final long serialVersionUID = -2680290846076264311L;
    /** 附件名称 */
    private String attachName;
    /** 上传人 */
    private String uploader;
    /** 上传时间 */
    private String uploadDate;
    public String getAttachName(){
        return attachName;
    }
    public void setAttachName(String attachName){
        this.attachName = attachName;
    }
    public String getUploader(){
        return uploader;
    }
    public void setUploader(String uploader){
        this.uploader = uploader;
    }
    public String getUploadDate(){
        return uploadDate;
    }
    public void setUploadDate(String uploadDate){
        this.uploadDate = uploadDate;
    }
}
