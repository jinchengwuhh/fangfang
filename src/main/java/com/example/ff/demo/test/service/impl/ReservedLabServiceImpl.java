package com.example.ff.demo.test.service.impl;

import com.example.ff.demo.test.entity.ReservedLab;
import com.example.ff.demo.test.mapper.ReservedLabMapper;
import com.example.ff.demo.test.service.IReservedLabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@Service
public class ReservedLabServiceImpl extends ServiceImpl<ReservedLabMapper, ReservedLab> implements IReservedLabService {

    //添加
    @Autowired
    private ReservedLabMapper reservedLabMapper;
    @Override
    public void appointmentLab(ReservedLab reservedLab) {
        reservedLabMapper.insert(reservedLab);
    }
}
