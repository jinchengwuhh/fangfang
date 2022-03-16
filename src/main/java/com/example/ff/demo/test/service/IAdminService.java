package com.example.ff.demo.test.service;

import com.example.ff.demo.test.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ff.demo.test.entity.Student;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
public interface IAdminService extends IService<Admin> {
    Admin checkLoginAdmin(String aId, String aPassword);

}
