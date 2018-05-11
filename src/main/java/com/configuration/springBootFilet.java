package com.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *springboot拦截器开发步骤
 * 1. 添加注解@Configuration
 * 2. 继承WebMvcConfigurerAdapter
 * 3. 重写addInterceptors添加需要拦截的地址
 */
@Configuration
public class springBootFilet extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
       // registry.addInterceptor(new Object()).addPathPatterns("*/**");
    }
}
