package org.example.user.service;

import java.util.List;
import java.util.Optional;

import org.example.user.entity.User;

public interface UserService {

	int create(User user);
	List<User> findAll();
	Optional<User> find(int id);
}
