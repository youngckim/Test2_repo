package com.young.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.young.pk1.Student;
import com.young.repository.StudentRepository;

@Configuration
public class MyConfig {
	
	@Bean
	public Student student() {
		return new Student(1,"");
	}
	
	@Bean
	public StudentRepository studentRepository() {
		return new StudentRepository();
	}

}
