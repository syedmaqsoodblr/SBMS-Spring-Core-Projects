package com.maq.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("SUD")
@Primary //becomes primary option for Autowiring dependency
public class SuperUserDao implements IUserDao {

	public SuperUserDao() {
		System.out.println("SuperUserDao :: Constructor");
	}

	@Override
	public String findNameById(Integer userid) {
		return "Smith";
	}

}
