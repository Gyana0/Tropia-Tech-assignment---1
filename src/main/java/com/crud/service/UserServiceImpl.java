package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.User;
import com.crud.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public void saveUserInfo(User user) {
		userRepo.save(user);
	}



	@Override
	public List<User> getAllUsers() {
		List<User> leads = userRepo.findAll();
		return leads;
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}


	@Override
	public User getOneLeadInfo(Long id) {
		Optional<User> findById = userRepo.findById(id);
		User lead = findById.get();
		return lead;
	}

}
