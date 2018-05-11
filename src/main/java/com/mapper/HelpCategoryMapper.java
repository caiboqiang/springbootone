package com.mapper;


import com.pojo.HelpCategory;

public interface HelpCategoryMapper {


    int deleteByPrimaryKey(Short helpCategoryId);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    HelpCategory selectByPrimaryKey(Short helpCategoryId);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);
}