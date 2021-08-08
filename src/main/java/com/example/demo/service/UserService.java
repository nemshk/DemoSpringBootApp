package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public User saveUser(User user) {
		return repository.save(user);
	}

}
