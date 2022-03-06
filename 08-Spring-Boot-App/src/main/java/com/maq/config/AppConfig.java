package com.maq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maq.Motor;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@Bean
	public Motor getMotorInstance() {
		Motor motor = new Motor();
		//customize motor obj
		return motor;
	}

}
