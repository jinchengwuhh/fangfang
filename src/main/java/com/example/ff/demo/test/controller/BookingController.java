package com.example.ff.demo.test.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Booking;
import com.example.ff.demo.test.service.impl.BookingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/bookingLab")
public class BookingController {
    @Resource
    private BookingServiceImpl bookingService;

    @RequestMapping("/findAllBookingLab")
    @ResponseBody
    public Object test(){
        return bookingService.list();
    }
    @RequestMapping("add.do")
    @ResponseBody
    public boolean add(@RequestBody  Booking booking){
        // System.out.println(booking);
        return bookingService.save(booking);
    }
    @RequestMapping("findById")
    @ResponseBody
    public Booking findBookingLabById(@RequestBody  Booking booking){
         //System.out.println(booking);
        //System.out.println(booking.getuId());
        return bookingService.getById(booking.getuId());
    }
    @RequestMapping("delBybId")
    @ResponseBody
    public boolean delBookingLabById(@RequestBody  Booking booking){
         System.out.println(booking);
        System.out.println(booking.getbId());
        return bookingService.remove(new QueryWrapper<Booking>().eq("b_id", booking.getbId()));

    }

}

