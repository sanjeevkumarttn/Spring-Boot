package com.springboot.SpringBoot;

import com.springboot.SpringBoot.entity.Database;
import com.springboot.SpringBoot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public User user(){
		return new User("sanjeev","12345");
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
