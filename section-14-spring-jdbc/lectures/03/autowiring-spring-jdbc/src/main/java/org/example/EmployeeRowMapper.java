package org.example;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeRowMapper implements org.springframework.jdbc.core.RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Employee()
                .setId(resultSet.getInt(1))
                .setName(resultSet.getString(2))
                .setLastName(resultSet.getString(3));
    }
}
