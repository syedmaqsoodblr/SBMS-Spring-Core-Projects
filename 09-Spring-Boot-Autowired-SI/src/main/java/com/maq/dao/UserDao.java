package com.maq.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class UserDao implements IUserDao {

	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}

	@Override
	public String findNameById(Integer userid) {
		return "John";
	}

}
