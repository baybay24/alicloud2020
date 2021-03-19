package com.ali.cloud.example.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean setinelFilterRegister() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new CommonFilter());
        bean.addUrlPatterns("/*");
        bean.addInitParameter(CommonFilter.WEB_CONTEXT_UNIFY, "false");
        bean.setName("sentinelFilter");
        bean.setOrder(1);
        return bean;
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
