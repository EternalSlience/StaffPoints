package com.staff.points.mapper;

import com.staff.points.entity.ManagerInfoEntityDO;
import java.util.List;

public interface ManagerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManagerInfoEntityDO record);

    ManagerInfoEntityDO selectByPrimaryKey(Integer id);

    List<ManagerInfoEntityDO> selectAll();

    int updateByPrimaryKey(ManagerInfoEntityDO record);

    ManagerInfoEntityDO selectByCertificateNo(String  certificateNo);

    int updateByManagerId(ManagerInfoEntityDO managerInfoEntityDO);

    List<ManagerInfoEntityDO> selectByCondition(ManagerInfoEntityDO managerInfoEntityDO);
}