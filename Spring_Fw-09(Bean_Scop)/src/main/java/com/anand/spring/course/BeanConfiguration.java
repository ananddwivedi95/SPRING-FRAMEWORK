package com.anand.spring.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean("java")
	public CourseDetails courseMethod()
	{
		CourseDetails course= new CourseDetails();
		course.setCourseName("java");
		course.setNoOFDays(60);
		return course;
	}
	
}
