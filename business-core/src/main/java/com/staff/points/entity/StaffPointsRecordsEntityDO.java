package com.staff.points.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class StaffPointsRecordsEntityDO implements Serializable {
    /**
     * id
     */
    private Integer id;

    private String managerId;

    private String managerName;

    private String managerDept;

    private String managerCertificateNo;

    private String projectName;

    private String workerId;

    private String workerName;

    private String workType;

    private String workerCertificateNo;

    private String workerCompany;

    private String pointType;

    private Integer point;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;


}