package com.sumec.flow.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sumec.boot.core.annotation.RESTful;
import com.sumec.boot.core.web.util.ResponseUtil;
import com.sumec.flow.bean.ReqConfirm;
import com.sumec.flow.bean.TSumecFlowDetailsModule;
import com.sumec.flow.service.ISumecFlowDetailsModuleService;
import com.sumec.flow.service.ISumecFlowDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 功能描述：流程审批相关接口
 * Created by sunhc on 2018/2/27.
 */
@RESTful
@RequestMapping("/api")
@Api(tags={"流程审批相关操作接口"})
public class FlowController {

	@Autowired
	private ISumecFlowDetailsModuleService iSumecFlowDetailsModuleService;
	@Autowired
    private ISumecFlowDetailsService sumecFlowDetailsService;
	
	
	@PutMapping(value = "/flow/v1/pass")
    @ApiOperation(value = "根据审批流水号来审批合同",notes = "v1-根据审批流水号来审批合同")
    public ResponseEntity<String> pass(@RequestBody ReqConfirm reqConfirm){
        if(reqConfirm == null){
            return ResponseEntity.badRequest().body(null);
        }
        String res = sumecFlowDetailsService.pass(reqConfirm);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(res));
        
    }
	
    @PutMapping(value = "/flow/v1/back")
    @ApiOperation(value = "根据审批流水号来审批合同",notes = "v1-根据审批流水号来审批合同")
    public ResponseEntity<String> back(@RequestBody ReqConfirm reqConfirm){
        if(reqConfirm == null){
            return ResponseEntity.badRequest().body(null);
        }
        String res = sumecFlowDetailsService.back(reqConfirm);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(res));
        
    }
    
	/**
	 * 方法描述：此方法根据userId查询该用户已经审批过的审批列表
	 * @param userId 用户ID
	 * @param pageNum 分页的页面数量
	 * @param pageSize 每页的数据条数
	 * @return
	 */
	@ApiOperation(value = "根据userId查询该用户已经审批过的审批列表",notes = "v1-根据userId查询该用户已经审批过的审批列表")
	@GetMapping(value = "/flow/v1/{userId}/check/list")
	public ResponseEntity<PageInfo<TSumecFlowDetailsModule>> selectCheckedByUserId(@PathVariable("userId") Long userId, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
		if (userId == null){
		    return ResponseEntity.badRequest().body(null);
		}
		PageHelper.startPage(pageNum,pageSize);
		List<TSumecFlowDetailsModule> tSumecFlowDetailsModuleList = iSumecFlowDetailsModuleService.selectCheckedByUserId(userId);
		PageInfo<TSumecFlowDetailsModule> pageResult = new PageInfo<>(tSumecFlowDetailsModuleList);
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(pageResult));
	}

	/**
	 * 方法描述：此方法根据userId查询该用户发起过的审批列表
	 * @param userId
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@ApiOperation(value = "根据userId查询该用户发起过的审批列表",notes = "v1-根据userId查询该用户发起过的审批列表")
	@GetMapping(value = "/flow/v1/{userId}/post/list")
	public ResponseEntity<PageInfo<TSumecFlowDetailsModule>> selectPostByUserId(@PathVariable("userId") Long userId, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
		if (userId == null) {
			return ResponseEntity.badRequest().body(null);
		}
		PageHelper.startPage(pageNum,pageSize);
		List<TSumecFlowDetailsModule> tSumecFlowDetailsModuleList = iSumecFlowDetailsModuleService.selectPostByUserId(userId);
		PageInfo<TSumecFlowDetailsModule> pageResult = new PageInfo<>(tSumecFlowDetailsModuleList);
		return ResponseUtil.wrapOrNotFound(Optional.ofNullable(pageResult));
	}

}
