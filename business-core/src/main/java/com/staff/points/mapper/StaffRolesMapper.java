package com.staff.points.mapper;

import com.staff.points.entity.StaffRolesEntity;

public interface StaffRolesMapper {

    void insert(StaffRolesEntity staffRolesEntity);

    int update(StaffRolesEntity staffRolesEntity);

    StaffRolesEntity  query(StaffRolesEntity staffRolesEntity);


}
