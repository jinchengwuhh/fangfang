package com.example.ff.demo;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.service.ILabService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ILabService labService;
    @Test
    void contextLoads() {
        QueryWrapper<Lab> wrapper = new QueryWrapper<>();
        wrapper.eq("state","可预约");

        System.out.println(JSON.toJSONString(labService.list(wrapper)));


    }

}
