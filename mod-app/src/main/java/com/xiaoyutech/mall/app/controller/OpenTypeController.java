package com.xiaoyutech.mall.app.controller;

import com.xiaoyutech.lib.common.CommonResult;
import com.xiaoyutech.mall.app.entities.OpenType;
import com.xiaoyutech.mall.app.service.OpenTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OpenTypeController {
    @Resource
    private OpenTypeService openTypeService;

    @PostMapping(value = "/opentype/create")
    public CommonResult create(@RequestBody OpenType openType) {
        int result = openTypeService.create(openType);
        if (result > 0) {
            return new CommonResult(200, "sucess", result);
        }
        return new CommonResult(400, "fail", null);
    }

    @GetMapping(value = "/opentype/get/{id}")
    public CommonResult getOpenTypeById(@PathVariable("id") Long id) {
        OpenType result = openTypeService.getOpenTypeById(id);

        if (result != null) {
            return new CommonResult(200, "sucess", result);
        }
        return new CommonResult(400, "no data,id:" + id, null);
    }
}
