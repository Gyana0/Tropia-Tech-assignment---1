package com.crud.service;

	import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.User;
import com.crud.repository.UserRepository;

	@Service
	public class UserService {
	  private final UserRepository userRepository;

	  public UserService(UserRepository userRepository) {
	    this.userRepository = userRepository;
	  }

	  public User createUser(User user) {
	    return userRepository.save(user);
	  }

	  public User getUserById(Long id) {
	    return userRepository.findById(id).orElse(null);
	  }

	  public List<User> getAllUsers() {
	    return userRepository.findAll();
	  }

	  public User updateUser(User user) {
	    return userRepository.save(user);
	  }

	  public void deleteUser(Long id) {
	    userRepository.deleteById(id);
	  }
	}
	