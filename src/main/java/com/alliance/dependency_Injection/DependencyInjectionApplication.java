package com.alliance.dependency_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

    //this will print two in aliens
    //but will print one object created bcz by default spring boot uses singleton design pattern
    Alien a = context.getBean(Alien.class);
    a.show();

  }

}
