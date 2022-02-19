package com.example.ff.demo.test.mapper;

import com.example.ff.demo.test.entity.ReservedLab;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@Mapper
@Repository
public interface ReservedLabMapper extends BaseMapper<ReservedLab> {
/*    @Insert("insert into reserved_lab (revLab_id,lab_name,startTime,endTime,mobile,info) " +
            "values (#{buildingId},#{lab_name},#{startTime},#{endTime},#{mobile},#{info})")
    void appointmentLab(ReservedLab reservedLab);*/
}
