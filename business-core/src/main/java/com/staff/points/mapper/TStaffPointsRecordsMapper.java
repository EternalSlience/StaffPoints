package com.staff.points.mapper;

import com.staff.points.entity.TStaffPointsRecords;
import java.util.List;

public interface TStaffPointsRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TStaffPointsRecords record);

    TStaffPointsRecords selectByPrimaryKey(Integer id);

    List<TStaffPointsRecords> selectAll();

    int updateByPrimaryKey(TStaffPointsRecords record);
}