package com.sumec.contract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumec.contract.constant.WorkFlowConstant;
import com.sumec.contract.dao.IBCallbackDao;
import com.sumec.contract.entity.BCallBackModel;
import com.sumec.contract.service.IBWorkFlowCallbackHandler;

/**
 * Created by hanf on 2016/6/23.
 */
@Service
public class BBaseCallbackHandler implements IBWorkFlowCallbackHandler{

    @Autowired
    private IBCallbackDao bCallbackMapper;

    /**
     * 通过回调
     *
     * @param strFmId
     * @param strBussinessId
     * @return
     * @throws Exception
     */
    @Override
    public boolean callBackBeforeConfirm(String strFmId, String strBussinessId) {
        return true;
    }

    @Override
    public boolean callBackAfterConfirm(String strFmId, String strBussinessId) {
        BCallBackModel bCallBackModel = new BCallBackModel();
        bCallBackModel.setStrFmId(strFmId);
        bCallBackModel.setStrBusinessId(strBussinessId);
        bCallBackModel.setStrDealFlag(WorkFlowConstant.DEAL_FLAG_1);
        bCallBackModel.setIntReturnValue(0);
        bCallbackMapper.callBackAfter(bCallBackModel);
        if(bCallBackModel.getIntReturnValue() == -1){
            return false;
        }
        return true;
    }

    /**
     * 退回回调
     *
     * @param strFmId
     * @param strBussinessId
     * @return
     * @throws Exception
     */
    @Override
    public boolean callBackBeforeBack(String strFmId, String strBussinessId) {
        return true;
    }

    @Override
    public boolean callBackAfterBack(String strFmId, String strBussinessId) {
        BCallBackModel bCallBackModel = new BCallBackModel();
        bCallBackModel.setStrFmId(strFmId);
        bCallBackModel.setStrBusinessId(strBussinessId);
        bCallBackModel.setStrDealFlag(WorkFlowConstant.DEAL_FLAG_2);
        bCallBackModel.setIntReturnValue(0);

        bCallbackMapper.callBackAfter(bCallBackModel);

        if(bCallBackModel.getIntReturnValue() == -1){
            return false;
        }
        return true;
    }
}
