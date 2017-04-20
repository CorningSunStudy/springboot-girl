package com.girl.enums;

/**
 * Created by corning on 2017/4/20.
 */
public enum ResultEnum {

    UNKOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(10, "你可能还在上小学"),
    MIDDLE_SCHOOL(16, "你可能还在上初中"),

    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
