package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工人信息Dto")
public class WorkerInfoQueryDto {



    @ApiModelProperty(name = "所属公司")
    private String companyName;
    @ApiModelProperty(name = "工种")
    private String workType;
    @ApiModelProperty(name = "工人id")
    private String workerId;
    @ApiModelProperty(name = "姓名")
    private String name;
    @ApiModelProperty(name = "状态")
    private String status;

}
