package com.example.ff.demo.test.controller;


import com.example.ff.demo.test.entity.Notice;
import com.example.ff.demo.test.service.ILabService;
import com.example.ff.demo.test.service.INoticeService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-03-31
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    private INoticeService noticeService;
    @GetMapping("/findAllNotice")
    public Object test(){
        return noticeService.list();
    }


    @RequestMapping("/findBynId")
    @ResponseBody
    public Notice findBynId(@RequestBody Notice notice){
        return noticeService.getById(notice.getnId());
    }
}

