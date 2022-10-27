package org.example;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static final String SQL_INSERT_EMPLOYEE = "insert into employee values(?,?,?)";
    private static final String SQL_UPDATE_EMPLOYEE = "update employee set firstname=?,lastname=? where id=?";
    private static final String SQL_DELETE_EMPLOYEE = "delete from employee where id=?";
    private static final String SQL_READ_EMPLOYEE = "select * from employee where id=?";
    private static final String SQL_READ_EMPLOYEES = "select * from employee";
    private JdbcTemplate jdbcTemplate;
    private EmployeeRowMapper rowMapper;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public EmployeeDaoImpl setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        return this;
    }

    public EmployeeRowMapper getRowMapper() {
        return rowMapper;
    }

    public EmployeeDaoImpl setRowMapper(EmployeeRowMapper rowMapper) {
        this.rowMapper = rowMapper;
        return this;
    }

    @Override
    public int create(Employee e) {
        return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, e.getId(), e.getName(), e.getLastName());
    }

    @Override
    public int update(Employee e) {
        return jdbcTemplate.update(SQL_UPDATE_EMPLOYEE, e.getName(), e.getLastName(), e.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, id);
    }

    @Override
    public Employee read(int id) {
        return jdbcTemplate.queryForObject(SQL_READ_EMPLOYEE, rowMapper, id);
    }

    @Override
    public List<Employee> read() {
        return jdbcTemplate.query(SQL_READ_EMPLOYEES, rowMapper);
    }
}
