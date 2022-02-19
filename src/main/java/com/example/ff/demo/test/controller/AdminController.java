package com.example.ff.demo.test.controller;


import com.example.ff.demo.test.service.IAdminService;
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
@RequestMapping("/test")
public class AdminController {
    @Resource
    private IAdminService adminService;
    @GetMapping("/admin")
    public Object listAdmin(){
        return adminService.list();
    }
}

