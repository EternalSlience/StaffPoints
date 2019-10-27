package com.staff.points.action;

import com.staff.points.common.ResponseDto;
import com.staff.points.dto.request.WorkerInfoInsertDto;
import com.staff.points.mapper.WorkerInfoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Api(description = "测试接口")
@Controller
@RequestMapping("test")
public class LocalHostTest {

    @Autowired(required = false)
    private WorkerInfoMapper workerInfoMapper;

    @ApiOperation(value = "测试方法", notes = "新增角色")
    @RequestMapping(value = "method", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto<String> testMethod (@RequestBody WorkerInfoInsertDto workerInfoInsertDto) {
        System.out.println("testMethod");
//        WorkerInfoEntityDO workerInfoEntityDO = new WorkerInfoEntityDO();
//        workerInfoEntityDO.setWorkerId(workerInfoInsertDto.getWorkerId());
//        workerInfoEntityDO.setCompanyName(workerInfoInsertDto.getCompanyName());
//        workerInfoEntityDO.setCertificateType(workerInfoInsertDto.getCertificateType());
//        workerInfoEntityDO.setCertificateNo(workerInfoInsertDto.getCertificateNo());
//        workerInfoEntityDO.setEnterTime(DateUtil.StringToDate(workerInfoInsertDto.getEnterTime()));
//        workerInfoEntityDO.setCreatedBy(workerInfoInsertDto.getCreatedBy());
//        workerInfoEntityDO.setUpdatedBy(workerInfoInsertDto.getUpdatedBy());
//        if ("string".equalsIgnoreCase(staffRolesDto.getRoleCode())) {
//            throw new StaffPointsException("01", "异常了");
//        }
 //       workerInfoMapper.insert(workerInfoEntityDO);
        return new ResponseDto<String>().assemblingSuccessResponse("小静子");
    }


}
