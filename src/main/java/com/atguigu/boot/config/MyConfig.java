package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@EnableConfigurationProperties(Pet.class)
public class MyConfig {

    @Bean
    public User user01(){
        User user = new User("zhangsan", 18);
        return user;
    }

//    @Bean("pet")
//    public Pet pet01(){
//        return new Pet("tom");
//    }
}





