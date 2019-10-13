package com.staff.points.mapper;

import com.staff.points.entity.TStaffUserInfo;
import java.util.List;

public interface TStaffUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TStaffUserInfo record);

    TStaffUserInfo selectByPrimaryKey(Integer id);

    List<TStaffUserInfo> selectAll();

    int updateByPrimaryKey(TStaffUserInfo record);
}