package com.girl.controller;

import com.girl.properties.GirlProperties;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by corning on 2017/4/19.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @ApiOperation(value = "你好")
    @ApiImplicitParam(name = "id", value = "编号", dataType = "Integer")
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "你好！id: " + id;
    }
}
