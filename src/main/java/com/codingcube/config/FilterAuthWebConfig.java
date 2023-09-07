package com.codingcube.config;


import com.codingcube.interceptor.DynamicAuthInterceptor;
import com.codingcube.properties.RequestAuthItemProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author CodingCube<br>
 * Dynamic Permission Filtering Configuration Class*
 */
public class FilterAuthWebConfig implements WebMvcConfigurer {
    @Resource
    RequestAuthItemProvider requestAuthItemProvider;
    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DynamicAuthInterceptor(requestAuthItemProvider, applicationContext)).addPathPatterns("/*").order(Integer.MAX_VALUE);
    }
}
