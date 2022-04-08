package com.example.ff.demo.test.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
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
 * @since 2022-02-19
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentServiceImpl studentService;
    @RequestMapping("login")
    @ResponseBody
    /* @PostMapping(value = "/login")*/
    public String checkLogin(@RequestBody Student rev_student){

        Student student = studentService.checkLogin(rev_student.getsId(),rev_student.getsPassword());

        if(student != null){
            System.out.println("student"+student.toString());
            return JSON.toJSONString(student);
        }else {
            return "error";
        }
    }
    @RequestMapping("/updateStudentPassword")
    @ResponseBody
    public boolean updateStudentPassword(@RequestBody Student student){
        UpdateWrapper<Student> studentUpdateWrapper = new UpdateWrapper<>();
        studentUpdateWrapper.eq("s_id", student.getsId()).set("s_password", student.getsPassword());
        return studentService.update(studentUpdateWrapper);
        //return studentService.update(new QueryWrapper<Student>().eq("s_Id",student.getsId()))
    }


}
