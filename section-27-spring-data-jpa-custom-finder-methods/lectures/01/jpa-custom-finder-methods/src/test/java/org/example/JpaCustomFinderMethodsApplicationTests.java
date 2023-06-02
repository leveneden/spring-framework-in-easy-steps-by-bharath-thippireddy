package org.example;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JpaCustomFinderMethodsApplicationTests {

	@Autowired
	private ProductRepository repository;

	@Test
	void testFindByName() {
		final List<Product> ironHelmList = repository.findByName("Iron Helm");
		assertEquals(1, ironHelmList.size());
		final Product heaume = ironHelmList.get(0);
		assertEquals(1L, heaume.getId());
		assertEquals("Iron Helm", heaume.getName());
		assertEquals("Large, durable iron helm, known as a heaume", heaume.getDescription());
		assertEquals(100.0, heaume.getPrice());
	}

	@Test
	void testFindByPrice() {
		final List<Product> sunlightItems = repository.findByPrice(100.0);
		assertEquals(2, sunlightItems.size());

		final Product heaume = sunlightItems.get(0);
		assertEquals(1L, heaume.getId());
		assertEquals("Iron Helm", heaume.getName());
		assertEquals("Large, durable iron helm, known as a heaume", heaume.getDescription());
		assertEquals(100.0, heaume.getPrice());

		final Product sunlightTalisman = sunlightItems.get(1);
		assertEquals(2L, sunlightTalisman.getId());
		assertEquals("Sunlight Talisman", sunlightTalisman.getName());
		assertEquals("The Knight of Sunlight's personal talisman for casting miracles of the Gods", sunlightTalisman.getDescription());
		assertEquals(100.0, sunlightTalisman.getPrice());
	}

	@Test
	void testFindByNameAndPrice() {
		final List<Product> ironHelmList = repository.findByNameAndPrice("Iron Helm", 100.0);
		assertEquals(1, ironHelmList.size());
		final Product heaume = ironHelmList.get(0);
		assertEquals(1L, heaume.getId());
		assertEquals("Iron Helm", heaume.getName());
		assertEquals("Large, durable iron helm, known as a heaume", heaume.getDescription());
		assertEquals(100.0, heaume.getPrice());
	}
}
