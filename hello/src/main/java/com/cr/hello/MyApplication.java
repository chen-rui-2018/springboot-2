package com.cr.hello;

/**
 * @author： chenr
 * @date： Created on 2021/3/30 22:02
 * @version： v1.0
 * @modified By:
 */

import com.cr.hello.beans.Car;
import com.cr.hello.beans.Pet;
import com.cr.hello.beans.User;
import com.cr.hello.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        User user1 =  run.getBean("user",User.class);
        User user2 =  run.getBean("user",User.class);
        System.out.println(user1 == user2);

        MyConfig MyConfig =  run.getBean("myConfig", MyConfig.class);
        System.out.println(MyConfig);

        Pet pet =  run.getBean("pet",Pet.class);
        System.out.println("pet ==  user.pet" + "   " +(pet == user1.getPet()));

        Car car = run.getBean("car", Car.class);
        System.out.println(car);

    }
}
