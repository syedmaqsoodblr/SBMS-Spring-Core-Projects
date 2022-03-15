package com.maq;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	@PostConstruct
	public void start() {
		System.out.println("Engine :: start() method called");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Engine :: stop() method called");
	}

}
