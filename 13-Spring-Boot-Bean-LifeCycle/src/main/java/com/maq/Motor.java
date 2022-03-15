package com.maq;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Motor :: destroy() method called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor :: afterPropertiesSet() method called");
	}

}
