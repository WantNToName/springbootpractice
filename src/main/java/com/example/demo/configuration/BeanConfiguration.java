package com.example.demo.configuration;

import com.example.demo.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    /*相比于直接在类中用component这样可以赋初值，如果两者都有进行配置那么在类中直接用component优先度高一些*/
    @Bean
    public Dog myDog(){
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("ww");
        return dog;
    }
}
