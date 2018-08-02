package com.controller.shrio_module;

import com.common.base.MessageBox;
import com.service.shrio_module.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController class
 * 权限->角色->测试
 * @author CBQ
 * @date 2018/08/02 09:00
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 测试案例
     * @param name
     * @return
     */
    @GetMapping(value = "/getId/{name}")
    public MessageBox getName(@PathVariable("name") String name){
        try {
            userService.getUser(name);
            return MessageBox.build("200","ok",userService.getUser(name));
        } catch (Exception e) {
            e.printStackTrace();
            return MessageBox.build("404","ok",e.toString());
        }

    }
}
