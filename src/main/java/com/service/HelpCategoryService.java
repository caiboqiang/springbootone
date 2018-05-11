package com.service;

import com.mapper.HelpCategoryMapper;
import com.pojo.HelpCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelpCategoryService {

    @Autowired
    private HelpCategoryMapper helpCategoryMapper;

    public HelpCategory getId(Short helpCategoryId){

        return helpCategoryMapper.selectByPrimaryKey(helpCategoryId);
    }


}
