package com.example.ff.demo.test.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ff.demo.test.entity.Lab;
import com.example.ff.demo.test.entity.LabList;
import com.example.ff.demo.test.mapper.LabMapper;
import com.example.ff.demo.test.service.ILabService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangfang
 * @since 2022-01-30
 */
@RestController
@RequestMapping("/lab")
public class LabController {

    @Resource
    private ILabService labService;
    private LabMapper labMapper;

    @GetMapping("/findAll")
    public Object test(){
        return labService.list();
    }
    /*分页查询全部数据*/
    @RequestMapping("/getLabPage")
    @ResponseBody
    public IPage<Lab> getLabPage( @RequestBody @RequestParam(value = "currentPage") int currentPage,
                                  @RequestBody @RequestParam(value = "pageSize") int pageSize){
        IPage<Lab> page = labService.selectByPage(currentPage,pageSize);
        //System.out.println(pageSize);
        return page;
    }

    @RequestMapping("/findByState")
    @ResponseBody
    public List<Lab> findByState(@RequestBody Lab find_labByState){

        return labService.findByState(find_labByState);

    }
    @RequestMapping("/findByLabName")
    @ResponseBody
    public List<Lab> findByLabName(@RequestBody Lab find_lab){
        
        return labService.findByLabName(find_lab);
    }
    /*修改实验室信息*/
    @RequestMapping("/updateLabInfo")
    @ResponseBody
    public boolean updateLabInfo(@RequestBody Lab lab){
        UpdateWrapper<Lab> labUpdateWrapper = new UpdateWrapper<>();
        labUpdateWrapper.eq("lab_id", lab.getLabId())
                .set("lab_name",lab.getLabName())
                .set("state",lab.getState())
                .set("place",lab.getPlace())
                .set("time",lab.getTime())
                .set("info",lab.getInfo());
        return labService.update(labUpdateWrapper);
    }
    /*删除实验室*/
    @RequestMapping("/delLab")
    @ResponseBody
    public boolean delLab(@RequestBody Lab delLab){
        return labService.remove(new QueryWrapper<Lab>().eq("lab_id",delLab.getLabId()));
    }
    /*添加实验室*/
    @RequestMapping("/addLab")
    @ResponseBody
    public boolean addLab(@RequestBody Lab lab){
        return labService.save(lab);
    }

    @RequestMapping("/findPage")
    @ResponseBody
    public IPage<Lab> findPage(@RequestParam(value = "currentPage") int currentPage,
                               @RequestParam(value = "pageSize") int pageSize,
                               @RequestParam(value = "state") String state) {
        Page<Lab> pageParam = new Page<Lab>(currentPage,pageSize);
        IPage<Lab> pageResult = labService.findPage(pageParam,state);

        return pageResult;
    }

    @RequestMapping("/findPageByIdOrNameOrState")
    @ResponseBody
    public IPage<Lab> findPageByIdOrNameOrState(@RequestParam(value = "currentPage") int currentPage,
                                         @RequestParam(value = "pageSize") int pageSize,
                                          String labId,
                                         String labName,
                                          String state ) {

        Page<Lab> pageParam = new Page<Lab>(currentPage,pageSize);
        IPage<Lab> findPageByIdOrName = labService.findPageByIdOrNameOrState(pageParam,labId,labName,state);
        return findPageByIdOrName;
    }
    /*批量删除操作*/
    @RequestMapping("/deleteSelectLab")
    @ResponseBody
    public String deleteSelectLab(@RequestBody LabList labList){
        return labService.deleteSelectLab(labList);
    }

}

