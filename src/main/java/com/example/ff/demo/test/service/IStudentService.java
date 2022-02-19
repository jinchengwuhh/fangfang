package com.example.ff.demo.test.service;

import com.example.ff.demo.test.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
public interface IStudentService extends IService<Student> {

   Student checkLogin(String id,String password);
}
