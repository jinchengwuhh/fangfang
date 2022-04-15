package com.example.ff.demo.test.controller;


import com.alibaba.fastjson.JSON;
import com.example.ff.demo.test.entity.Admin;
import com.example.ff.demo.test.service.impl.AdminServiceImpl;

import com.example.ff.demo.test.util.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminServiceImpl AdminService;
    private RedisTemplate redisTemplate;
    @RequestMapping("login")
    @ResponseBody
    /* @PostMapping(value = "/login")*/
    public String checkLogin(@RequestBody Admin rev_admin){
        //Result result = new Result();
        Admin admin = AdminService.checkLoginAdmin(rev_admin.getaId(),rev_admin.getaPassword());
        System.out.println("Admin"+admin.toString());
        if(admin != null){
           /* String token = UUID.randomUUID() + "";//申请一个token
            //key：token   value：user 写入redis
            redisTemplate.opsForValue().set(token, admin, Duration.ofMinutes(60L));//保存一个小时的登录状态
            System.out.println("token"+token);

            result.setToken(token);//token也返回前端
            result.setMsg("登录成功，一小时内可以免登录进入");
            result.setResult(true);*/
           return JSON.toJSONString(admin);

        }else {
            return null;
        }
    }

}
