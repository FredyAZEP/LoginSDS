package com.signup.service;

import com.signup.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	 
	 public void saveUser(User user);

}
