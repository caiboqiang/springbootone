package com.mapper.shrio_module;

import com.pojo.shrio_module.User;

public interface UserMapper {
    User findByUsername(String name);
}
