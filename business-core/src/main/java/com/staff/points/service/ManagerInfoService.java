package com.staff.points.service;


import com.staff.points.dto.request.*;
import com.staff.points.entity.ManagerInfoEntityDO;
import com.staff.points.mapper.ManagerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.staff.points.service.covert.ManagerInfoCovert.convertManagerInfoDO;


/**
 * @author yanjing
 * @version Id: WorkInfoService.java, v 0.1 2019/10/16 22:21 yanjing Exp $$
 */
@Service
public class ManagerInfoService {

    @Autowired(required = false)
    private ManagerInfoMapper managerInfoMapper;

    public int insert(ManagerInfoInsertDto managerInfoInsertDto) {
        ManagerInfoEntityDO managerInfoEntityDO = managerInfoMapper.selectByCertificateNo(managerInfoInsertDto.getManagerCertificateNo());
        return managerInfoMapper.insert(convertManagerInfoDO(managerInfoInsertDto,managerInfoEntityDO));
    }

    public int update(ManagerInfoUpdateDto managerInfoUpdateDto) {

        return managerInfoMapper.updateByManagerId(convertManagerInfoDO(managerInfoUpdateDto));
    }

    public List<ManagerInfoEntityDO> query(ManagerInfoQueryDto managerInfoQueryDto) {

        return managerInfoMapper.selectByCondition(convertManagerInfoDO(managerInfoQueryDto));
    }




}
