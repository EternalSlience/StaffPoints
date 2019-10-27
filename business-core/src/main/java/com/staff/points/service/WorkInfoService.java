package com.staff.points.service;


import com.staff.points.dto.request.WorkerInfoInsertDto;
import com.staff.points.dto.request.WorkerInfoQueryDto;
import com.staff.points.dto.request.WorkerInfoUpdateDto;
import com.staff.points.entity.ManagerInfoEntityDO;
import com.staff.points.entity.WorkerInfoEntityDO;
import com.staff.points.mapper.ManagerInfoMapper;
import com.staff.points.mapper.WorkerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import static com.staff.points.service.covert.WorkInfoCovert.convertWorkInfoDO;

/**
 * @author yanjing
 * @version Id: WorkInfoService.java, v 0.1 2019/10/16 22:21 yanjing Exp $$
 */
@Service
public class WorkInfoService {

    @Autowired(required = false)
    private WorkerInfoMapper workerInfoMapper;

    @Autowired(required = false)
    private ManagerInfoMapper managerInfoMapper;

    public int insert(WorkerInfoInsertDto workerInfoInsertDto) {

        ManagerInfoEntityDO managerInfoEntityDO = managerInfoMapper.selectByCertificateNo(workerInfoInsertDto.getManagerCertificateNo());
        return workerInfoMapper.insert(convertWorkInfoDO(workerInfoInsertDto,managerInfoEntityDO));
    }

    public int update(WorkerInfoUpdateDto workerInfoUpdateDto) {

        return workerInfoMapper.updateByWorkerId(convertWorkInfoDO(workerInfoUpdateDto));
    }

    public List<WorkerInfoEntityDO> query(WorkerInfoQueryDto workerInfoQueryDto) {

        return workerInfoMapper.selectByCondition(convertWorkInfoDO(workerInfoQueryDto));
    }




}
