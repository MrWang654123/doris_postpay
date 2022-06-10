package com.gtxy.yyf.doris.common.enums;

/**
 * 返回枚举类处理
 */
public enum ResultEnum {

    SUCCESS(200, "SUCCESS"),
    FAIL(201, "FAIL"),
    ILLEGAL_ARGUMENTS(202, "ILLEGAL_ARGUMENTS"),
    MISSING_PARAMETER(203, "MISSING_PARAMETER"),
    FORBIDDEN(403, "FORBIDDEN"),
    INTERNAL_ERROR(500, "INTERNAL_ERROR");

    private int code;
    private String msg;

    private ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}

