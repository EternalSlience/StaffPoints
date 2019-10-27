package com.staff.points.mapper;

import com.staff.points.entity.StaffPointsRecordsEntityDO;
import java.util.List;

public interface StaffPointsRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StaffPointsRecordsEntityDO record);

    StaffPointsRecordsEntityDO selectByPrimaryKey(Integer id);

    List<StaffPointsRecordsEntityDO> selectAll();

    int updateByPrimaryKey(StaffPointsRecordsEntityDO record);
}