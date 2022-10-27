package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            JdbcTemplate jdbcTemplate = springContext.getBean("jdbcTemplate", JdbcTemplate.class);
            final String sqlStatement = "insert into employee values(?,?,?)";
            int updatedRecords = jdbcTemplate.update(sqlStatement, 1, "Bharath", "Thippireddy");
            System.out.println(updatedRecords + " records were updated");
        }
    }
}
