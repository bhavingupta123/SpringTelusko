package com.example.car.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TeluskoApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle obj = (Vehicle)context.getBean("bike");
		
		obj.drive();
		
		context.close();
		
		//SpringApplication.run(TeluskoApplication.class, args);
	}

}
