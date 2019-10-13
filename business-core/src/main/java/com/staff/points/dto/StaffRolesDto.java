package com.staff.points.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户角色Dto")
public class StaffRolesDto {

    @ApiModelProperty(name = "角色code", required = true)
    private String roleCode;
    @ApiModelProperty(name = "角色名称", required = true)
    private String roleName;
    @ApiModelProperty(name = "角色描述", required = true)
    private String roleDesc;
    @ApiModelProperty(name = "创建人", required = true)
    private String createdBy;
    @ApiModelProperty(name = "修改人", required = true)
    private String updatedBy;

}
