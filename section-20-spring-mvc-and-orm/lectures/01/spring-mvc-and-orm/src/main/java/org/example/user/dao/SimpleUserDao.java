package org.example.user.dao;

import java.util.List;

import org.example.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository 
public class SimpleUserDao implements UserDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public SimpleUserDao setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
		return this;
	}

	@Override
	public int create(User user) {
		return (Integer) hibernateTemplate.save(user);
	}

	@Override
	public List<User> findAll() {
		return hibernateTemplate.loadAll(User.class);
	}

}
