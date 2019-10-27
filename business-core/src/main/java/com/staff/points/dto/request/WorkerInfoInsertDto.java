package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工人信息Dto")
public class WorkerInfoInsertDto {


    @ApiModelProperty(name = "姓名", required = true)
    private String name;
    @ApiModelProperty(name = "身份证号", required = true)
    private String certificateNo;
    @ApiModelProperty(name = "所属公司", required = true)
    private String companyName;
    @ApiModelProperty(name = "工种", required = true)
    private String workType;
    @ApiModelProperty(name = "管理员身份证号", required = true)
    private String managerCertificateNo;
    @ApiModelProperty(name = "状态", required = true)
    private String status;
    @ApiModelProperty(name = "积分", required = true)
    private Integer points;

}
