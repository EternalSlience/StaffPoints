package com.staff.points.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class WorkerInfoEntityDO implements Serializable {
    private Integer id;
    /**
     * 工人id
     */
    private String workerId;
    /**
     * 工人姓名
     */
    private String name;
    /**
     * 工人身份证号
     */
    private String certificateNo;
    /**
     * 工人身份类型
     */
    private String certificateType;
    /**
     * 工人所属公司
     */
    private String companyName;
    /**
     * 工人工种
     */
    private String workType;
    /**
     * 所属项目
     */
    private String projectName;
    /**
     * 入场时间
     */
    private Date enterTime;
    /**
     * 状态
     */
    private String status;
    /**
     * 积分
     */
    private Integer points;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;


}