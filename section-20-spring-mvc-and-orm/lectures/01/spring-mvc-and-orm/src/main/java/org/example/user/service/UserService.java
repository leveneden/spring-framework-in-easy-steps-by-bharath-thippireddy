package org.example.user.service;

import java.util.List;

import org.example.user.entity.User;

public interface UserService {

	int create(User user);
	List<User> findAll();
}
