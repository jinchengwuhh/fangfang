package com.example.ff.demo.test.controller;


import com.example.ff.demo.test.entity.ReservedLab;
import com.example.ff.demo.test.service.impl.ReservedLabServiceImpl;
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
@RequestMapping("/reservedLab")
public class ReservedLabController {
    @Resource
    private ReservedLabServiceImpl reservedLabService;
    @RequestMapping("appointment")
    @ResponseBody
    public boolean appointmentLab(@RequestBody ReservedLab reservedLab){
        try {
            reservedLabService.appointmentLab(reservedLab);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @RequestMapping("add.do")
    @ResponseBody
    public boolean add(@RequestBody  ReservedLab reservedLab){
        System.out.println(reservedLab);
        return reservedLabService.save(reservedLab);
    }

}

