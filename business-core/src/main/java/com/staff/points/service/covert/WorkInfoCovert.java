package com.staff.points.service.covert;

import com.staff.points.dto.request.WorkerInfoInsertDto;
import com.staff.points.dto.request.WorkerInfoQueryDto;
import com.staff.points.dto.request.WorkerInfoUpdateDto;
import com.staff.points.entity.ManagerInfoEntityDO;
import com.staff.points.entity.WorkerInfoEntityDO;
import org.apache.logging.log4j.util.Strings;

import java.util.Date;
import java.util.UUID;

/**
 * @author yanjing
 * @version Id: WorkInfoCovert.java, v 0.1 2019/10/26 10:05 yanjing Exp $$
 */
public class WorkInfoCovert {

    public static WorkerInfoEntityDO convertWorkInfoDO(WorkerInfoInsertDto workerInfoInsertDto, ManagerInfoEntityDO managerInfoEntityDO) {
        WorkerInfoEntityDO workerInfoEntityDO = new WorkerInfoEntityDO();
        workerInfoEntityDO.setWorkerId(UUID.randomUUID().toString().substring(0, 11));
        workerInfoEntityDO.setCertificateNo(workerInfoInsertDto.getCertificateNo());
        /**默认是1 代表是身份证**/
        workerInfoEntityDO.setCertificateType("1");
        workerInfoEntityDO.setCompanyName(workerInfoInsertDto.getCompanyName());
        workerInfoEntityDO.setEnterTime(new Date());
        workerInfoEntityDO.setStatus(workerInfoInsertDto.getStatus());
        workerInfoEntityDO.setName(workerInfoInsertDto.getName());
        workerInfoEntityDO.setPoints(workerInfoInsertDto.getPoints());
        workerInfoEntityDO.setWorkType(workerInfoInsertDto.getWorkType());
        workerInfoEntityDO.setProjectName("222");
        workerInfoEntityDO.setCreatedBy("admin");
        workerInfoEntityDO.setUpdatedBy("admin");
        workerInfoEntityDO.setCreatedTime(new Date());
        workerInfoEntityDO.setUpdatedTime(new Date());
        /**工人所属项目和管理员所属项目一致**/
        if (null != managerInfoEntityDO && Strings.isNotEmpty(managerInfoEntityDO.getProjectName())) {
            workerInfoEntityDO.setProjectName(managerInfoEntityDO.getProjectName());
        }
        return workerInfoEntityDO;

    }

    public static WorkerInfoEntityDO convertWorkInfoDO(WorkerInfoUpdateDto workerInfoUpdateDto) {
        WorkerInfoEntityDO workerInfoEntityDO = new WorkerInfoEntityDO();
        workerInfoEntityDO.setWorkerId(workerInfoUpdateDto.getWorkerId());
        workerInfoEntityDO.setCompanyName(workerInfoUpdateDto.getCompanyName());
        workerInfoEntityDO.setPoints(workerInfoUpdateDto.getPoints());
        workerInfoEntityDO.setWorkType(workerInfoUpdateDto.getWorkType());
        workerInfoEntityDO.setUpdatedBy("admin");
        workerInfoEntityDO.setUpdatedTime(new Date());
        return workerInfoEntityDO;

    }

    public static WorkerInfoEntityDO convertWorkInfoDO(WorkerInfoQueryDto workerInfoQueryDto) {
        WorkerInfoEntityDO workerInfoEntityDO = new WorkerInfoEntityDO();
        workerInfoEntityDO.setWorkerId(workerInfoQueryDto.getWorkerId());
        workerInfoEntityDO.setCompanyName(workerInfoQueryDto.getCompanyName());
        workerInfoEntityDO.setStatus(workerInfoQueryDto.getStatus());
        workerInfoEntityDO.setWorkType(workerInfoQueryDto.getWorkType());
        workerInfoEntityDO.setPoints(workerInfoEntityDO.getPoints());
        return workerInfoEntityDO;

    }
}
