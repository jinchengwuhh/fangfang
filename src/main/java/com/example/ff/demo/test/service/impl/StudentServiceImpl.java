package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.mapper.StudentMapper;
import com.example.ff.demo.test.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.ognl.ASTUnsignedShiftRight;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public Student checkLogin(String id, String password) {
        if (this.getOne(new QueryWrapper<Student>().eq("id" , id).eq("password" , password)) != null) {
            return this.getById(id);
        } else {
            return null;
        }


    }
/*    public Student findLoginStudent(String id){
        return find
    }*/
}
