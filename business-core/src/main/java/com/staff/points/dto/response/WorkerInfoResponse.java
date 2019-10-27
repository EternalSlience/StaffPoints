package com.staff.points.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * @author yanjing
 * @version Id: WorkerInfoResponse.java, v 0.1 2019/10/26 12:59 yanjing Exp $$
 */
@Data
public class WorkerInfoResponse {
    private String   name ;

    private String companyName;

    private String workType;

    private String status;
    private Integer points;

    private Date enterTime;

}
