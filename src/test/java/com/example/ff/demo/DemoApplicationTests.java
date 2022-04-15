package com.example.ff.demo;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.mapper.LabMapper;
import com.example.ff.demo.test.service.ILabService;
import com.example.ff.demo.test.service.INoticeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ILabService labService;
    INoticeService noticeService;
    LabMapper labMapper;
    @Test
    void contextLoads() {
/*        QueryWrapper<Lab> wrapper = new QueryWrapper<>();
        wrapper.eq("state","可预约");

        System.out.println(JSON.toJSONString(labService.list(wrapper)));*/

        //System.out.println(noticeService.getById("2"));
    }

/*    @Test

        public void selectByPage () {
            QueryWrapper<Lab> labWrapper = new QueryWrapper<>();
        labWrapper.eq("state", "维修");
            Page<Lab> page = new Page<>(1, 2);
            IPage<Lab> labIPage = labService.selectByPage(page, labWrapper);
            System.out.println("总条数"+labIPage.getTotal());
            System.out.println("总页数"+labIPage.getPages());
        }*/

}
