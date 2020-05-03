package com.xiaoyutech.mall.app.dao;

import com.xiaoyutech.mall.app.entities.OpenType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OpenTypeDao {

    //新增 使用add,create,save，推荐create
    public int create(OpenType openType);

    public OpenType getOpenTypeById(@Param("id") Long id);

}
