package org.example;

import org.example.dao.ProductDao;
import org.example.entity.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            ProductDao productDao = springContext.getBean("simpleProductDao", ProductDao.class);
            /* CREATE
            int updatedRecords = productDao.create(new Product()
                    .setId(1)
                    .setName("Fancy computer mouse")
                    .setDescription("It's so slick!")
                    .setPrice(40)
            );
            *//* UPDATE
            productDao.update(new Product()
                    .setId(1)
                    .setName("Luxurious mouse")
                    .setDescription("It's so slick! (and a bit more expensive as well)")
                    .setPrice(55)
            );
            *//* DELETE
            productDao.delete(new Product().setId(1));
            *//* FIND (by id)
            System.out.println(productDao.find(1));
            *//* FIND (all)
            System.out.println(productDao.findAll());
            */
            // System.out.println(updatedRecords + " records were updated!");
        }
    }
}
