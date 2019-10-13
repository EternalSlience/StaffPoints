package com.staff.points.action;

import com.staff.points.dto.StaffRolesDto;
import com.staff.points.entity.StaffRolesEntity;
import com.staff.points.mapper.StaffRolesMapper;
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

    @Autowired
    private StaffRolesMapper staffRolesMapper;

    @ApiOperation(value = "测试方法", notes = "新增角色")
    @RequestMapping(value = "method", method = RequestMethod.POST)
    @ResponseBody
    public String testMethod (@RequestBody StaffRolesDto staffRolesDto) {
        System.out.println("testMethod");
        StaffRolesEntity staffRolesEntity = new StaffRolesEntity();
        staffRolesEntity.setRoleCode(staffRolesDto.getRoleCode());
        staffRolesEntity.setRoleName(staffRolesDto.getRoleName());
        staffRolesEntity.setRoleDesc(staffRolesDto.getRoleDesc());
        staffRolesEntity.setCreatedBy(staffRolesDto.getCreatedBy());
        staffRolesEntity.setUpdatedBy(staffRolesDto.getUpdatedBy());
        staffRolesMapper.insert(staffRolesEntity);
        return "小静子";
    }
}
