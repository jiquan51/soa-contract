package com.sumec.template.controller;

import com.github.pagehelper.PageHelper;
import com.sumec.api.base.bean.TSumecUser;
import com.sumec.api.base.service.ISumecAuthorityService;
import com.sumec.api.base.service.ISumecUserService;
import com.sumec.api.data.bean.*;
import com.sumec.api.data.service.*;
import com.sumec.api.inv.bean.InvIncomeRel;
import com.sumec.api.inv.bean.InvJsBean;
import com.sumec.api.inv.bean.TInvIncome;
import com.sumec.api.inv.service.IInvIncomeService;
import com.sumec.api.inv.service.InvJsService;
import com.sumec.api.pay.bean.*;
import com.sumec.api.pay.service.*;
import com.sumec.api.tran.entity.TTrSoutBean;
import com.sumec.api.tran.service.ITrSoutService;
import com.sumec.base.BaseEntity;
import com.sumec.boot.core.annotation.RESTful;
import com.sumec.boot.core.web.util.ResponseUtil;
import com.sumec.common.Constants;
import com.sumec.contract.constant.DictConstant;
import com.sumec.contract.entity.*;
import com.sumec.contract.service.*;
import com.sumec.flow.bean.TSumecFlowDetailsModule;
import com.sumec.flow.entity.TSumecFlowDetails;
import com.sumec.flow.entity.TSumecFlowModule;
import com.sumec.flow.service.ISumecFlowDetailsModuleService;
import com.sumec.flow.service.ISumecFlowDetailsService;
import com.sumec.flow.service.ISumecFlowModuleService;
import com.sumec.pkg.dao.ITrPkgRelDao;
import com.sumec.pkg.entity.TTrPkg;
import com.sumec.pkg.entity.TTrPkgRel;
import com.sumec.pkg.service.ITrPkgRelService;
import com.sumec.template.bean.*;
import com.sumec.template.dao.ITemplateDao;
import com.sumec.template.service.IQrDecodeService;
import com.sumec.template.service.ISumecBusiGroupService;
import com.sumec.template.service.ITemplateService;
import com.sumec.utils.DateUtils;
import com.sumec.utils.NumberFormatUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述：模板相关接口.<br/>
 * <p>
 * #date： 2017年12月13日 上午8:58:19<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@RESTful
@RequestMapping("/api")
@Api(tags = {"APP模板相关操作接口"})
public class TemplateController {

    private final Logger logger = LoggerFactory.getLogger(TemplateController.class);
    private final String CONTRACT_REL_TYPE_EXC = "EXC";
    private final String FM_TR_SALES_SOUT_INL = "FM_TR_SALES_SOUT_INL";
    private final String FM_IO_EXC = "FM_IO_EXC";
    private final String TOB_P_ORDER = "P_ORDER";
    private final String TOB_S_ORDER = "S_ORDER";
    private final String PT = "PT"; // 纯自营
    private final BigDecimal HK = new BigDecimal(1);
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); /// HH:mm:ss

    @Autowired
    private IExpBcService expBcService;
    // @Autowired
    // private IPurchaseTrackService purchaseTrackService;
    @Autowired
    private IExpScService expScService;
    @Autowired
    private IDicBasicInfoService basicInfoService;
    @Autowired
    private IFdAccService fdAccService;
    @Autowired
    private ISumecUserService sumecUserService;
    @Autowired
    private ISumecUnitService sumecUnitService;
    @Autowired
    private IExpBcCmdService expBcCmdService;
    @Autowired
    private IExpScCmdService expScCmdService;
    @Autowired
    private IDicCommService dicCommService;
    @Autowired
    private IPubPayApplyService pubPayApplyService;
    @Autowired
    private IDicFeeKindService feeKindService;
    @Autowired
    private IDicPayWayService payWayService;
    @Autowired
    private IIoLcOpenService lcOpenService;
    @Autowired
    private IInvIncomeService invIncomeService;
    @Autowired
    private IDicInvKindService invKindService;
    //	@Autowired
//	private ITrLogiBlService logiBlService;
//	@Autowired
//	private ITrLogiTransService logiTransService;
//	@Autowired
//	private ITrLogiRkService logiRkService;
    @Autowired
    private ISumecFlowDetailsService sumecFlowDetailsService;
    @Autowired
    private ISumecFlowModuleService sumecFlowModuleService;
    @Autowired
    private IIoLcOpenService ioLcOpenService;
    @Autowired
    private IIoLcOpenBakService ioLcOpenBakService;
    @Autowired
    private IIoPayCollRelService ioPayCollRelService;
    @Autowired
    private ISumecFlowDetailsModuleService iSumecFlowDetailsModuleService;
    @Autowired
    private ISumecAuthorityService sumecAuthorityService;
    @Autowired
    private ITrOcuDivideService ocuDivideService;
    @Autowired
    private ITrPkgRelService pkgRelService;
    @Autowired
    private ISumecBusiGroupService sumecBusiGroupService;
    @Autowired
    private IQrDecodeService qrDecodeService;
    @Autowired
    private ITemplateService templateService;
    @Autowired
    private ITemplateDao templateDao;
    @Autowired
    private ITrPkgRelDao pkgRelDao;
    @Autowired
    private ITrSoutService trSoutService;
    @Autowired
    private InvJsService invJsService;
    @Autowired
    private ITPubIoService tPubIoService;
    @Autowired
    private ITrContractRelService trContractRelService;
    @Autowired
    private IPubExcService pubExcService;

    private Map<String, String> map0;    //合同周期字典

    @Scheduled(fixedRate = 1000 * 60 * 60 * 24)
    public void queryConPeriodSType() {
        List<TDicBasicInfo> list0 = null;
        try {
            list0 = basicInfoService.selectByStrType("TR_CON_PERIOD_S_TYPE");
        map0 = list0.stream().collect(Collectors.toMap(TDicBasicInfo::getStrName, TDicBasicInfo::getStrNotes));
        } catch (Exception e) {
            e.printStackTrace();
            //{PAY_L=末次采购付款日, CON_S=合同签订, AFT_RK=入库后, AFT_ARR_PORT=到港后, PAY_F=首次采购付款日}
            map0.put("PAY_L", "末次采购付款日");
            map0.put("CON_S", "合同签订");
            map0.put("AFT_RK", "入库后");
            map0.put("AFT_ARR_PORT", "到港后");
            map0.put("PAY_F", "首次采购付款日");
        }
        logger.info(map0.toString());
    }

    @GetMapping(value = "/contract/v1/scan/{userId}/{qrCode}")
    @ApiOperation(value = "根据用户id，编码值来查询对应的值", notes = "v1-根据用户id，编码值来查询对应的值")
    public ResponseEntity<Map<String, Object>> queryQrCodeDetail(@PathVariable("userId") Long userId,
                                                                 @PathVariable("qrCode") String qrCode) {
        Map<String, Object> template = null;
        if (userId != null && StringUtils.isNotEmpty(qrCode) && qrCode.length() >= 32) {
            String tId = qrCode.substring(0, 32);
            String tValue = qrCode.substring(32);
            TTrQrbarType tTrQrbarType = qrDecodeService.selectByPrimaryKey(tId);
            if (tTrQrbarType != null) {
                String tCode = tTrQrbarType.gettCode();
                if ("T_EXP_BC".equals(tCode)) {// 采购合同
                    Set<TTrOcuDivide> res = viewContractPermission(userId);
                    if (CollectionUtils.isNotEmpty(res) && res.size() >= 1) {
                        List<String> ids = new ArrayList<>();
                        for (TTrOcuDivide tTrOcuDivide : res) {
                            ids.add(tTrOcuDivide.getTobId().toString());
                        }
                        if (ids.contains(tValue)) {
                            TExpBc expBc = expBcService.selectByPrimaryKey(new BigDecimal(tValue));
                            if (expBc != null) {

                                template = getExpBcTemplateOne(expBc);
                                template.putAll(getExpBcTemplateTwo(expBc));

                                /// 增加会话
                                BigDecimal bcId = expBc.getBcId();
                                List<TTrPkgRel> trPkgList = pkgRelService.selectByTobIdAndType(bcId.toString(),
                                        TOB_P_ORDER);
                                TemplateBtn btn = new TemplateBtn();
                                btn.setHeader("进入会话");
                                Map<String, String> hiddenKvs = new HashMap<>();
                                hiddenKvs.put("route", "Content"); // 会话路由
                                hiddenKvs.put("id", getOneChatId(trPkgList));
                                hiddenKvs.put("type", tCode);
                                btn.setHiddenKvs(hiddenKvs);
                                template.put("conversation_temp", btn);
                            }
                        } else {
                            // 401
                            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
                        }
                    } else {
                        // 401
                        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
                    }
                } else if ("T_EXP_SC".equals(tCode)) {// 销售合同
                    Set<TTrOcuDivide> res = viewContractPermission(userId);
                    if (CollectionUtils.isNotEmpty(res) && res.size() >= 1) {
                        List<String> ids = new ArrayList<>();
                        for (TTrOcuDivide tTrOcuDivide : res) {
                            ids.add(tTrOcuDivide.getTobId().toString());
                        }
                        if (ids.contains(tValue)) {
                            TExpSc expSc = expScService.selectByPrimaryKey(new BigDecimal(tValue));
                            if (expSc != null) {
                                template = getExpScTemplateOne(expSc);
                                template.putAll(getExpScTemplateTwo(expSc));

                                /// 增加会话
                                BigDecimal scId = expSc.getScId();
                                List<TTrPkgRel> trPkgList = pkgRelService.selectByTobIdAndType(scId.toString(),
                                        TOB_S_ORDER);
                                TemplateBtn btn = new TemplateBtn();
                                btn.setHeader("进入会话");
                                Map<String, String> hiddenKvs = new HashMap<>();
                                hiddenKvs.put("route", "Content"); // 会话路由
                                hiddenKvs.put("id", getOneChatId(trPkgList));
                                hiddenKvs.put("type", tCode);
                                btn.setHiddenKvs(hiddenKvs);
                                template.put("conversation_temp", btn);
                            }
                        } else {
                            // 401
                            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
                        }
                    } else {
                        // 401
                        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
                    }
                } else if ("T_INV_INCOME".equals(tCode)) {// 发票

                } else if ("T_IO_DAP_PAY".equals(tCode)) {// DA/DP兑付

                } else if ("T_IO_LC_OPEN".equals(tCode)) {// 开证申请

                } else if ("T_IO_LC_OPEN_NEGO".equals(tCode)) {// 开证-到单议付

                } else if ("T_PUB_PAY_APPLY".equals(tCode)) {// 非证支付申请

                } else if ("T_TR_BG_IMP".equals(tCode)) {// 进口报关申请

                } else if ("T_TR_FIN_PROD".equals(tCode)) {// 金融产品

                } else if ("T_TR_INV_BATCH".equals(tCode)) {// 批量发票

                } else if ("T_TR_INV_TAX_EXC".equals(tCode)) {// 税单流转

                } else if ("T_TR_LOGI_CK".equals(tCode)) {// 出库通知

                } else if ("T_TR_LOGI_RK".equals(tCode)) {// 入库通知

                } else if ("T_TR_LOGI_TRANS".equals(tCode)) {// 运输通知

                } else if ("T_TR_SALES_SETTLE".equals(tCode)) {// 销售结算

                } else if ("T_TR_SOUT".equals(tCode)) {// 销售发货

                } else if ("T_TR_TENDER".equals(tCode)) {// 投标申请

                }
            }
        }
        // 1. 在原先扫一扫模板的基础上，增加一个模板，模板定义为按钮，文案固定“进入会话”，与其他按钮一样，第三极通过模板上 hiddenkvs
        // 给到的数据做页面跳转
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    @GetMapping(value = "/contract/v1/serach/{userId}/contracts")
    @ApiOperation(value = "根据userId获取该用户权限下会话列表", notes = "v1-根据userId获取该用户权限下会话列表")
    public ResponseEntity<List<String>> queryContractsByUserId(@PathVariable("userId") Long userId) {
        if (userId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        Set<TTrOcuDivide> res = viewContractPermission(userId);
        // 查询合同对应的包信息
        List<String> chatIds = getchatIds(res);

        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(chatIds));
    }

    @GetMapping(value = "/contract/v1/serach/{userId}/{keyWord}/contracts")
    @ApiOperation(value = "根据userId,关键字获取该用户权限下会话列表", notes = "v1-根据userId,关键字获取该用户权限下会话列表")
    public ResponseEntity<List<String>> queryContractsByUserIdAndKeyWord(@PathVariable("userId") Long userId,
                                                                         @PathVariable("keyWord") String keyWord) {
        if (userId == null || StringUtils.isEmpty(keyWord)) {
            return ResponseEntity.badRequest().body(null);
        }
        Set<TTrOcuDivide> res = viewContractPermission(userId);
        keyWord = keyWord.toUpperCase();
        Set<TTrOcuDivide> keyWords = new HashSet<>();
        List<TTrOcuDivide> pContractsByKeyWords = expBcService.selectByKeyWord(keyWord);
        List<TTrOcuDivide> sContractsByKeyWords = expScService.selectByKeyWord(keyWord);

        if (CollectionUtils.isNotEmpty(pContractsByKeyWords)) {
            keyWords.addAll(pContractsByKeyWords);
        }
        if (CollectionUtils.isNotEmpty(sContractsByKeyWords)) {
            keyWords.addAll(sContractsByKeyWords);
        }

        // 查询合同对应的包信息
        List<String> chatIds = null;
        if (CollectionUtils.isNotEmpty(res)) {
            res.retainAll(keyWords);
            chatIds = getchatIds(res);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(chatIds));
    }

    /**
     * <p>
     * 方法描述：根据id与类型来获取合同主题概要页面模板数据
     * </p>
     * \r\n
     * <p>
     * 已废弃，由创建群主时传给终端
     *
     * @param id
     * @param type
     * @return
     * @author SunTow_J <br />
     * @date： 2018年1月12日 下午2:32:25<br/>
     */
    @GetMapping(value = "/contract/v1/{id}/outline")
    @ApiOperation(value = "根据id与类型来获取合同主题概要页面模板数据", notes = "v1-根据id与类型来获取合同主题概要页面模板数据")
    @Deprecated
    public ResponseEntity<List<String>> queryContract(@PathVariable("id") String id,
                                                      @RequestParam("type") String type) {
        List<String> list = null;
        if (StringUtils.isEmpty(id) || StringUtils.isEmpty(type)) {
            return ResponseEntity.badRequest().body(null);
        }
        if ("T_TR_PKG".equals(type)) {
            TTrPkg trPkg = pkgRelService.selectByPrimaryKey(id);
            if (trPkg == null) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            List<TTrPkgRel> pkgRels = pkgRelService.selectByPkgId(id);
            if (pkgRels == null || CollectionUtils.isEmpty(pkgRels)) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            String pkgType = trPkg.getPkgType();
            Map<String, List<BaseEntity>> contractMap = templateService.getContractEntity(id, pkgType);
            List<BaseEntity> expBcs = contractMap.get("P_ORDER");
            List<BaseEntity> expScs = contractMap.get("S_ORDER");
            if ("TR_JK_PR".equals(pkgType)) {// 代理进口
                // 一销售多采购 采购取进口采购
                if (CollectionUtils.isNotEmpty(expScs)) {
                    TExpSc expSc = (TExpSc) expScs.get(0);
                    list = new ArrayList<>();
                    list.add(expSc.getCstName());// 客户
                    list.add(DictConstant.C_STATUS.get(expSc.getcStatus())); // 状态
                    String dicComm = "";
                    if (expSc.getCmdCataId() != null) {
                        TDicComm cmdCata = dicCommService.selectByPrimaryKey(expSc.getCmdCataId());
                        if (cmdCata != null) {
                            dicComm = dicComm + cmdCata.getCommName();
                        }
                    }
                    if (expSc.getCommId() != null) {
                        TDicComm comm = dicCommService.selectByPrimaryKey(expSc.getCommId());
                        if (comm != null) {
                            dicComm = dicComm + " " + comm.getCommName();
                        }
                    }
                    list.add(dicComm);

                    Long commUnit = expSc.getCommUnit();
                    String commUnitName = "";
                    TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(commUnit);
                    if (dicUnit != null) {
                        commUnitName = dicUnit.getUnitName();
                    }
                    list.add(NumberFormatUtils.getNumber(expSc.getpQuant()) + " " + commUnitName); // 数量

                    list.add("");// 占位
                    list.add(expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(expSc.gettAmt())); // 金额
                    list.add("");// 占位
                    String person = templateService.getExpScDepartMent(expSc);
                    list.add(person);// 业务员
                }
                TExpBc expBc = (TExpBc) expBcs.get(0);
                list = getExpBcList(expBc);
            } else if ("TR_NM_PR".equals(pkgType)) {// 代理内贸
                // 一销售多采购 取第一个
                TExpBc expBc = (TExpBc) expBcs.get(0);
                list = getExpBcList(expBc);
            } else if ("TR_NM_PT".equals(pkgType)) {// 自营内贸
                // 一采购多销售
                TExpBc expBc = (TExpBc) expBcs.get(0);
                list = getExpBcList(expBc);
            } else if ("TR_EXP_PT".equals(pkgType)) {// 自营出口
                // 一销售多采购
                TExpBc expBc = (TExpBc) expBcs.get(0);
                list = getExpBcList(expBc);
            }
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(list));
    }

    /**
     * <p>
     * 方法描述：根据id与类型来获取合同主题首页模板数据
     * </p>
     *
     * @param pkgId
     * @param type
     * @return
     * @author SunTow_J <br />
     * @date： 2018年1月12日 下午2:32:41<br/>
     */
    @GetMapping(value = "/contract/v1/{pkgId}/topicHomePage")
    @ApiOperation(value = "根据id与类型来获取合同主题首页模板数据", notes = "v1-根据id与类型来获取合同主题首页模板数据")
    public ResponseEntity<Map<String, Object>> queryContractSum(@PathVariable("pkgId") String pkgId,
                                                                @RequestParam("type") String type) {
        Map<String, Object> template = new LinkedHashMap<>();
        if ("T_TR_PKG".equals(type)) {
            TTrPkg trPkg = pkgRelService.selectByPrimaryKey(pkgId);
            if (trPkg == null) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            List<TTrPkgRel> pkgRels = pkgRelService.selectByPkgId(pkgId);
            if (CollectionUtils.isEmpty(pkgRels)) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            Map<String, List<BaseEntity>> contractMap = templateService.getContractEntity(pkgId, type);
            List<BaseEntity> expBcs = contractMap.get("P_ORDER");
            List<BaseEntity> expScs = contractMap.get("S_ORDER"); /// 改成从T_TR_CONTRACT_REL取; 只有S_ORDER的话从t_tr_pkg_rel取
            Map<String, List<String>> ids = new HashMap<>();
            if (CollectionUtils.isNotEmpty(expBcs)) {
                List<String> expBcIds = new ArrayList<>();
                for (int i = 0; i < expBcs.size(); i++) {
                    TExpBc expBc = (TExpBc) expBcs.get(i);
                    TemplateSummary one = templateService.getPkgTemplateOne(trPkg, null, expBc, type);
                    template.put("summary_temp#ExpBc" + i, one);
                    Map<String, Object> temp = templateService.queryBcSum(expBc, i);
                    if (temp != null && !temp.isEmpty()) {
                        template.putAll(temp);
                    }
                    expBcIds.add(expBc.getBcId() + "");
                }
                ids.put("P_ORDER", expBcIds);
            }
            if (CollectionUtils.isNotEmpty(expScs)) {
                List<String> expScIds = new ArrayList<>();
                for (int i = 0; i < expScs.size(); i++) {
                    TExpSc expSc = (TExpSc) expScs.get(i);
                    TemplateSummary one = templateService.getPkgTemplateOne(trPkg, expSc, null, type);
                    template.put("summary_temp#ExpSc" + i, one);
                    Map<String, Object> temp = templateService.queryScSum(expSc, i);
                    if (temp != null && !temp.isEmpty()) {
                        template.putAll(temp);
                    }
                    expScIds.add(expSc.getScId() + "");
                }
                ids.put("S_ORDER", expScIds);
            }

            // Map<String,Object> temp = templateService.queryPgkSum(trPkg,ids,type);
            // if(temp != null && !temp.isEmpty()){
            // template.putAll(temp);
            // }
        }
        // BC
        else if ("T_EXP_BC".equals(type)) {
            // Map<String,Object> temp = templateService.queryPgkSum(trPkg,ids,type);
            // List<String> expBcIds = new ArrayList<>();
            // expBcIds.add(id);
            // TTrPurchaseTrack purchaseTrack =
            // purchaseTrackDao.selectByIds("T_EXP_BC",expBcIds);
            TExpBc expBc = expBcService.selectByPrimaryKey(new BigDecimal(pkgId));
            TemplateSummary one = templateService.getPkgTemplateOne(new TTrPkg(), null, expBc, "T_TR_PKG"); //
            template.put("summary_temp#ExpBc" + 0, one);
            Map<String, Object> temp = templateService.queryBcSum(expBc, 0);

            if (temp != null && !temp.isEmpty()) {
                template.putAll(temp);
            }

            /// 增加会话
            BigDecimal bcId = expBc.getBcId();
            List<TTrPkgRel> trPkgList = pkgRelService.selectByTobIdAndType(bcId.toString(), TOB_P_ORDER);
            TemplateBtn btn = new TemplateBtn();
            btn.setHeader("进入会话");
            Map<String, String> hiddenKvs = new HashMap<>();
            hiddenKvs.put("route", "Content"); // 会话路由
            hiddenKvs.put("id", getOneChatId(trPkgList));
            hiddenKvs.put("type", type);
            btn.setHiddenKvs(hiddenKvs);
            template.put("conversation_temp", btn);

        }
        // SC
        else if ("T_EXP_SC".equals(type)) {
            TExpSc expSc = expScService.selectByPrimaryKey(new BigDecimal(pkgId));
            TemplateSummary one = templateService.getPkgTemplateOne(new TTrPkg(), expSc, null, "T_TR_PKG"); //
            template.put("summary_temp#ExpSc" + 0, one);
            Map<String, Object> temp = templateService.queryScSum(expSc, 0);
            if (temp != null && !temp.isEmpty()) {
                template.putAll(temp);
            }
        }

        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    /**
     * <p>
     * 方法描述：根据id与类型来获取合同详细模板数据
     * </p>
     *
     * @param id
     * @param type
     * @return
     * @author SunTow_J <br />
     * @date： 2018年1月15日 下午5:22:53<br/>
     */
    @GetMapping(value = "/contract/v1/{id}/detailPage")
    @ApiOperation(value = "根据id与类型来获取合同详细模板数据", notes = "v1-根据id与类型来获取合同详细首页模板数据")
    public ResponseEntity<Map<String, Object>> queryContractDetail(@PathVariable("id") String id,
                                                                   @RequestParam("type") String type) {
        Map<String, Object> template = null;
        if ("T_TR_PKG".equals(type)) {
            TTrPkg trPkg = pkgRelService.selectByPrimaryKey(id);
            if (trPkg == null) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            List<TTrPkgRel> pkgRels = pkgRelService.selectByPkgId(id);
            if (pkgRels == null || CollectionUtils.isEmpty(pkgRels)) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            String pkgType = trPkg.getPkgType();
            template = templateService.queryPgkDetail(trPkg, id, pkgType);
        } else if ("T_EXP_BC".equals(type)) {
            TExpBc expBc = expBcService.selectByPrimaryKey(new BigDecimal(id));
            if (expBc != null) {
                template = getExpBcTemplateOne(expBc);
                template.putAll(getExpBcTemplateTwo(expBc));
            }
        } else if ("T_EXP_SC".equals(type)) {
            TExpSc expSc = expScService.selectByPrimaryKey(new BigDecimal(id));
            if (expSc != null) {
                template = getExpScTemplateOne(expSc);
                template.putAll(getExpScTemplateTwo(expSc));
            }
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    @GetMapping(value = "/contract/v1/{item}/{id}/detailPage")
    @ApiOperation(value = "根据id与类型来获取合同对应的付款/发票/物流、收款/结算/发货模板数据", notes = "v1-根据id与类型来获取合同对应的付款/发票/物流、收款/结算/发货模板数据")
    public ResponseEntity<Map<String, Object>> queryContractItems(@PathVariable("id") String id,
                                                                  @PathVariable("item") String item, @RequestParam("type") String type) {
        Map<String, Object> template = null;
        if ("T_TR_PKG".equals(type)) {
            if (id == null || StringUtils.isEmpty(type) || StringUtils.isEmpty(item)) {
                return ResponseEntity.badRequest().body(null);
            }
            TTrPkg trPkg = pkgRelService.selectByPrimaryKey(id);
            if (trPkg == null) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            List<TTrPkgRel> pkgRels = pkgRelService.selectByPkgId(id);
            if (pkgRels == null || CollectionUtils.isEmpty(pkgRels)) {
                return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
            }
            String pkgType = trPkg.getPkgType();
            Map<String, List<BaseEntity>> contractMap = templateService.getContractEntity(id, pkgType);
            List<BaseEntity> expBcs = contractMap.get("P_ORDER");
            // List<BaseEntity> expScs = contractMap.get("S_ORDER");
            if (CollectionUtils.isNotEmpty(expBcs)) {
                template = new LinkedHashMap<>();
                for (BaseEntity baseEntity : expBcs) {
                    TExpBc expBc = (TExpBc) baseEntity;
                    Map<String, Object> temp = getExpBcTemplateListFour(item, expBc);
                    if (temp != null && !temp.isEmpty()) {
                        template.putAll(temp);
                    }
                }
            }
        } else if ("T_EXP_BC".equals(type)) {
            template = new LinkedHashMap<>();
            TExpBc expBc = expBcService.selectByPrimaryKey(new BigDecimal(id));
            Map<String, Object> temp = getExpBcTemplateListFour(item, expBc);
            if (temp != null && !temp.isEmpty()) {
                template.putAll(temp);
            }
        } else if ("T_EXP_SC".equals(type)) {
            template = new LinkedHashMap<>();
            TExpSc expSc = expScService.selectByPrimaryKey(new BigDecimal(id));
            Map<String, Object> temp = getExpScTemplateListFour(item, expSc);
            if (temp != null && !temp.isEmpty()) {
                template.putAll(temp);
            }
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    /**
     * <p>
     * 方法描述：根据flow_details中的intId查询出对应的fmId与refValue,最终查询对应的审批详情
     * </p>
     *
     * @param intId
     * @return
     * @author SunTow_J <br />
     * @date： 2018年2月24日 下午2:32:41<br/>
     */
    @GetMapping(value = "/contract/v1/approved/{intId}/detail")
    @ApiOperation(value = "根据intId来查询对应的审批详情", notes = "v1-根据intId来查询对应的审批详情")
    public ResponseEntity<Map<String, Object>> queryApprovedDetail(@PathVariable("intId") Long intId) {
        Map<String, Object> template = null;
        if (intId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsService.selectByPrimaryKey(intId);
        if (sumecFlowDetails == null) {
            template = new LinkedHashMap<>();
            template.put("status", "Undo"); // 主动撤回
            return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
            // return ResponseEntity.badRequest().body(template);
        }
        Long longFmId = sumecFlowDetails.getFmId();
        String strRefValue = sumecFlowDetails.getRefValue();
        TSumecFlowModule flowModule = sumecFlowModuleService.selectByPrimaryKey(longFmId);
        if (flowModule == null) {
            return ResponseEntity.badRequest().body(null);
        }
        String tableName = flowModule.getTableName();
        String fmCode = flowModule.getFmCode();
        // String pkColumn = flowModule.getPkColumn();
        if (StringUtils.isEmpty(tableName)) {
            return ResponseEntity.badRequest().body(null);
        }
        if (tableName.contains("T_PUB_PAY_APPLY")) {// 支付申请
            TPubPayApply pubPayApply = pubPayApplyService.selectByPrimaryKey(new BigDecimal(strRefValue));
            template = new LinkedHashMap<>();
            if (pubPayApply == null) {
                return ResponseEntity.badRequest().body(null);
            }
            // 申请金额
            BigDecimal payAmt = pubPayApply.getPayAmt();
            TemplateOne templateOne = new TemplateOne();
            // 金额
            templateOne.setLeft(pubPayApply.getCurrType() + " " + NumberFormatUtils.getCurrency(payAmt));
            // 状态
            templateOne.setRight(pubPayApply.getConfirm());
            Map<String, Object> temp1 = new LinkedHashMap<>();
            TFdAcc fdAcc = fdAccService.selectByAccNo(pubPayApply.getAccNo());
            if (fdAcc != null) {
                temp1.put("付款单位", fdAcc.getAccShortName());
            }
            temp1.put("收款单位", pubPayApply.getCstName());
            temp1.put("收款银行", pubPayApply.getCstBankName());
            templateOne.setKvs(temp1);
            template.put("info_temp_one", templateOne);
            // 基本信息
            TemplateInfo info = new TemplateInfo();
            info.setHeader("基本信息");
            Map<String, String> temp2 = new LinkedHashMap<>();
            // 支付方式
            Long pwId = pubPayApply.getPwId();
            if (pwId != null) {
                TDicPayWay payWay = payWayService.selectByPrimaryKey(pwId);
                temp2.put("支付方式", payWay.getPwName());
            }

            // 款项性质 改成T_PUB_PAY_DTL表中的FEE_KIND_CATA字段@zy@zjq
            temp2.put("款项性质", pubPayApply.getPayKind());

            String payKind = templateDao.selectLs_pay_kind(strRefValue);
            long rc = templateDao.selectRc(strRefValue);
            boolean flagHk = false; // 是否货款
            if (rc > 0 && !"退款".equals(payKind)) {
                // dw_io_tt_itc_inl_multi_rev 货款 // dw_io_tt_itc_fee_rev 非货款
                flagHk = true;
            }
            if (!flagHk) {
                List<InvIncomeRel> InvIncomeRels = invIncomeService.queryInvIncomeRel(strRefValue);
                BigDecimal invRelAmtAcc = InvIncomeRels.stream().map(InvIncomeRel::getRelAmt).reduce(BigDecimal.ZERO,
                        BigDecimal::add);
//				for (int i = 0; i < InvIncomeRels.size(); i++) {
//					InvIncomeRel item = InvIncomeRels.get(i);
//					invRelAmtAcc = invRelAmtAcc.add(item.getRelAmt());
//				}
                if (invRelAmtAcc.intValue() == 0) {
                    temp2.put("关联发票", "无");
                } else {
                    temp2.put("关联发票", "有" + NumberFormatUtils.getCurrency(invRelAmtAcc));
                }
            }
            // // 是否预付款
            // String isPrepaid = pubPayApply.getIsPrepaid();
            // if ("1".equals(isPrepaid)) { // 是
            // temp2.put("是否预付款", "是");
            // } else {// 否
            // temp2.put("是否预付款", "否");
            // }
            // 审批状态
            // temp2.put("审批状态",pubPayApply.getConfirm());
            // 申请人
            // Long postUserId = pubPayApply.getUserId();
            // TSumecUser postSumecUser = sumecUserService.selectByUserId(postUserId);
            // if(postSumecUser != null){
            // temp2.put("申请人",postSumecUser.getUserName());
            // }
            String payNote = pubPayApply.getTtPayNote();
            if (StringUtils.isNotEmpty(payNote)) {
                temp2.put("T/T付款附言", payNote);
            }
            String dealNote = pubPayApply.getTtDealNote();
            if (StringUtils.isNotEmpty(dealNote)) {
                temp2.put("T/T交易附言", dealNote);
            }
            String feeBear = pubPayApply.getTtFeeBear();
            if (StringUtils.isNotEmpty(feeBear)) {
                temp2.put("付汇费用承担", feeBear);
            }
            // 银行费用
            BigDecimal bankFeeAmt = pubPayApply.getBankFeeAmt();
            if (bankFeeAmt != null) {
                temp2.put("银行费用", bankFeeAmt + "");
            }
            // 申请支付日期
            temp2.put("申请支付日期", DateUtils.format(pubPayApply.getPayDateApply()));
            info.setKvs(temp2);
//			template.put("info_temp_two", info);	//把基本信息放到系统风险提示和商务审批提示后面，此行下移

            // 关联合同 -- 支付申请 zjq 备选方案 select * from view_tr_tob where tob_type in
            // ('P_ORDER','S_ORDER')
            BigDecimal amtFee = BigDecimal.ZERO; // 系统提示用 feiyongzhifu
            BigDecimal amtHk = BigDecimal.ZERO; // 系统提示用 huokuan
            BigDecimal pAmt = BigDecimal.ZERO; // 合同额
            List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_PUB_PAY_APPLY", strRefValue);
            TemplateListFour listFour = null;
            if (CollectionUtils.isNotEmpty(rels)) {
                listFour = new TemplateListFour();
                listFour.setHeader("关联合同");
                List<Map<String, Object>> list = new LinkedList<>();
                TExpBc tExpBc = new TExpBc();
                for (int i = 0; i < rels.size(); i++) {
                    TIoPayCollRel payCollRel = rels.get(i);
                    Map<String, Object> temp4 = new LinkedHashMap<>();
                    // 合同号 状态
                    // temp4.put(payCollRel.getTobNo(),"");
                    String tobId = payCollRel.getTobId();
                    String tobType = payCollRel.getTobType();
                    BigDecimal onceAmtFyzf = templateDao.selectPayAmt4Hint(tobType, tobId, strRefValue,
                            pubPayApply.getCstId(), HK);
                    amtFee.add(onceAmtFyzf == null ? BigDecimal.ZERO : onceAmtFyzf);
                    BigDecimal onceAmtHk = templateDao.selectPayAmt4HintHk(tobType, tobId, HK);
                    amtHk.add(onceAmtHk == null ? BigDecimal.ZERO : onceAmtHk);
                    if ("P_ORDER".equals(tobType)) {
                        // 根据tobId 去查询合同相关信息
                        tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(tobId));
                        pAmt = tExpBc.getpAmt();
                        String tmpBizType = "";
                        String bizMode = tExpBc.getBizMode();
                        if (StringUtils.isNotEmpty(bizMode)) {
                            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
                            if (basicInfo != null) {
                                tmpBizType = basicInfo.getStrNotes();
                            }
                        }
                        temp4.put("[采购]" + payCollRel.getTobNo(), tmpBizType); // DictConstant.C_STATUS.get(tExpBc.getcStatus())
                        temp4.put(tExpBc.getFctName(),
                                tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));

                        // 合同标的
                        temp4.putAll(getExpBcCmdMap(tExpBc));
                        // Long unit = tExpBc.getCommUnit();
                        // String unitName = "";
                        // if(unit != null){
                        // TDicUnitEntity unitEntity = sumecUnitService.queryDicUnitByUnitId(unit);
                        // if(unitEntity != null){
                        // unitName = unitEntity.getUnitName();
                        // }
                        // }
                        // temp4.put(NumberFormatUtils.getNumber(tExpBc.getpQuant()) + " " + unitName,
                        // tExpBc.getCurrType() + " " +
                        // NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
                        Map<String, String> hiddenKvs = new HashMap<String, String>();
                        if ((flagHk)) {
                            temp4.put("本次支付金额", pubPayApply.getCurrType() + " "
                                    + NumberFormatUtils.getCurrency(payCollRel.getRelAmt()));
                            temp4.put("已申请支付金额(含本次)", pubPayApply.getCurrType() + " "
                                    + NumberFormatUtils.getCurrency(templateDao.selectAmt(tobType, tobId)));
                        } else {
                            temp4.put(pubPayApply.getPayKind(), pubPayApply.getCurrType() + " "
                                    + NumberFormatUtils.getCurrency(payCollRel.getRelAmt()));
                        }

                        List<Map<String, Object>> wlList = templateDao.selectItemWl(TOB_P_ORDER, tobId);
                        // 发货 send_amt
                        BigDecimal sendAmt = BigDecimal.ZERO;// purchaseTrack.getSendAmt();
                        // 数量 send_quant
                        BigDecimal sendQuant = BigDecimal.ZERO;// purchaseTrack.getSendQuant();
                        for (int i1 = 0; i1 < wlList.size(); i1++) {
                            Map<String, Object> wlMap = wlList.get(i1);
                            Map<String, Object> map = new LinkedHashMap<>();
                            // String logi_doc_type = wlMap.get("LOGI_DOC_TYPE").toString();
                            // String logi_doc_no = (String) wlMap.getOrDefault("LOGI_DOC_NO", "");
                            BigDecimal invPrice = (BigDecimal) wlMap.getOrDefault("INV_PRICE", BigDecimal.ZERO);
                            String comm_name = wlMap.get("COMM_NAME").toString();
                            String r_date = wlMap.get("R_DATE").toString();
                            String tol_comm_quant = wlMap.get("TOL_COMM_QUANT").toString();
                            Long comm_unit = Long.valueOf(wlMap.get("COMM_UNIT").toString());
                            sendAmt = sendAmt.add(invPrice.multiply(new BigDecimal(tol_comm_quant)));
                            sendQuant = sendQuant.add(new BigDecimal(tol_comm_quant));
                            map.put(comm_name,
                                    tol_comm_quant + sumecUnitService.queryDicUnitByUnitId(comm_unit).getUnitName());
                            map.put(" ", r_date);
                        }
                        // Map<String, String> map2 = new LinkedHashMap<>();
                        // if (sendAmt == null || sendAmt.intValue() == 0) {
                        // map2.put("发货金额", "无");
                        // } else {
                        // map2.put("发货金额", NumberFormatUtils.getCurrency(sendAmt));
                        // }
                        if (sendQuant == null || sendQuant.intValue() == 0) {
                            temp4.put("已发货数量", "无");
                        } else {
                            temp4.put("已发货数量", NumberFormatUtils.getNumber(sendQuant));
                        }

                        temp4.put("发货期限 ", tExpBc.getSendTerm() == null ? "" : tExpBc.getSendTerm());
                        temp4.put("付款方式 ", tExpBc.getPayTerm() == null ? "" : tExpBc.getPayTerm());
                        temp4.put("交货地点 ", tExpBc.getDeliveryPlace());
                        String transResp = tExpBc.getTransResp();
                        String transRespNotes = "";
                        if (transResp != null && !"".equals(transResp)) {
                            TDicBasicInfo tmpInfo = basicInfoService.selectByNameAndType("TR_TRANS_RESP", transResp);
                            transRespNotes = tmpInfo.getStrNotes();
                        }
                        temp4.put("运输负责方 ", transRespNotes);
                        temp4.put("运输公司", tExpBc.getTransCorpName());
                        temp4.put("仓储单位 ", tExpBc.getWhName());
                        //
                        BigDecimal bcId = tExpBc.getBcId();
                        temp4.put("供应商在手情况", templateService.supplierInhand(bcId));
                        hiddenKvs.put("route", "ContractExecute");
                        hiddenKvs.put("id", tExpBc.getBcId().toString());
                        hiddenKvs.put("type", "T_EXP_BC");
                        temp4.put("hiddenKvs", hiddenKvs);
                        list.add(temp4);

                        if (PT.equals(bizMode)) { // 纯自营关联的销售合同不显示，所以跳出循环
                            break;
                        }
                        ////
                        if ((true)) { // flagHk
                            /// huokuan
                            List<TTrPkgRel> sOrders = pkgRelDao.selectSOrderByPkgIdAndType(tobId, "S_ORDER");
                            if (CollectionUtils.isNotEmpty(sOrders) && sOrders.size() >= 1) {
                                for (TTrPkgRel tTrPkgRel : sOrders) {
                                    Map<String, Object> temp44 = new LinkedHashMap<>();
                                    Map<String, String> hiddenKvs2 = new HashMap<String, String>();
                                    String scId = tTrPkgRel.getTobId();
                                    TExpSc expSc = expScService.selectByPrimaryKey(new BigDecimal(scId));
                                    String tmpBizTypeSc = "";
                                    String bizModeSc = expSc.getBizMode();
                                    if (StringUtils.isNotEmpty(bizModeSc)) {
                                        TDicBasicInfo basicInfo = basicInfoService
                                                .selectByNameAndType("TR_BIZ_MODE_SALES", bizModeSc);
                                        if (basicInfo != null) {
                                            tmpBizTypeSc = (basicInfo.getStrNotes());
                                        }
                                    }

                                    temp44.put("[销售]" + expSc.getcNo(), tmpBizTypeSc); // DictConstant.C_STATUS.get(expSc.getcStatus())
                                    temp44.put(expSc.getCstName(),
                                            expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(expSc.gettAmt())); // 合同金额

                                    // 合同标的
                                    temp44.putAll(getExpScCmdMap(expSc));
                                    BigDecimal bailTAmt = expSc.gettAmt().multiply(expSc.getBailRate())
                                            .multiply(new BigDecimal(0.01));
                                    temp44.put("保证金比例 ", expSc.getBailRate() + "%" + "(应付保证金"
                                            + NumberFormatUtils.getCurrency(bailTAmt) + ")");

                                    // temp44.put("已收货款",
                                    // pubPayApply.getCurrType() + " "
                                    // + NumberFormatUtils.getCurrency(
                                    // templateDao.selectCollAmt("S_ORDER", scId)) == null ? "0"
                                    // : templateDao.selectCollAmt("S_ORDER", scId));
                                    temp44.put("发货期限 ", expSc.getSendTerm() == null ? "" : expSc.getSendTerm());
                                    temp44.put("交货地点 ", expSc.getDeliveryPlace());
                                    // temp44.put("付款方式 ", expSc.getPayTerm() == null ? "" : expSc.getPayTerm());
                                    temp4.put("运输公司", expSc.getTransCorpName());
                                    temp4.put("仓储单位 ", tExpBc.getWhName());

                                    BigDecimal collAmtFeeAcc = BigDecimal.ZERO;
                                    BigDecimal collAmtHk = BigDecimal.ZERO;// salesTrack.getCollAmtHk();
                                    List<TPubIoBean> pubIos = tPubIoService.selectByScId(expSc.getScId());
                                    for (TPubIoBean pubIo : pubIos) {
                                        Map<String, Object> map = new LinkedHashMap<>();
                                        map.put("收款性质", pubIo.getFkName() == null ? "" : pubIo.getFkName());
                                        String fkName = pubIo.getFkName();
                                        if ("客户保证金".equals(fkName)) {
                                            collAmtFeeAcc = collAmtFeeAcc.add(pubIo.getOriAmt());
                                        } else if ("货款".equals(fkName)) {
                                            collAmtHk = collAmtHk.add(pubIo.getOriAmt());
                                        }
                                        // map.put("收款金额", pubIo.getOriCurrType()+"
                                        // "+NumberFormatUtils.getCurrency(pubIo.getOriAmt())); //
                                    }
                                    temp44.put("已收货款",
                                            expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtHk));
                                    temp44.put("已收保证金",
                                            expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtFeeAcc));

                                    BigDecimal sendAmt1 = BigDecimal.ZERO;// salesTrack.getSendAmt();
                                    BigDecimal sendQuant1 = BigDecimal.ZERO;// salesTrack.getSendQuant();
                                    List<TTrSoutBean> souts = trSoutService.selectByScId(expSc.getScId());
                                    for (TTrSoutBean sout : souts) {
                                        String soutType = sout.getSoutType();
                                        if ("TOSO_SALES".equals(soutType)) {
                                            // map.put("发货金额",sout.getCurrType()+"
                                            // "+NumberFormatUtils.getCurrency(sout.getSoAmt()));
                                            sendAmt1 = sendAmt1.add(sout.getSoAmt());
                                            sendQuant1 = sendQuant1.add(sout.getCommQuant());
                                        }
                                    }
                                    // 发货 send_amt
                                    if (sendAmt1 == null || sendAmt1.intValue() == 0) {
                                        temp44.put("已调拨金额", "无");
                                    } else {
                                        temp44.put("已调拨金额", NumberFormatUtils.getCurrency(sendAmt1));
                                    }
                                    // 数量 send_quant
                                    if (sendQuant1 == null || sendQuant1.intValue() == 0) {
                                        temp44.put("已调拨数量", "无");
                                    } else {
                                        temp44.put("已调拨数量", NumberFormatUtils.getNumber(sendQuant1));
                                    }

                                    BigDecimal jsAmt = BigDecimal.ZERO; // jie suan zong jin e
                                    BigDecimal jsQuant = BigDecimal.ZERO; // jie suan zong shu liang
                                    List<InvJsBean> jsInvs = invJsService.selectByScId(expSc.getScId());
                                    if (jsInvs != null) {
                                        for (InvJsBean jsInv : jsInvs) {
                                            jsAmt = jsAmt.add(jsInv.gettAmt());
                                            jsQuant = jsQuant.add(jsInv.getCommQuant());
                                        }
                                    }
                                    if (jsAmt == null || jsAmt.intValue() == 0) {
                                        temp44.put("已结算金额", "无");
                                    } else {
                                        temp44.put("已结算金额", NumberFormatUtils.getCurrency(jsAmt));
                                    }
                                    if (jsQuant == null || jsQuant.intValue() == 0) {
                                        temp44.put("已结算数量", "无");
                                    } else {
                                        temp44.put("已结算数量", jsQuant.toEngineeringString());
                                    }
                                    // temp44.put("合同备注", expSc.getNotes());
                                    String bizMode1 = expSc.getBizMode();
                                    BigDecimal scId1 = expSc.getScId();
                                    int llCount = templateService.selectLLCount(expSc.getScId(), CONTRACT_REL_TYPE_EXC,
                                            TOB_S_ORDER, TOB_S_ORDER);
                                    if (llCount > 0) { // 转卖
                                    } else if ("PT".equals(bizMode1) || "PR_P".equals(bizMode1)
                                            || "PR_S".equals(bizMode1)) { // 纯自营 // 代销 代采
                                        String cst_desc = templateService.customerInHand(scId1);
                                        temp44.put("客户在手情况", cst_desc);
                                    }

                                    hiddenKvs2.put("route", "ContractExecute");
                                    hiddenKvs2.put("id", expSc.getScId().toString());
                                    hiddenKvs2.put("type", "T_EXP_SC");
                                    temp44.put("hiddenKvs", hiddenKvs2);
                                    list.add(temp44);
                                }
                            }
                        }
                    } else if ("S_ORDER".equals(tobType)) {
                        // 根据tobId 去查询合同相关信息
                        TExpSc tExpSc = expScService.selectByPrimaryKey(new BigDecimal(tobId));
                        String tmpBizTypeSc = "";
                        String bizModeSc = tExpSc.getBizMode();
                        if (StringUtils.isNotEmpty(bizModeSc)) {
                            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES",
                                    bizModeSc);
                            if (basicInfo != null) {
                                tmpBizTypeSc = (basicInfo.getStrNotes());
                            }
                        }
                        temp4.put("[销售]" + payCollRel.getTobNo(), tmpBizTypeSc);
                        // temp4.put(tExpSc.getCstName(), "保证金比例 " + tExpSc.getBailRate() + "%");
                        temp4.put(tExpSc.getCstName(),
                                tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(tExpSc.gettAmt())); // 合同金额

                        temp4.putAll(getExpScCmdMap(tExpSc));

                        BigDecimal bailTAmt = tExpSc.gettAmt().multiply(tExpSc.getBailRate())
                                .multiply(new BigDecimal(0.01));
                        temp4.put("保证金比例 ",
                                tExpSc.getBailRate() + "%" + "(应付保证金" + NumberFormatUtils.getCurrency(bailTAmt) + ")");
                        // Long unit = tExpSc.getCommUnit();
                        // String unitName = "";
                        // if(unit != null){
                        // TDicUnitEntity unitEntity = sumecUnitService.queryDicUnitByUnitId(unit);
                        // if(unitEntity != null){
                        // unitName = unitEntity.getUnitName();
                        // }
                        // }
                        // temp4.put(NumberFormatUtils.getNumber(tExpSc.getpQuant()) + " " + unitName,
                        // tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(tExpSc.getpAmt()));
                        temp4.put("发货期限 ", tExpSc.getSendTerm() == null ? "" : tExpSc.getSendTerm());
                        temp4.put("交货地点 ", tExpSc.getDeliveryPlace());
                        temp4.put("运输公司", tExpSc.getTransCorpName());
                        temp4.put("仓储单位 ", tExpBc.getWhName());
                        // temp4.put("付款方式 ", tExpSc.getPayTerm() == null ? "" : tExpSc.getPayTerm());

                        BigDecimal collAmtFeeAcc = BigDecimal.ZERO;
                        BigDecimal collAmtHk = BigDecimal.ZERO;// salesTrack.getCollAmtHk();
                        List<TPubIoBean> pubIos = tPubIoService.selectByScId(tExpSc.getScId());
                        for (TPubIoBean pubIo : pubIos) {
                            Map<String, Object> map = new LinkedHashMap<>();
                            map.put("收款性质", pubIo.getFkName() == null ? "" : pubIo.getFkName());
                            String fkName = pubIo.getFkName();
                            if ("客户保证金".equals(fkName)) {
                                collAmtFeeAcc = collAmtFeeAcc.add(pubIo.getOriAmt());
                            } else if ("货款".equals(fkName)) {
                                collAmtHk = collAmtHk.add(pubIo.getOriAmt());
                            }
                            // map.put("收款金额", pubIo.getOriCurrType()+"
                            // "+NumberFormatUtils.getCurrency(pubIo.getOriAmt())); //
                        }
                        temp4.put("已收货款", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtHk));
                        temp4.put("已收保证金", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtFeeAcc));

                        BigDecimal sendAmt = BigDecimal.ZERO;// salesTrack.getSendAmt();
                        BigDecimal sendQuant = BigDecimal.ZERO;// salesTrack.getSendQuant();
                        List<TTrSoutBean> souts = trSoutService.selectByScId(tExpSc.getScId());
                        for (TTrSoutBean sout : souts) {
                            String soutType = sout.getSoutType();
                            if ("TOSO_SALES".equals(soutType)) {
                                // map.put("发货金额",sout.getCurrType()+"
                                // "+NumberFormatUtils.getCurrency(sout.getSoAmt()));
                                sendAmt = sendAmt.add(sout.getSoAmt());
                                sendQuant = sendQuant.add(sout.getCommQuant());
                            }
                        }
                        // 发货 send_amt
                        if (sendAmt == null || sendAmt.intValue() == 0) {
                            temp4.put("已调拨金额", "无");
                        } else {
                            temp4.put("已调拨金额", NumberFormatUtils.getCurrency(sendAmt));
                        }
                        // 数量 send_quant
                        if (sendQuant == null || sendQuant.intValue() == 0) {
                            temp4.put("已调拨数量", "无");
                        } else {
                            temp4.put("已调拨数量", NumberFormatUtils.getNumber(sendQuant));
                        }

                        BigDecimal jsAmt = BigDecimal.ZERO; // jie suan zong jin e
                        BigDecimal jsQuant = BigDecimal.ZERO; // jie suan zong shu liang
                        List<InvJsBean> jsInvs = invJsService.selectByScId(tExpSc.getScId());
                        if (jsInvs != null) {
                            for (InvJsBean jsInv : jsInvs) {
                                jsAmt = jsAmt.add(jsInv.gettAmt());
                                jsQuant = jsQuant.add(jsInv.getCommQuant());
                            }
                        }
                        if (jsAmt == null || jsAmt.intValue() == 0) {
                            temp4.put("已结算金额", "无");
                        } else {
                            temp4.put("已结算金额", NumberFormatUtils.getCurrency(jsAmt));
                        }
                        if (jsQuant == null || jsQuant.intValue() == 0) {
                            temp4.put("已结算数量", "无");
                        } else {
                            temp4.put("已结算数量", jsQuant.toEngineeringString());
                        }
                        // temp4.put("合同备注", tExpSc.getNotes());
                        String bizMode = tExpSc.getBizMode();
                        BigDecimal scId1 = tExpSc.getScId();
                        int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC,
                                TOB_S_ORDER, TOB_S_ORDER);
                        if (llCount > 0) { // 转卖
                        } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode) || "PR_S".equals(bizMode)) {
                            // 纯自营 代销 代采
                            String cst_desc = templateService.customerInHand(scId1);
                            temp4.put("客户在手情况", cst_desc);
                        }

                        ///
                        Map<String, String> hiddenKvs = new HashMap<String, String>();
                        hiddenKvs.put("route", "ContractExecute");
                        hiddenKvs.put("id", tExpSc.getScId().toString());
                        hiddenKvs.put("type", "T_EXP_SC");
                        temp4.put("hiddenKvs", hiddenKvs);
                        list.add(temp4);
                    }
                } // end for
                listFour.setKvs(list);
                // template.put("info_temp_list_four#1", listFour);
            }

            //// 系统风险提示
            int count = sumecBusiGroupService.queryAccNoCount(pubPayApply.getIntId());
            String hints = "";
            if (count > 0) {
                if (StringUtils.isEmpty(hints)) {
                    hints = "★付款抬头与合同签约抬头不一致!";
                } else {
                    hints = hints + "\r\n★付款抬头与合同签约抬头不一致!";
                }
            }
            if ("货款".equals(pubPayApply.getPayKind())) {
                int count1 = sumecBusiGroupService.queryCstidCount(pubPayApply.getIntId());
                if (count1 > 0) {
                    if (StringUtils.isEmpty(hints)) {
                        hints = "★收款人与合同供方不一致!";
                    } else {
                        hints = hints + "\r\n★收款人与合同供方不一致!";
                    }
                }
            }
            BigDecimal count2 = pubPayApply.getPayAmt();
            if (count2.subtract(new BigDecimal(1000000)).doubleValue() > 0) {
                if (StringUtils.isEmpty(hints)) {
                    hints = "★需要财务领导签字!";
                } else {
                    hints = hints + "\r\n★需要财务领导签字!";
                }
            }
            //
            if (amtFee.subtract(BigDecimal.ZERO).doubleValue() > 0) {
                if (StringUtils.isEmpty(hints)) {
                    hints = "★本合同下本收款人已收金额!" + amtFee;
                } else {
                    hints = hints + "\r\n★本合同下本收款人已收金额!" + amtFee;
                }
            }

            // 货款已付款大于合同额要提示；
            if (amtHk.subtract(pAmt).doubleValue() > 0) {
                if (StringUtils.isEmpty(hints)) {
                    hints = "★已付货款大于合同额";
                } else {
                    hints = hints + "\r\n★已付货款大于合同额";
                }
            }
            if (StringUtils.isNotEmpty(hints)) {
                TemplateListFour info1 = new TemplateListFour();
                info1.setHeader("系统风险提示");
                List<Map<String, Object>> list = new LinkedList<>();
                Map<String, Object> temp3 = new LinkedHashMap<>();
                temp3.put(hints, "");
                list.add(temp3);
                info1.setKvs(list);
                template.put("info_temp_list_four#2", info1);
                ///
                // TemplateInfo info1 = new TemplateInfo();
                // info1.setHeader("系统风险提示");
                // temp3.put(hints,"");
                // info1.setKvs(temp3);
                // template.put("info_temp_two#1",info1);
            }

            //// 商务审批提示
            String remarkClerk = pubPayApply.getRemarkClerk();
            TemplateListFour info3 = new TemplateListFour();
            info3.setHeader("商务审批提示");
            List<Map<String, Object>> list = new LinkedList<>();
            Map<String, Object> temp3 = new LinkedHashMap<>();
            temp3.put(remarkClerk == null ? "无" : remarkClerk, "");
            list.add(temp3);
            info3.setKvs(list);
            template.put("info_temp_list_four#3", info3);
            // String hintsClerk = "";
            // if(StringUtils.isNotEmpty(remarkClerk)){
            // TemplateInfo info2 = new TemplateInfo();
            // info2.setHeader("商务审批提示");
            // Map<String,String> temp4 = new LinkedHashMap<>();
            // temp4.put(remarkClerk == null? "暂无内容":remarkClerk, "");
            // info2.setKvs(temp4);
            // template.put("info_temp_two#2",info2);
            // }

            template.put("info_temp_two", info); // 把基本信息放到系统风险提示和商务审批提示后面，此行从上面下移到这里
            //////
            if (listFour != null) {
                template.put("info_temp_list_four#1", listFour);
            }

        } else if (tableName.contains("T_IO_LC_OPEN")) { // 开证审批
            TIoLcOpen ioLcOpen = ioLcOpenService.queryLcDetail(new BigDecimal(strRefValue));
            template = new LinkedHashMap<>();
            if (ioLcOpen == null) {
                return ResponseEntity.badRequest().body(null);
            }
            // 开证金额
            BigDecimal lcAmt = ioLcOpen.getLcAmt();
            TemplateOne templateOne = new TemplateOne();
            // 金额
            String currType = ioLcOpen.getCurrType();
            templateOne.setLeft(currType + " " + NumberFormatUtils.getCurrency(lcAmt));
            // 状态
            templateOne.setRight(ioLcOpen.getConfirm());
            Map<String, Object> temp1 = new LinkedHashMap<>();
            temp1.put("开证方", ioLcOpen.getOpenerName());
            temp1.put("收证方", ioLcOpen.getBeneficiaryName());
            String issuingBankName = ioLcOpen.getIssuingBankName();
            temp1.put("开证行", issuingBankName);
            templateOne.setKvs(temp1);

            template.put("info_temp_one", templateOne);
            // 基本信息
            TemplateInfo info = new TemplateInfo();
            info.setHeader("基本信息");
            Map<String, String> temp2 = new LinkedHashMap<>();
            // 最迟装期
            temp2.put("最迟装期", DateUtils.format(ioLcOpen.getLastShipDate()));
            // 最迟效期
            temp2.put("最迟效期", DateUtils.format(ioLcOpen.getLastValidDate()));
            // 交单期限
            temp2.put("交单期限", ioLcOpen.getPresentPeriod() + "");
            // 日期方式
            temp2.put("日期方式", ioLcOpen.getDateTrm() + " " + ioLcOpen.getPayDays() + " 天");
            // 分批装运条款
            temp2.put("分批装运条款", ioLcOpen.getPartialShipment() == null ? "" : ioLcOpen.getPartialShipment());
            // 转运条款
            temp2.put("转运条款", ioLcOpen.getTransShipment() == null ? "" : ioLcOpen.getTransShipment());
            // 备注
            temp2.put("备注", ioLcOpen.getRemark() == null ? "" : ioLcOpen.getRemark());
            info.setKvs(temp2);
            template.put("info_temp_two", info);
            // 是否有修证 1 有修证
            String hasXz = ioLcOpen.getHasXz();
            if (String.valueOf(Constants.NUM_1).equals(hasXz)) {// 有修证
                List<TIoLcOpenBak> lcOpenBaks = ioLcOpenBakService.selectByLcId(new BigDecimal(strRefValue), "XZ");
                if (CollectionUtils.isNotEmpty(lcOpenBaks)) {
                    TemplateListFour listFour = new TemplateListFour();
                    listFour.setHeader("修证前信息");
                    List<Map<String, Object>> list = new LinkedList<>();
                    // 取最新的一条数据
                    TIoLcOpenBak lcOpenBak = lcOpenBaks.get(0);
                    Map<String, Object> temp3 = new LinkedHashMap<>();
                    // 币种、金额、银行
                    String issuingBankNameBak = lcOpenBak.getIssuingBankName();
                    if (StringUtils.isNotEmpty(issuingBankName) && issuingBankName.equals(issuingBankNameBak)) {
                        issuingBankNameBak = issuingBankNameBak + " *";
                    }
                    temp3.put("开证行名称", issuingBankNameBak);
                    String currTypeBak = lcOpenBak.getCurrType();
                    if (StringUtils.isNotEmpty(currType) && currType.equals(currTypeBak)) {
                        currTypeBak = currTypeBak + " *";
                    }
                    temp3.put("币种", currTypeBak);
                    BigDecimal lcAmtBak = lcOpenBak.getLcAmt();
                    if (lcAmt.equals(lcAmtBak)) {
                        temp3.put("开证金额", NumberFormatUtils.getCurrency(lcAmtBak));
                    } else {
                        temp3.put("开证金额", NumberFormatUtils.getCurrency(lcAmtBak) + " *");
                    }
                    // 最迟装期
                    temp3.put("最迟装期", DateUtils.format(lcOpenBak.getLastShipDate()));
                    // 最迟效期
                    temp3.put("最迟效期", DateUtils.format(lcOpenBak.getLastValidDate()));
                    // 交单期限
                    temp3.put("交单期限", lcOpenBak.getPresentPeriod() + "");
                    // 日期方式
                    temp3.put("日期方式", lcOpenBak.getDateTrm() + " " + lcOpenBak.getPayDays() + "天");
                    // 分批装运条款
                    temp3.put("分批装运条款", lcOpenBak.getPartialShipment());
                    // 转运条款
                    temp3.put("转运条款", lcOpenBak.getTransShipment());
                    // 备注
                    temp3.put("备注", lcOpenBak.getRemark());
                    list.add(temp3);
                    listFour.setKvs(list);
                    template.put("info_temp_list_four", listFour);
                }
            }

            // 商务审批提示
            String remarkClerk = ioLcOpen.getRemarkClerk();
            // if(StringUtils.isNotEmpty(remarkClerk)){
            TemplateInfo info2 = new TemplateInfo();
            info2.setHeader("商务审批提示");
            Map<String, String> temp4 = new LinkedHashMap<>();
            temp4.put(remarkClerk == null ? "暂无内容" : remarkClerk, "");
            info2.setKvs(temp4);
            template.put("info_temp_two#2", info2);
            // }
            ///////////
            // 关联合同
            List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_IO_LC_OPEN", strRefValue);
            if (CollectionUtils.isNotEmpty(rels)) {
                if (CollectionUtils.isNotEmpty(rels)) {
                    TemplateListFour listFour = new TemplateListFour();
                    listFour.setHeader("关联合同");
                    List<Map<String, Object>> list = new LinkedList<>();
                    for (int i = 0; i < rels.size(); i++) {
                        TIoPayCollRel payCollRel = rels.get(i);
                        Map<String, Object> temp41 = new LinkedHashMap<>();
                        // 合同号 状态
                        temp41.put(payCollRel.getTobNo(), "");

                        String tobId = payCollRel.getTobId();
                        String tobType = payCollRel.getTobType();
                        if ("P_ORDER".equals(tobType)) {
                            // 根据tobId 去查询合同相关信息
                            TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(tobId));
                            temp41.put(payCollRel.getTobNo(), DictConstant.C_STATUS.get(tExpBc.getcStatus()));
                            temp41.put(tExpBc.getFctName(), "");
                            Long unit = tExpBc.getCommUnit();
                            String unitName = "";
                            if (unit != null) {
                                TDicUnitEntity unitEntity = sumecUnitService.queryDicUnitByUnitId(unit);
                                if (unitEntity != null) {
                                    unitName = unitEntity.getUnitName();
                                }
                            }
                            temp41.put(NumberFormatUtils.getNumber(tExpBc.getpQuant()) + " " + unitName,
                                    tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
                            Map<String, String> hiddenKvs = new HashMap<String, String>();
                            hiddenKvs.put("route", "ContractExecute");
                            hiddenKvs.put("id", tExpBc.getBcId().toString());
                            hiddenKvs.put("type", "T_EXP_BC");
                            temp41.put("hiddenKvs", hiddenKvs);
                        }
                        list.add(temp41);
                    }
                    listFour.setKvs(list);
                    template.put("info_temp_list_four#1", listFour);
                }
            }
        } else if (tableName.contains("T_TR_SOUT")) {
            if (FM_TR_SALES_SOUT_INL.equals(fmCode)) { // 国内调拨审批 fm_code = FM_TR_SALES_SOUT_INL 出运审批 fm_code =
                // FM_TR_SALES_SOUT_OS
                // T_TR_SOUT && t_tr_sales_so_rel
                BigDecimal soId = new BigDecimal(strRefValue);
                TTrSoutBean trSoutBean = trSoutService.selectBySoId(soId);
                template = new LinkedHashMap<>();
                if (trSoutBean == null) {
                    return ResponseEntity.badRequest().body(null);
                }

                //// 抬头
//				BigDecimal soAmt = trSoutBean.getSoAmt();	// 申请金额
                TemplateOne templateOne = new TemplateOne();
                String commUnit = "";
                BigDecimal unit = trSoutBean.getCommUnit();
                if (unit != null) {
                    TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unit.longValue());
                    commUnit = entity.getUnitName();
                }
                String commPackUnit = "";
                BigDecimal unitPack = trSoutBean.getCommUnitPack();
                if (unitPack != null) {
                    TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unitPack.longValue());
                    commPackUnit = entity.getUnitName();
                }
                BigDecimal quantPack = trSoutBean.getCommQuantPack();
                List<Map<String, Object>> bcList = expBcService.selectBcListBySoId(soId);
                String commName = "";
//				for (int i = 0; i < bcList.size(); i++) {
//					TIoPayCollRel payCollRel = rels.get(i);
                commName = bcList.get(0).get("COMM_NAME").toString();
//				}
                // 金额
//				templateOne.setLeft(trSoutBean.getCurrType() + " " + NumberFormatUtils.getCurrency(soAmt));
                if (quantPack == null || quantPack.compareTo(BigDecimal.ZERO) == 0) {
                    templateOne.setLeft(
                            commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit);
                } else {
                    templateOne.setLeft(commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant())
                            + commUnit + "  " + quantPack + commPackUnit);
                }
                // 状态
                templateOne.setRight(trSoutBean.getConfirm());
                Map<String, Object> temp1 = new LinkedHashMap<>();
                temp1.put("销售方", trSoutBean.getSellerName());
                temp1.put("客户", trSoutBean.getCstName());
                templateOne.setKvs(temp1);
                template.put("info_temp_one", templateOne);

                //////////// 收支情况---
                TemplateInfo info2 = new TemplateInfo();
                info2.setHeader("收支情况");
                BigDecimal scId = trSoutService.selectScIdBySoId(soId);
                BigDecimal cstId = trSoutBean.getCstId();
                Map<String, String> temp2 = templateService.queryIncomeExpenditure(soId, cstId);
                info2.setKvs(temp2);
//				template.put("info_temp_two", info);	//为了把风险提示显示在上面，这句话移到风险提示下面

                //// 系统风险提示
                String hints = "";
                if ("1".equals(trSoutBean.getIsLastSend())) {
                    if ("PT".equals(trSoutBean.getBizMode())) {
                        hints += "★本次为最后一次调拨且为自营调拨\r\n";
                    } else {
                        hints += "★本次为最后一次调拨且为代理调拨\r\n";
                    }
                } else {
                    if ("PT".equals(trSoutBean.getBizMode())) {
                        hints += "★本次为自营调拨\r\n";
                    } else {
                        hints += "★本次为代理调拨\r\n";
                    }
                }
                String t_last = temp2.get("本次调拨后剩余");
                String t_last_cst = temp2.get("调拨客户余款");
                if (t_last.startsWith("-")) {
                    hints += "★本次调拨后该合同欠款 " + t_last.substring(1) + "\r\n";
                }
                if (t_last_cst.startsWith("-")) {
                    hints += "★本次调拨后该客户欠款 " + t_last_cst.substring(1) + "\r\n";
                }
//				if (Ld_Left_Amt.compareTo(BigDecimal.ZERO) < 0) {
//					hints += "★本次调拨后该合同欠款 "+formatString(Ld_Left_Amt.negate(), "#,##0.00") + "\r\n";
////					if (StringUtils.isEmpty(hints)) {
////						hints = "★本次调拨后该合同欠款 "+formatString(Ld_Left_Amt.negate(), "#,##0.00");
////					} else {
////						hints = hints + "\r\n★本次调拨后该合同欠款 "+formatString(Ld_Left_Amt.negate(), "#,##0.00");
////					}
//				}
//				if(Ld_Left_Cst.compareTo(BigDecimal.ZERO) < 0) {
//					hints += "★本次调拨后该客户欠款 "+formatString(Ld_Left_Cst.negate(), "#,##0.00") + "\r\n";
////					if (StringUtils.isEmpty(hints)) {
////						hints = "★本次调拨后该客户欠款 "+formatString(Ld_Left_Cst.negate(), "#,##0.00");
////					} else {
////						hints = hints + "\r\n★本次调拨后该客户欠款 "+formatString(Ld_Left_Cst.negate(), "#,##0.00");
////					}
//				}
                if (StringUtils.isNotEmpty(hints)) {
                    TemplateListFour info11 = new TemplateListFour();
                    info11.setHeader("系统风险提示");
                    List<Map<String, Object>> list = new LinkedList<>();
                    Map<String, Object> temp3 = new LinkedHashMap<>();
                    temp3.put(hints.substring(0, hints.length() - 2), ""); // 去\r\n
                    list.add(temp3);
                    info11.setKvs(list);
                    template.put("info_temp_list_four#2", info11);
                }

                //// 商务审批提示
                String remarkClerk = trSoutBean.getRemarkClerk();
                TemplateListFour info3 = new TemplateListFour();
                info3.setHeader("商务审批提示");
                List<Map<String, Object>> listR = new LinkedList<>();
                Map<String, Object> temp3 = new LinkedHashMap<>();
                temp3.put(remarkClerk == null ? "无" : remarkClerk, "");
                listR.add(temp3);
                info3.setKvs(listR);
                template.put("info_temp_list_four#3", info3);

                //// 基本信息
                TemplateInfo info1 = new TemplateInfo();
                info1.setHeader("基本信息");
                Map<String, String> temp11 = new LinkedHashMap<>();
                temp11.put("发货编号", trSoutBean.getSoNo());
                temp11.put("费用已结",
                        (trSoutBean.getHasFeeClear() == null || "0".equals(trSoutBean.getHasFeeClear())) ? "否" : "是");
                temp11.put("最后一次调拨",
                        (trSoutBean.getIsLastSend() == null || "0".equals(trSoutBean.getIsLastSend())) ? "否" : "是");
//				temp11.put("有免责", (trSoutBean.getHasDisclaimer() == null || "0".equals(trSoutBean.getHasDisclaimer()))? "否" :"是");
//				temp11.put("数量", NumberFormatUtils.getNumber(trSoutBean.getCommQuant()));
//				temp11.put("总件数", NumberFormatUtils.getNumber(trSoutBean.getCommQuantPack()));
//				String shipmentWay = trSoutBean.getShipmentWay();
//				if(!"".equals(shipmentWay)) {
//					TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_SHIPMENT_WAY", shipmentWay);
//					if (basicInfo != null) {
//						shipmentWay = basicInfo.getStrNotes();
//					}
//				}
//				temp11.put("装运方式", shipmentWay);
                temp11.put("调拨日期", sdf.format(trSoutBean.getSoDate()));
//				BigDecimal scId = trSoutService.selectScIdBySoId(soId);
                TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                temp11.put("销售合同号", tExpSc.getcNo()); // 2018.12.14新增销售合同号
                TemplateSummary one = templateService.getPkgTemplateOne(new TTrPkg(), tExpSc, null, "T_TR_PKG"); //
                temp11.put("业务员", one.getPerson()); // 2018.12.14新增事业部-SBU-业务员
                info1.setKvs(temp11);
                template.put("info_temp_two#1", info1);
//				template.put("info_temp_two#2", info2);//为了把风险提示显示在上面，这句话移到风险提示下面	2018.12.14 朱原要注释掉调拨审批的收支情况和关联合同
                // 关联合同
                BigDecimal amtFee = BigDecimal.ZERO; // 系统提示用 feiyongzhifu
                BigDecimal amtHk = BigDecimal.ZERO; // 系统提示用 huokuan
//				BigDecimal pAmt = BigDecimal.ZERO; // 合同额
//				List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_PUB_PAY_APPLY", strRefValue);
                TemplateListFour listFour = null;
                if (true) { // CollectionUtils.isNotEmpty(rels)
                    listFour = new TemplateListFour();
                    listFour.setHeader("关联合同");
                    List<Map<String, Object>> list = new LinkedList<>();
//					TExpBc tExpBc = new TExpBc();
                    // 根据tobId 去查询合同相关信息
                    Map<String, Object> temp4Sc = new LinkedHashMap<>();
//					TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    String tmpBizTypeSc = "";
                    String bizModeSc = tExpSc.getBizMode();
                    if (StringUtils.isNotEmpty(bizModeSc)) {
                        TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizModeSc);
                        if (basicInfo != null) {
                            tmpBizTypeSc = (basicInfo.getStrNotes());
                        }
                    }
                    temp4Sc.put("[销售]" + tExpSc.getcNo(), tmpBizTypeSc);
                    // temp4.put(tExpSc.getCstName(), "保证金比例 " + tExpSc.getBailRate() + "%");
                    temp4Sc.put(tExpSc.getCstName(),
                            tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(tExpSc.gettAmt())); // 合同金额

//					temp4Sc.putAll(getExpScCmdMap(tExpSc));
                    //// 定价方式
                    String pricingWay = tExpSc.getPricingWay();
                    String pricingWayNotes = "";
                    if (pricingWay != null && !"".equals(pricingWay)) {
                        TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PRICING_WAY", pricingWay);
                        pricingWayNotes = basicInfo.getStrNotes();
                    }
                    // 合同标的
                    String commUnitName1 = "";
                    BigDecimal pQuantAcc = BigDecimal.ZERO;
                    BigDecimal objPrice = BigDecimal.ZERO;
                    String pName = "";
                    BigDecimal cmdAmt = BigDecimal.ZERO;
                    List<TExpScCmd> expScCmdList = expScCmdService.selectByScId(tExpSc.getScId());
                    if (CollectionUtils.isNotEmpty(expScCmdList)) {
                        for (int i1 = 0; i1 < expScCmdList.size(); i1++) {
                            TExpScCmd expScCmd = expScCmdList.get(i1);
                            if (tExpSc.getCommUnit() != null) {
                                TDicUnitEntity dicUnit1 = sumecUnitService.queryDicUnitByUnitId(expScCmd.getCommUnit());
                                if (dicUnit1 != null) {
                                    commUnitName1 = dicUnit1.getUnitName();
                                }
                            }
                            objPrice = expScCmd.getObjPrice();
                            pName = expScCmd.getpName();
                            pQuantAcc = pQuantAcc.add(expScCmd.getpQuant());
                        }
                        temp4Sc.put("合同数量/标的",
                                NumberFormatUtils.getNumber(pQuantAcc) + "" + commUnitName1 + "/" + pName);
                        temp4Sc.put("销售单价（定价方式）",
                                NumberFormatUtils.getCurrency(objPrice) + "(" + pricingWayNotes + ")");
                        cmdAmt = pQuantAcc.multiply(objPrice);
                    }
                    temp4Sc.put(tExpSc.getCstName(), tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(cmdAmt)); // 合同金额

                    BigDecimal bailTAmt = tExpSc.gettAmt().multiply(tExpSc.getBailRate())
                            .multiply(new BigDecimal(0.01));
                    temp4Sc.put("保证金比例 ",
                            tExpSc.getBailRate() + "%" + "(应付保证金" + NumberFormatUtils.getCurrency(bailTAmt) + ")");
                    // Long unit = tExpSc.getCommUnit();
                    // String unitName = "";
                    // if(unit != null){
                    // TDicUnitEntity unitEntity = sumecUnitService.queryDicUnitByUnitId(unit);
                    // if(unitEntity != null){
                    // unitName = unitEntity.getUnitName();
                    // }
                    // }
                    // temp4.put(NumberFormatUtils.getNumber(tExpSc.getpQuant()) + " " + unitName,
                    // tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(tExpSc.getpAmt()));
                    temp4Sc.put("发货期限 ", tExpSc.getSendTerm() == null ? "" : tExpSc.getSendTerm());
                    temp4Sc.put("交货地点 ", tExpSc.getDeliveryPlace());
                    temp4Sc.put("运输公司", tExpSc.getTransCorpName());
//					temp4.put("仓储单位 ", tExpBc.getWhName());
                    // temp4.put("付款方式 ", tExpSc.getPayTerm() == null ? "" : tExpSc.getPayTerm());

                    BigDecimal collAmtFeeAcc = BigDecimal.ZERO;
                    BigDecimal collAmtHk = BigDecimal.ZERO;// salesTrack.getCollAmtHk();
                    List<TPubIoBean> pubIos = tPubIoService.selectByScId(tExpSc.getScId());
                    for (TPubIoBean pubIo : pubIos) {
                        Map<String, Object> map = new LinkedHashMap<>();
                        map.put("收款性质", pubIo.getFkName() == null ? "" : pubIo.getFkName());
                        String fkName = pubIo.getFkName();
                        if ("客户保证金".equals(fkName)) {
                            collAmtFeeAcc = collAmtFeeAcc.add(pubIo.getOriAmt());
                        } else if ("货款".equals(fkName)) {
                            collAmtHk = collAmtHk.add(pubIo.getOriAmt());
                        }
                        // map.put("收款金额", pubIo.getOriCurrType()+"
                        // "+NumberFormatUtils.getCurrency(pubIo.getOriAmt())); //
                    }
                    temp4Sc.put("已收货款", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtHk));
                    temp4Sc.put("已收保证金", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtFeeAcc));

                    BigDecimal sendAmt = BigDecimal.ZERO;// salesTrack.getSendAmt();
                    BigDecimal sendQuant = BigDecimal.ZERO;// salesTrack.getSendQuant();
                    List<TTrSoutBean> souts = trSoutService.selectByScId(tExpSc.getScId());
                    for (TTrSoutBean sout : souts) {
                        String soutType = sout.getSoutType();
                        if ("TOSO_SALES".equals(soutType)) {
                            // map.put("发货金额",sout.getCurrType()+"
                            // "+NumberFormatUtils.getCurrency(sout.getSoAmt()));
                            sendAmt = sendAmt.add(sout.getSoAmt());
                            sendQuant = sendQuant.add(sout.getCommQuant());
                        }
                    }
                    // 发货 send_amt
                    if (sendAmt == null || sendAmt.intValue() == 0) {
                        temp4Sc.put("已调拨金额", "无");
                    } else {
                        temp4Sc.put("已调拨金额", NumberFormatUtils.getCurrency(sendAmt));
                    }
                    // 数量 send_quant
                    if (sendQuant == null || sendQuant.intValue() == 0) {
                        temp4Sc.put("已调拨数量", "无");
                    } else {
                        temp4Sc.put("已调拨数量", NumberFormatUtils.getNumber(sendQuant));
                    }

                    BigDecimal jsAmt = BigDecimal.ZERO; // 结算总金额
                    BigDecimal jsQuant = BigDecimal.ZERO; // 结算总数量
                    List<InvJsBean> jsInvs = invJsService.selectByScId(tExpSc.getScId());
                    if (jsInvs != null) {
                        for (InvJsBean jsInv : jsInvs) {
                            jsAmt = jsAmt.add(jsInv.gettAmt());
                            jsQuant = jsQuant.add(jsInv.getCommQuant());
                        }
                    }
                    if (jsAmt == null || jsAmt.intValue() == 0) {
                        temp4Sc.put("已结算金额", "无");
                    } else {
                        temp4Sc.put("已结算金额", NumberFormatUtils.getCurrency(jsAmt));
                    }
                    if (jsQuant == null || jsQuant.intValue() == 0) {
                        temp4Sc.put("已结算数量", "无");
                    } else {
                        temp4Sc.put("已结算数量", jsQuant.toEngineeringString());
                    }
                    // temp4.put("合同备注", tExpSc.getNotes());
                    String bizMode = tExpSc.getBizMode();
                    BigDecimal scId1 = tExpSc.getScId();
                    int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                            TOB_S_ORDER);
                    if (llCount > 0) { // 转卖
                    } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode) || "PR_S".equals(bizMode)) {
                        // 纯自营 代销 代采
                        String cst_desc = templateService.customerInHand(scId1);
                        temp4Sc.put("客户在手情况", cst_desc);
                    }

                    ///
                    Map<String, String> hiddenKvs = new HashMap<String, String>();
                    hiddenKvs.put("route", "ContractExecute");
                    hiddenKvs.put("id", tExpSc.getScId().toString());
                    hiddenKvs.put("type", "T_EXP_SC");
                    temp4Sc.put("hiddenKvs", hiddenKvs);
                    list.add(temp4Sc);
                    //////// 采购 ////////
//					List<Map<String, Object>> bcList = expBcService.selectBcListBySoId(soId); //调到前面了
                    for (int i = 0; i < bcList.size(); i++) {
//						TIoPayCollRel payCollRel = rels.get(i);
                        Map<String, Object> map = bcList.get(i);
                        Map<String, Object> temp4 = new LinkedHashMap<>();
                        // 合同号 状态
                        // temp4.put(payCollRel.getTobNo(),"");
                        String tobId = map.get("TOB_ID").toString();
                        String tobType = map.get("TOB_TYPE").toString();
                        String tobNo = map.get("TOB_NO").toString();
                        BigDecimal onceAmtFyzf = templateDao.selectPayAmt4Hint(tobType, tobId, strRefValue, cstId, HK);
                        amtFee.add(onceAmtFyzf == null ? BigDecimal.ZERO : onceAmtFyzf);
                        BigDecimal onceAmtHk = templateDao.selectPayAmt4HintHk(tobType, tobId, HK);
                        amtHk.add(onceAmtHk == null ? BigDecimal.ZERO : onceAmtHk);
                        if ("P_ORDER".equals(tobType)) {
                            // 根据tobId 去查询合同相关信息
                            TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(tobId));
//							pAmt = tExpBc.getpAmt();
                            String tmpBizType = "";
                            String bizMode1 = tExpBc.getBizMode();
                            if (StringUtils.isNotEmpty(bizMode1)) {
                                TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR",
                                        bizMode1);
                                if (basicInfo != null) {
                                    tmpBizType = basicInfo.getStrNotes();
                                }
                            }
                            temp4.put("[采购]" + tobNo, tmpBizType); // DictConstant.C_STATUS.get(tExpBc.getcStatus())
                            temp4.put(tExpBc.getFctName(),
                                    tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));

                            // 合同标的
//							temp4.putAll(getExpBcCmdMap(tExpBc));
                            TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(tExpBc.getCommUnit());
                            String commUnitName = dicUnit != null ? dicUnit.getUnitName() : "";
                            List<TExpBcCmd> expBcCmdList = expBcCmdService.selectByBcId(tExpBc.getBcId());
                            BigDecimal cmdAmt1 = BigDecimal.ZERO;
                            BigDecimal objPrice1 = BigDecimal.ZERO;
                            if (CollectionUtils.isNotEmpty(expBcCmdList)) {
                                int expBcCmdListCount = expBcCmdList.size();
                                BigDecimal pQuantAcc1 = BigDecimal.ZERO;
                                String pricingWayNotes1 = "";
                                String pName1 = "";
                                for (int i1 = 0; i1 < expBcCmdListCount; i1++) {
                                    TExpBcCmd expBcCmd = expBcCmdList.get(i1);
                                    pName1 = expBcCmd.getpName();
                                    pQuantAcc1 = pQuantAcc1.add(expBcCmd.getpQuant());
                                    String pricingWay1 = tExpBc.getPricingWay();
                                    objPrice1 = expBcCmd.getObjPrice();
                                    if (pricingWay1 != null && !"".equals(pricingWay1)) {
                                        TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PRICING_WAY",
                                                pricingWay1);
                                        pricingWayNotes1 = basicInfo.getStrNotes();
                                    }
                                }
                                temp4.put("合同数量/标的",
                                        NumberFormatUtils.getNumber(pQuantAcc1) + " " + commUnitName + "/" + pName1);
                                temp4.put("采购单价(定价方式)",
                                        NumberFormatUtils.getCurrency(objPrice1) + "(" + pricingWayNotes1 + ")");
                                cmdAmt1 = pQuantAcc1.multiply(objPrice1);
                            }

                            // Long unit = tExpBc.getCommUnit();
                            // String unitName = "";
                            // if(unit != null){
                            // TDicUnitEntity unitEntity = sumecUnitService.queryDicUnitByUnitId(unit);
                            // if(unitEntity != null){
                            // unitName = unitEntity.getUnitName();
                            // }
                            // }
                            // temp4.put(NumberFormatUtils.getNumber(tExpBc.getpQuant()) + " " + unitName,
                            // tExpBc.getCurrType() + " " +
                            // NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
                            Map<String, String> hiddenKvs1 = new HashMap<String, String>();
//							if ((flagHk)) {
//								temp4.put("本次支付金额", pubPayApply.getCurrType() + " "
//										+ NumberFormatUtils.getCurrency(payCollRel.getRelAmt()));
//								temp4.put("已申请支付金额(含本次)", pubPayApply.getCurrType() + " "
//										+ NumberFormatUtils.getCurrency(templateDao.selectAmt(tobType, tobId)));
//							} else {
//								temp4.put(pubPayApply.getPayKind(), pubPayApply.getCurrType() + " "
//										+ NumberFormatUtils.getCurrency(payCollRel.getRelAmt()));
//							}

                            List<Map<String, Object>> wlList = templateDao.selectItemWl(TOB_P_ORDER, tobId);
                            // 发货 send_amt
                            BigDecimal sendAmt1 = BigDecimal.ZERO;// purchaseTrack.getSendAmt();
                            // 数量 send_quant
                            BigDecimal sendQuant1 = BigDecimal.ZERO;// purchaseTrack.getSendQuant();
                            for (int i1 = 0; i1 < wlList.size(); i1++) {
                                Map<String, Object> wlMap = wlList.get(i1);
                                Map<String, Object> map1 = new LinkedHashMap<>();
                                // String logi_doc_type = wlMap.get("LOGI_DOC_TYPE").toString();
                                // String logi_doc_no = (String) wlMap.getOrDefault("LOGI_DOC_NO", "");
                                BigDecimal invPrice = (BigDecimal) wlMap.getOrDefault("INV_PRICE", BigDecimal.ZERO);
                                String comm_name = wlMap.get("COMM_NAME").toString();
                                String r_date = wlMap.get("R_DATE").toString();
                                String tol_comm_quant = wlMap.get("TOL_COMM_QUANT").toString();
                                Long comm_unit = Long.valueOf(wlMap.get("COMM_UNIT").toString());
                                sendAmt1 = sendAmt1.add(invPrice.multiply(new BigDecimal(tol_comm_quant)));
                                sendQuant1 = sendQuant1.add(new BigDecimal(tol_comm_quant));
                                map1.put(comm_name, tol_comm_quant
                                        + sumecUnitService.queryDicUnitByUnitId(comm_unit).getUnitName());
                                map1.put(" ", r_date);
                            }
                            // Map<String, String> map2 = new LinkedHashMap<>();
                            // if (sendAmt == null || sendAmt.intValue() == 0) {
                            // map2.put("发货金额", "无");
                            // } else {
                            // map2.put("发货金额", NumberFormatUtils.getCurrency(sendAmt));
                            // }
                            if (sendQuant1 == null || sendQuant1.intValue() == 0) {
                                sendQuant1 = BigDecimal.ZERO;
                                temp4.put("已发货数量", "无");
                            } else {
                                temp4.put("已发货数量", NumberFormatUtils.getNumber(sendQuant1));
                            }
                            cmdAmt1 = sendQuant1.multiply(objPrice1);
                            temp4.put(tExpBc.getFctName(),
                                    tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(cmdAmt1));

                            // 交货方式 send_term
                            temp4.put("发货期限 ", tExpBc.getSendTerm() == null ? "" : tExpBc.getSendTerm());
                            // 付款方式 pay_term
                            temp4.put("付款方式 ", tExpBc.getPayTerm() == null ? "" : tExpBc.getPayTerm());
                            temp4.put("交货地点 ", tExpBc.getDeliveryPlace());
                            String transResp = tExpBc.getTransResp();
                            String transRespNotes = "";
                            if (transResp != null && !"".equals(transResp)) {
                                TDicBasicInfo tmpInfo = basicInfoService.selectByNameAndType("TR_TRANS_RESP",
                                        transResp);
                                transRespNotes = tmpInfo.getStrNotes();
                            }
                            temp4.put("运输负责方 ", transRespNotes);
                            temp4.put("运输公司", tExpBc.getTransCorpName());
                            temp4.put("仓储单位 ", tExpBc.getWhName());

                            //
                            BigDecimal bcId = tExpBc.getBcId();
                            String fct_desc = templateService.supplierInhand(bcId);
                            temp4.put("供应商在手情况", fct_desc);
                            hiddenKvs1.put("route", "ContractExecute");
                            hiddenKvs1.put("id", tExpBc.getBcId().toString());
                            hiddenKvs1.put("type", "T_EXP_BC");
                            temp4.put("hiddenKvs", hiddenKvs1);
                            list.add(temp4);
                            ////
                        } else if ("S_ORDER".equals(tobType)) {
                            // 应该没有这种情况吧
                        }
                    } // end for

                    listFour.setKvs(list);
                    // template.put("info_temp_list_four#1", listFour);
                }

                ////// 2018.12.14 注释掉调拨审批的收支情况和关联合同
//				if (listFour != null) {
//					template.put("info_temp_list_four#1", listFour);
//				}

            } // end of 国内调拨
        } else if (tableName.contains("T_PUB_EXC") && FM_IO_EXC.equals(fmCode)) { // 转款

            // T_PUB_EXC
            BigDecimal excId = new BigDecimal(strRefValue);
            TPubExc pubExc = pubExcService.selectByPrimaryKey(excId);
            template = new LinkedHashMap<>();
            if (pubExc == null) {
                return ResponseEntity.badRequest().body(null);
            }
            // 申请金额
//			BigDecimal soAmt = trSoutBean.getSoAmt();
            TemplateOne templateOne = new TemplateOne();
            // 金额
            templateOne.setLeft(pubExc.getCurrType() + " " + NumberFormatUtils.getCurrency(pubExc.getExcAmt()));
            // 状态
            templateOne.setRight(pubExc.getConfirm());
            Map<String, Object> temp1 = new LinkedHashMap<>();
            temp1.put("转出客商", pubExc.getCstNameFrom());
            temp1.put("转入客商", pubExc.getCstNameTo());
            templateOne.setKvs(temp1);
            template.put("info_temp_one", templateOne);

            // 基本信息
            TemplateInfo info1 = new TemplateInfo();
            info1.setHeader("基本信息");
            Map<String, String> temp11 = new LinkedHashMap<>();
            temp11.put("转款类型", "保证金转货款"); // pubExc.getExcType()
            temp11.put("转款日期", sdf.format(pubExc.getExcDate()));
            temp11.put("转出采购合同", pubExc.getcNoFrom());
            temp11.put("转入采购合同", pubExc.getcNoTo());
//			temp11.put("转出类型", pubExc.getExcFromType());
//			temp11.put("转入类型", pubExc.getExcToType());
            temp11.put("备注", pubExc.getNotes());
            info1.setKvs(temp11);
            template.put("info_temp_two#1", info1);
//			///审批提示
//			TemplateInfo info2 = new TemplateInfo();
//			info1.setHeader("审批提示");
//			Map<String, String> temp22 = new LinkedHashMap<>();
//			temp11.put(pubExc.getNotes(), "");
//			info2.setKvs(temp22);
//			template.put("info_temp_two#2", info2);
        } else if (tableName.contains("T_EXP_BC")) {
            TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(strRefValue));
            if (tExpBc == null) {
                return ResponseEntity.badRequest().body(null);
            }
            //// 头部
            TemplateOne templateOne = new TemplateOne();
            // 金额
//			templateOne.setLeft(tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
            String bizMode = tExpBc.getBizMode();
            if ("PR_S".equals(bizMode)) {
                templateOne.setLeft("代理合同立项审批");
            } else if ("PR_P".equals(bizMode)) {
                templateOne.setLeft("代销合同立项审批");
            } else if ("PT".equals(bizMode)) {
                templateOne.setLeft("自营采购合同立项审批");
            } else {
                templateOne.setLeft("");
            }
            // 状态
//			templateOne.setRight(tExpBc.getConfirm());
            templateOne.setRight("");

            Map<String, Object> kvs = new LinkedHashMap<>();
//			TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
//			if (basicInfo != null) {
//				kvs.put("业务模式", tExpBc.getBizMode());
//			}
            // 采购方 签约单位
            TFdAcc fdAcc = fdAccService.selectByAccNo(tExpBc.getAccNo());
            if (fdAcc != null) {
                kvs.put("签约单位", fdAcc.getAccShortName());
            }
            kvs.put("业务员", templateService.getExpBcDepartMent(tExpBc));
            kvs.put("签约日期", DateUtils.format(tExpBc.getSignDate()));
            kvs.put("采购合同号", tExpBc.getcNo());
            kvs.put("供应商", tExpBc.getFctName());
            kvs.put("制造商", tExpBc.getManufacName());
//			kvs.put("销售客户", tExpBc.getSellerProp());
            // 数量 p_quant comm_unit
//			Long commUnit = tExpBc.getCommUnit();
//			String commUnitName = "";
//			if (tExpBc.getCommUnit() != null) {
//				TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(commUnit);
//				if (dicUnit != null) {
//					commUnitName = dicUnit.getUnitName();
//				}
//			}
//			kvs.put("数量", NumberFormatUtils.getNumber(tExpBc.getpQuant()) + " " + commUnitName);
            templateOne.setKvs(kvs);
            template = new LinkedHashMap<>();
            template.put("info_temp_one", templateOne);

            //// 商务审批提示
            String remarkClerk = tExpBc.getRemarkClerk();
            TemplateListFour info3 = new TemplateListFour();
            info3.setHeader("商务审批提示");
            List<Map<String, Object>> listR = new LinkedList<>();
            Map<String, Object> temp3 = new LinkedHashMap<>();
            temp3.put(remarkClerk == null ? "无" : remarkClerk, "");
            listR.add(temp3);
            info3.setKvs(listR);
            template.put("info_temp_list_four#3", info3);
            ////
            template.putAll(getExpBcTemplateTwo2(tExpBc));

            //// 2、合同审批要素（代理）-采购、销售只带一份信息
            TemplateListFour listFour = null;
            if ("PR_S".equals(bizMode)) { // 代理 代采
                List<TTrContractRel> tmp = trContractRelService.selectByTobIdB(TOB_P_ORDER, tExpBc.getBcId());
                if (tmp != null && tmp.size() > 0) {
                    BigDecimal scId = tmp.get(0).getTobIdA();
                    listFour = new TemplateListFour();
                    listFour.setHeader("关联合同");
                    List<Map<String, Object>> list = new LinkedList<>();
                    TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    String tmpBizTypeSc = "";
                    String bizModeSc = tExpSc.getBizMode();
                    if (StringUtils.isNotEmpty(bizModeSc)) {
                        TDicBasicInfo basicInfo2 = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizModeSc);
                        if (basicInfo2 != null) {
                            tmpBizTypeSc = (basicInfo2.getStrNotes());
                        }
                    }
                    Map<String, Object> temp4 = new LinkedHashMap<>();
                    temp4.put("[销售]" + tExpSc.getcNo(), tmpBizTypeSc);
                    // temp4.put(tExpSc.getCstName(), "保证金比例 " + tExpSc.getBailRate() + "%");
                    temp4.put(tExpSc.getCstName(),
                            tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(tExpSc.gettAmt())); // 合同金额

                    // 合同标的
                    temp4.putAll(getExpScCmdMap(tExpSc));

                    BigDecimal bailTAmt = tExpSc.gettAmt().multiply(tExpSc.getBailRate())
                            .multiply(new BigDecimal(0.01));
                    temp4.put("保证金比例 ",
                            tExpSc.getBailRate() + "%" + "(应付保证金" + NumberFormatUtils.getCurrency(bailTAmt) + ")");
                    //
                    String conPeriodSType = tExpSc.getConPeriodSType();
//					String tmpconPeriodSType = "";
//					if (StringUtils.isNotEmpty(conPeriodSType)) {
//						TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_CON_PERIOD_S_TYPE", conPeriodSType);
//						if (basicInfo != null) {
//							tmpconPeriodSType = basicInfo.getStrNotes();
//						}
//					}
//					kvs.put("合同周期", tmpconPeriodSType + " " + tExpSc.getConPeriod() == null? "":tExpSc.getConPeriod() + "天");
                    kvs.put("合同周期", map0.getOrDefault(conPeriodSType, "") + " " + tExpSc.getConPeriod() == null ? "" : tExpSc.getConPeriod() + "天");

                    temp4.put("发货期限 ", tExpSc.getSendTerm() == null ? "" : tExpSc.getSendTerm());
                    temp4.put("交货地点 ", tExpSc.getDeliveryPlace());
                    temp4.put("运输公司", tExpSc.getTransCorpName());
                    temp4.put("仓储单位 ", tExpBc.getWhName());
                    // temp4.put("付款方式 ", tExpSc.getPayTerm() == null ? "" : tExpSc.getPayTerm());

                    BigDecimal collAmtFeeAcc = BigDecimal.ZERO;
                    BigDecimal collAmtHk = BigDecimal.ZERO;// salesTrack.getCollAmtHk();
                    List<TPubIoBean> pubIos = tPubIoService.selectByScId(tExpSc.getScId());
                    for (TPubIoBean pubIo : pubIos) {
                        Map<String, Object> map = new LinkedHashMap<>();
                        map.put("收款性质", pubIo.getFkName() == null ? "" : pubIo.getFkName());
                        String fkName = pubIo.getFkName();
                        if ("客户保证金".equals(fkName)) {
                            collAmtFeeAcc = collAmtFeeAcc.add(pubIo.getOriAmt());
                        } else if ("货款".equals(fkName)) {
                            collAmtHk = collAmtHk.add(pubIo.getOriAmt());
                        }
                        // map.put("收款金额", pubIo.getOriCurrType()+"
                        // "+NumberFormatUtils.getCurrency(pubIo.getOriAmt())); //
                    }
                    temp4.put("已收货款", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtHk));
                    temp4.put("已收保证金", tExpSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(collAmtFeeAcc));

					/*
					BigDecimal sendAmt = BigDecimal.ZERO;// salesTrack.getSendAmt();
					BigDecimal sendQuant = BigDecimal.ZERO;// salesTrack.getSendQuant();
					List<TTrSoutBean> souts = trSoutService.selectByScId(tExpSc.getScId());
					for (TTrSoutBean sout : souts) {
						String soutType = sout.getSoutType();
						if ("TOSO_SALES".equals(soutType)) {
							// map.put("发货金额",sout.getCurrType()+"
							// "+NumberFormatUtils.getCurrency(sout.getSoAmt()));
							sendAmt = sendAmt.add(sout.getSoAmt());
							sendQuant = sendQuant.add(sout.getCommQuant());
						}
					}
					// 发货 send_amt
					if (sendAmt == null || sendAmt.intValue() == 0) {
						temp4.put("已调拨金额", "无");
					} else {
						temp4.put("已调拨金额", NumberFormatUtils.getCurrency(sendAmt));
					}
					// 数量 send_quant
					if (sendQuant == null || sendQuant.intValue() == 0) {
						temp4.put("已调拨数量", "无");
					} else {
						temp4.put("已调拨数量", NumberFormatUtils.getNumber(sendQuant));
					}

					BigDecimal jsAmt = BigDecimal.ZERO; // jie suan zong jin e
					BigDecimal jsQuant = BigDecimal.ZERO; // jie suan zong shu liang
					List<InvJsBean> jsInvs = invJsService.selectByScId(tExpSc.getScId());
					if (jsInvs != null) {
						for (InvJsBean jsInv : jsInvs) {
							jsAmt = jsAmt.add(jsInv.gettAmt());
							jsQuant = jsQuant.add(jsInv.getCommQuant());
						}
					}
					if (jsAmt == null || jsAmt.intValue() == 0) {
						temp4.put("已结算金额", "无");
					} else {
						temp4.put("已结算金额", NumberFormatUtils.getCurrency(jsAmt));
					}
					if (jsQuant == null || jsQuant.intValue() == 0) {
						temp4.put("已结算数量", "无");
					} else {
						temp4.put("已结算数量", jsQuant.toEngineeringString());
					}
					*/

                    // temp4.put("合同备注", tExpSc.getNotes());
                    if ("PT".equals(bizMode) || "PR_P".equals(bizMode) || "PR_S".equals(bizMode)) {
                        // 纯自营 代销 代采
                        String cst_desc = templateService.customerInHand(scId);
                        temp4.put("客户在手情况", cst_desc);
                    }
                    // 合同执行
                    Map<String, String> hiddenKvs = new HashMap<String, String>();
                    hiddenKvs.put("route", "ContractExecute");
                    hiddenKvs.put("id", tExpSc.getScId().toString());
                    hiddenKvs.put("type", "T_EXP_SC");
                    temp4.put("hiddenKvs", hiddenKvs);
                    list.add(temp4);

                    listFour.setKvs(list);
                    template.put("info_temp_list_four#1", listFour);
                }
            }
            //// 2、合同审批要素（代理）-采购、销售只带一份信息
//			template = getExpBcTemplateTwo(tExpBc);
        } else if (tableName.contains("T_EXP_SC")) {
            TExpSc tExpSc = expScService.selectByPrimaryKey(new BigDecimal(strRefValue));
            if (tExpSc == null) {
                return ResponseEntity.badRequest().body(null);
            }
            //// 头部
            TemplateOne templateOne = new TemplateOne();
            // 金额
//			templateOne.setLeft(tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
            String bizMode = tExpSc.getBizMode();
            int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                    TOB_S_ORDER);
            if (llCount > 0) { // 转卖
                templateOne.setLeft("转卖合同立项审批");
            } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode)) { // 自营
                templateOne.setLeft("自营销售合同立项审批");
            } else {
                templateOne.setLeft("");
            }
            templateOne.setRight("");

            Map<String, Object> kvs = new LinkedHashMap<>();
//			TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizMode);
//			if (basicInfo != null) {
//				kvs.put("业务模式", tExpSc.getBizMode());
//			}
            // 采购方 签约单位
            TFdAcc fdAcc = fdAccService.selectByAccNo(tExpSc.getAccNo());
            if (fdAcc != null) {
                kvs.put("签约单位", fdAcc.getAccShortName());
            }
            kvs.put("业务员", templateService.getExpScDepartMent(tExpSc));
            kvs.put("签约日期", DateUtils.format(tExpSc.getSignDate()));
            kvs.put("销售合同号", tExpSc.getcNo());
            kvs.put("销售客户", tExpSc.getCstName());
            templateOne.setKvs(kvs);
            template = new LinkedHashMap<>();
            template.put("info_temp_one", templateOne);

            //// 商务审批提示
            String remarkClerk = tExpSc.getRemarkClerk();
            TemplateListFour info3 = new TemplateListFour();
            info3.setHeader("商务审批提示");
            List<Map<String, Object>> listR = new LinkedList<>();
            Map<String, Object> temp3 = new LinkedHashMap<>();
            temp3.put(remarkClerk == null ? "无" : remarkClerk, "");
            listR.add(temp3);
            info3.setKvs(listR);
            template.put("info_temp_list_four#3", info3);

            template.putAll(getExpScTemplateTwo2(tExpSc));
        }
        // 审批流程
        List<TSumecFlowDetails> flowDetails = sumecFlowDetailsService.selectByFmId(longFmId, strRefValue);
        if (CollectionUtils.isNotEmpty(flowDetails)) {
            TemplateFlow templateFlow = new TemplateFlow();
            templateFlow.setHeader("审批流程");
            List<TemplateFlowDetail> flows = new ArrayList<>();
            for (int i = 0; i < flowDetails.size(); i++) {
                TSumecFlowDetails detail = flowDetails.get(i);
                TemplateFlowDetail flow = new TemplateFlowDetail();
                Long userId = detail.getUserId();
                flow.setId(userId.toString());
                flow.setColCount(4);
                TSumecUser sumecUser = sumecUserService.selectByUserId(userId);
                String dealFlag = detail.getDealFlag();
                String flag = detail.getFlag();
                // dealFlag: 0待处理,1处理,D未到处理 ------主动撤回现在是查不到,退回的flag是0
                String dealName = "未到处理";
                switch (dealFlag) {
                    case "0":
                        dealName = "待处理";
                        break;
                    case "1":
                        dealName = "0".equals(flag) ? "退回" : (i == 0 ? "提交" : "通过");
                        break;
                    // case "2":
                    // dealName = "退回";
                    // break;
                    default:
                        break;
                }
                String notion = detail.getNotion();
                if (sumecUser != null) {
                    flow.setContent(sumecUser.getUserName(), dealName, notion,
                            DateUtils.format(detail.getDealTime(), DateUtils.F_YYYY_MM_dd));
                } else {
                    flow.setContent(dealName, notion, DateUtils.format(detail.getDealTime(), DateUtils.F_YYYY_MM_dd));
                }
                flows.add(flow);
            }
            templateFlow.setFlows(flows);
            template.put("info_temp_flow", templateFlow);
        }
        template.put("status", sumecFlowDetails.getDealFlag()); // Undo已撤回 0待处理 1已处理
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    /**
     * <p>
     * 方法描述：此方法根据userId查询该用户待审批过的审批列表
     * </p>
     *
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     * @author SunTow_J <br />
     * @date： 2018年2月28日 下午3:47:06<br/>
     */
    @ApiOperation(value = "根据userId查询该用户待审批的审批列表", notes = "v1-根据userId查询该用户待审批的审批列表")
    @GetMapping(value = "/template/flow/v1/{userId}/pending/list")
    public ResponseEntity<Map<String, List<TemplateTwo>>> queryPendingByUserId(@PathVariable("userId") Long userId,
                                                                               @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                                               @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        Map<String, List<TemplateTwo>> template = null;
        if (userId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        PageHelper.startPage(pageNum, pageSize);
        // 目前只查询了信用证开证\支付申请
        List<TSumecFlowDetailsModule> sumecFlowDetailsModuleList = iSumecFlowDetailsModuleService
                .selectPendingByUserId(userId);
        if (CollectionUtils.isNotEmpty(sumecFlowDetailsModuleList)) {
            template = new LinkedHashMap<>();
            List<TemplateTwo> list = new ArrayList<>();
            int count = sumecFlowDetailsModuleList.size();
            for (int i = 0; i < count; i++) {
                TSumecFlowDetailsModule detailModule = sumecFlowDetailsModuleList.get(i);
                TemplateTwo templateTwo = new TemplateTwo();
                templateTwo.setHeader(detailModule.getFmViewName());
                templateTwo.setStatus("待审批");
                Map<String, Object> kvs = new LinkedHashMap<>();

                String content = detailModule.getFmName(); // detailModule.getFmName()
                String payDate = "";
                Long intId = detailModule.getIntId();
                TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsService.selectByPrimaryKey(intId);
                Long longFmId = sumecFlowDetails.getFmId();
                String strRefValue = sumecFlowDetails.getRefValue();
                TSumecFlowModule flowModule = sumecFlowModuleService.selectByPrimaryKey(longFmId);
                String tableName = flowModule.getTableName();
                if (tableName.contains("T_PUB_PAY_APPLY")) {// 支付申请
                    TPubPayApply pubPayApply = pubPayApplyService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_PUB_PAY_APPLY", strRefValue);
                    TIoPayCollRel payCollRel = rels.get(0); // 暂时先取第0个
                    templateTwo.setHeader(payCollRel.getTobNo() + " 支付申请");
                    BigDecimal payAmt = pubPayApply.getPayAmt();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    content = "支付" + pubPayApply.getCstName() + pubPayApply.getPayKind();
                    payDate = sdf.format(pubPayApply.getPayDateApply());
                    kvs.put("金额", pubPayApply.getCurrType() + " " + NumberFormatUtils.getCurrency(payAmt));
                    kvs.put("内容", content);
                    kvs.put("申请支付日期", payDate);
                } else if (tableName.contains("T_IO_LC_OPEN")) {// 开证审批
                    //
                } else if (tableName.contains("T_TR_SOUT")) {// 调拨
//					BigDecimal scId = trSoutService.selectScIdBySoId(new BigDecimal(strRefValue));
                    BigDecimal scId = trSoutService.selectScIdBySoId(new BigDecimal(strRefValue));
                    TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    templateTwo.setHeader(tExpSc.getcNo() + " 调拨审批");
                    BigDecimal soId = new BigDecimal(strRefValue);
                    TTrSoutBean trSoutBean = trSoutService.selectBySoId(soId);
                    BigDecimal cstId = trSoutBean.getCstId();
                    String commUnit = "";
                    BigDecimal unit = trSoutBean.getCommUnit();
                    if (unit != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unit.longValue());
                        commUnit = entity.getUnitName();
                    }
                    String commPackUnit = "";
                    BigDecimal unitPack = trSoutBean.getCommUnitPack();
                    if (unitPack != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unitPack.longValue());
                        commPackUnit = entity.getUnitName();
                    }
                    BigDecimal quantPack = trSoutBean.getCommQuantPack();
                    List<Map<String, Object>> bcList = expBcService.selectBcListBySoId(soId);
                    String commName = "";
//					for (int i = 0; i < bcList.size(); i++) {
//						TIoPayCollRel payCollRel = rels.get(i);
                    commName = bcList.get(0).get("COMM_NAME").toString();
//					}
                    // 金额
//					templateOne.setLeft(trSoutBean.getCurrType() + " " + NumberFormatUtils.getCurrency(soAmt));
                    if (quantPack == null || quantPack.compareTo(BigDecimal.ZERO) == 0) {
                        kvs.put("数量",
                                commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit);
                    } else {
                        kvs.put("数量", commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit
                                + "  " + quantPack + commPackUnit);
                    }
                    kvs.put("客户", trSoutBean.getCstName());
                    Map<String, String> inExMap = templateService.queryIncomeExpenditure(soId, cstId);
//					kvs.put("本次调拨后剩余", inExMap.get("本次调拨后剩余"));
//					kvs.put("调拨客户余款", inExMap.get("调拨客户余款"));
                    String t_last = inExMap.get("本次调拨后剩余");
//					String t_last_cst = inExMap.get("调拨客户余款");
                    if (t_last.startsWith("-")) {
                        kvs.put("本次调拨后", "欠款" + t_last.substring(1));
                    } else {
                        kvs.put("本次调拨后", "不欠款");
                    }
                } else if (tableName.contains("T_PUB_EXC")) {//
                    //TODO
                } else if (tableName.contains("T_EXP_BC")) {
                    templateTwo.setHeader("合同立项审批");
                    TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpBc != null) {
                        String bizMode = tExpBc.getBizMode();
                        if ("PR_S".equals(bizMode)) {
                            templateTwo.setHeader("代理合同立项审批");
                        } else if ("PR_P".equals(bizMode)) {
                            templateTwo.setHeader("代销合同立项审批");
                        } else if ("PT".equals(bizMode)) {
                            templateTwo.setHeader("自营采购合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpBc.getConfirm());
                        kvs.put("采购合同号", tExpBc.getcNo());
                    }
                } else if (tableName.contains("T_EXP_SC")) {
                    templateTwo.setHeader("销售合同立项审批");
                    TExpSc tExpSc = expScService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpSc != null) {
                        String bizMode = tExpSc.getBizMode();
                        int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                                TOB_S_ORDER);
                        if (llCount > 0) { // 转卖
                            templateTwo.setHeader("转卖合同立项审批");
                        } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode)) { // 自营
                            templateTwo.setHeader("自营销售合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpSc.getConfirm());
                        kvs.put("销售合同号", tExpSc.getcNo());
                    }
                }

                TSumecFlowDetails temp = new TSumecFlowDetails();
                temp.setFmSeqId(detailModule.getFmSeqId());
                short intNextDtlStep = (short) 1;
                temp.setDtlStep(intNextDtlStep);
                TSumecFlowDetails nextValid = sumecFlowDetailsService.selectNextValidStep(temp);
                if (nextValid != null) {
                    Long postUserId = nextValid.getUserId();
                    TSumecUser sumecUser = sumecUserService.selectByUserId(postUserId);
                    if (sumecUser != null) {
                        kvs.put("发起人", sumecUser.getUserName());
                    }
                }
//				kvs.put("提交时间", DateUtils.format(detailModule.getPostTime(), DateUtils.F_YYYY_MM_dd_HH_mm_ss));
                templateTwo.setKvs(kvs);

                Map<String, String> hiddenKvs = new HashMap<>();
                hiddenKvs.put("id", detailModule.getIntId().toString());
                hiddenKvs.put("route", "ApprovalExamine");
                templateTwo.setHiddenKvs(hiddenKvs);
                list.add(templateTwo);
            }
            template.put("info_temp_two", list);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    /**
     * <p>
     * 方法描述：此方法根据userId查询该用户已经审批过的审批列表
     * </p>
     *
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     * @author SunTow_J <br />
     * @date： 2018年2月28日 下午3:47:06<br/>
     */
    @ApiOperation(value = "根据userId查询该用户已经审批过的审批列表", notes = "v1-根据userId查询该用户已经审批过的审批列表")
    @GetMapping(value = "/template/flow/v1/{userId}/check/list")
    public ResponseEntity<Map<String, List<TemplateTwo>>> queryCheckedByUserId(@PathVariable("userId") Long userId,
                                                                               @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                                               @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        Map<String, List<TemplateTwo>> template = null;
        if (userId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        PageHelper.startPage(pageNum, pageSize);
        // 目前只查询了信用证开证\支付申请
        List<TSumecFlowDetailsModule> sumecFlowDetailsModuleList = iSumecFlowDetailsModuleService
                .selectCheckedByUserId(userId);
        if (CollectionUtils.isNotEmpty(sumecFlowDetailsModuleList)) {
            template = new LinkedHashMap<>();
            List<TemplateTwo> list = new ArrayList<>();
            int count = sumecFlowDetailsModuleList.size();
            for (int i = 0; i < count; i++) {
                TSumecFlowDetailsModule detailModule = sumecFlowDetailsModuleList.get(i);
                TemplateTwo templateTwo = new TemplateTwo();
//				templateTwo.setHeader(detailModule.getFmViewName());
                Map<String, Object> kvs = new LinkedHashMap<>();
                String dealFlag = detailModule.getDealFlag();
                if ("1".equals(dealFlag)) {// 通过
                    templateTwo.setStatus("通过");
                } else if ("2".equals(dealFlag)) {// 退回
                    templateTwo.setStatus("退回");
                }
                // kvs.put("审批内容", detailModule.getFmName());

                String content = detailModule.getFmName(); // detailModule.getFmName()
                String payDate = "";
                Long intId = detailModule.getIntId();
                TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsService.selectByPrimaryKey(intId);
                Long longFmId = sumecFlowDetails.getFmId();
                String strRefValue = sumecFlowDetails.getRefValue();
                TSumecFlowModule flowModule = sumecFlowModuleService.selectByPrimaryKey(longFmId);
                String tableName = flowModule.getTableName();
                if (tableName.contains("T_PUB_PAY_APPLY")) {// 支付申请
                    TPubPayApply pubPayApply = pubPayApplyService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_PUB_PAY_APPLY", strRefValue);
                    TIoPayCollRel payCollRel = rels.get(0); // 暂时先取第0个
                    templateTwo.setHeader(payCollRel.getTobNo() + " 支付申请");
                    BigDecimal payAmt = pubPayApply.getPayAmt();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    content = "支付" + pubPayApply.getCstName() + pubPayApply.getPayKind();
                    payDate = sdf.format(pubPayApply.getPayDateApply());
                    kvs.put("内容", content);
                    kvs.put("金额", pubPayApply.getCurrType() + " " + NumberFormatUtils.getCurrency(payAmt));
                    kvs.put("申请支付日期", payDate);
                } else if (tableName.contains("T_IO_LC_OPEN")) {// 开证审批
                    //
                } else if (tableName.contains("T_TR_SOUT")) {// 调拨
//					BigDecimal scId = trSoutService.selectScIdBySoId(new BigDecimal(strRefValue));
//					TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    BigDecimal scId = trSoutService.selectScIdBySoId(new BigDecimal(strRefValue));
                    TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    templateTwo.setHeader(tExpSc.getcNo() + " 调拨审批");
                    BigDecimal soId = new BigDecimal(strRefValue);
                    TTrSoutBean trSoutBean = trSoutService.selectBySoId(soId);
                    BigDecimal cstId = trSoutBean.getCstId();
                    String commUnit = "";
                    BigDecimal unit = trSoutBean.getCommUnit();
                    if (unit != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unit.longValue());
                        commUnit = entity.getUnitName();
                    }
                    String commPackUnit = "";
                    BigDecimal unitPack = trSoutBean.getCommUnitPack();
                    if (unitPack != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unitPack.longValue());
                        commPackUnit = entity.getUnitName();
                    }
                    BigDecimal quantPack = trSoutBean.getCommQuantPack();
                    List<Map<String, Object>> bcList = expBcService.selectBcListBySoId(soId);
                    String commName = "";
//					for (int i = 0; i < bcList.size(); i++) {
//						TIoPayCollRel payCollRel = rels.get(i);
                    commName = bcList.get(0).get("COMM_NAME").toString();
//					}
                    // 金额
//					templateOne.setLeft(trSoutBean.getCurrType() + " " + NumberFormatUtils.getCurrency(soAmt));
                    if (quantPack == null || quantPack.compareTo(BigDecimal.ZERO) == 0) {
                        kvs.put("数量",
                                commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit);
                    } else {
                        kvs.put("数量", commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit
                                + "  " + quantPack + commPackUnit);
                    }
                    kvs.put("客户", trSoutBean.getCstName());
                    Map<String, String> inExMap = templateService.queryIncomeExpenditure(soId, cstId);
//					kvs.put("本次调拨后剩余", inExMap.get("本次调拨后剩余"));
//					kvs.put("调拨客户余款", inExMap.get("调拨客户余款"));
                    String t_last = inExMap.get("本次调拨后剩余");
//					String t_last_cst = inExMap.get("调拨客户余款");
                    if (t_last.startsWith("-")) {
                        kvs.put("本次调拨后", "欠款" + t_last.substring(1));
                    } else {
                        kvs.put("本次调拨后", "不欠款");
                    }
                } else if (tableName.contains("T_PUB_EXC")) {//
                    //TODO
                } else if (tableName.contains("T_EXP_BC")) {
                    templateTwo.setHeader("合同立项审批");
                    TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpBc != null) {
                        String bizMode = tExpBc.getBizMode();
                        if ("PR_S".equals(bizMode)) {
                            templateTwo.setHeader("代理合同立项审批");
                        } else if ("PR_P".equals(bizMode)) {
                            templateTwo.setHeader("代销合同立项审批");
                        } else if ("PT".equals(bizMode)) {
                            templateTwo.setHeader("自营采购合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpBc.getConfirm());
                        kvs.put("采购合同号", tExpBc.getcNo());
                    }
                } else if (tableName.contains("T_EXP_SC")) {
                    templateTwo.setHeader("销售合同立项审批");
                    TExpSc tExpSc = expScService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpSc != null) {
                        String bizMode = tExpSc.getBizMode();
                        int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                                TOB_S_ORDER);
                        if (llCount > 0) { // 转卖
                            templateTwo.setHeader("转卖合同立项审批");
                        } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode)) { // 自营
                            templateTwo.setHeader("自营销售合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpSc.getConfirm());
                        kvs.put("销售合同号", tExpSc.getcNo());
                    }
                }

                TSumecFlowDetails temp = new TSumecFlowDetails();
                temp.setFmSeqId(detailModule.getFmSeqId());
                short intNextDtlStep = (short) 1;
                temp.setDtlStep(intNextDtlStep);
                TSumecFlowDetails nextValid = sumecFlowDetailsService.selectNextValidStep(temp);
                if (nextValid != null) {
                    Long postUserId = nextValid.getUserId();
                    TSumecUser sumecUser = sumecUserService.selectByUserId(postUserId);
                    if (sumecUser != null) {
                        kvs.put("发起人", sumecUser.getUserName());
                    }
                }
                kvs.put("意见", detailModule.getNotion());
//				kvs.put("提交时间", DateUtils.format(detailModule.getPostTime(), DateUtils.F_YYYY_MM_dd_HH_mm_ss));
                templateTwo.setKvs(kvs);

                Map<String, String> hiddenKvs = new HashMap<>();
                hiddenKvs.put("id", detailModule.getIntId().toString());
                hiddenKvs.put("route", "ApprovalExamine");
                templateTwo.setHiddenKvs(hiddenKvs);
                list.add(templateTwo);
            }
            template.put("info_temp_two", list);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    /**
     * <p>
     * 方法描述：此方法根据userId查询该用户发起的审批列表
     * </p>
     *
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     * @author SunTow_J <br />
     * @date： 2018年2月28日 下午3:47:06<br/>
     */
    @ApiOperation(value = "根据userId查询该用户发起的审批列表", notes = "v1-根据userId查询该用户发起的审批列表")
    @GetMapping(value = "/template/flow/v1/{userId}/post/list")
    public ResponseEntity<Map<String, List<TemplateTwo>>> queryPostByUserId(@PathVariable("userId") Long userId,
                                                                            @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                                            @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        Map<String, List<TemplateTwo>> template = null;
        if (userId == null) {
            return ResponseEntity.badRequest().body(null);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<TSumecFlowDetailsModule> sumecFlowDetailsModuleList = iSumecFlowDetailsModuleService
                .selectPostByUserId(userId);
        if (CollectionUtils.isNotEmpty(sumecFlowDetailsModuleList)) {
            template = new LinkedHashMap<>();
            List<TemplateTwo> list = new ArrayList<>();
            int count = sumecFlowDetailsModuleList.size();
            for (int i = 0; i < count; i++) {
                TSumecFlowDetailsModule detailModule = sumecFlowDetailsModuleList.get(i);
                TemplateTwo templateTwo = new TemplateTwo();
//				templateTwo.setHeader(detailModule.getFmViewName());	//2018.12.20修改
                String tableName = detailModule.getTableName();
                String strRefValue = detailModule.getRefValue();
                Map<String, Object> kvs = new LinkedHashMap<>();
//				kvs.put("审批内容", detailModule.getFmName());
                String content = detailModule.getFmName(); // detailModule.getFmName()
                String payDate = "";

                if (tableName.contains("T_PUB_PAY_APPLY")) {// 支付申请
                    TPubPayApply pubPayApply = pubPayApplyService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    List<TIoPayCollRel> rels = ioPayCollRelService.selectByTopcId("T_PUB_PAY_APPLY", strRefValue);
                    TIoPayCollRel payCollRel = rels.get(0); // 暂时先取第0个
                    templateTwo.setHeader(payCollRel.getTobNo() + " 支付申请");
                    if (pubPayApply != null) {
                        // 状态
                        templateTwo.setStatus(pubPayApply.getConfirm());
                    }

                    BigDecimal payAmt = pubPayApply.getPayAmt();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    content = "支付" + pubPayApply.getCstName() + pubPayApply.getPayKind();
                    payDate = sdf.format(pubPayApply.getPayDateApply());
                    kvs.put("内容", content);
                    kvs.put("金额", pubPayApply.getCurrType() + " " + NumberFormatUtils.getCurrency(payAmt));
                    kvs.put("申请支付日期", payDate);
                } else if (tableName.contains("T_IO_LC_OPEN")) {// 开证审批
                    TIoLcOpen ioLcOpen = ioLcOpenService.queryLcDetail(new BigDecimal(strRefValue));
                    templateTwo.setHeader("开证审批");
                    if (ioLcOpen != null) {
                        // 状态
                        templateTwo.setStatus(ioLcOpen.getConfirm());
                    }
                } else if (tableName.contains("T_TR_SOUT")) {// 调拨
                    BigDecimal scId = trSoutService.selectScIdBySoId(new BigDecimal(strRefValue));
                    TExpSc tExpSc = expScService.selectByPrimaryKey(scId);
                    templateTwo.setHeader(tExpSc.getcNo() + " 调拨审批");
                    BigDecimal soId = new BigDecimal(strRefValue);
                    TTrSoutBean trSoutBean = trSoutService.selectBySoId(soId);
                    BigDecimal cstId = trSoutBean.getCstId();
                    if (trSoutBean != null) {
                        // 状态
                        templateTwo.setStatus(trSoutBean.getConfirm());
                    }
                    // 新增
                    template = new LinkedHashMap<>();
                    //// 抬头
//					BigDecimal soAmt = trSoutBean.getSoAmt();	// 申请金额
                    String commUnit = "";
                    BigDecimal unit = trSoutBean.getCommUnit();
                    if (unit != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unit.longValue());
                        commUnit = entity.getUnitName();
                    }
                    String commPackUnit = "";
                    BigDecimal unitPack = trSoutBean.getCommUnitPack();
                    if (unitPack != null) {
                        TDicUnitEntity entity = sumecUnitService.queryDicUnitByUnitId(unitPack.longValue());
                        commPackUnit = entity.getUnitName();
                    }
                    BigDecimal quantPack = trSoutBean.getCommQuantPack();
                    List<Map<String, Object>> bcList = expBcService.selectBcListBySoId(soId);
                    String commName = "";
//					for (int i = 0; i < bcList.size(); i++) {
//						TIoPayCollRel payCollRel = rels.get(i);
                    commName = bcList.get(0).get("COMM_NAME").toString();
//					}
                    kvs.put("客户", trSoutBean.getCstName());
                    // 金额
//					templateOne.setLeft(trSoutBean.getCurrType() + " " + NumberFormatUtils.getCurrency(soAmt));
                    if (quantPack == null || quantPack.compareTo(BigDecimal.ZERO) == 0) {
                        kvs.put("数量",
                                commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit);
                    } else {
                        kvs.put("数量", commName + " " + NumberFormatUtils.getNumber(trSoutBean.getCommQuant()) + commUnit
                                + "  " + quantPack + commPackUnit);
                    }
                    Map<String, String> inExMap = templateService.queryIncomeExpenditure(soId, cstId);
//					kvs.put("本次调拨后剩余", inExMap.get("本次调拨后剩余"));
//					kvs.put("调拨客户余款", inExMap.get("调拨客户余款"));
                    String t_last = inExMap.get("本次调拨后剩余");
//					String t_last_cst = inExMap.get("调拨客户余款");
                    if (t_last.startsWith("-")) {
                        kvs.put("本次调拨后", "欠款" + t_last.substring(1));
                    } else {
                        kvs.put("本次调拨后", "不欠款");
                    }
                } else if (tableName.contains("T_PUB_EXC")) {//
                    templateTwo.setHeader("转款申请");
                    TPubExc pubExc = pubExcService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (pubExc != null) {
                        // 状态
                        templateTwo.setStatus(pubExc.getConfirm());
                    }
                } else if (tableName.contains("T_EXP_BC")) {
                    templateTwo.setHeader("合同立项审批");
                    TExpBc tExpBc = expBcService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpBc != null) {
                        String bizMode = tExpBc.getBizMode();
                        if ("PR_S".equals(bizMode)) {
                            templateTwo.setHeader("代理合同立项审批");
                        } else if ("PR_P".equals(bizMode)) {
                            templateTwo.setHeader("代销合同立项审批");
                        } else if ("PT".equals(bizMode)) {
                            templateTwo.setHeader("自营采购合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpBc.getConfirm());
                        kvs.put("采购合同号", tExpBc.getcNo());
                    }
                } else if (tableName.contains("T_EXP_SC")) {
                    templateTwo.setHeader("销售合同立项审批");
                    TExpSc tExpSc = expScService.selectByPrimaryKey(new BigDecimal(strRefValue));
                    if (tExpSc != null) {
                        String bizMode = tExpSc.getBizMode();
                        int llCount = templateService.selectLLCount(tExpSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                                TOB_S_ORDER);
                        if (llCount > 0) { // 转卖
                            templateTwo.setHeader("转卖合同立项审批");
                        } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode)) { // 自营
                            templateTwo.setHeader("自营销售合同立项审批");
                        } else {
                            templateTwo.setHeader("");
                        }
                        templateTwo.setStatus(tExpSc.getConfirm());
                        kvs.put("销售合同号", tExpSc.getcNo());
                    }
                }
                /*
                 * String dealFlag = detailModule.getDealFlag(); if("0".equals(dealFlag)){
                 * templateTwo.setStatus("待审批"); }else if("1".equals(dealFlag)){
                 * templateTwo.setStatus("已审批"); }else if("2".equals(dealFlag)){
                 * templateTwo.setStatus("已退回"); }else if("D".equals(dealFlag)){
                 * templateTwo.setStatus("未到处理"); }
                 */
                TSumecUser sumecUser = sumecUserService.selectByUserId(detailModule.getUserId());
                if (sumecUser != null) {
                    kvs.put("发起人", sumecUser.getUserName() + " "
                            + DateUtils.format(detailModule.getDealTime(), DateUtils.F_YYYY_MM_dd_HH_mm_ss));
                }
//				kvs.put("审批时间", DateUtils.format(detailModule.getDealTime(), DateUtils.F_YYYY_MM_dd_HH_mm_ss));
                templateTwo.setKvs(kvs);

                Map<String, String> hiddenKvs = new HashMap<>();
                hiddenKvs.put("id", detailModule.getIntId().toString());
                hiddenKvs.put("route", "ApprovalExamine");
                templateTwo.setHiddenKvs(hiddenKvs);
                list.add(templateTwo);
            }
            template.put("info_temp_two", list);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(template));
    }

    @Deprecated
    private List<String> getExpBcList(TExpBc expBc) {
        List<String> list = null;
        if (expBc != null) {
            list = new ArrayList<>();
            list.add(expBc.getFctName());// 客户
            list.add(DictConstant.C_STATUS.get(expBc.getcStatus()));// 状态
            String dicComm = "";
            if (expBc.getCmdCataId() != null) {
                TDicComm cmdCata = dicCommService.selectByPrimaryKey(expBc.getCmdCataId());
                if (cmdCata != null) {
                    dicComm = dicComm + cmdCata.getCommName();
                }
            }
            if (expBc.getCommId() != null) {
                TDicComm comm = dicCommService.selectByPrimaryKey(expBc.getCommId());
                if (comm != null) {
                    dicComm = dicComm + " " + comm.getCommName();
                }
            }
            list.add(dicComm);
            String commUnitName = "";
            TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(expBc.getCommUnit());
            if (dicUnit != null) {
                commUnitName = dicUnit.getUnitName();
            }
            list.add(NumberFormatUtils.getNumber(expBc.getpQuant()) + " " + commUnitName);// 数量
            list.add("");// 占位
            list.add(expBc.getCurrType() + " " + NumberFormatUtils.getCurrency(expBc.getpAmt()));// 金额
            list.add(""); // 占位
            // 签约事业部-业务组-业务员 dep_org_id-ocu_org_id-cell_id
            String person = templateService.getExpBcDepartMent(expBc);
            list.add(person);
        }
        return list;
    }

    private String getOneChatId(List<TTrPkgRel> trPkgList) {
        String chatId = "";
        if (trPkgList != null && trPkgList.size() > 0) {
            String pkgId = trPkgList.get(0).getPkgId();    //取第一个
            List<String> pkgIds = new ArrayList<String>();
            pkgIds.add(pkgId);
            List<String> chatIds = sumecBusiGroupService.selectChatIdByGroupIds(pkgIds);
            if (chatIds != null && chatIds.size() > 0) {
                chatId = chatIds.get(0);
            }
        }
        return chatId;
    }

    private List<String> getchatIds(Set<TTrOcuDivide> res) {
        List<String> chatIds = null;
        if (CollectionUtils.isNotEmpty(res)) {
            List<TTrOcuDivide> query = new ArrayList<>();
            query.addAll(res);
            List<String> pkgIds = pkgRelService.selectPkgIds(query);
            if (CollectionUtils.isNotEmpty(pkgIds)) {
                // 查询包对应的群id列表
                chatIds = sumecBusiGroupService.selectChatIdByGroupIds(pkgIds);
            }
        }
        return chatIds;
    }

    /**
     * <p>
     * 方法描述：获取采购合同汇总概要
     * </p>
     *
     * @param expBc
     * @return
     * @author SunTow_J <br />
     * @date： 2018年1月12日 下午2:34:49<br/>
     */
    private Map<String, Object> getExpBcTemplateOne(TExpBc expBc) {
        Map<String, Object> template = new LinkedHashMap<>();
        TemplateSummary one = new TemplateSummary();
        one.setNo("[采购]" + expBc.getcNo());
        // 0:未签约 1:执行中 2:已终止 3:已关闭
        one.setStatus(DictConstant.C_STATUS.get(expBc.getcStatus()));
        // 隐藏属性
        Map<String, String> hiddenKvs = new HashMap<>();
        hiddenKvs.put("id", expBc.getBcId().toString());
        hiddenKvs.put("type", "T_EXP_BC");
        hiddenKvs.put("route", "Contract");
        one.setHiddenKvs(hiddenKvs);
        List<String> tags = new ArrayList<>();
        // 国别
        // 判断是境内还是境外 境内:INLAND,境外:OVERSEAS
        String inlandOrOverseas = expBc.getInlandOrOverseas();
        if ("INLAND".equals(inlandOrOverseas)) {
            tags.add("国内");
        } else if ("OVERSEAS".equals(inlandOrOverseas)) {
            tags.add("国外");
        }
        // if(expBc.getLandNationId() != null){
        // TDicCpc dicCpc = dicCpcService.selectByPrimaryKey(expBc.getLandNationId());
        // if(dicCpc != null){
        // tags.add(dicCpc.getCpcNameCn());
        // }
        // }
        // type_of_con 合同类型 买卖合同 TR_TYPE_OF_CON type_of_con
        if (StringUtils.isNotEmpty(expBc.getTypeOfCon())) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_TYPE_OF_CON", expBc.getTypeOfCon());
            if (basicInfo != null) {
                tags.add(basicInfo.getStrNotes());
            }
        }
        // // prop_of_con 合同性质 购销 TR_PROP_OF_CON
        // if(StringUtils.isNotEmpty(expBc.getPropOfCon())){
        // TDicBasicInfo basicInfo =
        // basicInfoService.selectByNameAndType("TR_PROP_OF_CON",expBc.getPropOfCon());
        // if(basicInfo != null){
        // tags.add(basicInfo.getStrNotes());
        // }
        // }
        if (StringUtils.isNotEmpty(expBc.getPropOfCon())) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PROP_OF_CON", expBc.getPropOfCon());
            if (basicInfo != null) {
                tags.add(basicInfo.getStrNotes());
            }
        }

        // cata_of_con 合同分类 订单 TR_CATA_OF_CON
        if (CollectionUtils.isNotEmpty(tags)) {
            one.setTags(tags);
        }
        Map<String, Object> kvs = new LinkedHashMap<>();
        // 供应商
        kvs.put("供应商", expBc.getFctName());
        // 采购方
        TFdAcc fdAcc = fdAccService.selectByAccNo(expBc.getAccNo());
        if (fdAcc != null) {
            kvs.put("采购方", fdAcc.getAccShortName());
        }
        // 采购金额 currType+pAmt
        kvs.put("采购金额", expBc.getCurrType() + " " + NumberFormatUtils.getCurrency(expBc.getpAmt()));
        // 数量 p_quant comm_unit
        Long commUnit = expBc.getCommUnit();
        String commUnitName = "";
        if (expBc.getCommUnit() != null) {
            TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(commUnit);
            if (dicUnit != null) {
                commUnitName = dicUnit.getUnitName();
            }
        }
        kvs.put("数量", NumberFormatUtils.getNumber(expBc.getpQuant()) + " " + commUnitName);
        one.setKvs(kvs);
        // 签约时间 sign_date
        one.setDate(DateUtils.format(expBc.getSignDate()));
        // 签约事业部-业务组-业务员 dep_org_id-ocu_org_id-cell_id
        String person = templateService.getExpBcDepartMent(expBc);
        one.setPerson(person.toString());
        template.put("summary_temp", one);

        return template;
    }

    /**
     * <p>
     * 方法描述：获取销售合同汇总概要
     * </p>
     *
     * @return
     * @author SunTow_J <br />
     * @date： 2018年1月12日 下午2:34:49<br/>
     */
    private Map<String, Object> getExpScTemplateOne(TExpSc expSc) {
        Map<String, Object> template = new LinkedHashMap<>();
        TemplateSummary one = new TemplateSummary();
        one.setNo("[销售]" + expSc.getcNo());
        // 0:未签约 1:执行中 2:已终止 3:已关闭
        one.setStatus(DictConstant.C_STATUS.get(expSc.getcStatus()));
        // 隐藏属性
        Map<String, String> hiddenKvs = new HashMap<>();
        hiddenKvs.put("id", expSc.getScId().toString());
        hiddenKvs.put("type", "T_EXP_SC");
        hiddenKvs.put("route", "Contract");
        List<String> tags = new ArrayList<>();
        // 国别
        String inlandOrOverseas = expSc.getInlandOrOverseas();
        if ("INLAND".equals(inlandOrOverseas)) {
            tags.add("国内");
        } else if ("OVERSEAS".equals(inlandOrOverseas)) {
            tags.add("国外");
        }
        one.setHiddenKvs(hiddenKvs);
        // if(expSc.getLandNationId() != null){
        // TDicCpc dicCpc = dicCpcService.selectByPrimaryKey(expSc.getLandNationId());
        // if(dicCpc != null){
        // tags.add(dicCpc.getCpcNameCn());
        // }
        // }
        // type_of_con 合同类型 买卖合同 TR_TYPE_OF_CON type_of_con
        if (StringUtils.isNotEmpty(expSc.getTypeOfCon())) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_TYPE_OF_CON", expSc.getTypeOfCon());
            if (basicInfo != null) {
                tags.add(basicInfo.getStrNotes());
            }
        }
        // prop_of_con 合同性质 购销 TR_PROP_OF_CON
        if (StringUtils.isNotEmpty(expSc.getPropOfCon())) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PROP_OF_CON", expSc.getPropOfCon());
            if (basicInfo != null) {
                tags.add(basicInfo.getStrNotes());
            }
        }
        // biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
        // cata_of_con 合同分类 订单 TR_CATA_OF_CON
        if (CollectionUtils.isNotEmpty(tags)) {
            one.setTags(tags);
        }
        Map<String, Object> kvs = new LinkedHashMap<>();
        // 客户
        kvs.put("客户", expSc.getCstName());
        // 销售方
        TFdAcc fdAcc = fdAccService.selectByAccNo(expSc.getAccNo());
        if (fdAcc != null) {
            kvs.put("销售方", fdAcc.getAccShortName());
        }
        // 金额 currType+pAmt
        kvs.put("销售金额", expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(expSc.gettAmt()));
        // 数量 p_quant comm_unit
        Long commUnit = expSc.getCommUnit();
        String commUnitName = "";
        if (expSc.getCommUnit() != null) {
            TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(commUnit);
            if (dicUnit != null) {
                commUnitName = dicUnit.getUnitName();
            }
        }
        kvs.put("数量", NumberFormatUtils.getNumber(expSc.getpQuant()) + " " + commUnitName);
        one.setKvs(kvs);
        // 签约时间 sign_date
        one.setDate(DateUtils.format(expSc.getSignDate()));
        // 签约事业部-业务组-业务员 dep_org_id-ocu_org_id-cell_id
        String person = templateService.getExpScDepartMent(expSc);
        one.setPerson(person.toString());
        template.put("summary_temp", one);

        return template;
    }

    private Map<String, Object> getExpBcTemplateTwo(TExpBc expBc) {
        Map<String, Object> template = new LinkedHashMap<>();
//		TemplateSummary one = getExpBcTemplateOne(expBc);
//		template.put("summary_temp", one);
        /// 业务模式
        // biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
        String bizMode = expBc.getBizMode();
        BigDecimal bcId = expBc.getBcId();
        if (StringUtils.isNotEmpty(bizMode)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
            if (basicInfo != null) {
                TemplateListFour info2 = new TemplateListFour();
                List<Map<String, Object>> list = new LinkedList<>();
                // TemplateInfo info2 = new TemplateInfo();
                Map<String, Object> kvs2 = new LinkedHashMap<>();
                info2.setHeader(basicInfo.getStrNotes());
                // kvs2.put("业务模式",basicInfo.getStrNotes());
                BigDecimal pQuant = expBc.getpQuant();
                BigDecimal quantSold = BigDecimal.ZERO;
                BigDecimal quantSoldTmp = templateService.selectQUANT_SOLD(bcId);
                if (quantSoldTmp != null) {
                    quantSold = quantSoldTmp;
                }

                String fct_desc = templateService.supplierInhand(bcId);
                if ("PT".equals(bizMode)) { // 纯自营
                    kvs2.put("供应商在手情况", fct_desc);
//					kvs2.put(" ", fct_desc2);
//					kvs2.put("  ", fct_desc3);
                    kvs2.put("已销售 吨位",
                            quantSold.compareTo(pQuant) > 0 ? pQuant.toPlainString() : quantSold.toPlainString()); // if(
                    kvs2.put("未销售吨位",
                            quantSold.compareTo(pQuant) > 0 ? "0" : pQuant.subtract(quantSold).toPlainString()); // if(
                } else if ("PR_P".equals(bizMode)) { // 代销
                    kvs2.put("预计收益", expBc.getProfitSchemeDesc() == null ? "" : expBc.getProfitSchemeDesc());
                    kvs2.put("代销客户在手情况", fct_desc);
//					kvs2.put(" ", fct_desc2);
//					kvs2.put("  ", fct_desc3);
                    kvs2.put("已销售 吨位",
                            quantSold.compareTo(pQuant) > 0 ? pQuant.toPlainString() : quantSold.toPlainString()); // if(
                    kvs2.put("未销售吨位",
                            quantSold.compareTo(pQuant) > 0 ? "0" : pQuant.subtract(quantSold).toPlainString()); // if(
                } else if ("PR_S".equals(bizMode)) { // 代采
                    kvs2.put("预计收益", expBc.getProfitSchemeDesc() == null ? "" : expBc.getProfitSchemeDesc());
                    kvs2.put("供应商在手情况", fct_desc);
//					kvs2.put(" ", fct_desc2);
//					kvs2.put("  ", fct_desc3);
                    List<TTrContractRel> tmp = trContractRelService.selectByTobIdB(TOB_P_ORDER, bcId);
                    if (tmp != null && tmp.size() > 0) {
                        BigDecimal scId = tmp.get(0).getTobIdA();
                        String cst_desc = templateService.customerInHand(scId);
                        kvs2.put("客户在手情况", cst_desc);
//						kvs2.put("   ", cst_desc2);
//						kvs2.put("    ", cst_desc3);
                    }
                }
                // info2.setKvs(kvs2);
                list.add(kvs2);
                info2.setKvs(list);
                // template.put("info_temp_two#2",info2);
                template.put("info_temp_list_four#2", info2);

            }
        }
        /// 基本信息
        TemplateInfo info = new TemplateInfo();
        info.setHeader("基本信息");
        Map<String, String> kvs = new LinkedHashMap<>();
        // trademode 贸易方式
        // if(StringUtils.isNotEmpty(expBc.getTrademode())){
        // kvs.put("业务模式",expBc.getTrademode());
        // }
        // 商品描述 cmd_cata_id品类 comm_id子类 comm_name品名
        if (expBc.getCmdCataId() != null) {
            Long cmdCataId = expBc.getCmdCataId();
            if (cmdCataId != null) {
                TDicComm dicComm = dicCommService.selectByPrimaryKey(cmdCataId);
                if (dicComm != null) {
                    kvs.put("商品描述", dicComm.getCommName());
                }
            }
        }
        // 价格条款 price_term
        if (StringUtils.isNotEmpty(expBc.getPriceTerm())) {
            kvs.put("价格条款", expBc.getPriceTerm());
        }
        // 付款方式 pay_term
        if (StringUtils.isNotEmpty(expBc.getPayTerm())) {
            kvs.put("付款方式 ", expBc.getPayTerm());
        }
        // 交货方式 send_term
        if (StringUtils.isNotEmpty(expBc.getSendTerm())) {
            kvs.put("交货方式 ", expBc.getSendTerm());
        }
        info.setKvs(kvs);
        template.put("info_temp_two", info);
        // 合同标的
        List<TExpBcCmd> expBcCmdList = expBcCmdService.selectByBcId(expBc.getBcId());
        if (CollectionUtils.isNotEmpty(expBcCmdList)) {
            int expBcCmdListCount = expBcCmdList.size();
            TemplateListTwo templateListTwo = new TemplateListTwo();
            templateListTwo.setHeader("合同标的");
            List<Map<String, Object>> list = new ArrayList<>();
            BigDecimal sumcObjAmt = new BigDecimal(0);// 总金额
            BigDecimal sumcPquant = new BigDecimal(0); // 总数量
            for (int i = 0; i < expBcCmdListCount; i++) {
                TExpBcCmd expBcCmd = expBcCmdList.get(i);
                Map<String, Object> map = new LinkedHashMap<>();
                BigDecimal commAmt = expBcCmd.getCommAmt();
                sumcObjAmt = sumcObjAmt.add(commAmt);
                map.put(expBcCmd.getpName(), NumberFormatUtils.getCurrency(commAmt));
                map.put("采购单价", NumberFormatUtils.getCurrency(expBcCmd.getObjPrice()));
                String commUnitName = "";
                if (expBc.getCommUnit() != null) {
                    TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(expBcCmd.getCommUnit());
                    if (dicUnit != null) {
                        commUnitName = dicUnit.getUnitName();
                    }
                }
                BigDecimal pQuant = expBcCmd.getpQuant();
                sumcPquant = sumcPquant.add(pQuant);
                map.put("数量", NumberFormatUtils.getNumber(pQuant) + "" + commUnitName);
                list.add(map);
            }
            templateListTwo.setKvs(list);
            templateListTwo.setLeft("合计");
            templateListTwo.setRight("数量:" + NumberFormatUtils.getNumber(sumcPquant) + ",金额:"
                    + NumberFormatUtils.getCurrency(sumcObjAmt));
            template.put("list_temp_two", templateListTwo);
        }
        return template;
    }

    /**
     * 提供ExpBc基本信息 改版
     *
     * @param tExpBc
     * @return
     */
    private Map<String, Object> getExpBcTemplateTwo2(TExpBc tExpBc) {
        Map<String, Object> template = new LinkedHashMap<>();
        // TemplateSummary one = getExpBcTemplateOne(expBc);
        // template.put("summary_temp", one);
        /// 业务模式
        // biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
        TemplateInfo info = new TemplateInfo();
        info.setHeader("基本信息");
        Map<String, String> kvs = new LinkedHashMap<>();
        BigDecimal bcId = tExpBc.getBcId();
        BigDecimal pAmt = tExpBc.getpAmt();
        String tmpBizType = "";
        String bizMode = tExpBc.getBizMode();
        if (StringUtils.isNotEmpty(bizMode)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
            if (basicInfo != null) {
                tmpBizType = basicInfo.getStrNotes();
            }
        }
//			kvs.put(tExpBc.getFctName(), tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
        kvs.putAll(getExpBcCmdMap(tExpBc)); // 合同标的
        kvs.put("合同金额", tExpBc.getCurrType() + " " + NumberFormatUtils.getCurrency(tExpBc.getpAmt()));
//		kvs.put("保证金比例 ", tExpBc.getBailRate() == null ? "无" : tExpBc.getBailRate() + "%");
        kvs.put("发货期限", tExpBc.getSendTerm() == null ? "" : tExpBc.getSendTerm());
        String conPeriodSType = tExpBc.getConPeriodSType();
//		String tmpconPeriodSType = "";
//		if (StringUtils.isNotEmpty(conPeriodSType)) {
//			TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_CON_PERIOD_S_TYPE", conPeriodSType);
//			if (basicInfo != null) {
//				tmpconPeriodSType = basicInfo.getStrNotes();
//			}
//		}
//		kvs.put("合同周期", tmpconPeriodSType + " " + tExpBc.getConPeriod() == null? "":tExpBc.getConPeriod() + "天");
        kvs.put("合同周期", map0.getOrDefault(conPeriodSType, "") + " " + tExpBc.getConPeriod() == null ? "" : tExpBc.getConPeriod() + "天");
        kvs.put("付款方式 ", tExpBc.getPayTerm() == null ? "" : tExpBc.getPayTerm());
//		kvs.put("预计收益", tExpBc.getProfitSchemeDesc() == null ? "" : tExpBc.getProfitSchemeDesc());
        kvs.put("供货方式 ", tExpBc.getShipmentWay() == null ? "" : tExpBc.getShipmentWay());
        kvs.put("供货地点 ", tExpBc.getDeliveryPlace());
        String transResp = tExpBc.getTransResp();
        String transRespNotes = "";
        if (transResp != null && !"".equals(transResp)) {
            TDicBasicInfo tmpInfo = basicInfoService.selectByNameAndType("TR_TRANS_RESP", transResp);
            transRespNotes = tmpInfo.getStrNotes();
        }
        kvs.put("运输负责方 ", transRespNotes);
        kvs.put("运输公司", tExpBc.getTransCorpName());
        kvs.put("仓储单位 ", tExpBc.getWhName());
//			kvs.put("供应商在手情况", templateService.supplierInhand(bcId));
//			hiddenKvs.put("route", "ContractExecute");
//			hiddenKvs.put("id", tExpBc.getBcId().toString());
//			hiddenKvs.put("type", "T_EXP_BC");
//			temp4.put("hiddenKvs", hiddenKvs);
//			list.add(temp4);

        if (StringUtils.isNotEmpty(bizMode)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
            if (basicInfo != null) {
                String fct_desc = templateService.supplierInhand(bcId);
                if ("PT".equals(bizMode)) { // 纯自营
                    kvs.put("供应商在手情况", fct_desc);
                } else if ("PR_P".equals(bizMode)) { // 代销
                    kvs.put("代销客户在手情况", fct_desc);
                } else if ("PR_S".equals(bizMode)) { // 代采
                    kvs.put("供应商在手情况", fct_desc);
//					List<TTrContractRel> tmp = trContractRelService.selectByTobIdB(TOB_P_ORDER, bcId);
//					if (tmp != null && tmp.size() > 0) {
//						BigDecimal scId = tmp.get(0).getTobIdA();
//						String cst_desc = templateService.customerInHand(scId);
//						kvs.put("客户在手情况", cst_desc);
//					}
                }
            }
        }
        info.setKvs(kvs);
        template.put("info_temp_two", info);
        return template;
    }

    private Map<String, Object> getExpScTemplateTwo(TExpSc expSc) {
        Map<String, Object> template = new LinkedHashMap<>();
//		TemplateSummary one = getExpScTemplateOne(expSc);
//		template.put("summary_temp", one);
        TemplateInfo info = new TemplateInfo();
        info.setHeader("基本信息");
        Map<String, String> kvs = new LinkedHashMap<>();
        String bizMode = expSc.getBizMode();
        BigDecimal scId = expSc.getScId();
        // biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
        if (StringUtils.isNotEmpty(bizMode)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizMode);
            if (basicInfo != null) {
                TemplateListFour info2 = new TemplateListFour();
                List<Map<String, Object>> list = new LinkedList<>();

                // TemplateInfo info2 = new TemplateInfo();
                Map<String, Object> kvs2 = new LinkedHashMap<>();
                info2.setHeader(basicInfo.getStrNotes());
                // kvs.put("业务模式",basicInfo.getStrNotes());
                int llCount = templateService.selectLLCount(expSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                        TOB_S_ORDER);
                if (llCount > 0) { // 转卖
                    kvs2.put("转卖销售合同号", expSc.getcNo() == null ? "" : expSc.getcNo());
                    kvs2.put("转卖销售客户", expSc.getCstName() == null ? "" : expSc.getCstName());
                    kvs2.put("保证金比例", expSc.getBailRate() + "%");
                    kvs2.put("合同周期", map0.getOrDefault(expSc.getConPeriodSType(), "") + " " + expSc.getConPeriod() + "天");
                    kvs2.put("合同金额", expSc.gettAmt().toEngineeringString());
                } else if ("PT".equals(bizMode)) { // 纯自营
//                  kvs2.put("预计收益", expSc.getProfitSchemeDesc() == null ? "" : expSc.getProfitSchemeDesc());
                    String prFeeType = expSc.getPrFeeType();
                    String prFeeTypeName = "";
                    TDicBasicInfo tDicBasicInfo = basicInfoService.selectByNameAndType("TR_PR_FEE_TYPE", prFeeType);
                    if (tDicBasicInfo != null) {
                        prFeeTypeName = tDicBasicInfo.getStrNotes();
                    }
                    if ("UNIT".equals(prFeeType)) {
                        kvs2.put("预计收益", prFeeTypeName + " " + expSc.getPrFeeRate() + "元/吨");
                    } else {
                        kvs2.put("预计收益", prFeeTypeName);
                    }
                    String cst_desc = templateService.customerInHand(scId);
                    kvs2.put("客户在手情况", cst_desc);
//					kvs2.put(" ", cst_desc2);
//					kvs2.put("  ", cst_desc3);
                    BigDecimal p_quant = expSc.getpQuant();
                    BigDecimal quant_purced = templateService.selectQUANT_PURCED(expSc.getScId());
                    kvs2.put("已采购吨位", quant_purced.compareTo(p_quant) >= 0 ? p_quant.toPlainString()
                            : quant_purced.toPlainString()); // if( quant_purced >=p_quant , p_quant , quant_purced )
                    kvs2.put("未采购吨位", quant_purced.compareTo(p_quant) >= 0 ? "0"
                            : p_quant.subtract(quant_purced).toPlainString()); // p_quant - if( quant_purced >=p_quant ,
                    // p_quant , quant_purced )
                } else if ("PR_P".equals(bizMode) || "PR_S".equals(bizMode)) { // 代销 代采
//                    kvs2.put("预计收益", expSc.getProfitSchemeDesc() == null ? "" : expSc.getProfitSchemeDesc());
                    String prFeeType = expSc.getPrFeeType();
                    String prFeeTypeName = "";
                    TDicBasicInfo tDicBasicInfo = basicInfoService.selectByNameAndType("TR_PR_FEE_TYPE", prFeeType);
                    if (tDicBasicInfo != null) {
                        prFeeTypeName = tDicBasicInfo.getStrNotes();
                    }
                    if ("UNIT".equals(prFeeType)) {
                        kvs2.put("预计收益", prFeeTypeName + " " + expSc.getPrFeeRate() + "元/吨");
                    } else {
                        kvs2.put("预计收益", prFeeTypeName);
                    }
                    List<TTrContractRel> tmp = trContractRelService.selectByTobIdA(TOB_S_ORDER, scId);
                    if (tmp != null && tmp.size() > 0) {
                        BigDecimal bcId = tmp.get(0).getTobIdB();
                        String fct_desc = templateService.supplierInhand(bcId);
                        kvs2.put("供应商在手情况", fct_desc);
//						kvs2.put(" ", fct_desc2);
//						kvs2.put("  ", fct_desc3);
                    }
                    String cst_desc = templateService.customerInHand(scId);
                    kvs2.put("客户在手情况", cst_desc);
//					kvs2.put("   ", cst_desc2);
//					kvs2.put("    ", cst_desc3);
                }
                list.add(kvs2);
                info2.setKvs(list);
                template.put("info_temp_list_four#2", info2);
                // template.put("info_temp_two#2",info2);
            }
        }
        // // trademode 贸易方式
        // if(StringUtils.isNotEmpty(expSc.getTrademode())){
        // kvs.put("业务模式",expSc.getTrademode());
        // }
        // 商品描述 cmd_cata_id品类 comm_id子类 comm_name品名
        if (expSc.getCmdCataId() != null) {
            Long cmdCataId = expSc.getCmdCataId();
            if (cmdCataId != null) {
                TDicComm dicComm = dicCommService.selectByPrimaryKey(cmdCataId);
                if (dicComm != null) {
                    kvs.put("商品描述", dicComm.getCommName());
                }
            }
        }
        // 价格条款 price_term
        if (StringUtils.isNotEmpty(expSc.getPriceTerm())) {
            kvs.put("价格条款", expSc.getPriceTerm());
        }
        // 付款方式 pay_term
        if (StringUtils.isNotEmpty(expSc.getPayTerm())) {
            kvs.put("付款方式 ", expSc.getPayTerm());
        }
        // 交货方式 send_term
        if (StringUtils.isNotEmpty(expSc.getSendTerm())) {
            kvs.put("交货方式 ", expSc.getSendTerm());
        }
        info.setKvs(kvs);
        template.put("info_temp_two", info);
        // 合同标的
        List<TExpScCmd> expScCmdList = expScCmdService.selectByScId(expSc.getScId());
        if (CollectionUtils.isNotEmpty(expScCmdList)) {
            int expScCmdListCount = expScCmdList.size();
            TemplateListTwo templateListTwo = new TemplateListTwo();
            templateListTwo.setHeader("合同标的");
            List<Map<String, Object>> list = new ArrayList<>();
            BigDecimal sumcObjAmt = new BigDecimal(0);// 总金额
            BigDecimal sumcPquant = new BigDecimal(0); // 总数量
            for (int i = 0; i < expScCmdListCount; i++) {
                TExpScCmd expScCmd = expScCmdList.get(i);
                Map<String, Object> map = new LinkedHashMap<>();
                BigDecimal pAmt = expScCmd.getpAmt();
                sumcObjAmt = sumcObjAmt.add(pAmt);
                map.put(expScCmd.getpName(), NumberFormatUtils.getCurrency(pAmt));
                map.put("销售单价", NumberFormatUtils.getCurrency(expScCmd.getObjPrice()));
                String commUnitName = "";
                if (expSc.getCommUnit() != null) {
                    TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(expScCmd.getCommUnit());
                    if (dicUnit != null) {
                        commUnitName = dicUnit.getUnitName();
                    }
                }
                BigDecimal pQuant = expScCmd.getpQuant();
                sumcPquant = sumcPquant.add(pQuant);
                map.put("数量", NumberFormatUtils.getNumber(pQuant) + "" + commUnitName);
                list.add(map);
            }
            templateListTwo.setKvs(list);
            templateListTwo.setLeft("合计");
            templateListTwo.setRight("数量:" + NumberFormatUtils.getNumber(sumcPquant) + "  金额:"
                    + NumberFormatUtils.getCurrency(sumcObjAmt));
            template.put("list_temp_two", templateListTwo);
        }
        return template;
    }

    /*
     * 提供ExpSc基本信息 改版
     */
    private Map<String, Object> getExpScTemplateTwo2(TExpSc expSc) {
        Map<String, Object> template = new LinkedHashMap<>();
        String bizMode = expSc.getBizMode();
        BigDecimal scId = expSc.getScId();
        // biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
        if (StringUtils.isNotEmpty(bizMode)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizMode);
            if (basicInfo != null) {
                // TemplateInfo info2 = new TemplateInfo();
//				info2.setHeader(basicInfo.getStrNotes());
                // kvs.put("业务模式",basicInfo.getStrNotes());
                int llCount = templateService.selectLLCount(expSc.getScId(), CONTRACT_REL_TYPE_EXC, TOB_S_ORDER,
                        TOB_S_ORDER);
                if (llCount > 0) { // 转卖
                    TemplateInfo info = new TemplateInfo();
                    info.setHeader("转卖来源信息");
                    Map<String, String> kvs = new LinkedHashMap<>();
                    BigDecimal originalScId = templateService.selectOriginalScId(scId);
                    TExpSc originalExpSc = expScService.selectByPrimaryKey(originalScId);
                    kvs.put("原销售合同号", originalExpSc.getcNo());
                    kvs.put("原销售客户", originalExpSc.getCstName());
                    kvs.putAll(getExpScCmdMap(originalExpSc)); // 合同标的
                    info.setKvs(kvs);
                    template.put("info_temp_two", info);

                    TemplateInfo info2 = new TemplateInfo();
                    info2.setHeader("转卖基本信息");
                    Map<String, String> kvs2 = new LinkedHashMap<>();
                    kvs2.put("销售合同号", expSc.getcNo() == null ? "" : expSc.getcNo());
                    kvs2.put("销售客户", expSc.getCstName() == null ? "" : expSc.getCstName());
                    kvs2.putAll(getExpScCmdMap(expSc)); // 合同标的
                    kvs2.put("合同金额", expSc.gettAmt().toEngineeringString());
                    kvs2.put("保证金比例", expSc.getBailRate() + "%");
                    kvs2.put("合同周期", map0.getOrDefault(expSc.getConPeriodSType(), "") + " " + expSc.getConPeriod() + "天");
                    kvs2.put("付款方式 ", expSc.getPayTerm());
                    kvs2.put("交货地点 ", expSc.getDeliveryPlace());
                    info2.setKvs(kvs2);
                    template.put("info_temp_two#2", info2);
                } else if ("PT".equals(bizMode) || "PR_P".equals(bizMode)) { // 自营
                    TemplateInfo info2 = new TemplateInfo();
                    info2.setHeader("基本信息");
                    Map<String, String> kvs2 = new LinkedHashMap<>();
//					kvs2.put("销售合同号", expSc.getcNo() == null ? "" : expSc.getcNo());
//					kvs2.put("销售客户", expSc.getCstName() == null ? "" : expSc.getCstName());
                    kvs2.putAll(getExpScCmdMap(expSc)); // 合同标的
                    kvs2.put("合同金额", expSc.gettAmt().toEngineeringString());
                    kvs2.put("保证金比例", expSc.getBailRate() + "%");
                    kvs2.put("发货期限 ", expSc.getSendTerm() == null ? "" : expSc.getSendTerm());
                    kvs2.put("合同周期", map0.getOrDefault(expSc.getConPeriodSType(), "") + " " + expSc.getConPeriod() + "天");
                    kvs2.put("付款方式 ", expSc.getPayTerm());
                    kvs2.put("预计收益", expSc.getProfitSchemeDesc() == null ? "" : expSc.getProfitSchemeDesc());
                    kvs2.put("交货方式 ", expSc.getPriceTerm() == null ? "" : expSc.getPriceTerm());
                    kvs2.put("交货地点 ", expSc.getDeliveryPlace());
                    String transRespNotes = "";
                    String transResp = expSc.getTransResp();
                    if (transResp != null && !"".equals(transResp)) {
                        TDicBasicInfo tmpInfo = basicInfoService.selectByNameAndType("TR_TRANS_RESP", transResp);
                        transRespNotes = tmpInfo.getStrNotes();
                    }
                    kvs2.put("运输负责方 ", transRespNotes);
                    kvs2.put("运输公司", expSc.getTransCorpName());
                    kvs2.put("仓储单位 ", expSc.getWhName() == null ? "" : expSc.getWhName());
                    kvs2.put("是否赊销 ", expSc.getIsOa());
                    kvs2.put("客户在手情况", templateService.customerInHand(scId));
                    info2.setKvs(kvs2);
                    template.put("info_temp_two#2", info2);
                }
            }
        }
        return template;
    }

    /*
     * from view_tr_io_dtl_classic curr_type, pay_amt,io_date, pw_id, pat_name,
     * pay_kind, io_status
     */
    private Map<String, Object> getExpBcTemplateListFour(String item, TExpBc expBc) {
        Map<String, Object> template = null;
        if ("fk".equals(item)) { // 付款
            if (expBc != null) {
                // List<PayApplyBean> payApplys =
                // pubPayApplyService.selectByBcId(expBc.getBcId());// 一般支付
                List<PayApplyBean> payApplys = templateDao.selectItemFk(TOB_P_ORDER, expBc.getBcId().toPlainString());
                if (CollectionUtils.isNotEmpty(payApplys)) {
                    template = new LinkedHashMap<>();
                    // 查询
                    List<String> goodsFunds = feeKindService.selectFeeKindsByFkId(1L);// 货款 1
                    List<String> costs = feeKindService.selectFeeKindsByFkId(2L);// 费用 2
                    List<String> taxFunds = feeKindService.selectFeeKindsByFkId(3L);// 税款 3
                    List<String> bails = feeKindService.selectFeeKindsByFkId(4L);// 保证金 4
                    List<String> comms = feeKindService.selectFeeKindsByFkId(29L);// 佣金 29
                    List<Map<String, Object>> goodsFundKvs = new ArrayList<>();
                    List<Map<String, Object>> costsFundKvs = new ArrayList<>();
                    List<Map<String, Object>> taxsFundKvs = new ArrayList<>();
                    List<Map<String, Object>> bailsFundKvs = new ArrayList<>();
                    List<Map<String, Object>> commsFundKvs = new ArrayList<>();
                    for (int i = 0; i < payApplys.size(); i++) {
                        PayApplyBean payApply = payApplys.get(i);
                        String fkId = payApply.getFkId().toString();
                        Map<String, Object> map = new LinkedHashMap<>();
                        TDicPayWay payWay = payWayService.selectByPrimaryKey(payApply.getPwId());
                        map.put(payWay.getPwName(), payApply.getConfirm()); // 结算方式 pw_id 审批状态confirm
                        BigDecimal feeAmt = payApply.getFeeAmt();
                        map.put(payApply.getFeeKind(),
                                payApply.getCurrType() + " " + NumberFormatUtils.getCurrency(feeAmt));// 金额curr_type
                        // fee_amt 款项性质
                        // fee_kind
                        map.put(payApply.getCstName(), DateUtils.format(payApply.getmDate()));// 单位cst_name 日期 m_date
                        if (goodsFunds.contains(fkId)) { // 货款
                            goodsFundKvs.add(map);
                        } else if (costs.contains(fkId)) {// 费用
                            costsFundKvs.add(map);
                        } else if (taxFunds.contains(fkId)) {// 税款
                            taxsFundKvs.add(map);
                        } else if (bails.contains(fkId)) {// 保证金
                            bailsFundKvs.add(map);
                        } else if (comms.contains(fkId)) {// 佣金
                            commsFundKvs.add(map);
                        }
                    }
                    if (CollectionUtils.isNotEmpty(goodsFundKvs)) {
                        TemplateListFour templateListFour = new TemplateListFour();
                        templateListFour.setHeader("货款");
                        // 获取对应的开证
                        List<LcPayApplyBean> lcPays = lcOpenService.selectLcApplyByTobId(expBc.getBcId().toString(),
                                "P_ORDER");
                        if (CollectionUtils.isNotEmpty(lcPays)) {
                            for (int i = 0; i < lcPays.size(); i++) {
                                LcPayApplyBean lcPay = lcPays.get(i);
                                Map<String, Object> map = new LinkedHashMap<>();
                                map.put("开证", lcPay.getConfirm());
                                if ("I".equals(lcPay.getIoTag())) {// 国内
                                    map.put("国内", lcPay.getCurrType() + " "
                                            + NumberFormatUtils.getCurrency(lcPay.getLcAmt()));
                                } else if ("O".equals(lcPay.getIoTag())) {
                                    map.put("国际", lcPay.getCurrType() + " "
                                            + NumberFormatUtils.getCurrency(lcPay.getLcAmt()));
                                } else {
                                    map.put(" ", lcPay.getCurrType() + " "
                                            + NumberFormatUtils.getCurrency(lcPay.getLcAmt()));
                                }
                                map.put(lcPay.getBeneficiaryName(), DateUtils.format(lcPay.getmDate()));
                                goodsFundKvs.add(map);
                            }
                        }
                        // 获取DAP
                        templateListFour.setKvs(goodsFundKvs);
                        template.put("info_temp_list_four", templateListFour);
                    }
                    if (CollectionUtils.isNotEmpty(costsFundKvs)) {
                        TemplateListFour templateListFour = new TemplateListFour();
                        templateListFour.setHeader("费用");
                        templateListFour.setKvs(costsFundKvs);
                        template.put("info_temp_list_four#1", templateListFour);
                    } else if (CollectionUtils.isNotEmpty(taxsFundKvs)) {
                        TemplateListFour templateListFour = new TemplateListFour();
                        templateListFour.setHeader("税款");
                        templateListFour.setKvs(taxsFundKvs);
                        template.put("info_temp_list_four#2", templateListFour);
                    } else if (CollectionUtils.isNotEmpty(bailsFundKvs)) {
                        TemplateListFour templateListFour = new TemplateListFour();
                        templateListFour.setHeader("保证金");
                        templateListFour.setKvs(bailsFundKvs);
                        template.put("info_temp_list_four#3", templateListFour);
                    } else if (CollectionUtils.isNotEmpty(commsFundKvs)) {
                        TemplateListFour templateListFour = new TemplateListFour();
                        templateListFour.setHeader("佣金");
                        templateListFour.setKvs(commsFundKvs);
                        template.put("info_temp_list_four#4", templateListFour);
                    }
                }
            }
        } else if ("fp".equals(item)) { // 发票
            // 国内发票 国外税单
            if (expBc != null) {
                template = new LinkedHashMap<>();
                // 发票
                List<TInvIncome> invs = invIncomeService.queryByBcId("I", "P_ORDER", expBc.getBcId());
                List<TInvIncome> invsO = invIncomeService.queryByBcId("O", "P_ORDER", expBc.getBcId());
                invs.addAll(invsO);
                List<Map<String, Object>> goodsFundKvs = new ArrayList<>();
                List<Map<String, Object>> costsFundKvs = new ArrayList<>();
                List<Map<String, Object>> taxsFundKvs = new ArrayList<>();
                if (CollectionUtils.isNotEmpty(invs)) {
                    // 费用类型 税单:TAX/税单 费用:FEE/费用 货款:HK
                    for (int i = 0; i < invs.size(); i++) {
                        TInvIncome invIncome = invs.get(i);
                        String kpKind = invIncome.getKpKind();
                        Map<String, Object> map = new LinkedHashMap<>();
                        // 发票类型
                        Long ikId = invIncome.getIkId();
                        String ikName = "";
                        TDicInvKind invKind = invKindService.selectByPrimaryKey(ikId);
                        if (invKind != null) {
                            ikName = invKind.getIkProp();
                        }
                        // 发票金额
                        map.put(ikName, invIncome.getInvCode()); //
                        map.put(invIncome.getFromUnitName(),
                                invIncome.getCurrType() + " " + NumberFormatUtils.getCurrency(invIncome.getFpAmt()));
                        map.put("成本金额", invIncome.getCurrType() + " "
                                + NumberFormatUtils.getCurrency(invIncome.getFpPriceAmt()));
                        map.put("数量", invIncome.getCommQuant());
                        // map.put("时间",DateUtils.format(invIncome.getInvDate()));// 开票人 时间
                        if ("HK".equalsIgnoreCase(kpKind)) {
                            goodsFundKvs.add(map);
                        } else if ("FEE".equalsIgnoreCase(kpKind) || "费用".equals(kpKind)) {
                            costsFundKvs.add(map);
                        }
                    }
                }
                // 税单
                if (CollectionUtils.isNotEmpty(goodsFundKvs)) {
                    TemplateListFour templateListFour = new TemplateListFour();
                    templateListFour.setHeader("货款");
                    templateListFour.setKvs(goodsFundKvs);
                    template.put("info_temp_list_four", templateListFour);
                }
                if (CollectionUtils.isNotEmpty(costsFundKvs)) {
                    TemplateListFour templateListFour = new TemplateListFour();
                    templateListFour.setHeader("费用");
                    templateListFour.setKvs(costsFundKvs);
                    template.put("info_temp_list_four#1", templateListFour);
                } else if (CollectionUtils.isNotEmpty(taxsFundKvs)) {
                    TemplateListFour templateListFour = new TemplateListFour();
                    templateListFour.setHeader("税款");
                    templateListFour.setKvs(taxsFundKvs);
                    template.put("info_temp_list_four#2", templateListFour);
                }
            }
        } else if ("wl".equals(item)) { // 物流
            if (expBc != null) {
                template = new LinkedHashMap<>();
                TemplateListFour templateListFour = new TemplateListFour();
                templateListFour.setHeader("货物");
                List<Map<String, Object>> wls = new ArrayList<>();
                List<Map<String, Object>> wlList = templateDao.selectItemWl(TOB_P_ORDER,
                        expBc.getBcId().toPlainString());
                // 提单：T_TR_LOGI_BL
                // 入库：T_TR_LOGI_RK
                // 运输：T_TR_LOGI_TRANS
                // 工厂调拨：T_TR_SOUT
                if (CollectionUtils.isNotEmpty(wlList)) {
                    for (int i = 0; i < wlList.size(); i++) {
                        Map<String, Object> wlMap = wlList.get(i);
                        Map<String, Object> map = new LinkedHashMap<>();
                        String logi_doc_type = wlMap.get("LOGI_DOC_TYPE").toString();
                        String logi_doc_no = (String) wlMap.getOrDefault("LOGI_DOC_NO", "");
                        String comm_name = wlMap.get("COMM_NAME").toString();
                        String r_date = wlMap.get("R_DATE").toString();
                        String tol_comm_quant = wlMap.get("TOL_COMM_QUANT").toString();
                        BigDecimal invPrice = new BigDecimal(wlMap.getOrDefault("INV_PRICE", "0").toString());
                        Long comm_unit = Long.valueOf(wlMap.get("COMM_UNIT").toString());
                        if ("T_TR_LOGI_BL".equals(logi_doc_type)) {
                            map.put("提单", logi_doc_no);
                        } else if ("T_TR_LOGI_RK".equals(logi_doc_type)) {
                            map.put("入库", logi_doc_no);
                        } else if ("T_TR_LOGI_TRANS".equals(logi_doc_type)) {
                            map.put("运输", logi_doc_no);
                        } else if ("T_TR_SOUT".equals(logi_doc_type)) {
                            map.put("工厂调拨", logi_doc_no);
                        }
                        map.put(comm_name,
                                NumberFormatUtils.getCurrency(invPrice.multiply(new BigDecimal(tol_comm_quant))));
                        map.put(tol_comm_quant + sumecUnitService.queryDicUnitByUnitId(comm_unit).getUnitName(),
                                r_date);
                        wls.add(map);
                    }
                }
                templateListFour.setKvs(wls);
                template.put("info_temp_list_four", templateListFour);
            }
        }
        return template;
    }

    /**
     * <p>
     * 方法描述：获取
     * </p>
     *
     * @return
     * @author zhoujiquan <br />
     * @date： 2018年4月4日 上午10:14:55<br/>
     */
    private Map<String, Object> getExpScTemplateListFour(String item, TExpSc expSc) {
        Map<String, Object> template = null;
        if ("fh".equals(item)) // fa huo
        {
            if (expSc != null) {
                template = new LinkedHashMap<>();
                TemplateListFour templateListFour = new TemplateListFour();
                templateListFour.setHeader("发货");
                List<Map<String, Object>> soutList = new ArrayList<>();
                List<TTrSoutBean> souts = trSoutService.selectByScId(expSc.getScId());
                for (TTrSoutBean sout : souts) {
                    Map<String, Object> map = new LinkedHashMap<>();
                    String soutType = sout.getSoutType();
                    if ("TOSO_SALES".equals(soutType)) {
                        map.put("货权方", sout.getCstName());
                        map.put("发货单号", sout.getSoNo());
                        map.put("发货日期", DateUtils.format(sout.getSoDate()));
                        map.put("发货金额", sout.getCurrType() + " " + NumberFormatUtils.getCurrency(sout.getSoAmt()));
                    }
                    if (null != map && map.size() >= 1) {
                        soutList.add(map);
                    }
                }
                templateListFour.setKvs(soutList);
                template.put("info_temp_list_four", templateListFour);
            }

        } else if ("sk".equals(item)) { // shou kuan
            if (expSc != null) {
                template = new LinkedHashMap<>();
                TemplateListFour templateListFour = new TemplateListFour();
                templateListFour.setHeader("收款");
                List<Map<String, Object>> pubIoList = new ArrayList<>();
                List<TPubIoBean> pubIos = tPubIoService.selectByScId(expSc.getScId());
                for (TPubIoBean pubIo : pubIos) {
                    Map<String, Object> map = new LinkedHashMap<>();
                    map.put("收款方式", pubIo.getPwName());
                    map.put("收款性质", pubIo.getFkName() == null ? "" : pubIo.getFkName());
                    map.put("收款金额", pubIo.getOriCurrType() + " " + NumberFormatUtils.getCurrency(pubIo.getOriAmt())); //
                    map.put("收款日期", DateUtils.format(pubIo.getIoDate()));
                    // map.put("是否议付", pubIo.getIsNego());
                    if ("议付".equals(pubIo.getIsNego())) {
                        map.put("议付金额", pubIo.getNegoList());
                        map.put("承兑金额", pubIo.getCdList());
                        map.put("到款金额", pubIo.getDkList());
                    }
                    if (null != map && map.size() >= 1) {
                        pubIoList.add(map);
                    }
                }
                templateListFour.setKvs(pubIoList);
                template.put("info_temp_list_four", templateListFour);

            }
        } else if ("js".equals(item)) { // jie suan
            if (expSc != null) {
                template = new LinkedHashMap<>();
                TemplateListFour templateListFour = new TemplateListFour();
                templateListFour.setHeader("结算");
                List<Map<String, Object>> invs = new ArrayList<>();
                List<InvJsBean> jsInvs = invJsService.selectByScId(expSc.getScId());
                if (jsInvs != null) {
                    for (InvJsBean jsInv : jsInvs) {
                        Map<String, Object> map = new LinkedHashMap<>();
                        String fkType = jsInv.getFkType();
                        if ("HK".equals(fkType)) {
                            map.put("结算类型", "货物交易");
                        } else if (null == fkType) {
                            map.put("结算类型", "服务交易");
                        }
                        map.put("结算金额", NumberFormatUtils.getCurrency(jsInv.gettAmt()));
                        map.put("结算日期", DateUtils.format(jsInv.getStlDate()));
                        map.put("是否开票", jsInv.getInvStatus() == null ? "" : jsInv.getInvStatus());
                        if (null != map && map.size() >= 1) {
                            invs.add(map);
                        }
                    }
                }
                templateListFour.setKvs(invs);
                template.put("info_temp_list_four", templateListFour);
            }
        }
        return template;
    }

    // 采购合同标的
    private Map<String, String> getExpBcCmdMap(TExpBc tExpBc) {
        List<TExpBcCmd> expBcCmdList = expBcCmdService.selectByBcId(tExpBc.getBcId());
        Map<String, String> result = new LinkedHashMap<>();
        TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(tExpBc.getCommUnit());
        String commUnitName = dicUnit != null ? dicUnit.getUnitName() : "";
        if (CollectionUtils.isNotEmpty(expBcCmdList)) {
            int expBcCmdListCount = expBcCmdList.size();
            BigDecimal pQuantAcc = BigDecimal.ZERO;
            String pricingWayNotes = "";
            String pName = "";
            BigDecimal objPrice = BigDecimal.ZERO;
            for (int i1 = 0; i1 < expBcCmdListCount; i1++) {
                TExpBcCmd expBcCmd = expBcCmdList.get(i1);
                pName = expBcCmd.getpName();
                pQuantAcc = pQuantAcc.add(expBcCmd.getpQuant());
                String pricingWay = tExpBc.getPricingWay();
                objPrice = expBcCmd.getObjPrice();
                if (pricingWay != null && !"".equals(pricingWay)) {
                    TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PRICING_WAY", pricingWay);
                    pricingWayNotes = basicInfo.getStrNotes();
                }
            }
            result.put("合同数量/标的", NumberFormatUtils.getNumber(pQuantAcc) + " " + commUnitName + "/" + pName);
            result.put("采购单价(定价方式)", NumberFormatUtils.getCurrency(objPrice) + "(" + pricingWayNotes + ")");
        }

        return result;
    }

    // 销售合同标的
    private Map<String, String> getExpScCmdMap(TExpSc expSc) {
        String pricingWay = expSc.getPricingWay();
        String pricingWayNotes = "";
        if (pricingWay != null && !"".equals(pricingWay)) {
            TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_PRICING_WAY", pricingWay);
            pricingWayNotes = basicInfo.getStrNotes(); // 定价方式
        }

        BigDecimal objPrice = BigDecimal.ZERO;
        BigDecimal pQuantAcc = BigDecimal.ZERO;
        String commUnitName1 = "";
        String pName = "";
        Map<String, String> result = new LinkedHashMap<>();
        List<TExpScCmd> expScCmdList = expScCmdService.selectByScId(expSc.getScId());
        if (CollectionUtils.isNotEmpty(expScCmdList)) {
            for (int i1 = 0; i1 < expScCmdList.size(); i1++) {
                TExpScCmd expScCmd = expScCmdList.get(i1);
                objPrice = expScCmd.getObjPrice();
                pName = expScCmd.getpName();
                pQuantAcc = pQuantAcc.add(expScCmd.getpQuant());
                if (expSc.getCommUnit() != null) {
                    TDicUnitEntity dicUnit1 = sumecUnitService.queryDicUnitByUnitId(expSc.getCommUnit());
                    if (dicUnit1 != null) {
                        commUnitName1 = dicUnit1.getUnitName();
                    }
                }
            }
            result.put("合同数量/标的", NumberFormatUtils.getNumber(pQuantAcc) + "" + commUnitName1 + "/" + pName);
            result.put("销售单价（定价方式）", NumberFormatUtils.getCurrency(objPrice) + "(" + pricingWayNotes + ")");
        }

        return result;
    }

    /**
     * <p>
     * 方法描述：判断用户是否有查看合同的权限
     * </p>
     *
     * @param userId
     * @return
     * @author SunTow_J <br />
     * @date： 2018年3月28日 上午11:00:02<br/>
     */
    private Set<TTrOcuDivide> viewContractPermission(Long userId) {
        Set<TTrOcuDivide> res = null;
        Set<Long> cellIds = new HashSet<>();
        Set<Long> userIds = new HashSet<>();
        Set<Long> pOrderCellIds = sumecAuthorityService.selectCellIdsByUserId(userId, "M_TR_PUR_ORDER", "VIEW");
        Set<Long> pOrderUserIds = sumecAuthorityService.selectUserIdsByUserId(userId, "M_TR_PUR_ORDER", "VIEW");
        Set<Long> sOrderCellIds = sumecAuthorityService.selectCellIdsByUserId(userId, "M_TR_SALES_ORDER", "VIEW");
        Set<Long> sOrderUserIds = sumecAuthorityService.selectUserIdsByUserId(userId, "M_TR_SALES_ORDER", "VIEW");
        if (CollectionUtils.isNotEmpty(pOrderCellIds)) {
            cellIds.addAll(pOrderCellIds);
        }
        if (CollectionUtils.isNotEmpty(sOrderCellIds)) {
            cellIds.addAll(sOrderCellIds);
        }
        if (CollectionUtils.isNotEmpty(pOrderUserIds)) {
            userIds.addAll(pOrderUserIds);
        }
        if (CollectionUtils.isNotEmpty(sOrderUserIds)) {
            userIds.addAll(sOrderUserIds);
        }
        if (CollectionUtils.isEmpty(cellIds) && CollectionUtils.isEmpty(userIds)) {
            return null;
        }
        List<TTrOcuDivide> contractsByCells = null;
        // 分摊下的合同
        if (CollectionUtils.isNotEmpty(cellIds)) {
            List<Long> cellList = new ArrayList<>(cellIds);
            contractsByCells = ocuDivideService.selectByOcuIds(cellList);
        }
        // 制作的采购合同
        List<TTrOcuDivide> pContractsByUsers = null;
        // 制作的销售合同
        List<TTrOcuDivide> sContractsByUsers = null;
        if (CollectionUtils.isNotEmpty(userIds)) {
            List<Long> userList = new ArrayList<>(userIds);
            pContractsByUsers = expBcService.selectByUserIds(userList);
            sContractsByUsers = expScService.selectByUserIds(userList);
        }
        res = new HashSet<>();
        if (CollectionUtils.isNotEmpty(contractsByCells)) {
            res.addAll(contractsByCells);
        }
        if (CollectionUtils.isNotEmpty(pContractsByUsers)) {
            res.addAll(pContractsByUsers);
        }
        if (CollectionUtils.isNotEmpty(sContractsByUsers)) {
            res.addAll(sContractsByUsers);
        }
        return res;
    }
}
