package com.crud.service;

import java.util.List;

import com.crud.entity.User;

public interface UserService {

	void saveUserInfo(User user);

	List<User> getAllUsers();

	void deleteUser(Long id);

	User getOneLeadInfo(Long id);

}
