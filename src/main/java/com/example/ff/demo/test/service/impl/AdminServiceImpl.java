package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Admin;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.mapper.AdminMapper;
import com.example.ff.demo.test.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
    @Override
    public Admin checkLoginAdmin(String aId, String aPassword) {
        if (this.getOne(new QueryWrapper<Admin>().eq("id" , aId).eq("password" , aPassword)) != null) {
            return this.getById(aId);
        } else {
            return null;
        }


    }
}