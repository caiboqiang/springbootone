package com;

import com.pojo.HelpCategory;
import com.service.HelpCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试业务(单元测试)
 * 方法二 选中要测试的类1->右键->GO To->Test->勾选要测试的方法
 */
@RunWith(SpringRunner.class)//表示在测试环境跑
@SpringBootTest//表示启动整个spring工程
public class helpServicrTest {
    //注入测试类
    @Autowired
    private HelpCategoryService helpCategoryService;
    @Test
    public void helpTest(){
        java.lang.Short i = 1;
        HelpCategory helpCategory=  helpCategoryService.getIdTest(i);
       //用断言打印
        Assert.assertEquals(new String("Geographi"),helpCategory.getName());
        //System.out.println( helpCategory.toString());
    }
}
