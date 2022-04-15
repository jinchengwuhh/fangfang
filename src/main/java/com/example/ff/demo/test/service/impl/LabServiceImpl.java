package com.example.ff.demo.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.mapper.LabMapper;
import com.example.ff.demo.test.service.ILabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ff.demo.test.entity.LabList;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-16
 */
@Service
public class LabServiceImpl extends ServiceImpl<LabMapper, Lab> implements ILabService {
    @Autowired
    ILabService labService;
    @Resource
    private LabMapper labMapper;
    public List<Lab> findByState(Lab find_labByState){
        List<Lab> list = labService.list(new QueryWrapper<Lab>().eq("state", find_labByState.getState()));
        if(!list.isEmpty() ){
            return list;
        }else {
            return null;
        }

    }

    @Override
    public List<Lab> findByLabName(Lab find_lab) {
         QueryWrapper<Lab> findLabWrapper = new QueryWrapper<>();
        List<Lab> listByName = labService.list(findLabWrapper.like("lab_id",find_lab.getLabId())
                                                                        .and(wrapper -> wrapper
                                                                         .like("lab_name", find_lab.getLabName())));
        System.out.println(listByName);
        if(!listByName.isEmpty() ){
            return listByName;
        }else {
            return null;
        }
    }

    @Override
    public IPage selectByPage(int currentPage, int pageSize) {
        //查询对象
        QueryWrapper<Lab> findLabWrapper = new QueryWrapper<>();

        //List<Lab> list = labService.list(new QueryWrapper<Lab>().eq("state", lab.getState()));
        //分页  第一个参数为，查询第几页，第二个参数为 每页多少条记录
        IPage<Lab> page = new Page<>(currentPage,pageSize);
        return labService.page(page,findLabWrapper);
    }

    @Override
    public IPage<Lab> findPage(Page<Lab> pageParam, String state){
        QueryWrapper<Lab> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("state",state);

        IPage<Lab> labIPage = labMapper.selectPage(pageParam,queryWrapper);
        System.out.println(labIPage);
        return labIPage;
    }
    /*通过Id名称模糊查询并 分页返回*/
    @Override
    public  IPage<Lab> findPageByIdOrNameOrState(Page<Lab> pageParam, String labId, String labName,String state){
        QueryWrapper<Lab> findLabByIdOrNameWrapper = new QueryWrapper<>();
        if(!labId.isEmpty()){
            findLabByIdOrNameWrapper.like("lab_id",labId);
        }
        if(!labName.isEmpty()) {
            findLabByIdOrNameWrapper.like("lab_name", labName);
        }
        if (!state.isEmpty()){
            findLabByIdOrNameWrapper.eq("state",state);
        }
/*        findLabByIdOrNameWrapper.eq("state",state).or()
                .and(wrapper -> wrapper.like("lab_id",labId)
                .like("lab_name", labName));*/
        System.out.println(labId);
        IPage<Lab> findLabByIdOrNameIPage = labMapper.selectPage(pageParam,findLabByIdOrNameWrapper);
        return  findLabByIdOrNameIPage;


    }

    /*批量删除选中的实验室*/
    @Override
    public String deleteSelectLab(LabList lablist){
        List<String> ids = lablist.getIds();

        //List<Lab> ids = labService.list(delSelectLabWrapper.in("lab_id",lab.getLabId()));
            QueryWrapper<Lab> delSelectLabWrapper = new QueryWrapper<>();
            delSelectLabWrapper.in("lab_id",ids);
            labMapper.delete(delSelectLabWrapper);

        //labMapper.delete(ids);
        System.out.println(ids);
        //List<Lab> delList = labService.list(delSelectLabWrapper);
        //System.out.println(delList);
        //return delList;
        return "删除成功";
    }
}