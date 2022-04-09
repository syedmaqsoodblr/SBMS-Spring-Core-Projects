package com.maq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maq.binding.User;
import com.maq.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepo;

	public String saveUser(User user) {
		User save = userRepo.save(user);
		Integer userId = save.getUserId();
		if (userId > 0) {
			return "User saved";
		} else {
			return "Failed to save user";
		}
	}

}
