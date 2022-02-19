package com.example.ff.demo.test.service;

import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
public interface ITeacherService extends IService<Teacher> {
    Teacher checkLoginTeacher(String id, String password);
}
