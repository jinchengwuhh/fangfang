package com.example.ff.demo.test.controller;


import com.example.ff.demo.test.entity.Booking;
import com.example.ff.demo.test.service.impl.BookingServiceImpl;
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
    @RequestMapping("appointment")
    @ResponseBody
    public boolean appointmentLab(@RequestBody Booking booking){
        try {
            bookingService.appointmentLab(booking);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @RequestMapping("add.do")
    @ResponseBody
    public boolean add(@RequestBody  Booking booking){
        System.out.println(booking);
        return bookingService.save(booking);
    }

}
