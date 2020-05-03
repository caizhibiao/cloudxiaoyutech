package com.xiaoyutech.mall.app.service;

import com.xiaoyutech.mall.app.entities.OpenType;
import org.apache.ibatis.annotations.Param;

public interface OpenTypeService {

    //新增 使用add,create,save，推荐create
    public int create(OpenType openType);

    public OpenType getOpenTypeById(@Param("id") Long id);
}
