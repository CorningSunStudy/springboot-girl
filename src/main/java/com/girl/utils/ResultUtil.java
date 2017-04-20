package com.girl.utils;

import com.girl.domain.Result;

/**
 * Created by corning on 2017/4/20.
 */
public class ResultUtil {


    public static Result success(Object object) {
        return new Result(0, "成功", object);
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        return new Result(code, msg);
    }


}
