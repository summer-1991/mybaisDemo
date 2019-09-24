package com.example.demo.dao;

import com.example.demo.entiy.Tbcat;

public interface TbcatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbcat record);

    int insertSelective(Tbcat record);

    Tbcat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbcat record);

    int updateByPrimaryKey(Tbcat record);
}