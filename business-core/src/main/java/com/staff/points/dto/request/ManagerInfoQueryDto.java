package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "管理员信息Dto")
public class ManagerInfoQueryDto {



    @ApiModelProperty(name = "部门")
    private String department;
    @ApiModelProperty(name = "姓名")
    private String name;
    @ApiModelProperty(name = "状态")
    private String status;

}
