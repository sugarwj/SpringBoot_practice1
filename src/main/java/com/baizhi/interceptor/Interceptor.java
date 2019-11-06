package com.baizhi.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Component
public class Interceptor extends WebMvcConfigurerAdapter {
    @Autowired
    private LoginForeInteceptor loginForeInteceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginForeInteceptor).addPathPatterns("/**").excludePathPatterns("/user/login");
    }
}
