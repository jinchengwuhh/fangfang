package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.ff.demo.test.entity.Student;
import com.example.ff.demo.test.mapper.StudentMapper;
import com.example.ff.demo.test.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    private StudentMapper studentMapper;
    private  IStudentService studentService;
//学生登录
    @Override
    public Student checkLogin(String sId, String sPassword) {
        if (this.getOne(new QueryWrapper<Student>().eq("s_id" , sId).eq("s_password" , sPassword)) != null) {
            return getById(sId);
        } else {
            return null;
        }

    }
    //修改密码
    public boolean updateStudentPassword(Student s_changePassword){
        UpdateWrapper studentUpdateWrapper = new UpdateWrapper<>();
        studentUpdateWrapper.eq("s_id", s_changePassword.getsId());
        studentUpdateWrapper.set("sPassword",s_changePassword.getsPassword());
        return studentService.update(studentUpdateWrapper);
    }
}