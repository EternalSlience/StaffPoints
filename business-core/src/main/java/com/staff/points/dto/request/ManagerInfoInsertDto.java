package com.staff.points.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工人信息Dto")
public class ManagerInfoInsertDto {


    @ApiModelProperty(name = "姓名", required = true)
    private String name;
    @ApiModelProperty(name = "身份证号", required = true)
    private String certificateNo;
    @ApiModelProperty(name = "部门", required = true)
    private String department;
    @ApiModelProperty(name = "管理员身份证号", required = true)
    private String managerCertificateNo;
    @ApiModelProperty(name = "状态", required = true)
    private String status;
    @ApiModelProperty(name = "每周加分上限", required = true)
    private Integer weekPointsLimit;
    @ApiModelProperty(name = "初始密码", required = true)
    private String passWord;


}
