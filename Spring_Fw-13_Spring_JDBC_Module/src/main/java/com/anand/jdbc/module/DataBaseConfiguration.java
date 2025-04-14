package com.anand.jdbc.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBaseConfiguration {
	
	@Bean
	public  JdbcTemplate getJdbcTemplate()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/springdatabase");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		return new JdbcTemplate(dataSource);
	}
}
