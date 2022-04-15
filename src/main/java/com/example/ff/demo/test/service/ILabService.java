package com.example.ff.demo.test.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ff.demo.test.entity.Lab;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.ff.demo.test.entity.LabList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
public interface ILabService extends IService<Lab> {
    List<Lab> findByState(Lab find_labByState);//小程序根据状态查找

    List<Lab> findByLabName(Lab find_lab); //小程序根据id 或 名称 模糊查询

    IPage<Lab> findPageByIdOrNameOrState(Page<Lab> pageParam, String labId, String labName, String state); //通过Id名称模糊查询并 分页返回

    public IPage selectByPage(int currentPage, int pageSize);

    IPage<Lab> findPage(Page<Lab> pageParam, String state); //通过状态查找并 分页 返回

    //IPage<Lab> selectByPage(Page<Lab> page, QueryWrapper<Lab> labWrapper);

    String deleteSelectLab(LabList lablist); //批量删除
}