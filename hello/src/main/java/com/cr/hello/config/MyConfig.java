package com.cr.hello.config;

import com.cr.hello.beans.Car;
import com.cr.hello.beans.Pet;
import com.cr.hello.beans.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author： chenr
 * @date： Created on 2021/4/2 11:15
 * @version： v1.0
 * @modified By:
 */
@Configuration(proxyBeanMethods = false)
//@Import(User.class)
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user(){
        User user = new User(1, "张三", 18,pet());

        return user;
    }
    @Bean
    public Pet pet(){
        Pet pet = new Pet(1, "tomcat");
        return pet;
    }
}
