package com.controller;

import com.pojo.stu;
import com.service.HelpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 控制器创建
 */
@RestController
public class HelloController {

    @Autowired
    private HelpCategoryService helpCategoryService;

    @GetMapping(value = "/get")
    public String get(){
        java.lang.Short i = 1;
        helpCategoryService.getId(i).toString();
        System.out.println(helpCategoryService.getId(i).toString());
        return  helpCategoryService.getId(i).toString();
    }

    @RequestMapping(value = "/getid/{id}/{name}")//@RequestParam(value = "id",required = false, defaultValue = "0")
    public String resFu( @PathVariable("id") Integer myId,
                        @PathVariable("name") String name){
       // System.out.println("==={}",id);
        return "---------{}"+myId+"===="+name;
    }

    /**
     *@Valid 表单信息验证
     * @param s
     * @return
     *
     * r如果没有验证通过 返回信息在BindingResult对象中
     */
   // @PostMapping
    @RequestMapping(value = "/put")
    public String putStu(@Valid stu s, BindingResult bindingResult){
        //错误信息
        bindingResult.getFieldError().getDefaultMessage();
        System.out.println(bindingResult.getFieldError().getDefaultMessage());
        return s.toString();
    }

    /**
     * 热部署测试
     */
    @GetMapping(value = "/rbs")
    public String getone(){
        return "热部署测试成功";
    }
}
