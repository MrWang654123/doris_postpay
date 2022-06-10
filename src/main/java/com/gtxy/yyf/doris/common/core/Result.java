package com.gtxy.yyf.doris.common.core;
import com.gtxy.yyf.doris.common.enums.ResultEnum;
import com.gtxy.yyf.doris.common.utils.JsonUtils;

/**
 * 返回对象封装
 */
public class Result {
    private int status;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result(int status, String msg, Object data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result success() {
        Result result = new Result();
        result.setStatus(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setStatus(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setStatus(ResultEnum.FAIL.getCode());
        result.setMsg(ResultEnum.FAIL.getMsg());
        return result;
    }

    public static Result fail(Object data) {
        Result result = new Result();
        result.setStatus(ResultEnum.FAIL.getCode());
        result.setMsg(ResultEnum.FAIL.getMsg());
        result.setData(data);
        return result;
    }

    public static Result internalError() {
        Result result = new Result();
        result.setStatus(ResultEnum.INTERNAL_ERROR.getCode());
        result.setMsg(ResultEnum.INTERNAL_ERROR.getMsg());
        return result;
    }

    public static Result internalError(Object data) {
        Result result = new Result();
        result.setStatus(ResultEnum.INTERNAL_ERROR.getCode());
        result.setMsg(ResultEnum.INTERNAL_ERROR.getMsg());
        result.setData(data);
        return result;
    }

    public static Result illegalArguments(Object data) {
        Result result = new Result();
        result.setStatus(ResultEnum.ILLEGAL_ARGUMENTS.getCode());
        result.setMsg(ResultEnum.ILLEGAL_ARGUMENTS.getMsg());
        result.setData(data);
        return result;
    }

    public static Result illegalArguments() {
        Result result = new Result();
        result.setStatus(ResultEnum.ILLEGAL_ARGUMENTS.getCode());
        result.setMsg(ResultEnum.ILLEGAL_ARGUMENTS.getMsg());
        return result;
    }

    public static Result missingParameter(Object data) {
        Result result = new Result();
        result.setStatus(ResultEnum.MISSING_PARAMETER.getCode());
        result.setMsg(ResultEnum.MISSING_PARAMETER.getMsg());
        result.setData(data);
        return result;
    }

    public static Result forbidden() {
        Result result = new Result();
        result.setStatus(ResultEnum.FORBIDDEN.getCode());
        result.setMsg(ResultEnum.FORBIDDEN.getMsg());
        return result;
    }

    public static Result custom(int status, String msg) {
        Result result = new Result();
        result.setStatus(status);
        result.setMsg(msg);
        return result;
    }

    public static Result custom(int status, String msg, Object data) {
        Result result = new Result();
        result.setStatus(status);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public String toString() {
        return JsonUtils.toJSONString(this);
    }
}
