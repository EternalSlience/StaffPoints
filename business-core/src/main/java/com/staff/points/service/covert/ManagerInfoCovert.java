package com.staff.points.service.covert;

import com.staff.points.dto.request.*;
import com.staff.points.entity.ManagerInfoEntityDO;
import com.staff.points.entity.WorkerInfoEntityDO;
import org.apache.logging.log4j.util.Strings;

import java.util.Date;
import java.util.UUID;

/**
 * @author yanjing
 * @version Id: WorkInfoCovert.java, v 0.1 2019/10/26 10:05 yanjing Exp $$
 */
public class ManagerInfoCovert {

    public static ManagerInfoEntityDO convertManagerInfoDO(ManagerInfoInsertDto managerInfoInsertDto,ManagerInfoEntityDO infoEntityDO) {
        ManagerInfoEntityDO managerInfoEntityDO = new ManagerInfoEntityDO();
        managerInfoEntityDO.setManagerId(UUID.randomUUID().toString().substring(0, 11));
        managerInfoEntityDO.setCertificateNo(managerInfoInsertDto.getCertificateNo());
        /**默认是1 代表是身份证**/
        managerInfoEntityDO.setCertificateType("1");
        managerInfoEntityDO.setRole("1");
        managerInfoEntityDO.setStatus(managerInfoInsertDto.getStatus());
        managerInfoEntityDO.setName(managerInfoInsertDto.getName());
        managerInfoEntityDO.setPassWord(managerInfoInsertDto.getPassWord());
        managerInfoEntityDO.setWeekPointsLimit(managerInfoInsertDto.getWeekPointsLimit());
        managerInfoEntityDO.setScanTimes(0);
        managerInfoEntityDO.setProjectName("111");
        //根据超级管理员账号查询
        /**工人所属项目和管理员所属项目一致**/
        if (null != infoEntityDO && Strings.isNotEmpty(infoEntityDO.getProjectName())) {
            managerInfoEntityDO.setProjectName(infoEntityDO.getProjectName());
        }
        managerInfoEntityDO.setDepartment(managerInfoInsertDto.getDepartment());
        managerInfoEntityDO.setCreatedBy("admin");
        managerInfoEntityDO.setUpdatedBy("admin");
        managerInfoEntityDO.setCreatedTime(new Date());
        managerInfoEntityDO.setUpdatedTime(new Date());
        return managerInfoEntityDO;

    }

    public static ManagerInfoEntityDO convertManagerInfoDO(ManagerInfoUpdateDto managerInfoUpdateDto) {
        ManagerInfoEntityDO managerInfoEntityDO = new ManagerInfoEntityDO();
        managerInfoEntityDO.setProjectName(managerInfoUpdateDto.getProjectName());
        managerInfoEntityDO.setCertificateNo(managerInfoUpdateDto.getCertificateNo());
        managerInfoEntityDO.setWeekPointsLimit(managerInfoUpdateDto.getWeekPointsLimit());
        managerInfoEntityDO.setPassWord(managerInfoUpdateDto.getPassWord());
        managerInfoEntityDO.setManagerId(managerInfoUpdateDto.getManagerId());
        managerInfoEntityDO.setStatus(managerInfoUpdateDto.getStatus());
        managerInfoEntityDO.setName(managerInfoUpdateDto.getName());
        managerInfoEntityDO.setDepartment(managerInfoUpdateDto.getDepartment());
        managerInfoEntityDO.setUpdatedBy("admin");
        managerInfoEntityDO.setUpdatedTime(new Date());
        return managerInfoEntityDO;

    }

    public static ManagerInfoEntityDO convertManagerInfoDO(ManagerInfoQueryDto managerInfoQueryDto) {
        ManagerInfoEntityDO managerInfoEntityDO = new ManagerInfoEntityDO();
        managerInfoEntityDO.setName(managerInfoQueryDto.getName());
        managerInfoEntityDO.setStatus(managerInfoQueryDto.getStatus());
        managerInfoEntityDO.setDepartment(managerInfoQueryDto.getDepartment());

        return managerInfoEntityDO;

    }
}
