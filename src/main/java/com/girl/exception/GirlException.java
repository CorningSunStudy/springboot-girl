package com.girl.exception;

import com.girl.enums.ResultEnum;

/**
 * Created by corning on 2017/4/20.
 */
public class GirlException extends RuntimeException {


    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        this(resultEnum.getMsg(), resultEnum.getCode());
    }

    public GirlException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
