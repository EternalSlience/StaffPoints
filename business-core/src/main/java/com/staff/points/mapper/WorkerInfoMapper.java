package com.staff.points.mapper;

import com.staff.points.entity.WorkerInfoEntityDO;
import java.util.List;

public interface WorkerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkerInfoEntityDO record);

    WorkerInfoEntityDO selectByPrimaryKey( String workerId);

    List<WorkerInfoEntityDO> selectAll();

    int updateByPrimaryKey(WorkerInfoEntityDO record);

    int updateByWorkerId(WorkerInfoEntityDO  workerInfoEntityDO);

    List<WorkerInfoEntityDO> selectByCondition(WorkerInfoEntityDO  workerInfoEntityDO);

}