package com.staff.points.action;

import com.staff.points.common.ResponseDto;
import com.staff.points.common.StaffPointsException;
import com.staff.points.dto.request.WorkerInfoInsertDto;
import com.staff.points.dto.request.WorkerInfoQueryDto;
import com.staff.points.dto.request.WorkerInfoUpdateDto;
import com.staff.points.dto.response.WorkerInfoResponse;
import com.staff.points.entity.WorkerInfoEntityDO;
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
@Api(description = "角色新增")
@Controller
@RequestMapping("workerInfo")
public class WorkerInfoAction {

    @Autowired(required = false)
    private WorkInfoService workInfoService;



    @ApiOperation(value = "新增", notes = "新增角色")
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<String> insert (@RequestBody WorkerInfoInsertDto workerInfoInsertDto) {

        int insert = workInfoService.insert(workerInfoInsertDto);
        if (insert< 0) {
            throw new StaffPointsException("01", "异常了");
        }
        return new ResponseDto<String>().assemblingSuccessResponse("小静子");
    }
    @ApiOperation(value = "修改", notes = "修改角色")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<String> update (@RequestBody WorkerInfoUpdateDto workerInfoUpdateDto) {

        int insert = workInfoService.update(workerInfoUpdateDto);
        if (insert< 0) {
            throw new StaffPointsException("01", "异常了");
        }
        return new ResponseDto<String>().assemblingSuccessResponse("小静子");
    }
    @ApiOperation(value = "查询", notes = "查询角色")
    @RequestMapping(value = "query", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<List<WorkerInfoResponse>> query (@RequestBody WorkerInfoQueryDto workerInfoQueryDto) {
        ResponseDto<List<WorkerInfoResponse>> responseDto =new ResponseDto<>();
        List<WorkerInfoEntityDO> query = workInfoService.query(workerInfoQueryDto);
        if (null ==query) {
            throw new StaffPointsException("01", "异常了");
        }
        List<WorkerInfoResponse> responses =new ArrayList<>();
        for(WorkerInfoEntityDO entityDO : query){
            WorkerInfoResponse  workerInfoResponse =new WorkerInfoResponse();
            workerInfoResponse.setCompanyName(entityDO.getCompanyName());
            workerInfoResponse.setEnterTime(entityDO.getEnterTime());
            workerInfoResponse.setName(entityDO.getName());
            workerInfoResponse.setPoints(entityDO.getPoints());
            workerInfoResponse.setStatus(entityDO.getStatus());
            workerInfoResponse.setWorkType(entityDO.getWorkType());
            responses.add(workerInfoResponse);
        }
        responseDto.setData(responses);
        return responseDto;
    }
}
