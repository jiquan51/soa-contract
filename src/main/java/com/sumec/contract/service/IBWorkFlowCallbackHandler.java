package com.sumec.contract.service;

/**
 * 移动审批流程回调类接口（处理业务数据）
 * Created by hanf on 2016/6/20.
 */
public interface IBWorkFlowCallbackHandler {

    /**
     * 通过回调
     * @return
     * @throws Exception
     */
    public boolean callBackBeforeConfirm(String strFmId,String strBussinessId);

    public boolean callBackAfterConfirm(String strFmId,String strBussinessId);

    /**
     * 退回回调
     * @return
     * @throws Exception
     */
    public boolean callBackBeforeBack(String strFmId,String strBussinessId);

    public boolean callBackAfterBack(String strFmId,String strBussinessId);
}
