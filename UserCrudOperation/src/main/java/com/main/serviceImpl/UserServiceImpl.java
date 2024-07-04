package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.User;
import com.main.repository.UserRepository;
import com.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired UserRepository userRepository;

	@Override
	public User postData(User user) {
		User u = userRepository.save(user);
		return u;
	}

}
