package com.sumec.template.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.MultiValueMap;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.sumec.boot.core.annotation.RESTful;
import com.sumec.boot.core.web.util.ResponseUtil;
import com.sumec.template.bean.Approval;
import com.sumec.template.bean.Approval2Chatroom;
import com.sumec.template.bean.ChatRoom;
import com.sumec.template.bean.ModifyChanmember;
import com.sumec.template.bean.User;
import com.sumec.template.entity.TSumecBusiGroup;
import com.sumec.template.service.ISumecBusiGroupService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 功能描述：对im聊天接口的封装.
 * </p>
 * <br/>
 * 
 * @date： 2018年2月2日 上午10:04:58<br/>
 * 
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@RESTful
@RequestMapping("/public")
@Api(tags = { "APP聊天相关操作接口" })
public class ImController {

	private final Logger log = LoggerFactory.getLogger(ImController.class);

	@Value("${im.chatRoomUrl}")
	private String chatRoomUrl;
	@Value("${im.channelUrl}")
	private String channelUrl;
	@Value("${im.addUserUrl}")
	private String addUserUrl;
	@Value("${im.modifyChatRoomUrl}")
	private String modifyChatRoomUrl;
	@Value("${im.approvalUrl}")
	private String approvalUrl;
	@Value("${im.approval2ChatroomUrl}")
	private String approval2ChatroomUrl;
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

	@PostMapping(value = "/app/chatroom/generate")
	@ApiOperation(value = "根据合同信息创建聊天群", notes = "v1-根据合同信息创建聊天群")
	public ResponseEntity<Long> createChatroom(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			@RequestBody ChatRoom chatRoom) {
		Long chatRoomId = null;

		log.info("苏美达请求/app/chatroom/generate" + JSONObject.toJSONString(chatRoom));
		if (chatRoom != null) {
			List<Long> members = chatRoom.getMembers().stream().distinct().collect(Collectors.toList());
			chatRoom.setMembers(members);
			// 判断是否已经创建过
			Map<String, Object> agent = chatRoom.getAgent();			
			String id = agent.get("id").toString();
			String type = agent.get("type").toString();
			TSumecBusiGroup busiGroup = sumecBusiGroupService.queryBusiGroup(id, type);
			if (busiGroup != null) { // 已创建过
				chatRoomId = Long.valueOf(busiGroup.getChatId());
			} else {// 新创建
				try {
					// 获取token
					HttpHeaders requestHeaders = new HttpHeaders();
					requestHeaders.add("api_key", apiKey);
					HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
					ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
							requestEntity, JSONObject.class, httpRequest.getParameterMap());
					if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
						String access_token = accessTokenRes.getBody().getString("access_token");
						HttpHeaders headers = new HttpHeaders();
						headers.add("access_token", access_token);
//						headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
						HttpEntity<ChatRoom> postEntity = new HttpEntity<>(chatRoom, headers);
						ResponseEntity<JSONObject> response = restTemplate.postForEntity(chatRoomUrl, postEntity,
								JSONObject.class);
						// ResponseEntity<JSONObject> response =
						// restTemplate.postForEntity(chatRoomUrl,chatRoom,JSONObject.class);
						log.info("第三极返回" + response.getStatusCode() + JSONObject.toJSONString(response.getBody()));
						if (response.getStatusCode() == HttpStatus.OK) {
							chatRoomId = response.getBody().getLong("id");
							// 插入关联表T_SUMEC_BUSI_GROUP
							TSumecBusiGroup record = new TSumecBusiGroup();
							record.setChatId(chatRoomId.toString());
							record.setGroupId(id);
							record.setGroupType(type);
							sumecBusiGroupService.insertSelective(record);
						}
					}

				} catch (Exception e) {
					log.error("第三极返回异常" + e.getMessage());
					e.printStackTrace();
				}
			}
		}
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(chatRoomId));
	}

	@PostMapping(value = "/app/user/addUser")
	@ApiOperation(value = "新增用户(输入id)，且将用户加入组织架构中", notes = "v1-新增用户(输入id)，且将用户加入组织架构中")
	public ResponseEntity<Map<String, Object>> addUser(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			@RequestBody User user) {
		log.info("苏美达请求/app/user/addUser" + JSONObject.toJSONString(user));
		Map<String, Object> map = addUser(user, httpRequest.getParameterMap());
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(map));
	}

	@PostMapping(value = "/app/chatroom/{pkgId}")
	@ApiOperation(value = "修改群组", notes = "v1-修改群组")
	public ResponseEntity<JSONObject> modifyChatroom(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			@PathVariable("pkgId") String pkgId, @RequestBody Map<String, Object> chatRoom) {
		JSONObject ret = null;
		log.info("苏美达请求/app/chatroom/" + pkgId + JSONObject.toJSONString(chatRoom));
		if (chatRoom != null) {
			// 判断是否已经创建过
			// Map<String, Object> agent = chatRoom.getAgent();
			// String id = agent.get("id").toString();
			// String type = agent.get("type").toString();
			TSumecBusiGroup busiGroup = sumecBusiGroupService.queryBusiGroup(pkgId, "T_TR_PKG");
			if (busiGroup == null) { // 没创建过
				ret = new JSONObject();
				ret.put("chatRoomId", "-1");
			} else {// 新创建
				Long chatRoomId = Long.valueOf(busiGroup.getChatId());
				try {
					// 获取token
					HttpHeaders requestHeaders = new HttpHeaders();
					requestHeaders.add("api_key", apiKey);
					HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
					ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
							requestEntity, JSONObject.class, httpRequest.getParameterMap());
					if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
						String access_token = accessTokenRes.getBody().getString("access_token");
						HttpHeaders headers = new HttpHeaders();
						headers.add("access_token", access_token);
//						headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
						HttpEntity<Map<String, Object>> postEntity = new HttpEntity<>(chatRoom, headers);
						// ResponseEntity<JSONObject> response =
						// restTemplate.postForEntity(modifyChatRoomUrl + "/" + chatRoomId, postEntity,
						// JSONObject.class);
						restTemplate.put(modifyChatRoomUrl + "/" + chatRoomId, postEntity);
						ret = new JSONObject();
						ret.put("chatRoomId", chatRoomId);
						// ResponseEntity<JSONObject> response =
						// restTemplate.postForEntity(chatRoomUrl,chatRoom,JSONObject.class);
						// if (response.getStatusCode() == HttpStatus.OK) {
						// ret = response.getBody();
						// log.info("第三极返回" + JSONObject.toJSONString(ret));
						//// chatRoomId = response.getBody().getLong("id");
						// // 插入关联表T_SUMEC_BUSI_GROUP
						//// TSumecBusiGroup record = new TSumecBusiGroup();
						//// record.setChatId(chatRoomId.toString());
						//// record.setGroupId(id);
						//// record.setGroupType(type);
						//// sumecBusiGroupService.insertSelective(record);
						// }
					}

				} catch (Exception e) {
					log.error("第三极返回异常" + e.getMessage());
					e.printStackTrace();
				}
			}
		}
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(ret));
	}

	@PostMapping(value = "/app/approval/message")
	@ApiOperation(value = "发送审批消息给指定用户", notes = "v1-发送审批消息给指定用户")
	public ResponseEntity<JSONObject> sendApproval(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			@RequestBody Approval approval) {
		Map<String, String[]> map = httpRequest.getParameterMap();
//		JSONObject ret = null;
//		if (approval != null) {
//			log.info("苏美达请求/app/approval/message: " + JSONObject.toJSONString(approval));
//			// 获取token
//			HttpHeaders requestHeaders = new HttpHeaders();
//			requestHeaders.add("api_key", apiKey);
//			HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
//			ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
//					requestEntity, JSONObject.class, map);
//			log.info("第三极返回accessTokenRes: " + accessTokenRes.getStatusCode() +JSONObject.toJSONString(accessTokenRes.getBody()));
//			if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
//				String access_token = accessTokenRes.getBody().getString("access_token");
//				HttpHeaders headers = new HttpHeaders();
//				headers.add("access_token", access_token);
//				HttpEntity<Approval> postEntity = new HttpEntity<>(approval, headers);
//				ResponseEntity<JSONObject> response = restTemplate.postForEntity(approvalUrl, postEntity,
//						JSONObject.class);
//				log.info("第三极返回response: " + response.getStatusCode() +JSONObject.toJSONString(response.getBody()));
//				if (response.getStatusCode() == HttpStatus.OK) {
//					ret = response.getBody();
//					log.info("第三极返回/app/approval/message: " + JSONObject.toJSONString(response.getBody()));
//				} else {
//					log.info("第三极返回/app/approval/message: " + response.getStatusCode() + JSONObject.toJSONString(response.getBody()));
//				}
//			}
//		}
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(ret(approval, map)));
	}

	@PostMapping(value = "/app/groupid/{groupid}/messages")
	@ApiOperation(value = "发送审批消息给指定群组的指定用户", notes = "v1-发送审批消息给指定群组的指定用户")
	public ResponseEntity<JSONObject> sendApproval2Chatroom(HttpServletRequest httpRequest,
			HttpServletResponse httpResponse, @RequestBody Approval approval, @PathVariable String groupid) {
		JSONObject ret = null;
		HttpHeaders headers = new HttpHeaders();
		Approval2Chatroom a2c = new Approval2Chatroom();		
		TSumecBusiGroup busiGroup = sumecBusiGroupService.queryBusiGroup(groupid, "T_TR_PKG");
		if(busiGroup != null) {
			a2c.setId(busiGroup.getChatId()); //
			a2c.setExtend(approval);
			// 获取token
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.add("api_key", apiKey);
			HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
			ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET, requestEntity,
					JSONObject.class, new MultiValueMap());
			log.info("第三极返回accessTokenRes: " + accessTokenRes.getStatusCode()
			+ JSONObject.toJSONString(accessTokenRes.getBody()));
			if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
				String access_token = accessTokenRes.getBody().getString("access_token");
				headers.add("access_token", access_token);
				try {
					HttpEntity<Approval2Chatroom> postEntity = new HttpEntity<>(a2c, headers);
					log.info("苏美达请求/app/chatroom/message: " + JSONObject.toJSONString(a2c));
					ResponseEntity<JSONObject> response1 = restTemplate.postForEntity(approval2ChatroomUrl, postEntity,
							JSONObject.class);
					log.info("第三极返回response: " + response1.getStatusCode() + JSONObject.toJSONString(response1.getBody()));
					if (response1.getStatusCode() == HttpStatus.OK) {
						ret = response1.getBody();
					}
				} catch (Exception e) {
					log.error("ERROR苏美达请求 /app/chatroom/message : " + groupid);
					e.printStackTrace();
				}
			}
		}
		
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(ret));
	}

	@PostMapping(value = "/app/chanmember/modifyChanmember/{modifyType}/{groupId}/{groupType}/{userId}")
	@ApiOperation(value = "增加或者删除群组用户", notes = "v1-增加或者删除群组用户")
	public ResponseEntity<JSONObject> modifyChanmember(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
			@PathVariable("modifyType") String modifyType, @PathVariable("groupId") String groupId,
			@PathVariable("groupType") String groupType, @PathVariable("userId") Long userId) {
		JSONObject ret = null;
		// modifyType "join","leave"
		if (userId != null && StringUtils.isNotEmpty(modifyType) && StringUtils.isNotEmpty(groupId)
				&& StringUtils.isNotEmpty(groupType)) {
			TSumecBusiGroup busiGroup = sumecBusiGroupService.queryBusiGroup(groupId, groupType);
			if (busiGroup != null) { // 已创建过
				Long chatRoomId = Long.valueOf(busiGroup.getChatId());
				ModifyChanmember modifyChanmember = new ModifyChanmember();
				modifyChanmember.setUserId(userId);
				modifyChanmember.setChatroomId(chatRoomId);
				modifyChanmember.setAction(modifyType);
				// 获取token
				HttpHeaders requestHeaders = new HttpHeaders();
				requestHeaders.add("api_key", apiKey);
				HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
				ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
						requestEntity, JSONObject.class, httpRequest.getParameterMap());
				if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
					String access_token = accessTokenRes.getBody().getString("access_token");
					HttpHeaders headers = new HttpHeaders();
					headers.add("access_token", access_token);
//					headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
					HttpEntity<ModifyChanmember> postEntity = new HttpEntity<>(modifyChanmember, headers);
					ResponseEntity<JSONObject> response = restTemplate.postForEntity(modifyChanmemberUrl, postEntity,
							JSONObject.class);
					if (response.getStatusCode() == HttpStatus.OK) {
						ret = response.getBody();
						log.info("第三极返回" + JSONObject.toJSONString(ret));
					}
				}
			}
		}
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(ret));
	}

	public Map<String, Object> addUser(User user, Map<String, String[]> param) {
		Map<String, Object> map = new HashMap<String, Object>();
		Long userId = null;
		if (user != null) {
			// 判断是否已经创建过
			userId = user.getId();
			if (userId == null) { // 已创建过
				// chatRoomId = Long.valueOf(busiGroup.getChatId());
				map.put("status", "userId is null");
			} else {// 新创建
				try {
					// 获取token
					HttpHeaders requestHeaders = new HttpHeaders();
					requestHeaders.add("api_key", apiKey);
					HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
					ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
							requestEntity, JSONObject.class, param);
					if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
						String access_token = accessTokenRes.getBody().getString("access_token");
						HttpHeaders headers = new HttpHeaders();
						headers.add("access_token", access_token);
//						headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
						HttpEntity<User> postEntity = new HttpEntity<>(user, headers);
						ResponseEntity<JSONObject> response = restTemplate.postForEntity(addUserUrl, postEntity,
								JSONObject.class);
						// ResponseEntity<JSONObject> response =
						// restTemplate.postForEntity(chatRoomUrl,chatRoom,JSONObject.class);
						HttpStatus status = response.getStatusCode();
						map.put("status", status);
						if (status == HttpStatus.OK) {
							log.info("第三极返回" + JSONObject.toJSONString(response.getBody()));
							userId = response.getBody().getLong("id");
						} /*
							 * else if (status == HttpStatus.BAD_REQUEST) { log.info("第三极返回" +
							 * JSONObject.toJSONString(response.getBody())); }
							 */
					}

				} catch (Exception e) {
					log.error("第三极返回异常" + e.getMessage() + ":400组织架构id未填写，500请检查手机号、id是否已存在");
					map.put("status", e.getMessage() + ":400组织架构id未填写，500请检查手机号/id是否已存在");
					e.printStackTrace();
				}
			}
		}
		return map;
	}

	private JSONObject ret(Approval approval, Map<String, String[]> map) {
		JSONObject ret = null;
		if (approval != null) {
			log.info("苏美达请求/app/approval/message: " + JSONObject.toJSONString(approval));
			// 获取token
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.add("api_key", apiKey);
			HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
			ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken, HttpMethod.GET,
					requestEntity, JSONObject.class, map);
			log.info("第三极返回accessTokenRes: " + accessTokenRes.getStatusCode()
					+ JSONObject.toJSONString(accessTokenRes.getBody()));
			if (accessTokenRes.getStatusCode() == HttpStatus.OK) {
				String access_token = accessTokenRes.getBody().getString("access_token");
				try {
					HttpHeaders headers = new HttpHeaders();
					headers.add("access_token", access_token);
//					headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
					HttpEntity<Approval> postEntity = new HttpEntity<>(approval, headers);
					ResponseEntity<JSONObject> response = restTemplate.postForEntity(approvalUrl, postEntity,
							JSONObject.class);
					log.info(
							"第三极返回response: " + response.getStatusCode() + JSONObject.toJSONString(response.getBody()));
					if (response.getStatusCode() == HttpStatus.OK) {
						ret = response.getBody();
//					log.info("第三极返回/app/approval/message: " + JSONObject.toJSONString(response.getBody()));
					}
				} catch (RestClientException e) {
					log.error(" ERROR 苏美达请求/app/approval/message");
					e.printStackTrace();
				}
			}
		} else {
			log.info("approval is null!");
		}
		return ret;
	}
}