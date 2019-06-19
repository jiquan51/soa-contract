package com.sumec.contract.entity;

/**
 * Created by hanf on 2016/6/23.
 */
public class BCallBackModel {

    private String strFmId;
    private String strBusinessId;
    private String strDealFlag;
    private int intReturnValue;

    public String getStrFmId() {
        return strFmId;
    }

    public void setStrFmId(String strFmId) {
        this.strFmId = strFmId;
    }

    public String getStrBusinessId() {
        return strBusinessId;
    }

    public void setStrBusinessId(String strBusinessId) {
        this.strBusinessId = strBusinessId;
    }

    public String getStrDealFlag() {
        return strDealFlag;
    }

    public void setStrDealFlag(String strDealFlag) {
        this.strDealFlag = strDealFlag;
    }

    public int getIntReturnValue() {
        return intReturnValue;
    }

    public void setIntReturnValue(int intReturnValue) {
        this.intReturnValue = intReturnValue;
    }
}
