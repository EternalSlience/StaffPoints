package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工人信息Dto")
public class ManagerInfoUpdateDto {



    @ApiModelProperty(name = "姓名")
    private String name;
    @ApiModelProperty(name = "身份证号")
    private String certificateNo;
    @ApiModelProperty(name = "部门")
    private String department;
    @ApiModelProperty(name = "管理员id", required = true)
    private String managerId;
    @ApiModelProperty(name = "状态")
    private String status;
    @ApiModelProperty(name = "每周加分上限")
    private Integer weekPointsLimit;
    @ApiModelProperty(name = "初始密码")
    private String passWord;
    @ApiModelProperty(name = "所属项目")
    private String projectName;

}
