package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.entity.Teacher;
import com.example.ff.demo.test.mapper.TeacherMapper;
import com.example.ff.demo.test.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {
    @Override
    public Teacher checkLoginTeacher(String tId, String tPassword) {
        if (this.getOne(new QueryWrapper<Teacher>().eq("t_id" , tId).eq("t_password" , tPassword)) != null) {
            return this.getById(tId);
        } else {
            return null;
        }
    }

}