package com.example.ff.demo.test.controller;


import com.alibaba.fastjson.JSON;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.service.IStudentService;
import com.example.ff.demo.test.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentServiceImpl studentService;
    @RequestMapping("login")
    @ResponseBody
   /* @PostMapping(value = "/login")*/
    public String checkLogin(@RequestBody  Student rev_student){

        Student student = studentService.checkLogin(rev_student.getId(),rev_student.getPassword());
        System.out.println("student"+student.toString());
            if(student != null){
                return JSON.toJSONString(student);
            }else {
                return "error";
            }
    }

}

