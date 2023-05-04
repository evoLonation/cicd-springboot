package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Controller
public class LayeredJarsApplication{
	@GetMapping
	public String hello(){
		return "Hello Layered Jars!";
	}

	public static void main(String[] args) {
		SpringApplication.run(LayeredJarsApplication.class, args);
	}

}
