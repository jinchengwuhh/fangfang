package com.example.ff.demo.test.controller;


import com.alibaba.fastjson.JSON;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.entity.Teacher;
import com.example.ff.demo.test.service.impl.StudentServiceImpl;
import com.example.ff.demo.test.service.impl.TeacherServiceImpl;
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
 * @since 2022-01-30
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherServiceImpl teacherService;
    @RequestMapping("login")
    @ResponseBody
    /* @PostMapping(value = "/login")*/
    public String checkLoginTeacher(@RequestBody Teacher rev_teacher){

        Teacher teacher = teacherService.checkLoginTeacher(rev_teacher.getId(),rev_teacher.getPassword());

        System.out.println("teacher"+teacher.toString());/**/
        if(teacher != null){
            return JSON.toJSONString(teacher);
        }else {
            return "error";
        }
    }
}
