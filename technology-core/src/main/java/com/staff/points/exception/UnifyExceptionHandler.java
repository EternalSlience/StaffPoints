package com.staff.points.exception;

import com.staff.points.common.ResponseCodeEnum;
import com.staff.points.common.ResponseDto;
import com.staff.points.common.StaffPointsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Component
public class UnifyExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(UnifyExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseDto handlerCommonException (Exception e) {
        ResponseDto responseDto = new ResponseDto<>();
        responseDto.setCode(ResponseCodeEnum.FAILURE.getCode());
        responseDto.setMessage(ResponseCodeEnum.FAILURE.getMessage());
        logger.info("UnifyExceptionHandler.handlerCommonException exception:" + e);
        return responseDto;
    }

    @ExceptionHandler(StaffPointsException.class)
    public ResponseDto handlerCustomizeException (StaffPointsException e) {
        ResponseDto responseDto = new ResponseDto<>();
        responseDto.setCode(e.getCode());
        responseDto.setMessage(e.getMessage());
        logger.info("UnifyExceptionHandler.handlerCustomizeException StaffPointsException:" + e);
        return responseDto;
    }
}
