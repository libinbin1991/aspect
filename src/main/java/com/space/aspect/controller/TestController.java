package com.space.aspect.controller;

import com.space.aspect.anno.SysLog;
import com.space.aspect.service.SysLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhuzhe
 * @date 2018/6/4 9:47
 * @email 1529949535@qq.com
 */
@RestController
public class TestController {

    @Resource
    private SysLogService sysLogService;


    @GetMapping("/test")
    public String test(@RequestParam("name") String name){

        String s = sysLogService.doWork(name);

        return s;
    }
}
