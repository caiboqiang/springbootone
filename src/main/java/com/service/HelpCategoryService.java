package com.service;

import com.common.err.helloException;
import com.mapper.HelpCategoryMapper;
import com.pojo.HelpCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelpCategoryService {

    @Autowired
    private HelpCategoryMapper helpCategoryMapper;


    /**
     * @Transactional 事物注解
     * 一般用在也用业务层
     *当其中一个不成功就回滚
     */
    //事物 当其中一个不成功就回滚
    @Transactional
    public HelpCategory getId(Short helpCategoryId){

        return helpCategoryMapper.selectByPrimaryKey(helpCategoryId);

    }


    /**
     * 业务处理方法 抛异常
     */
    public void getAge(Integer age) throws Exception{
        if(age<10){
            throw new Exception("还在上小学把");
        }
        if(age>11 && age<15){
            throw new helloException("你还上初中","101");
        }
        if(age>12 && age<18){
            throw new helloException("你还上搞中","102");
        }
        throw new Exception("未知错误请联系管理员");
    }

    /**
     * 单元测试 demo
     * @param helpCategoryId
     * @return
     */
    public HelpCategory getIdTest(Short helpCategoryId){

        return helpCategoryMapper.selectByPrimaryKey(helpCategoryId);

    }
}
