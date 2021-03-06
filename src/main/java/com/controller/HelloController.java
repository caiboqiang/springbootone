package com.controller;

import com.common.base.MessageBox;
import com.common.base.code.sys;
import com.common.redis.redisService;
import com.pojo.UserApp;
import com.pojo.stu;
import com.service.HelpCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * HelloController class
 * Demo案例功能测试
 * @author CBQ
 * @date 2018/07/31
 */
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private HelpCategoryService helpCategoryService;
    @Autowired
    private redisService redis;
    @Autowired
    private UserApp userApps;

    @GetMapping(value = "/get")
    public MessageBox get(){
        java.lang.Short i = 1;
        helpCategoryService.getId(i).toString();
        System.out.println(helpCategoryService.getId(i).toString());
        //redis
        redis.set("cai",helpCategoryService.getId(i).toString());
        logger.info("===测试redis==={}",redis.get("cai"));
        //scala 类在java调用
        UserApp userApp = new UserApp();
        userApp.ages_$eq(666);
        userApp.name_$eq("666666");
        userApp.say(userApp.name());
        //-----
        userApps.id_$eq("");
        List listStu = new ArrayList<stu>();
        for (int h=0;h<5;h++){
                stu  stu = new stu();
            stu.setAge(h);
            stu.setId(h);
            stu.setName("h"+h);
            listStu.add(stu);
        }
        //return  helpCategoryService.getId(i).toString();
        return MessageBox.build(sys.CORRECT.getCode(),sys.CORRECT.getMessage(),listStu);
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
    public String putStu(stu s, BindingResult bindingResult){
        //错误信息
        bindingResult.getFieldError().getDefaultMessage();
        System.out.println(bindingResult.getFieldError().getDefaultMessage());
        return s.toString();
    }

    /**
     * 热部署测试
     */
    @GetMapping(value = "/rbs")
    public String getOne(){
        return "热部署测试成功";
    }

    /**
     * 标准返回方式
     * @param s
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "/putErr")
    public MessageBox putStuErr(@Valid stu s, BindingResult bindingResult){
        //错误信息
        if(bindingResult.hasErrors()){
            return MessageBox.build(sys.ERR.getCode(),bindingResult.getFieldError().getDefaultMessage()) ;
        }else {
            return MessageBox.build(sys.CORRECT.getCode(),sys.CORRECT.getMessage(),s.toString());
        }

    }

    /**
     * 抛异常处理
     * @param age
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getErr/{age}")
    public MessageBox handle(@PathVariable("age") int age) throws Exception{
        helpCategoryService.getAge(age);
        return MessageBox.build(sys.CORRECT.getCode(),sys.CORRECT.getMessage());
    }
}
