package com.sumec.contract.constant;

/**
 * 
 * 功能描述：移动待办模块的常量数据.<br/>
 * 
 * #date： 2017年11月17日 下午2:10:37<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class WorkFlowConstant {

    //审批的处理标记
    public static final String DEAL_FLAG_0="0"; //未处理，当前待审批
    public static final String DEAL_FLAG_1="1"; //flag =1 处理通过，flag=2 表示通过被改单了
    public static final String DEAL_FLAG_2="2"; //处理退回
    public static final String DEAL_FLAG_D="d"; //flag=1未处理，后续待审批 ,flag=0 表示前面已经有人处理退回 表示取消
    public static final String DEAL_FLAG_C="c"; //flag=0 表示是提交人撤销

    //审批的有效标记
    public static final String FLAG_0="0"; //无效的
    public static final String FLAG_1="1"; //有效的
    public static final String FLAG_2="2"; //改单的

    //默认通过的意见
    public static final String DEFAULT_PASS_ADVICE="OK";

    //审批对表的状态操作
    public static final String CONFIRM_PASS="通过";
    public static final String CONFIRM_BACK="退回";
}
