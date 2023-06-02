package org.example;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private ProductRepository repository;

	@Test
	void testSave() {
		final Product sunlightShield = new Product()
				.setId(2L)
				.setName("Sunlight Shield")
				.setDescription("A large, circular shield made of metal and decorated with a holy symbol depicting the sun")
				.setPrice(100.0);
		final Product savedProduct = repository.save(sunlightShield);

		assertEquals(sunlightShield, savedProduct);
	}

	@Test
	void testFindById() {
		final Optional<Product> optionalProduct = repository.findById(1L);
		assertTrue(optionalProduct.isPresent());
		final Product heaume = optionalProduct.get();
		assertEquals(1L, heaume.getId());
		assertEquals("Iron Helm", heaume.getName());
		assertEquals("Large, durable iron helm, known as a heaume", heaume.getDescription());
		assertEquals(100.0, heaume.getPrice());
	}

	@Test
	void testUpdate() {
		final Optional<Product> optionalProduct = repository.findById(2L);
		assertTrue(optionalProduct.isPresent());
		final Product sunlightItem = optionalProduct.get();
		sunlightItem.setName("Sunlight Talisman");
		sunlightItem.setDescription("The Knight of Sunlight's personal talisman for casting miracles of the Gods");
		final Product sunlightTalisman = repository.save(sunlightItem);
		assertEquals(sunlightItem.getId(), sunlightTalisman.getId());
		assertEquals(sunlightItem.getName(), sunlightTalisman.getName());
		assertEquals(sunlightItem.getDescription(), sunlightTalisman.getDescription());
		assertEquals(sunlightItem.getPrice(), sunlightTalisman.getPrice());
	}
}
