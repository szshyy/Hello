package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * 程序入口
 *
 * main方法一跑，Tomcat就起起来了，端口号默认8080
 * application.properties中可以用server.port项去配置
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 1.返回IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

        Pet pet = context.getBean("pet-com.atguigu.boot.bean.Pet", Pet.class);
        System.out.println("拿到bean："+pet);
    }
}









//pet-com.atguigu.boot.bean.Pet
//    // 1.返回IOC容器
//    ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
//
//    // 2.查看是否拿到组件
//    for(String name:context.getBeanDefinitionNames()){
//            if(name.equals("user01")||name.equals("pet01")||name.equals("pet")){
//            System.out.println("拿到bean："+name);
//            }
//            }
//
//            // 3.两次获取容器里的pet看拿到的是不是同一个bean（结论：容器中的对象默认是单例的）
//            Pet pet1 = context.getBean("pet", Pet.class);
//    Pet pet2 = context.getBean("pet", Pet.class);
//    System.out.println(pet1==pet2);
//
//    // 4.配置类对象本身也是一个bean，也在容器中
//    MyConfig myConfig = context.getBean("myConfig", MyConfig.class);
//    System.out.println("拿到配置类对象："+myConfig);