package com.example.ff.demo.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.mapper.LabMapper;
import com.example.ff.demo.test.service.ILabService;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/lab")
public class LabController {

    @Resource
    private ILabService labService;
    private LabMapper labMapper;

    @GetMapping("/findAll")
    public Object test(){
        return labService.list();
    }
    @RequestMapping("/findByState")
    @ResponseBody
    public List<Lab> findByState(@RequestBody Lab find_lab){

        return labService.findByState(find_lab);

    }
    @RequestMapping("/findByLabName")
    @ResponseBody
    public List<Lab> findByLabName(@RequestBody Lab find_lab){

        return labService.findByLabName(find_lab);


    }
}

