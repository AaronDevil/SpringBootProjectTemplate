package com.nopava.whodo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * 
 * @description: mybatisplus配置文件
 * @author: rjw
 * @Date: 2019年8月10日 上午11:27:12
 */
@Configuration
public class MybatisPlusConfig {
    
    /**
     * 配置分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
    

}