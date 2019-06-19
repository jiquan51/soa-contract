package com.sumec.template.job;

import com.alibaba.fastjson.JSONObject;
import com.sumec.api.base.bean.TSumecCell;
import com.sumec.api.base.bean.TSumecOrg;
import com.sumec.api.base.bean.TSumecUser;
import com.sumec.api.base.service.ISumecCellService;
import com.sumec.api.base.service.ISumecOrgService;
import com.sumec.api.base.service.ISumecUserService;
import com.sumec.api.data.bean.TDicComm;
import com.sumec.api.data.bean.TDicUnitEntity;
import com.sumec.api.data.service.IDicCommService;
import com.sumec.api.data.service.ISumecUnitService;
import com.sumec.pkg.service.ITrPkgRelService;
import com.sumec.template.bean.ChatBean;
import com.sumec.template.bean.ChatRoom;
import com.sumec.template.bean.User;
import com.sumec.template.controller.ImController;
import com.sumec.template.entity.TSumecBusiGroup;
import com.sumec.template.handler.CustomException;
import com.sumec.template.service.ISumecBusiGroupService;
import com.sumec.template.service.ITemplateService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * <p>
 * 功能描述：会话生成定时任务.
 * </p>
 * <br/>
 * 
 */
@Component
public class ChatroomGenerateJob {

	private static final Logger log = LoggerFactory.getLogger(ChatroomGenerateJob.class);

	public static String scheduledEnable = "true";
	private static final String NO_USER_ERROR = "4040501";

	@Value("${im.chatRoomUrl}")
	private String chatRoomUrl;
	@Value("${im.modifyChatRoomUrl}")
	private String modifyChatRoomUrl;
	@Value("${im.approvalUrl}")
	private String approvalUrl;
	@Value("${im.modifyChanmemberUrl}")
	private String modifyChanmemberUrl;
	@Value("${im.accessToken}")
	private String accessToken;
	@Value("${im.apiKey}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ISumecBusiGroupService sumecBusiGroupService;
	@Autowired
	private ITrPkgRelService trPkgRelService;
	@Autowired
	private ITemplateService templateService;
	@Autowired
	private ISumecOrgService sumecOrgService;
	@Autowired
	private ISumecCellService sumecCellService;
	@Autowired
	private IDicCommService dicCommService;
	@Autowired
	private ISumecUnitService sumecUnitService;
	@Autowired
	private ISumecUserService sumecUserService;
	@Autowired
	private ImController imController;

	/**
	 * 
	 * <p>
	 * 方法描述：定时
	 * </p>
	 *
	 */
	// @Scheduled(fixedRate = 1000 * 60 * 60 * 24)
	@Scheduled(cron = "0 0 3 * * ?")
	public void chatroomGenerateTask() {

		if (!Boolean.parseBoolean(scheduledEnable)) {
			log.info("会话生成job任务禁用");
			return;
		}
		Long chatRoomId = null;
		long start = System.currentTimeMillis();
		log.info("会话生成job开始");

		// 判断是否已经创建过
		List<String> groupIdList = sumecBusiGroupService.queryAllBusiGroup();
		List<String> pkgIdList = trPkgRelService.selectAllPkgId();
		pkgIdList.removeAll(groupIdList);
		// 获取token
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.add("api_key", apiKey);
		HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
		ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET, requestEntity, JSONObject.class);
		List<String> errList = new ArrayList<>();
		if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
			String access_token = accessTokenRes.getBody().getString("access_token");
			HttpHeaders headers = new HttpHeaders();
			headers.add("access_token", access_token);
//			headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
			for (String pkgId : pkgIdList) {
				try {
					List<ChatBean> chatBeans = templateService.selectChatBean(pkgId);
					if (chatBeans != null && chatBeans.size() > 0) {
						ChatBean chatBean = chatBeans.get(0);

						ChatRoom chatRoom = new ChatRoom();
						List<Long> members = new ArrayList<>();
						Map<String, Object> agent = new HashMap<String, Object>();
						String ls_dep_org = "";
						String ls_ocu_org = "";
						String ls_ocu_name = "";
						if (nil2zero(chatBean.getDepOrgId()) > 0) {
							TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(chatBean.getDepOrgId());// selectByOrgId(ll_dep_org_id)
							ls_dep_org = sumecOrg.getOrgNameShort();
						}

						if (nil2zero(chatBean.getOcuOrgId()) > 0) {
							TSumecOrg sumecOrg2 = sumecOrgService.selectByOrgId(chatBean.getOcuOrgId());// selectByOrgId(ll_dep_org_id)
							ls_ocu_org = sumecOrg2.getOrgNameShort();
						}
						Long cellId = chatBean.getCellId();
						if (nil2zero(cellId) > 0) {
							TSumecCell sumecCell = sumecCellService.selectByCellId(cellId);
							ls_ocu_name = sumecCell.getCellName();
						}
						String subtitle = nil2str(ls_dep_org) + "-" + nil2str(ls_ocu_org) + "-" + nil2str(ls_ocu_name);
						Long commId = chatBean.getCommId();
						String ls_comm_name = "";
						if (nil2zero(commId) > 0) {
							TDicComm dicComm = dicCommService.selectByPrimaryKey(commId);
							ls_comm_name = dicComm.getCommName();
						}
						String ls_comm_unit = "";
						Long commUnit = chatBean.getCommUnit();
						if (nil2zero(commUnit) > 0) {
							TDicUnitEntity en = sumecUnitService.queryDicUnitByUnitId(commUnit);
							ls_comm_unit = en.getUnitNameCn();
						}
						String title = nil2str(ls_comm_name) + " "
								+ formatString(nil2zero(chatBean.getpQuant()), "#,##0.00") + " "
								+ nil2str(ls_comm_unit);

						String content = nil2str(chatBean.getCurrType()) + " "
								+ formatString(nil2zero(chatBean.getpAmt()), "#,##0.00");
						// String ls_members = "";
						Long userId = chatBean.getUserId();
						if (nil2zero(cellId) > 0) {
							List<TSumecUser> userList = sumecOrgService.selectUsersByCellId(cellId);
							if (CollectionUtils.isNotEmpty(userList)) {
								for (TSumecUser tSumecUser : userList) {
									// ls_members += tSumecUser.getUserId().toString() + ",";
									if ("0".equals(tSumecUser.getIsDel())) {
										members.add(tSumecUser.getUserId());
									}
								}
								// ls_members.substring(0, userList.size());
								// Gnv_String.of_arraytostring(ll_ocu_users, ',', ls_members)
							}
							members.add(userId);
							// if( "".equals(ls_members) ) {
							// ls_members = '[' + userId + ']';
							// } else {
							// ls_members = '[' + ls_members + userId + ']';
							// }
						}
						agent.put("subtitle", subtitle);
						agent.put("id", pkgId);
						agent.put("title", title);
						agent.put("type", "T_TR_PKG");
						agent.put("content", content);
						agent.put("status", "执行中");
						chatRoom.setAgent(agent);
						chatRoom.setDescription("");
						chatRoom.setMembers(members);
						chatRoom.setName(chatBean.getcNo());
						chatRoom.setOwnerid(chatBean.getUserId());
						HttpEntity<ChatRoom> postEntity = new HttpEntity<>(chatRoom, headers);
						ResponseEntity<JSONObject> response = restTemplate.postForEntity(chatRoomUrl, postEntity,
								JSONObject.class);
						// ResponseEntity<JSONObject> response =
						// restTemplate.postForEntity(chatRoomUrl,chatRoom,JSONObject.class);
						if (response.getStatusCode() == HttpStatus.OK) {
							log.info("第三极返回" + JSONObject.toJSONString(response.getBody()));
							chatRoomId = response.getBody().getLong("id");
							// 插入关联表T_SUMEC_BUSI_GROUP
							TSumecBusiGroup record = new TSumecBusiGroup();
							record.setChatId(chatRoomId.toString());
							record.setGroupId(pkgId);
							record.setGroupType("T_TR_PKG");
							sumecBusiGroupService.insertSelective(record);
						}
					}

				} catch (CustomException e) {
					String body = e.getBody();
					log.error("第三极返回异常" + e.getMessage() + body);
					errList.add(pkgId + " :: " + e.getMessage() + body);
					////尝试增加用户
					JSONObject jsonObj = JSONObject.parseObject(body);
					if (jsonObj != null && jsonObj.get("code") != null && NO_USER_ERROR.equals(jsonObj.get("code").toString())) {
						String msg = jsonObj.getString("message");
						int a = msg.indexOf(" ");
						int b = msg.lastIndexOf(" ");
						String trimMsg = msg.substring(a+1, b);
						String[] userIds = trimMsg.split(",");
						for (String userId : userIds) {
							TSumecUser sumecUser = sumecUserService.selectByUserId(Long.parseLong(userId));
							User user = userChange(sumecUser);							
							Map<String, Object> result = imController.addUser(user, new HashMap<String, String[]>());
							errList.add("已尝试新增用户" + userId + ", result:" + result.toString());
						}
					}
					// e.printStackTrace();
				}
			}
		}

		long end = System.currentTimeMillis();
		log.info("会话生成job结束:" + pkgIdList.size() + ",耗时" + (end - start));
	}

	private String nil2str(String str) {
		if (null == str) {
			return "";
		} else {
			return str.trim();
		}
	}

	private Long nil2zero(Long value) {
		return value == null ? 0L : value;
	}

	private BigDecimal nil2zero(BigDecimal value) {
		return value == null ? BigDecimal.ZERO : value;
	}

	private String formatString(BigDecimal value, String pattern) {
		NumberFormat nf = new DecimalFormat(pattern);
		return nf.format(value);
	}
	
	private User userChange(TSumecUser sumecUser) {
		User user = new User();
		user.setEmail(sumecUser.getUserEmail());
		user.setFullname(sumecUser.getUserName());
		user.setId(sumecUser.getUserId());
		user.setMobile(sumecUser.getUserMobile());
		user.setOrgid(sumecUser.getOrgId());
		user.setSex(sumecUser.getUserSex() == null ? "" : sumecUser.getUserSex().toString());
		user.setTelephone(sumecUser.getUserTel());
		return user;
	}
}
