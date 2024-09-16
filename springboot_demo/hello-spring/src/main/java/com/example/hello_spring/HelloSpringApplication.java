package com.example.hello_spring;

import com.example.hello_spring.configuration.AccountConfig;
import com.example.hello_spring.dao.AccoutDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AccountConfig.class);
		AccoutDao accoutDao=context.getBean("accoutDao", AccoutDao.class);
		accoutDao.addAccout();
//		SpringApplication.run(HelloSpringApplication.class, args);
//		System.out.println("hello");
	}

}
