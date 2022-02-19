package com.example.ff.demo.test.service.impl;

import com.example.ff.demo.test.entity.Admin;
import com.example.ff.demo.test.mapper.AdminMapper;
import com.example.ff.demo.test.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-02-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
