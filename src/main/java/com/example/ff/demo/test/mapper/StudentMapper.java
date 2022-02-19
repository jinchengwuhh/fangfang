package com.example.ff.demo.test.mapper;

import com.example.ff.demo.test.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    //List<Student> checkLogin(@Param("username") String username,@Param("password") String password);
}
