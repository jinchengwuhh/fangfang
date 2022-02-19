package com.example.ff.demo.test.service;

import com.example.ff.demo.test.entity.ReservedLab;
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
public interface IReservedLabService extends IService<ReservedLab> {

    void appointmentLab(ReservedLab reservedLab);
}
