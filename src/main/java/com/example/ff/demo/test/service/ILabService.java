package com.example.ff.demo.test.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Lab;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
public interface ILabService extends IService<Lab> {
    List<Lab> findByState(Lab find_lab);
    List<Lab> findByLabName(Lab find_lab);
}