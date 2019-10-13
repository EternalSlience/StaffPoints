package com.staff.points.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
public class StaffRolesEntity {

    private Integer id;

    private String roleCode;
    private String roleName;
    private String roleDesc;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;

}
