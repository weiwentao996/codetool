package com.wwt.dao;

import com.wwt.entity.Essay;

public interface EssayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Essay record);

    int insertSelective(Essay record);

    Essay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKeyWithBLOBs(Essay record);

    int updateByPrimaryKey(Essay record);
}