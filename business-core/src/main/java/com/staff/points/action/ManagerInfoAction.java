package com.staff.points.action;

import com.staff.points.common.ResponseDto;
import com.staff.points.common.StaffPointsException;
import com.staff.points.dto.request.*;
import com.staff.points.dto.response.ManagerInfoResponse;
import com.staff.points.dto.response.WorkerInfoResponse;
import com.staff.points.entity.ManagerInfoEntityDO;
import com.staff.points.entity.WorkerInfoEntityDO;
import com.staff.points.service.ManagerInfoService;
import com.staff.points.service.WorkInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanjing
 * @version Id: StaffRolesInfoAction.java, v 0.1 2019/10/16 22:25 yanjing Exp $$
 */
@Api(description = "管理员信息新增")
@Controller
@RequestMapping("managerInfo")
public class ManagerInfoAction {

    @Autowired(required = false)
    private ManagerInfoService managerInfoService;



    @ApiOperation(value = "新增", notes = "新增管理员信息")
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<String> insert (@RequestBody ManagerInfoInsertDto managerInfoInsertDto) {

        int insert = managerInfoService.insert(managerInfoInsertDto);
        if (insert< 0) {
            throw new StaffPointsException("01", "异常了");
        }
        return new ResponseDto<String>().assemblingSuccessResponse("小静子");
    }
    @ApiOperation(value = "修改", notes = "修改管理员信息")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<String> update (@RequestBody ManagerInfoUpdateDto managerInfoUpdateDto) {

        int insert = managerInfoService.update(managerInfoUpdateDto);
        if (insert< 0) {
            throw new StaffPointsException("01", "异常了");
        }
        return new ResponseDto<String>().assemblingSuccessResponse("小静子");
    }
    @ApiOperation(value = "查询", notes = "查询管理员信息")
    @RequestMapping(value = "query", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<List<ManagerInfoResponse>> query (@RequestBody ManagerInfoQueryDto managerInfoQueryDto) {
        ResponseDto<List<ManagerInfoResponse>> responseDto =new ResponseDto<>();
        List<ManagerInfoEntityDO> query = managerInfoService.query(managerInfoQueryDto);
        if (null ==query) {
            throw new StaffPointsException("01", "异常了");
        }
        List<ManagerInfoResponse> responses =new ArrayList<>();
        for(ManagerInfoEntityDO entityDO : query){
            ManagerInfoResponse  managerInfoResponse =new ManagerInfoResponse();
            managerInfoResponse.setCompanyName(entityDO.getDepartment());
            managerInfoResponse.setName(entityDO.getName());
            managerInfoResponse.setScanTimes(entityDO.getScanTimes());
            managerInfoResponse.setStatus(entityDO.getStatus());
            managerInfoResponse.setSendPoints(100);
            responses.add(managerInfoResponse);
        }
        responseDto.setData(responses);
        return responseDto;
    }
}
