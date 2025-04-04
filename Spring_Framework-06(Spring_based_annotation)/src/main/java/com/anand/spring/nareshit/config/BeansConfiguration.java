package com.anand.spring.nareshit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.Student;

@Configuration  // instead of using xml file we used configuration annotation to configure the class and manage beans  
public class BeansConfiguration {
	
	@Bean(name="student")   // that tells that our bean creation method that make a bean of that class
	public Student getStudent()
	{
		return new Student();
	}
	@Bean(name="student1")
	public Student getStudent1()
	{
		return new Student();
	}

}
