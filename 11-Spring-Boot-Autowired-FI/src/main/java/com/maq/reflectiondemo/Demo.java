package com.maq.reflectiondemo;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.maq.reflectiondemo.User");
		Object obj = cls.newInstance();
		Field field = cls.getDeclaredField("age");
		field.setAccessible(true);
		field.set(obj, 40);
//		System.out.println("User age :: " + field.get(obj));
		
		User user = (User)obj;
		System.out.println("User age :: " + user.getUserAge());
	}

}
