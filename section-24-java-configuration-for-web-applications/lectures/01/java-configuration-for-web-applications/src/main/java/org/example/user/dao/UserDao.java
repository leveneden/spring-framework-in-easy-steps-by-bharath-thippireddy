package org.example.user.dao;

import java.util.List;

import org.example.user.entity.User;

public interface UserDao {

	int create(User user);
	List<User> findAll();
	User find(int id);
}
