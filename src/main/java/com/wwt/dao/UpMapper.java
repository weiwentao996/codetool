package com.wwt.dao;

import com.wwt.entity.Up;

public interface UpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Up record);

    int insertSelective(Up record);

    Up selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Up record);

    int updateByPrimaryKey(Up record);
}