package com.maq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maq.dao.IUserDao;
import com.maq.dao.UserDao;

@Service
public class UserService {

	public UserService() {
		System.out.println("UserService :: Constructor");
	}

	private IUserDao userdao;

	@Autowired
	@Qualifier("SUD")
	public void setUserdao(IUserDao userdao) {
		System.out.println("setUserDao() method called");
		System.out.println("Injected bean : " + userdao.getClass().getName());
		this.userdao = userdao;
	}

	public void getName(Integer userid) {
		String name = userdao.findNameById(userid);
		System.out.println("User Name : " + name);
	}

}
