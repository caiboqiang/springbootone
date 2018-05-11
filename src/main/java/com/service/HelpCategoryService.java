package com.service;

import com.mapper.HelpCategoryMapper;
import com.pojo.HelpCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Service
public class HelpCategoryService {

    @Autowired
    private HelpCategoryMapper helpCategoryMapper;
    @Transactional//事物 当其中一个不成功就回滚
    public HelpCategory getId(Short helpCategoryId){

        return helpCategoryMapper.selectByPrimaryKey(helpCategoryId);
    }


}
