package com.example.ff.demo.test.service.impl;

import com.example.ff.demo.test.entity.Notice;
import com.example.ff.demo.test.mapper.NoticeMapper;
import com.example.ff.demo.test.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangfang
 * @since 2022-03-31
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {
    private NoticeMapper noticeMapper;
    @Override
    public void findBynId(Integer nId) {
        noticeMapper.selectById(nId);
    }
}
