package com.staff.points.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ManagerInfoEntityDO implements Serializable {
    private Integer id;
    /**
     * 管理者id
     */
    private String managerId;
    /**
     * 角色
     */
    private String role;
    /**
     * 姓名
     */
    private String name;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 身份证号
     */
    private String certificateNo;
    /**
     * 身份类型
     */
    private String certificateType;
    /**
     * 扫码次数
     */
    private Integer scanTimes;
    /**
     * 每周加分上限
     */
    private Integer weekPointsLimit;
    /**
     * 状态
     */
    private String status;
    /**
     * 项目名称
     */
    private String projectName;

    private String passWord;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

}