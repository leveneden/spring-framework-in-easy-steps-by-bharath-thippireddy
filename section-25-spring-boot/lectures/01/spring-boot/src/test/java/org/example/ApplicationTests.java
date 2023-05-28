package org.example;

import org.example.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	void stestService() {
		final Service service = context.getBean(Service.class);
		service.save();
	}
}
