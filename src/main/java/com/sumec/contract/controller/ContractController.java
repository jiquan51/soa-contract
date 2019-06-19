package com.sumec.contract.controller;

import com.sumec.api.base.bean.TSumecCell;
import com.sumec.api.base.bean.TSumecOrg;
import com.sumec.api.base.service.ISumecAuthorityService;
import com.sumec.api.base.service.ISumecCellService;
import com.sumec.api.base.service.ISumecOrgService;
import com.sumec.api.data.bean.TDicComm;
import com.sumec.api.data.bean.TDicCpc;
import com.sumec.api.data.service.IDicCommService;
import com.sumec.api.data.service.IDicCpcService;
import com.sumec.base.BaseEntity;
import com.sumec.boot.core.annotation.RESTful;
import com.sumec.boot.core.web.util.ResponseUtil;
import com.sumec.contract.bean.AttachmentRel;
import com.sumec.contract.bean.ContractRelBean;
import com.sumec.contract.bean.TExpBcBean;
import com.sumec.contract.entity.TExpBc;
import com.sumec.contract.entity.TExpBcCmd;
import com.sumec.contract.entity.TTrContractRel;
import com.sumec.contract.entity.TTrOcuDivide;
import com.sumec.contract.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

/**
 * 
 * 功能描述：采购合同相关操作接口.<br/>
 * 
 * #date： 2017年8月24日 上午9:42:57<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@RESTful
@RequestMapping("/api")
@Api(tags={"采购合同相关操作接口"})
public class ContractController{

    private final Logger log = LoggerFactory.getLogger(ContractController.class);
    @Autowired
    private IExpBcService expBcService;
    @Autowired
    private IExpBcCmdService expBcCmdService;
    @Autowired
    private IExpScService expScService;
    @Autowired
    private ITrContractRelService contractRelService;
    @Autowired
    private ISumecCellService sumecCellService;
    @Autowired
    private ISumecOrgService sumecOrgService;
    @Autowired
    private IDicCommService dicCommService;
    @Autowired
    private IDicCpcService dicCpcService;
    @Autowired
    private ISumecAuthorityService sumecAuthorityService;
    @Autowired
    private ITrOcuDivideService ocuDivideService;
    
    @GetMapping(value = "/contract/v1/{bcId}/detail")
    @ApiOperation(value = "根据合同流水号bcId获取合同详细信息",notes = "v1-根据合同流水号bcId获取合同详细信息")
    public ResponseEntity<TExpBcBean> queryExpBcDetail(@PathVariable("bcId")BigDecimal bcId){
        if(bcId == null){
            return ResponseEntity.badRequest().body(null);
        }
        TExpBcBean detail = null;
        TExpBc expBc = expBcService.selectByPrimaryKey(bcId);
        if(expBc != null){
            detail = new TExpBcBean();
            BeanUtils.copyProperties(expBc,detail);
            BigDecimal cellId = detail.getCellId();
            if(cellId != null){
                TSumecCell sumecCell = sumecCellService.selectByCellId(cellId.longValue());
                if(sumecCell != null) {
                    detail.setCellName(sumecCell.getCellName());
                }
            }
            Long ocuOrgId = detail.getOcuOrgId();
            if(ocuOrgId != null){
                TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(ocuOrgId.longValue());
                if(sumecOrg != null) {
                    detail.setOcuOrgName(sumecOrg.getOrgName());
                }
            }
            Long depOrgId = detail.getDepOrgId();
            if(depOrgId != null){
                TSumecOrg sumecOrg = sumecOrgService.selectByOrgId(depOrgId.longValue());
                if(sumecOrg != null) {
                    detail.setDepOrgName(sumecOrg.getOrgName());
                }
            }
            Long cmdCataId = detail.getCmdCataId();
            if(cmdCataId != null){
                TDicComm dicComm = dicCommService.selectByPrimaryKey(cmdCataId);
                if(dicComm != null) {
                    detail.setCmdCataName(dicComm.getCommName());
                }
            }
            Long destNationId = detail.getDestNationId();
            if(destNationId != null){
                TDicCpc dicCpc = dicCpcService.selectByPrimaryKey(destNationId);
                if(dicCpc != null) {
                    detail.setDestNationName(dicCpc.getCpcNameCn());
                }
            }
            // 合同标的
            List<TExpBcCmd> bcCmds = expBcCmdService.selectByBcId(bcId);
            detail.setBcCmd(bcCmds);
            // 关联合同
            List<TTrContractRel> rels = contractRelService.selectByTobIdB("P_ORDER",bcId);
            if(CollectionUtils.isNotEmpty(rels)){
                List<ContractRelBean> relCon = new ArrayList<>();
                int count = rels.size();
                for(int i = 0; i < count; i++){
                    TTrContractRel rel = rels.get(i);
                    ContractRelBean item = new ContractRelBean();
                    item.setRelType(rel.getRelType());
//                            String tobTypeA = rel.getTobTypeA();
//                            BigDecimal tobIdA = rel.getTobIdA();
                    // todo
                    item.setCommAmt(new BigDecimal("12312321"));
                    item.setFctName("苏美达技术国际贸易有限公司");
                    item.setPayment("27.25% T/T AFTER CONTRACT , 72.74% OA AFTER B/L 30 天");
                    item.setRelBcNo("123454321");
                    item.setRelCurrType("RMB");
                    relCon.add(item);
                }
                detail.setRelCon(relCon);
            }
            // 合同附件
            List<AttachmentRel> atts = new ArrayList<>();
            AttachmentRel item = new AttachmentRel();
            item.setAttachName("合同文本");
            item.setUploadDate("2017-09-08");
            item.setUploader("朱原");
            atts.add(item);
            detail.setRelAttachment(atts);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(detail));
    }
    
    @GetMapping(value = "/contract/v1/{userId}/contracts")
    @ApiOperation(value = "根据userId获取该用户权限下合同列表",notes = "v1-根据userId获取该用户权限下合同列表")
    public ResponseEntity<List<TTrOcuDivide>> queryContractsByUserId(@PathVariable("userId") Long userId){
        if(userId == null){
            return ResponseEntity.badRequest().body(null);
        }
        List<TTrOcuDivide> res = null;
        Set<Long> cellIds = new HashSet<>();
        Set<Long> userIds = new HashSet<>();
        Set<Long> pOrderCellIds = sumecAuthorityService.selectCellIdsByUserId(userId,"M_TR_PUR_ORDER","VIEW");
        Set<Long> pOrderUserIds = sumecAuthorityService.selectUserIdsByUserId(userId,"M_TR_PUR_ORDER","VIEW");
        Set<Long> sOrderCellIds = sumecAuthorityService.selectCellIdsByUserId(userId,"M_TR_SALES_ORDER","VIEW");
        Set<Long> sUserCellIds = sumecAuthorityService.selectUserIdsByUserId(userId,"M_TR_SALES_ORDER","VIEW");
        if(CollectionUtils.isNotEmpty(pOrderCellIds)){
            cellIds.addAll(pOrderCellIds);
        }
        if(CollectionUtils.isNotEmpty(sOrderCellIds)){
            cellIds.addAll(sOrderCellIds);
        }
        if(CollectionUtils.isNotEmpty(pOrderUserIds)){
            userIds.addAll(pOrderUserIds);
        }
        if(CollectionUtils.isNotEmpty(sUserCellIds)){
            userIds.addAll(sUserCellIds);
        }
        if(CollectionUtils.isEmpty(cellIds) && CollectionUtils.isEmpty(userIds)){
            return ResponseEntity.badRequest().body(null);
        }
        List<TTrOcuDivide> contractsByCells = null;
        // 分摊下的合同
        if(CollectionUtils.isNotEmpty(cellIds)){
            int count = cellIds.size();
            log.info("权限下核算单元数为:"+count);
            List<Long> cellList = new ArrayList<>(cellIds);
            contractsByCells = ocuDivideService.selectByOcuIds(cellList);
        }
        // 制作的采购合同
        List<TTrOcuDivide> pContractsByUsers = null;
        // 制作的销售合同
        List<TTrOcuDivide> sContractsByUsers = null;
        if(CollectionUtils.isNotEmpty(userIds)){
            log.info("权限下执行人数为:"+userIds.size());
            List<Long> userList = new ArrayList<>(userIds);
            pContractsByUsers = expBcService.selectByUserIds(userList);
            sContractsByUsers = expScService.selectByUserIds(userList);
        }
        res = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(contractsByCells)){
            res.addAll(contractsByCells);  
        }
        if(CollectionUtils.isNotEmpty(pContractsByUsers)){
            res.addAll(pContractsByUsers);  
        }
        if(CollectionUtils.isNotEmpty(sContractsByUsers)){
            res.addAll(sContractsByUsers);  
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(res));
    }
    
    @GetMapping(value = "/contract/v1/expBc/{bcId}")
    @ApiOperation(value = "根据bc_id获取采购合同订单信息",notes = "v1-根据bc_id获取采购合同订单信息")
    @ResponseBody
    public ResponseEntity<BaseEntity> queryExpBcByBcId(@PathVariable BigDecimal bcId){
        if(bcId == null){
            return ResponseEntity.badRequest().body(null);
        }
        TExpBc expBc =  expBcService.selectByPrimaryKey(bcId);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(expBc));
    }
    
    @GetMapping(value = "/contract/v1/queryExpBcCmdByIntId")
    @ApiOperation(value = "根据bc_id获取采购合同订单商品信息",notes = "v1-根据bc_id获取采购合同订单商品信息")
    @ApiImplicitParam(name = "bcId",value = "合同的流水号",required = true,paramType="query")
    @ResponseBody
    public ResponseEntity<List<TExpBcCmd>> queryExpBcCmdByIntId(@RequestParam BigDecimal bcId){
        if(bcId == null){
            return ResponseEntity.badRequest().body(null);
        }
        List<TExpBcCmd> expBcCmdList =  expBcCmdService.selectByBcId(bcId);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(expBcCmdList));
    }
    
    @GetMapping(value = "/contract/v1/selectCstIdByBcPId")
    @ApiOperation(value = "根据销售明细与收购明细关联表中bcPId来查询客户Id",notes = "v1-根据销售明细与收购明细关联表中bcPId来查询客户Id")
    @ApiImplicitParam(name = "bcPId",value = "销售明细与收购明细关联表中BC_P_ID",required = true,paramType="query")
    @ResponseBody
    public ResponseEntity<BigDecimal> selectCstIdByBcPId(@RequestParam BigDecimal bcPId){
        if(bcPId == null){
            return ResponseEntity.badRequest().body(null);
        }
        BigDecimal cstId =  expScService.selectCstIdByBcPId(bcPId);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(cstId));
    }
    
    @GetMapping(value = "/contract/v1/selectNotesByNoticeId")
    @ApiOperation(value = "根据noticeId获取开票通知的备注信息",notes = "v1-根据noticeId获取开票通知的备注信息")
    @ApiImplicitParam(name = "noticeId",value = "noticeId",required = true,paramType="query")
    @ResponseBody
    public ResponseEntity<String> selectNotesByNoticeId(@RequestParam BigDecimal noticeId){
        if(noticeId == null){
            return ResponseEntity.badRequest().body(null);
        }
        String notes =  expBcService.selectNotesByNoticeId(noticeId);
        if(!StringUtils.isEmpty(notes)){
            return ResponseEntity.ok().body(notes);
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
    }

    @PostMapping(value = "/contract/v1/updateByExpBc")
    @ApiOperation(value = "根据bc_id更新采购合同订单信息",notes = "v1-根据bc_id更新采购合同订单信息")
    @ResponseBody
    public ResponseEntity<String> updateByExpBc(@RequestBody TExpBc record){
        if(record == null){
            return ResponseEntity.badRequest().body(null);
        }
        int back =  expBcService.updateByExpBc(record);
        if(back > 0){
            return ResponseEntity.ok().body("OK");
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(null));
    }
}
