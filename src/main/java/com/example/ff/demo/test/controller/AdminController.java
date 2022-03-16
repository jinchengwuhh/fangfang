package com.example.ff.demo.test.controller;


import com.alibaba.fastjson.JSON;
import com.example.ff.demo.test.entity.Admin;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.service.impl.AdminServiceImpl;
import com.example.ff.demo.test.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
@Controller
@RequestMapping("/test/admin")
public class AdminController {
    @Resource
    private AdminServiceImpl AdminService;
    @RequestMapping("login")
    @ResponseBody
    /* @PostMapping(value = "/login")*/
    public String checkLogin(@RequestBody Admin rev_admin){

        Admin admin = AdminService.checkLoginAdmin(rev_admin.getaId(),rev_admin.getaPassword());
        System.out.println("Admin"+admin.toString());
        if(admin != null){
            return JSON.toJSONString(admin);
        }else {
            return "error";
        }
    }

}

