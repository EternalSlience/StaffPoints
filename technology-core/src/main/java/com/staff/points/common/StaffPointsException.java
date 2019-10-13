package com.staff.points.common;

import lombok.Data;

@Data
public class StaffPointsException extends RuntimeException{
    private String code;
    private String message;
    public StaffPointsException () {}

    public StaffPointsException (Exception e) {
        super(e);
    }

    public StaffPointsException (String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
