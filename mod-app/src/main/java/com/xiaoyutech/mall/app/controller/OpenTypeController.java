package com.xiaoyutech.mall.app.controller;

import com.xiaoyutech.mall.app.service.OpenTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OpenTypeController {
    @Resource
    private OpenTypeService openTypeService;


}
