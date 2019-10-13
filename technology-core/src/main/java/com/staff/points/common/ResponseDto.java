package com.staff.points.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseDto<T> implements Serializable {
    private static final long serialVersionUID = -284719732991678911L;

    private String code;

    private String message;

    private T data;

    public ResponseDto<T> assemblingSuccessResponse(T data) {
        ResponseDto<T> responseDto = new ResponseDto<>();
        responseDto.setCode(ResponseCodeEnum.SUCCESS.getCode());
        responseDto.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        responseDto.setData(data);
        return responseDto;
    }

//    public ResponseDto<T> getFailureResponse() {
//        ResponseDto<T> responseDto = new ResponseDto<>();
//        responseDto.setCode(ResponseCodeEnum.FAILURE.getCode());
//        responseDto.setMessage(ResponseCodeEnum.FAILURE.getMessage());
//        return responseDto;
//    }
}
