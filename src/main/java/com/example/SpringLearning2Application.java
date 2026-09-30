package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication

// -- component scan should be used with @Configuration annotation only --

//@ComponentScan(basePackages = "com.example",
//		excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = ExampleController.class))
public class SpringLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearning2Application.class, args);
	}

}
