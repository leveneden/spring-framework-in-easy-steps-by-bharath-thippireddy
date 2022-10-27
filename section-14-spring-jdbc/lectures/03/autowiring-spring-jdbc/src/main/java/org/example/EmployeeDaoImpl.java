package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    private static final String SQL_INSERT_EMPLOYEE = "insert into employee values(?,?,?)";
    private static final String SQL_UPDATE_EMPLOYEE = "update employee set firstname=?,lastname=? where id=?";
    private static final String SQL_DELETE_EMPLOYEE = "delete from employee where id=?";
    private static final String SQL_READ_EMPLOYEE = "select * from employee where id=?";
    private static final String SQL_READ_EMPLOYEES = "select * from employee";
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Employee> rowMapper;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public EmployeeDaoImpl setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        return this;
    }

    public RowMapper<Employee> getRowMapper() {
        return rowMapper;
    }

    @Autowired
    public EmployeeDaoImpl setRowMapper(RowMapper<Employee> rowMapper) {
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
