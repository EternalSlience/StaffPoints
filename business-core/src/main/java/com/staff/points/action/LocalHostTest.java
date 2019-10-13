package com.staff.points.action;

import com.staff.points.entity.StaffRolesEntity;
import com.staff.points.mapper.StaffRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class LocalHostTest {

    @Autowired
    private StaffRolesMapper staffRolesMapper;

    @RequestMapping("method")
    @ResponseBody
    public String testMethod () {
        System.out.println("testMethod");
        StaffRolesEntity staffRolesEntity = new StaffRolesEntity();
        staffRolesEntity.setRoleCode("plus");
        staffRolesEntity.setRoleName("使者");
        staffRolesEntity.setRoleDesc("加分");
        staffRolesEntity.setCreatedBy("admin");
        staffRolesEntity.setUpdatedBy("admin");
        staffRolesMapper.insert(staffRolesEntity);
        return "小静子";
    }
}
