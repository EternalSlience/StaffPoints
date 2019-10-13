package com.staff.points.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCodeEnum {
    SUCCESS("00", "成功"),
    FAILURE("01", "系统异常");


    private String code;
    private String message;
}
