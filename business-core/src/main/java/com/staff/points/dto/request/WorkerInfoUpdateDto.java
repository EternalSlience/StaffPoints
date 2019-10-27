package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工人信息Dto")
public class WorkerInfoUpdateDto {



    @ApiModelProperty(name = "所属公司")
    private String companyName;
    @ApiModelProperty(name = "工种")
    private String workType;
    @ApiModelProperty(name = "工人id", required = true)
    private String workerId;
    @ApiModelProperty(name = "积分")
    private Integer points;

}
