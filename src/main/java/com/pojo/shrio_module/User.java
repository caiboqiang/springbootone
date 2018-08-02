package com.pojo.shrio_module;

import java.util.HashSet;
import java.util.Set;
/**
 * Role class
 * 用户
 * @author CBQ
 * @date 2018/08/01
 */
public class User {
    private String uid;

    private String username;

    private String password;

    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}