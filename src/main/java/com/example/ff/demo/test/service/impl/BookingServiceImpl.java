package com.example.ff.demo.test.service.impl;

import com.example.ff.demo.test.entity.Booking;
import com.example.ff.demo.test.mapper.BookingMapper;
import com.example.ff.demo.test.service.IBookingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
@Service
public class BookingServiceImpl extends ServiceImpl<BookingMapper, Booking> implements IBookingService {

    //添加

    private BookingMapper bookingMapper;

    @Override
    public void add(Booking booking) {
        bookingMapper.insert(booking);
    }
    @Override
    public void findBookingLabById(String uId) {
        bookingMapper.selectById(uId);
    }
    @Override
    public void delBookingLabById(String bId){
        bookingMapper.deleteById(bId);
    }
}
