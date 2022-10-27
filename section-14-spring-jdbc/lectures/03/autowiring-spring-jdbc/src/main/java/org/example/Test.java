package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            EmployeeDaoImpl employeeDao = springContext.getBean("employeeDaoImpl", EmployeeDaoImpl.class);
            // int updatedRecords = employeeDao.create(new Employee().setId(1).setName("Bharath").setLastName("Thippireddy"));
            // int updatedRecords = employeeDao.create(new Employee().setId(2).setName("Neutro").setLastName("Shorty"));
            // int updatedRecords = employeeDao.update(new Employee().setId(2).setName("Tonny").setLastName("Montana"));
            // int updatedRecords = employeeDao.delete(1);
            // Employee employee = employeeDao.read(1);
            List<Employee> employees = employeeDao.read();
            for (Employee employee: employees) {
                System.out.println("Employee read from the database: " + employee);
            }
        }
    }
}
