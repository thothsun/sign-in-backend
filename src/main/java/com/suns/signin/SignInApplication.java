package com.suns.signin;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan(basePackages = "com.suns.signin", annotationClass = Mapper.class)
@SpringBootApplication
public class SignInApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SignInApplication.class, args);
		System.out.println("spring boot start...");

	}
}
