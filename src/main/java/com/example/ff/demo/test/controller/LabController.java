package com.example.ff.demo.test.controller;


import com.example.ff.demo.test.service.ILabService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@RestController
@RequestMapping("/lab")
public class LabController {
    @Resource
    private ILabService labService;

    @GetMapping("/findAll")
    public Object test(){
        return labService.list();
    }
}

