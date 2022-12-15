package org.example.user.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.example.user.dao.UserDao;
import org.example.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SimpleUserService implements UserService {

	private UserDao dao;
	private final static Comparator<User> idComparator = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
        }
    };

	public UserDao getDao() {
		return dao;
	}

	@Autowired
	public SimpleUserService setDao(UserDao dao) {
		this.dao = dao;
		return this;
	}

	@Override
	@Transactional
	public int create(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> findAll() {
		List<User> users = dao.findAll();
		Collections.sort(dao.findAll(), idComparator);
		Collections.reverse(users);
		return users;
	}
}
