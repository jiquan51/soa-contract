package com.sumec.template.service.impl;

import com.sumec.api.base.bean.TSumecCell;
import com.sumec.api.base.bean.TSumecOrg;
import com.sumec.api.base.service.ISumecCellService;
import com.sumec.api.base.service.ISumecOrgService;
import com.sumec.api.data.bean.TDicBasicInfo;
import com.sumec.api.data.bean.TDicComm;
import com.sumec.api.data.bean.TDicUnitEntity;
import com.sumec.api.data.bean.TFdAcc;
import com.sumec.api.data.service.IDicBasicInfoService;
import com.sumec.api.data.service.IDicCommService;
import com.sumec.api.data.service.IFdAccService;
import com.sumec.api.data.service.ISumecUnitService;
import com.sumec.api.inv.bean.InvJsBean;
import com.sumec.api.inv.bean.TInvIncome;
import com.sumec.api.inv.service.IInvIncomeService;
import com.sumec.api.inv.service.InvJsService;
import com.sumec.api.pay.bean.PayApplyBean;
import com.sumec.api.pay.bean.TPubIoBean;
import com.sumec.api.pay.service.ITPubIoService;
import com.sumec.api.tran.entity.TTrSoutBean;
import com.sumec.api.tran.service.ITrSoutService;
import com.sumec.base.BaseEntity;
import com.sumec.contract.constant.DictConstant;
import com.sumec.contract.dao.IExpBcDao;
import com.sumec.contract.dao.IExpScDao;
import com.sumec.contract.dao.ITrContractRelDao;
import com.sumec.contract.dao.ITrPurchaseTrackDao;
import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TExpSc;
import com.sumec.contract.entity.TTrPurchaseTrack;
import com.sumec.contract.entity.TTrSalesTrack;
import com.sumec.contract.service.IExpBcService;
import com.sumec.contract.service.ISalesTrackService;
import com.sumec.pkg.dao.ITrPkgRelDao;
import com.sumec.pkg.entity.TTrPkg;
import com.sumec.pkg.entity.TTrPkgRel;
import com.sumec.template.bean.BaseTemplate;
import com.sumec.template.bean.ChatBean;
import com.sumec.template.bean.TemplateCard;
import com.sumec.template.bean.TemplateSummary;
import com.sumec.template.dao.ITemplateDao;
import com.sumec.template.service.ITemplateService;
import com.sumec.utils.DateUtils;
import com.sumec.utils.NumberFormatUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * <p>
 * 功能描述：添加功能描述.
 * </p>
 * <br/>
 * 
 * @date： 2018年3月19日 下午1:47:00<br/>
 * 
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class TemplateServiceImpl implements ITemplateService {

	private final String TOB_P_ORDER = "P_ORDER";
	private final BigDecimal HK = new BigDecimal(1);

	@Autowired
	private ITrPkgRelDao pkgRelDao;
	@Autowired
	private IExpBcDao expBcDao;
	@Autowired
	private IExpScDao expScDao;
	@Autowired
	private ITrPurchaseTrackDao purchaseTrackDao;
	@Autowired
	private ITrContractRelDao contractRelDao; // add
	@Autowired
	private ITemplateDao templateDao; // add
	@Autowired
	private ISalesTrackService salesTrackService;
	@Autowired
	private IDicBasicInfoService basicInfoService;
	@Autowired
	private IFdAccService fdAccService;
	@Autowired
	private ISumecUnitService sumecUnitService;
	@Autowired
	private ISumecOrgService sumecOrgService;
	@Autowired
	private ISumecCellService sumecCellService;
	@Autowired
	private IDicCommService dicCommService;
	@Autowired
	private ITrSoutService trSoutService;
	@Autowired
	private InvJsService invJsService;
	@Autowired
	private ITPubIoService tPubIoService;
	@Autowired
	private IInvIncomeService invIncomeService;
	@Autowired
	private IExpBcService expBcService;

	@Override
	public Map<String, Object> queryPgkSum(TTrPkg trPkg, Map<String, List<String>> ids, String type) {
		Map<String, Object> template = null;
		if (ids != null && !ids.isEmpty()) {
			template = new LinkedHashMap<>();
			List<String> expBcIds = ids.get("P_ORDER");
			// List<String> expScIds = ids.get("S_ORDER");
			if (trPkg != null && "T_TR_PKG".equals(type)) {
				String pkgType = trPkg.getPkgType();
				/* TR_JK_PR // 代理进口 TR_JK_PT // 自营进口 TR_NM_PR // 代理内贸 TR_EXP_PT // 自营出口 */
				// TTrPurchaseTrack purchaseTrackSc = null;
				// if(CollectionUtils.isNotEmpty(expScIds)){
				// purchaseTrackSc = purchaseTrackDao.selectByIds("T_EXP_SC",expScIds);
				// }
				if (CollectionUtils.isNotEmpty(expBcIds)) {
					TTrPurchaseTrack purchaseTrack = purchaseTrackDao.selectByIds("T_EXP_BC", expBcIds);
					if (purchaseTrack != null) {
						List<BaseTemplate> twos = new ArrayList<>();
						TemplateCard two1 = new TemplateCard();
						two1.setHeader("付款");
						Map<String, String> hiddenKvs1 = new HashMap<>();
						hiddenKvs1.put("id", trPkg.getPkgId());
						hiddenKvs1.put("type", "T_TR_PKG");
						hiddenKvs1.put("route", "Payment");
						two1.setHiddenKvs(hiddenKvs1);
						Map<String, String> map1 = new LinkedHashMap<>();
						// 合同金额 BC_AMT_ACC
						BigDecimal bcAmtAcc = purchaseTrack.getBcAmtAcc();
						// 货款 payed_amt_hk_acc
						BigDecimal payedAmtHkAcc = purchaseTrack.getPayedAmtHkAcc();
						if (payedAmtHkAcc == null || payedAmtHkAcc.intValue() == 0) {
							map1.put("货款", "无");
						} else {
							map1.put("货款", NumberFormatUtils.getCurrency(payedAmtHkAcc));
						}
						// 费用 payed_amt_fee_acc
						BigDecimal payedAmtFeeAcc = purchaseTrack.getPayedAmtFeeAcc();
						if (payedAmtFeeAcc == null || payedAmtFeeAcc.intValue() == 0) {
							map1.put("费用", "无");
						} else {
							map1.put("费用", NumberFormatUtils.getCurrency(payedAmtFeeAcc));
						}
						if ("TR_JK_PR".equals(pkgType) || "TR_JK_PT".equals(pkgType)) {
							// 税费 payed_amt_tax_acc
							BigDecimal payedAmtTaxAcc = purchaseTrack.getPayedAmtTaxAcc();
							if (payedAmtTaxAcc == null || payedAmtTaxAcc.intValue() == 0) {
								map1.put("税费", "无");
							} else {
								map1.put("税费", NumberFormatUtils.getCurrency(payedAmtTaxAcc));
							}
						} else if ("TR_EXP_PT".equals(pkgType) || "TR_NM_PT".equals(pkgType)) {
							// 发票 COLL_INV_AMT
							BigDecimal collInvAmt = purchaseTrack.getCollInvAmt();
							if (collInvAmt == null || collInvAmt.intValue() == 0) {
								map1.put("发票", "无");
							} else {
								map1.put("发票", NumberFormatUtils.getCurrency(collInvAmt));
							}
						}
						two1.setKvs(map1);
						// 付款比例 payed_rate
						// payed_amt_hk_acc / p_amt
						if (payedAmtHkAcc != null && bcAmtAcc != null) {
							double payedRate = payedAmtHkAcc.divide(bcAmtAcc, BigDecimal.ROUND_HALF_UP).doubleValue();
							two1.setChart(NumberFormatUtils.getPercent(payedRate));
						}
						twos.add(two1);
						/*
						 * // 销售金额 SALES_AMT BigDecimal salesAmt = purchaseTrack.getSalesAmt();
						 * if(salesAmt != null){ // 收款 TemplateCard two4 = new TemplateCard();
						 * two4.setHeader("收款"); two4.setHiddenKvs(hiddenKvs); Map<String,String> map4 =
						 * new LinkedHashMap<>(); // 销售金额 SALES_AMT
						 * map4.put("销售金额",NumberFormatUtils.getCurrency(salesAmt)); // 销售数量 SALES_QUANT
						 * BigDecimal salesQuant = purchaseTrack.getSalesQuant();
						 * map4.put("销售数量",NumberFormatUtils.getNumber(salesQuant)); two4.setKvs(map4);
						 * // 比例 SALES_AMT / bcAmtAcc if(salesAmt != null && bcAmtAcc != null){ double
						 * payedRate = salesAmt.divide(bcAmtAcc,BigDecimal.ROUND_HALF_UP).doubleValue();
						 * two4.setChart(NumberFormatUtils.getPercent(payedRate)); } twos.add(two4); }
						 */
						TemplateCard two2 = new TemplateCard();
						two2.setHeader("物流");
						Map<String, String> hiddenKvs2 = new HashMap<>();
						hiddenKvs2.put("id", trPkg.getPkgId());
						hiddenKvs2.put("type", "T_TR_PKG");
						hiddenKvs2.put("route", "Logistics");
						two2.setHiddenKvs(hiddenKvs2);
						Map<String, String> map2 = new LinkedHashMap<>();
						// 发货 send_amt
						BigDecimal sendAmt = purchaseTrack.getSendAmt();
						if (sendAmt == null || sendAmt.intValue() == 0) {
							map2.put("发货金额", "无");
						} else {
							map2.put("发货金额", NumberFormatUtils.getCurrency(sendAmt));
						}
						// 数量 send_quant
						BigDecimal sendQuant = purchaseTrack.getSendQuant();
						if (sendQuant == null || sendQuant.intValue() == 0) {
							map2.put("数量", "无");
						} else {
							map2.put("数量", NumberFormatUtils.getNumber(sendQuant));
						}
						two2.setKvs(map2);
						// 发货比例 send_amt / bcAmtAcc
						if (sendAmt != null && bcAmtAcc != null) {
							double payedRate = sendAmt.divide(bcAmtAcc, BigDecimal.ROUND_HALF_UP).doubleValue();
							two2.setChart(NumberFormatUtils.getPercent(payedRate));
						}
						twos.add(two2);

						TemplateCard two3 = new TemplateCard();
						two3.setHeader("发票");
						Map<String, String> hiddenKvs3 = new HashMap<>();
						hiddenKvs3.put("id", trPkg.getPkgId());
						hiddenKvs3.put("type", "T_TR_PKG");
						hiddenKvs3.put("route", "Invoice");
						two3.setHiddenKvs(hiddenKvs3);
						Map<String, String> map3 = new LinkedHashMap<>();
						// 进项发票数量 COLL_INV_QUANT
						BigDecimal collInvQuant = purchaseTrack.getCollInvQuant();
						if (collInvQuant == null || collInvQuant.intValue() == 0) {
							map3.put("票面数量", "无");
						} else {
							map3.put("票面数量", NumberFormatUtils.getNumber(collInvQuant));
						}
						// 进项发票金额_票面 COLL_INV_AMT
						BigDecimal collInvAmt = purchaseTrack.getCollInvAmt();
						if (collInvAmt == null || collInvAmt.intValue() == 0) {
							map3.put("票面金额", "无");
						} else {
							map3.put("票面金额", NumberFormatUtils.getCurrency(collInvAmt));
						}
						// 进项发票金额_成本 COLL_INV_AMT_COST
						BigDecimal collInvAmtCost = purchaseTrack.getCollInvAmtCost();
						if (collInvAmtCost == null || collInvAmtCost.intValue() == 0) {
							map3.put("票面金额成本", "无");
						} else {
							map3.put("票面金额成本", NumberFormatUtils.getCurrency(collInvAmtCost));
						}
						if (collInvAmt != null && bcAmtAcc != null) {
							double payedRate = collInvAmt.divide(bcAmtAcc, BigDecimal.ROUND_HALF_UP).doubleValue();
							two3.setChart(NumberFormatUtils.getPercent(payedRate));
						}
						two3.setKvs(map3);
						twos.add(two3);
						template.put("card_temp", twos);
					}
				}
			}
		}
		return template;
	}

	@Override
	public Map<String, Object> queryPgkDetail(TTrPkg trPkg, String pkgId, String tobType) {
		// Map<String,BaseEntity> contractMap = getContractEntity(pkgId,tobType);
		// TExpBc expBc = (TExpBc)contractMap.get("P_ORDER");
		// TExpSc expSc = (TExpSc)contractMap.get("S_ORDER");
		// Map<String,Object> template = getPkgTemplateTwo(trPkg,expSc,expBc,tobType);
		// return template;
		return null;
	}

	/**
	 * 
	 * <p>
	 * 方法描述：获取销售合同汇总概要
	 * </p>
	 *
	 * @author SunTow_J <br />
	 * 		@date： 2018年1月12日 下午2:34:49<br/>
	 * @param expBc
	 * @return
	 */
	@Override
	public TemplateSummary getPkgTemplateOne(TTrPkg trPkg, TExpSc expSc, TExpBc expBc, String type) {
		TemplateSummary one = new TemplateSummary();
		if ("T_TR_PKG".equals(type)) {
			// 隐藏属性
			Map<String, String> hiddenKvs = new HashMap<>();
			if (expBc != null) {
				hiddenKvs.put("id", expBc.getBcId() + "");
				hiddenKvs.put("type", "T_EXP_BC");
				// 进入合同详情页面
				hiddenKvs.put("route", "Contract");

				one.setNo("[采购] " + expBc.getcNo());
				// 0:未签约 1:执行中 2:已终止 3:已关闭
				one.setStatus(DictConstant.C_STATUS.get(expBc.getcStatus()));
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
				/*
				 * if(expBc.getLandNationId() != null){ TDicCpc dicCpc =
				 * dicCpcService.selectByPrimaryKey(expBc.getLandNationId()); if(dicCpc !=
				 * null){ tags.add(dicCpc.getCpcNameCn()); } }
				 */
				// type_of_con 合同类型 买卖合同 TR_TYPE_OF_CON type_of_con
				if (StringUtils.isNotEmpty(expBc.getTypeOfCon())) {
					TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_TYPE_OF_CON",
							expBc.getTypeOfCon());
					if (basicInfo != null) {
						tags.add(basicInfo.getStrNotes());
					}
				}
				// prop_of_con 合同性质 购销 TR_PROP_OF_CON
				// if(StringUtils.isNotEmpty(expBc.getPropOfCon())){
				// TDicBasicInfo basicInfo =
				// basicInfoService.selectByNameAndType("TR_PROP_OF_CON",expBc.getPropOfCon());
				// if(basicInfo != null){
				// tags.add(basicInfo.getStrNotes());
				// }
				// }
				// biz mode
				String bizMode = expBc.getBizMode();
				if (StringUtils.isNotEmpty(bizMode)) {
					TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_PUR", bizMode);
					tags.add(basicInfo.getStrNotes());
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
				String person = getExpBcDepartMent(expBc);
				one.setPerson(person.toString());
			} else {
				hiddenKvs.put("id", expSc.getScId() + "");
				hiddenKvs.put("type", "T_EXP_SC");
				hiddenKvs.put("route", "Contract");
				one.setNo("[销售] " + expSc.getcNo());
				// 0:未签约 1:执行中 2:已终止 3:已关闭
				one.setStatus(DictConstant.C_STATUS.get(expSc.getcStatus()));
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
				// TDicCpc dicCpc =
				// dicCpcService.selectByPrimaryKey(expSc.getLandNationId());
				// if(dicCpc != null){
				// tags.add(dicCpc.getCpcNameCn());
				// }
				// }
				// type_of_con 合同类型 买卖合同 TR_TYPE_OF_CON type_of_con
				if (StringUtils.isNotEmpty(expSc.getTypeOfCon())) {
					TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_TYPE_OF_CON",
							expSc.getTypeOfCon());
					if (basicInfo != null) {
						tags.add(basicInfo.getStrNotes());
					}
				}
				// // prop_of_con 合同性质 购销 TR_PROP_OF_CON
				// if(StringUtils.isNotEmpty(expSc.getPropOfCon())){
				// TDicBasicInfo basicInfo =
				// basicInfoService.selectByNameAndType("TR_PROP_OF_CON",expSc.getPropOfCon());
				// if(basicInfo != null){
				// tags.add(basicInfo.getStrNotes());
				// }
				// }
				// biz mode
				String bizMode = expSc.getBizMode();
				if (StringUtils.isNotEmpty(bizMode)) {
					TDicBasicInfo basicInfo = basicInfoService.selectByNameAndType("TR_BIZ_MODE_SALES", bizMode);
					tags.add(basicInfo.getStrNotes());
				}
				// biz_mode 业务模式 纯自营 TR_BIZ_MODE_PUR
				// cata_of_con 合同分类 订单 TR_CATA_OF_CON
				if (CollectionUtils.isNotEmpty(tags)) {
					one.setTags(tags);
				}
				Map<String, Object> kvs = new LinkedHashMap<>();
				// 项目号
				// kvs.put("项目号",trPkg.getPkgCode());
				kvs.put("项目号", expSc.getcNo());
				// 客户
				kvs.put("客户", expSc.getCstName());
				if (StringUtils.isNotEmpty(expSc.getAccNo())) {
					// 销售方
					TFdAcc fdAcc = fdAccService.selectByAccNo(expSc.getAccNo());
					if (fdAcc != null) {
						kvs.put("签约抬头", fdAcc.getAccShortName());
					}
				}
				// 商品
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
				kvs.put("品名", dicComm);

				// 数量 p_quant comm_unit
				Long commUnit = expSc.getCommUnit();
				String commUnitName = "";
				if (commUnit != null) {
					TDicUnitEntity dicUnit = sumecUnitService.queryDicUnitByUnitId(commUnit);
					if (dicUnit != null) {
						commUnitName = dicUnit.getUnitName();
					}
				}
				kvs.put("数量", NumberFormatUtils.getNumber(expSc.getpQuant()) + " " + commUnitName);
				// 金额 currType+pAmt
				kvs.put("金额", expSc.getCurrTyp() + " " + NumberFormatUtils.getCurrency(expSc.gettAmt()));
				one.setKvs(kvs);
				// 签约时间 sign_date
				one.setDate(DateUtils.format(expSc.getSignDate()));
				// 签约事业部-业务组-业务员 dep_org_id-ocu_org_id-cell_id
				String person = getExpScDepartMent(expSc);
				one.setPerson(person.toString());
			}
			/*
			 * if("TR_NM_PT".equals(tobType)){
			 * 
			 * }else if("TR_JK_PR".equals(tobType) || "TR_NM_PR".equals(tobType) ||
			 * "TR_EXP_PT".equals(tobType)){
			 * 
			 * }
			 */
		}
		return one;
	}

	/**
	 * 
	 * <p>
	 * 方法描述：获取销售合同中的业务人员信息
	 * </p>
	 *
	 * @author SunTow_J <br />
	 * 		@date： 2018年1月12日 上午11:15:54<br/>
	 * @param expSc
	 * @return
	 */
	@Override
	public String getExpScDepartMent(TExpSc expSc) {
		StringBuffer person = new StringBuffer();
		Long depOrgId = expSc.getDepOrgId();
		if (depOrgId != null) {
			TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(depOrgId.longValue());
			if (sumecOrg != null && StringUtils.isNotEmpty(sumecOrg.getOrgNameShort())) {
				person.append(sumecOrg.getOrgNameShort()).append("-");
			}
		}
		Long ocuOrgId = expSc.getOcuOrgId();
		if (ocuOrgId != null) {
			TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(ocuOrgId.longValue());
			if (sumecOrg != null && StringUtils.isNotEmpty(sumecOrg.getOrgNameShort())) {
				person.append(sumecOrg.getOrgNameShort()).append("-");
			}
		}
		BigDecimal cellId = expSc.getCellId();
		if (cellId != null) {
			TSumecCell sumecCell = sumecCellService.selectByCellId(cellId.longValue());
			if (sumecCell != null && StringUtils.isNotEmpty(sumecCell.getCellName())) {
				person.append(sumecCell.getCellName());
			}
		}
		return person.toString();
	};

	@Override
	public String getExpBcDepartMent(TExpBc expBc) {
		StringBuffer person = new StringBuffer();
		Long depOrgId = expBc.getDepOrgId();
		if (depOrgId != null) {
			TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(depOrgId.longValue());
			if (sumecOrg != null && StringUtils.isNotEmpty(sumecOrg.getOrgNameShort())) {
				person.append(sumecOrg.getOrgNameShort()).append("-");
			}
		}
		Long ocuOrgId = expBc.getOcuOrgId();
		if (ocuOrgId != null) {
			TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(ocuOrgId.longValue());
			if (sumecOrg != null && StringUtils.isNotEmpty(sumecOrg.getOrgNameShort())) {
				person.append(sumecOrg.getOrgNameShort()).append("-");
			}
		}
		BigDecimal cellId = expBc.getCellId();
		if (cellId != null) {
			TSumecCell sumecCell = sumecCellService.selectByCellId(cellId.longValue());
			if (sumecCell != null && StringUtils.isNotEmpty(sumecCell.getCellName())) {
				person.append(sumecCell.getCellName());
			}
		}
		return person.toString();
	};

	@Override
	public Map<String, List<BaseEntity>> getContractEntity(String pkgId, String tobType) {
		Map<String, List<BaseEntity>> map = new HashMap<>();
		List<TTrPkgRel> pOrders = pkgRelDao.selectByPkgIdAndType(pkgId, "P_ORDER");
		// S_ORDER从T_TR_pkg_rel改成t_tr_contract_rel取
		// List<TTrPkgRel> sOrders = pkgRelDao.selectByPkgIdAndType(pkgId,"S_ORDER");
		List<TTrPkgRel> sOrders = null;
		if (CollectionUtils.isEmpty(pOrders)) {
			sOrders = pkgRelDao.selectByPkgIdAndType(pkgId,"S_ORDER");
		} else {
			String tobId = pOrders.get(0).getTobId();
			sOrders = pkgRelDao.selectSOrderByPkgIdAndType(tobId, "S_ORDER");
		}
		if (CollectionUtils.isNotEmpty(sOrders)) {
			List<BaseEntity> expScs = null;
			for (TTrPkgRel tTrPkgRel : sOrders) {
				String tobId = tTrPkgRel.getTobId();
				TExpSc expSc = expScDao.selectByPrimaryKey(new BigDecimal(tobId));
				if (expSc != null) {
					if (map.containsKey("S_ORDER")) {
						expScs = map.get("S_ORDER");
						expScs.add(expSc);
					} else {
						expScs = new ArrayList<>();
						expScs.add(expSc);
						map.put("S_ORDER", expScs);
					}
				}
			}
		}
		if (CollectionUtils.isNotEmpty(pOrders)) {
			List<BaseEntity> expBcs = null;
			for (TTrPkgRel trPkgRel : pOrders) {
				String tobId = trPkgRel.getTobId();
				TExpBc expBc = expBcDao.selectByPrimaryKey(new BigDecimal(tobId));
				if (expBc != null) {
					if (map.containsKey("P_ORDER")) {
						expBcs = map.get("P_ORDER");
						expBcs.add(expBc);
					} else {
						expBcs = new ArrayList<>();
						expBcs.add(expBc);
						map.put("P_ORDER", expBcs);
					}
				}
			}
		}
		return map;
	}

	@Override
	public int selectLLCount(BigDecimal tobIdB, String relType, String tobTypeA, String tobTypeB) {
		return contractRelDao.selectLLCount(tobIdB, relType, tobTypeA, tobTypeB);
	}

	@Override
	public BigDecimal selectOriginalScId(BigDecimal scId) {
		return contractRelDao.selectOriginalScId(scId);
	}

	@Override
	public BigDecimal selectQUANT_PURCED(BigDecimal scId) {
		return templateDao.selectQUANT_PURCED(scId);
	}

	@Override
	public BigDecimal selectQUANT_SOLD(BigDecimal bcId) {
		return templateDao.selectQUANT_SOLD(bcId);
	}

	@Override
	public Map<String, BigDecimal> selectQuantOld(BigDecimal bcId) {
		return templateDao.selectQuantOld(bcId);
	}

	@Override
	public BigDecimal selectCountOld(BigDecimal bcId) {
		return templateDao.selectCountOld(bcId);
	}

	@Override
	public Map<String, BigDecimal> selectQuantNew(BigDecimal bcId) {
		return templateDao.selectQuantNew(bcId);
	}

	@Override
	public BigDecimal selectCountNew(BigDecimal bcId) {
		return templateDao.selectCountNew(bcId);
	}

	@Override
	public Map<String, BigDecimal> selectOldSc(BigDecimal scId) {
		return templateDao.selectOldSc(scId);
	}

	@Override
	public BigDecimal selectQuantNewSc(BigDecimal scId) {
		return templateDao.selectQuantNewSc(scId);
	}

	@Override
	public BigDecimal selectKc_quant_newSc(BigDecimal scId) {
		return templateDao.selectKc_quant_newSc(scId);
	}

	@Override
	public List<ChatBean> selectChatBean(String pkgId) {
		return templateDao.selectChatBean(pkgId);
	}

	@Override
	public String supplierInhand(BigDecimal bcId) {
		BigDecimal ll_cst_count_old = selectCountOld(bcId);
		BigDecimal ll_cst_count_new = selectCountNew(bcId);
		BigDecimal ll_cst_count = nil2zero(ll_cst_count_old).add(nil2zero(ll_cst_count_new));
		Map<String, BigDecimal> mapOld = selectQuantOld(bcId);
		Map<String, BigDecimal> mapNew = selectQuantNew(bcId);
		BigDecimal ld_total_quant_old = mapOld.get("LD_TOTAL_QUANT_OLD");
		BigDecimal ld_total_quant_new = mapNew.get("LD_TOTAL_QUANT_NEW");
		BigDecimal ld_unsend_quant_old = mapOld.get("LD_UNSEND_QUANT_OLD");
		BigDecimal ld_unsend_quant_new = mapNew.get("LD_UNSEND_QUANT_NEW");
		BigDecimal ld_unsend_amt_old = mapOld.get("LD_UNSEND_AMT_OLD");
		BigDecimal ld_unsend_amt_new = mapNew.get("LD_UNSEND_AMT_NEW");
		BigDecimal ld_total_quant = nil2zero(ld_total_quant_old).add(nil2zero(ld_total_quant_new));
		BigDecimal ld_unsend_quant = nil2zero(ld_unsend_quant_old).add(nil2zero(ld_unsend_quant_new));
		BigDecimal ld_unsend_amt = nil2zero(ld_unsend_amt_old).add(nil2zero(ld_unsend_amt_new));
		String fct_desc = "供方累计在手业务: " + formatString(ld_total_quant, "#,##0") + " \r\n 未发: "
				+ formatString(ld_unsend_quant, "#,##0") + "(折合 " + formatString(ld_unsend_amt, "#,##0")
				+ " 万元) \r\n 采购客户: " + (ll_cst_count) + "家";
		return fct_desc;
	}

	private BigDecimal nil2zero(BigDecimal value) {
		return value == null ? BigDecimal.ZERO : value;
	}

	private String formatString(BigDecimal value, String pattern) {
		NumberFormat nf = new DecimalFormat(pattern);
		return nf.format(value);
	}

	@Override
	public String customerInHand(BigDecimal scId1) {
		Map<String, BigDecimal> mapOldSc = selectOldSc(scId1);
		BigDecimal ld_total_quant_old2 = mapOldSc.get("LD_TOTAL_QUANT_OLD");
		BigDecimal ld_kc_quant_old = mapOldSc.get("LD_KC_QUANT_OLD");
		BigDecimal ld_dk_amt_old = mapOldSc.get("LD_DK_AMT_OLD");
		BigDecimal ld_total_quant_new2 = selectQuantNewSc(scId1);
		BigDecimal ld_kc_quant_new = selectKc_quant_newSc(scId1);// (scId);
		BigDecimal ld_total_quant2 = nil2zero(ld_total_quant_old2).add(nil2zero(ld_total_quant_new2));
		BigDecimal ld_kc_quant = nil2zero(ld_kc_quant_old).add(nil2zero(ld_kc_quant_new));
		BigDecimal ld_dk_amt_new = BigDecimal.ZERO;
		BigDecimal ld_dk_amt = nil2zero(ld_dk_amt_old).add(nil2zero(ld_dk_amt_new));
		String cst_desc = "客户累计在手业务: " + formatString(ld_total_quant2, "#,##0") + "\r\n 广义库存: "
				+ formatString(ld_kc_quant, "#,##0") + "\r\n 累计垫款: " + formatString(ld_dk_amt, "#,##0") + "万元";
		return cst_desc;
	}

	@Override
    public Map<String, Object> queryScSum(TExpSc expSc, int ii) {
		String scId = expSc.getScId().toString();
		Map<String, Object> template = new LinkedHashMap<>();
		// Map<String,Object> temp = templateService.queryPgkSum(trPkg,ids,type);
		// List<String> expBcIds = new ArrayList<>();
		// expBcIds.add(id);
		// TTrPurchaseTrack purchaseTrack =
		// purchaseTrackDao.selectByIds("T_EXP_BC",expBcIds);
		// String pkgType = salesTrack.getSrcScType();
		TTrSalesTrack salesTrack = salesTrackService.selectByScId("T_EXP_SC", scId);
		if (salesTrack != null) {
			List<BaseTemplate> twos = new ArrayList<>();

			TemplateCard two1 = new TemplateCard();
			two1.setHeader("收款");
			Map<String, String> hiddenKvs1 = new HashMap<>();
			hiddenKvs1.put("id", scId);
			hiddenKvs1.put("type", "T_EXP_SC");
			hiddenKvs1.put("route", "Payment");
			two1.setHiddenKvs(hiddenKvs1);

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

			Map<String, String> map1 = new LinkedHashMap<>();
			// 合同金额 SC_AMT_ACC
			// BigDecimal scAmtAcc = salesTrack.getScAmtAcc();
			BigDecimal scAmtAcc = expSc.gettAmt();
			// 客户保证金
			// BigDecimal collAmtFeeAcc = salesTrack.getCollAmtFee();
			if (collAmtFeeAcc == null || collAmtFeeAcc.intValue() == 0) {
				map1.put("客户保证金", "无");
			} else {
				map1.put("客户保证金", NumberFormatUtils.getCurrency(collAmtFeeAcc));
			}
			// 货款 coll_amt_hk_acc
			if (collAmtHk == null || collAmtHk.intValue() == 0) {
				map1.put("货款", "无");
			} else {
				map1.put("货款", NumberFormatUtils.getCurrency(collAmtHk));
			}
			// if("TR_JK_PR".equals(pkgType) || "TR_JK_PT".equals(pkgType)){
			// // 税费 payed_amt_tax_acc
			// BigDecimal payedAmtTaxAcc = salesTrack.getPayedAmtTaxAcc();
			// if(payedAmtTaxAcc == null || payedAmtTaxAcc.intValue() == 0){
			// map1.put("税费","无");
			// }else{
			// map1.put("税费",NumberFormatUtils.getCurrency(payedAmtTaxAcc));
			// }
			// }else if("TR_EXP_PT".equals(pkgType) || "TR_NM_PT".equals(pkgType)){
			// // 发票 COLL_INV_AMT
			// BigDecimal collInvAmt = salesTrack.getCollInvAmt();
			// if(collInvAmt == null || collInvAmt.intValue() == 0){
			// map1.put("发票","无");
			// }else{
			// map1.put("发票",NumberFormatUtils.getCurrency(collInvAmt));
			// }
			// }
			two1.setKvs(map1);
			// 收款比例 payed_rate
			// payed_amt_hk_acc / p_amt
			BigDecimal collAmt = collAmtFeeAcc.add(collAmtHk);
			if (collAmt != null && scAmtAcc != null) {
				if (scAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
					double payedRate = collAmt.divide(scAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
					two1.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
				}
			}
			twos.add(two1);

			TemplateCard two2 = new TemplateCard();
			two2.setHeader("发货");
			Map<String, String> hiddenKvs2 = new HashMap<>();
			hiddenKvs2.put("id", scId);
			hiddenKvs2.put("type", "T_EXP_SC");
			hiddenKvs2.put("route", "Logistics");
			two2.setHiddenKvs(hiddenKvs2);
			Map<String, String> map2 = new LinkedHashMap<>();

			BigDecimal sendAmt = BigDecimal.ZERO;// salesTrack.getSendAmt();
			BigDecimal sendQuant = BigDecimal.ZERO;// salesTrack.getSendQuant();
			List<TTrSoutBean> souts = trSoutService.selectByScId(expSc.getScId());
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
				map2.put("发货金额", "无");
			} else {
				map2.put("发货金额", NumberFormatUtils.getCurrency(sendAmt));
			}
			// 数量 send_quant
			if (sendQuant == null || sendQuant.intValue() == 0) {
				map2.put("数量", "无");
			} else {
				map2.put("数量", NumberFormatUtils.getNumber(sendQuant));
			}
			two2.setKvs(map2);
			// 发货比例 send_amt / bcAmtAcc
			if (sendAmt != null && scAmtAcc != null) {
				if (scAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
					double payedRate = sendAmt.divide(scAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
					two2.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
				}
			}
			twos.add(two2);

			/////////// 结算 ////////////↓
			TemplateCard two3 = new TemplateCard();
			two3.setHeader("结算");
			Map<String, String> hiddenKvs3 = new HashMap<>();
			hiddenKvs3.put("id", scId);
			hiddenKvs3.put("type", "T_EXP_SC");
			hiddenKvs3.put("route", "Invoice");
			two3.setHiddenKvs(hiddenKvs3);
			Map<String, String> map3 = new LinkedHashMap<>();

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
				map3.put("结算金额", "无");
			} else {
				map3.put("结算金额", NumberFormatUtils.getCurrency(jsAmt));
			}
			if (jsQuant == null || jsQuant.intValue() == 0) {
				map3.put("结算数量", "无");
			} else {
				map3.put("结算数量", jsQuant.toEngineeringString());
			}
			// 货没发完 ÷合同额 货发完 ÷发货总金额 另外除数不能为0
			if ("1".equals(salesTrack.getHasSendOver()) && BigDecimal.ZERO.compareTo(salesTrack.getSendAmt()) != 0) {
				scAmtAcc = salesTrack.getSendAmt();
			}
			if (jsAmt != null && scAmtAcc != null) {
				if (scAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
					double payedRate = jsAmt.divide(scAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
					two3.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
				} else {
					String nullChart = "0%";
					two3.setChart(nullChart);
				}
			}
			two3.setKvs(map3);
			twos.add(two3);
			template.put("card_temp#sc" + ii, twos);
		}
		return template;
	}

	@Override
    public Map<String, Object> queryBcSum(TExpBc expBc, int ii) {
		String bcId = expBc.getBcId().toString();
		Map<String, Object> template = new LinkedHashMap<>();
		List<PayApplyBean> payApplys = templateDao.selectItemFk(TOB_P_ORDER, bcId);
		// String pkgType = purchaseTrack.getSrcPurType();
		List<BaseTemplate> twos = new ArrayList<>();
		TemplateCard two1 = new TemplateCard();
		two1.setHeader("付款");
		Map<String, String> hiddenKvs1 = new HashMap<>();
		hiddenKvs1.put("id", bcId);
		hiddenKvs1.put("type", "T_EXP_BC");
		hiddenKvs1.put("route", "Payment");
		two1.setHiddenKvs(hiddenKvs1);
		Map<String, String> map1 = new LinkedHashMap<>();
		BigDecimal payedAmtHkAcc = BigDecimal.ZERO;// purchaseTrack.getPayedAmtHkAcc();
		BigDecimal payedAmtFeeAcc = BigDecimal.ZERO;// purchaseTrack.getPayedAmtFeeAcc();
		for (int i = 0; i < payApplys.size(); i++) {
			PayApplyBean payApply = payApplys.get(i);
			if (HK.equals(payApply.getFkId())) {
				payedAmtHkAcc = payedAmtHkAcc.add(payApply.getFeeAmt());
			} else {
				payedAmtFeeAcc = payedAmtFeeAcc.add(payApply.getFeeAmt());
			}
		}
		// 合同金额 BC_AMT_ACC
		BigDecimal bcAmtAcc = expBc.getpAmt(); // .getBcAmtAcc();
		// 货款 payed_amt_hk_acc
		if (payedAmtHkAcc == null || payedAmtHkAcc.intValue() == 0) {
			map1.put("货款", "无");
		} else {
			map1.put("货款", NumberFormatUtils.getCurrency(payedAmtHkAcc));
		}
		// 费用 payed_amt_fee_acc
		if (payedAmtFeeAcc == null || payedAmtFeeAcc.intValue() == 0) {
			map1.put("费用", "无");
		} else {
			map1.put("费用", NumberFormatUtils.getCurrency(payedAmtFeeAcc));
		}
		// String bizType = expBc.getBizType();
		//// t_exp_bc.biz_type
		// if("进口".equals(bizType)){
		// // 税费 payed_amt_tax_acc 进口
		// BigDecimal payedAmtTaxAcc = purchaseTrack.getPayedAmtTaxAcc();
		// if(payedAmtTaxAcc == null || payedAmtTaxAcc.intValue() == 0){
		// map1.put("税费","无");
		// }else{
		// map1.put("税费",NumberFormatUtils.getCurrency(payedAmtTaxAcc));
		// }
		// }else if("出口".equals(bizType) || "内贸".equals(bizType)){
		// // 发票 COLL_INV_AMT 出口、内贸
		// BigDecimal collInvAmt = purchaseTrack.getCollInvAmt();
		// if(collInvAmt == null || collInvAmt.intValue() == 0){
		// map1.put("发票","无");
		// }else{
		// map1.put("发票",NumberFormatUtils.getCurrency(collInvAmt));
		// }
		// }
		two1.setKvs(map1);
		// 付款比例 payed_rate
		// payed_amt_hk_acc / p_amt
		if (payedAmtHkAcc != null && bcAmtAcc != null) {
			if (bcAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
				double payedRate = payedAmtHkAcc.divide(bcAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
				two1.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
			}
		}
		twos.add(two1);
		/*
		 * // 销售金额 SALES_AMT BigDecimal salesAmt = purchaseTrack.getSalesAmt();
		 * if(salesAmt != null){ // 收款 TemplateCard two4 = new TemplateCard();
		 * two4.setHeader("收款"); two4.setHiddenKvs(hiddenKvs); Map<String,String> map4 =
		 * new LinkedHashMap<>(); // 销售金额 SALES_AMT
		 * map4.put("销售金额",NumberFormatUtils.getCurrency(salesAmt)); // 销售数量 SALES_QUANT
		 * BigDecimal salesQuant = purchaseTrack.getSalesQuant();
		 * map4.put("销售数量",NumberFormatUtils.getNumber(salesQuant)); two4.setKvs(map4);
		 * // 比例 SALES_AMT / bcAmtAcc if(salesAmt != null && bcAmtAcc != null){ double
		 * payedRate = salesAmt.divide(bcAmtAcc,BigDecimal.ROUND_HALF_UP).doubleValue();
		 * two4.setChart(NumberFormatUtils.getPercent(payedRate)); } twos.add(two4); }
		 */
		TemplateCard two2 = new TemplateCard();
		two2.setHeader("物流");
		Map<String, String> hiddenKvs2 = new HashMap<>();
		hiddenKvs2.put("id", bcId);
		hiddenKvs2.put("type", "T_EXP_BC");
		hiddenKvs2.put("route", "Logistics");
		two2.setHiddenKvs(hiddenKvs2);
		List<Map<String, Object>> wlList = templateDao.selectItemWl(TOB_P_ORDER, bcId);
		// 发货 send_amt
		BigDecimal sendAmt = BigDecimal.ZERO;// purchaseTrack.getSendAmt();
		// 数量 send_quant
		BigDecimal sendQuant = BigDecimal.ZERO;// purchaseTrack.getSendQuant();
		for (int i = 0; i < wlList.size(); i++) {
			Map<String, Object> wlMap = wlList.get(i);
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
			map.put(comm_name, tol_comm_quant + sumecUnitService.queryDicUnitByUnitId(comm_unit).getUnitName());
			map.put(" ", r_date);
		}

		Map<String, String> map2 = new LinkedHashMap<>();
		if (sendAmt == null || sendAmt.intValue() == 0) {
			map2.put("发货金额", "无");
		} else {
			map2.put("发货金额", NumberFormatUtils.getCurrency(sendAmt));
		}
		if (sendQuant == null || sendQuant.intValue() == 0) {
			map2.put("数量", "无");
		} else {
			map2.put("数量", NumberFormatUtils.getNumber(sendQuant));
		}
		two2.setKvs(map2);
		// 发货比例 send_amt / bcAmtAcc
		if (sendAmt != null && bcAmtAcc != null) {
			if (bcAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
				double payedRate = sendAmt.divide(bcAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
				two2.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
			}
		}
		twos.add(two2);

		TemplateCard two3 = new TemplateCard();
		two3.setHeader("发票");
		Map<String, String> hiddenKvs3 = new HashMap<>();
		hiddenKvs3.put("id", bcId);
		hiddenKvs3.put("type", "T_EXP_BC");
		hiddenKvs3.put("route", "Invoice");
		two3.setHiddenKvs(hiddenKvs3);
		Map<String, String> map3 = new LinkedHashMap<>();
		// 进项发票数量 COLL_INV_QUANT
		BigDecimal collInvQuant = BigDecimal.ZERO;// purchaseTrack.getCollInvQuant();
		// 进项发票金额_票面 COLL_INV_AMT
		BigDecimal collInvAmt = BigDecimal.ZERO;// purchaseTrack.getCollInvAmt();
		// 进项发票金额_成本 COLL_INV_AMT_COST
		BigDecimal collInvAmtCost = BigDecimal.ZERO;// purchaseTrack.getCollInvAmtCost();
		List<TInvIncome> invs = invIncomeService.queryByBcId("I", TOB_P_ORDER, expBc.getBcId());
		List<TInvIncome> invsO = invIncomeService.queryByBcId("O", TOB_P_ORDER, expBc.getBcId());
		invs.addAll(invsO);
		if (CollectionUtils.isNotEmpty(invs)) {
			// 费用类型 税单:TAX/税单 费用:FEE/费用 货款:HK
			for (int i = 0; i < invs.size(); i++) {
				TInvIncome invIncome = invs.get(i);
				collInvQuant = collInvQuant.add(invIncome.getCmdQuant());// invIncome.getCmdQuant()
				collInvAmt = collInvAmt.add(invIncome.getFpAmt());
				collInvAmtCost = collInvAmtCost.add(invIncome.getFpPriceAmt());
				// String kpKind = invIncome.getKpKind();
				// Map<String,Object> map = new LinkedHashMap<>();
				// // 发票类型
				// Long ikId = invIncome.getIkId();
				// String ikName = "";
				// TDicInvKind invKind = invKindService.selectByPrimaryKey(ikId);
				// if(invKind != null){
				// ikName = invKind.getIkProp();
				// }
				// // 发票金额
				// map.put(ikName,NumberFormatUtils.getCurrency(invIncome.getFpAmt()));
				// map.put(invIncome.getFromUnitName(),DateUtils.format(invIncome.getInvDate()));//
				// 开票人 时间
				// if("HK".equalsIgnoreCase(kpKind)){
				// goodsFundKvs.add(map);
				// }else if("FEE".equalsIgnoreCase(kpKind) || "费用".equals(kpKind)){
				// costsFundKvs.add(map);
				// }
			}
		}

		if (collInvQuant == null || collInvQuant.intValue() == 0) {
			map3.put("票面数量", "无");
		} else {
			map3.put("票面数量", NumberFormatUtils.getNumber(collInvQuant));
		}

		if (collInvAmt == null || collInvAmt.intValue() == 0) {
			map3.put("票面金额", "无");
		} else {
			map3.put("票面金额", NumberFormatUtils.getCurrency(collInvAmt));
		}

		if (collInvAmtCost == null || collInvAmtCost.intValue() == 0) {
			map3.put("票面金额成本", "无");
		} else {
			map3.put("票面金额成本", NumberFormatUtils.getCurrency(collInvAmtCost));
		}
		if (collInvAmt != null && bcAmtAcc != null) {
			if (bcAmtAcc.compareTo(BigDecimal.ZERO) != 0) {
				double payedRate = collInvAmt.divide(bcAmtAcc, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
				two3.setChart(NumberFormatUtils.getPercent(payedRate).replaceAll(",", ""));
			}
		}
		two3.setKvs(map3);
		twos.add(two3);
		template.put("card_temp#bc" + ii, twos);
		return template;
	}
	
	@Override
    public Map<String, String> queryIncomeExpenditure(BigDecimal soId, BigDecimal cstId) {
		//////////// 收支情况---
		BigDecimal scId = trSoutService.selectScIdBySoId(soId);
		Map<String, String> temp2 = new LinkedHashMap<>();
		BigDecimal ld_rtn_amt = tPubIoService.selectLd_Rtn_AmtByScId(scId);
		BigDecimal ld_hk_amt = tPubIoService.selectLD_HK_AMTByScId(scId);
		BigDecimal ld_hk_cst = tPubIoService.selectLD_HK_CSTByCstIdScId(scId, cstId);
		BigDecimal ld_bzj_amt = tPubIoService.selectLD_BZJ_AMTByScId(scId);
		ld_hk_amt = nil2zero(ld_hk_amt).add(nil2zero(ld_rtn_amt));
		ld_hk_cst = nil2zero(ld_hk_cst).add(nil2zero(ld_rtn_amt));

		String bzj = formatString(ld_bzj_amt, "#,##0.00"); // round
		String hk = formatString(ld_hk_amt, "#,##0.00");
		String coll = formatString(ld_hk_amt.add(ld_bzj_amt), "#,##0.00");
		String hk_cst = formatString((ld_hk_cst), "#,##0.00");

		temp2.put("收款金额", coll);
		temp2.put("收保证金", bzj);
		temp2.put("收货款", hk);
		temp2.put("客户总货款", hk_cst);
		///////////
		BigDecimal cbcsId = expBcService.selectCbcsIdBySoId(soId);
		BigDecimal ldCst = expBcService.selectLdCstByScId(scId, cstId);
		BigDecimal ldPast = expBcService.selectLdPastByCbcsId(scId, soId);
		BigDecimal ldSum = expBcService.selectLdSumByScId(scId);
		BigDecimal ldThis = expBcService.selectLdThisByCbcsId(cbcsId);

		temp2.put("已调拨金额", formatString((nil2zero(ldPast)), "#,##0.00"));
		temp2.put("本次调拨金额", formatString((nil2zero(ldThis)), "#,##0.00"));
		temp2.put("总调拨金额", formatString((nil2zero(ldSum)), "#,##0.00"));
		temp2.put("客户调拨金额", formatString((ldCst), "#,##0.00"));
		///// 代收代付
		BigDecimal Ld_Df_Inv_Div = BigDecimal.ZERO;
		BigDecimal Ld_Df_Fee_Div = BigDecimal.ZERO;
		BigDecimal Ld_Df_Inv_Sum = BigDecimal.ZERO;
		BigDecimal Ld_Df_Fee_Sum = BigDecimal.ZERO;
		List<Map<String, Object>> Cur_Bc = expBcService.selectBcIdBcQuantDivBySoId(soId);
		for (Map<String, Object> map : Cur_Bc) {
			BigDecimal bcId = (BigDecimal) map.get("TOB_ID");
			BigDecimal Bc_Quant_Div = (BigDecimal) map.get("BC_QUANT_DIV");
			BigDecimal Ld_Df_Inv = expBcService.selectLd_Df_InvBySoId(bcId);
			BigDecimal Ld_Df_Fee = expBcService.selectLd_Df_FeeBySoId(bcId);
			BigDecimal Ld_Bc_Quant = expBcService.selectLd_Bc_QuantBySoId(bcId);
			if (nil2zero(Ld_Bc_Quant).compareTo(nil2zero(Bc_Quant_Div)) > 0
					&& Ld_Bc_Quant.compareTo(BigDecimal.ZERO) != 0) {
				Ld_Df_Inv_Div = nil2zero(Ld_Df_Inv).multiply(nil2zero(Bc_Quant_Div)).divide(nil2zero(Ld_Bc_Quant));
				Ld_Df_Fee_Div = nil2zero(Ld_Df_Fee).multiply(nil2zero(Bc_Quant_Div)).divide(nil2zero(Ld_Bc_Quant));
			} else {
				Ld_Df_Inv_Div = nil2zero(Ld_Df_Inv);
				Ld_Df_Fee_Div = nil2zero(Ld_Df_Fee);
			}
			Ld_Df_Inv_Sum = nil2zero(Ld_Df_Inv_Sum).add(nil2zero(Ld_Df_Inv_Div));
			Ld_Df_Fee_Sum = nil2zero(Ld_Df_Fee_Sum).add(nil2zero(Ld_Df_Fee_Div));
		}
		String t_df_inv = formatString(nil2zero(Ld_Df_Inv_Sum), "#,##0.00");
		String t_df_pay = formatString(nil2zero(Ld_Df_Fee_Sum), "#,##0.00");
		String t_df_amt = formatString(max(nil2zero(Ld_Df_Inv_Sum), nil2zero(Ld_Df_Fee_Sum)), "#,##0.00");
		String t_df_cst = formatString(max(nil2zero(Ld_Df_Inv_Sum), nil2zero(Ld_Df_Fee_Sum)), "#,##0.00");
		temp2.put("代付发票", t_df_inv);
		temp2.put("代支付金额", t_df_pay);
		temp2.put("代付金额", t_df_amt);
		temp2.put("客户代付金额", t_df_cst);
		////////
		BigDecimal Ld_Left_Amt, Ld_Left_Cst;
		// 取值逻辑更改
		// Ld_Left_Amt = ld_hk_amt - Max(nil2zero(Ld_Df_Inv_Sum),
		// nil2zero(Ld_Df_Fee_Sum)) - ld_this - ld_past
		Ld_Left_Amt = ld_hk_amt.subtract(ldSum).subtract(max(nil2zero(Ld_Df_Inv_Sum), nil2zero(Ld_Df_Fee_Sum)));
		String t_last = formatString(Ld_Left_Amt, "#,##0.00");
//		//取值逻辑更改
		Ld_Left_Cst = ld_hk_cst.subtract(ldCst).subtract(max(nil2zero(Ld_Df_Inv_Sum), nil2zero(Ld_Df_Fee_Sum)));
		String t_last_cst = formatString(Ld_Left_Cst, "#,##0.00");
		temp2.put("本次调拨后剩余", t_last);
		temp2.put("调拨客户余款", t_last_cst);

		return temp2;
	}
	
	private BigDecimal max(BigDecimal a, BigDecimal b) {
		return a.max(b);
	}
}
