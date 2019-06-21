package com.huanghe.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @Author: River
 * @Date:Created in  15:41 2018/10/24
 * @Description:
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){

            @Override
            public void customize(Configuration configuration) {
            	// [注]:自动使用驼峰命名属性映射字段
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
