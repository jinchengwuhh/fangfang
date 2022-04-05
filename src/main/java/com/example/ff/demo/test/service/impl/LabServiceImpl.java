package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.mapper.LabMapper;
import com.example.ff.demo.test.service.ILabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements ILabService {
    @Autowired
    ILabService labService;
    public List<Lab> findByState(Lab find_lab){
        List<Lab> list = labService.list(new QueryWrapper<Lab>().eq("state", find_lab.getState()));
        if(!list.isEmpty() ){
            return list;
        }else {
            return null;
        }

    }

    @Override
    public List<Lab> findByLabName(Lab find_lab) {
        List<Lab> listByName = labService.list(new QueryWrapper<Lab>().like("lab_name", find_lab.getLabName()));
        if(!listByName.isEmpty() ){
            return listByName;
        }else {
            return null;
        }
    }
}