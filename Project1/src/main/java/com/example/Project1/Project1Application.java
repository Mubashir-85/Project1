package com.example.Project1;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Project1Application{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project1Application.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();




	}

}
