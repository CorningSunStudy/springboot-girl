package com.girl.handle;

import com.girl.domain.Result;
import com.girl.enums.ResultEnum;
import com.girl.exception.GirlException;
import com.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by corning on 2017/4/20.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }
        logger.error("【系统异常】", e);
        return ResultUtil.error(ResultEnum.UNKOWN_ERROR.getCode(), ResultEnum.UNKOWN_ERROR.getMsg());
    }
}
