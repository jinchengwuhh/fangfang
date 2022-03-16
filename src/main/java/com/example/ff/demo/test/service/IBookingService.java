package com.example.ff.demo.test.service;

import com.example.ff.demo.test.entity.Booking;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Insert;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
public interface IBookingService extends IService<Booking> {

    void appointmentLab(Booking booking);
}