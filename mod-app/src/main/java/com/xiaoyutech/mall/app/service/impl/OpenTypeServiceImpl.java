package com.xiaoyutech.mall.app.service.impl;

import com.xiaoyutech.mall.app.dao.OpenTypeDao;
import com.xiaoyutech.mall.app.entities.OpenType;
import com.xiaoyutech.mall.app.service.OpenTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OpenTypeServiceImpl implements OpenTypeService {
    @Resource
    private OpenTypeDao openTypeDao;

    @Override
    public int create(OpenType openType) {
        return openTypeDao.create(openType);
    }

    @Override
    public OpenType getOpenTypeById(Long id) {
        return openTypeDao.getOpenTypeById(id);
    }
}
