package com.goomo.JPA_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JpaDemoApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}
	}

}
