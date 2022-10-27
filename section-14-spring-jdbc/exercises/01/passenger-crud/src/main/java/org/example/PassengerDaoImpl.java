package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PassengerDaoImpl implements PassengerDao {

    private static final String SQL_INSERT_EMPLOYEE = "insert into passenger values(?,?,?)";
    private static final String SQL_UPDATE_EMPLOYEE = "update passenger set firstname=?,lastname=? where id=?";
    private static final String SQL_DELETE_EMPLOYEE = "delete from passenger where id=?";
    private static final String SQL_READ_EMPLOYEE = "select * from passenger where id=?";
    private static final String SQL_READ_EMPLOYEES = "select * from passenger";
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Passenger> rowMapper;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public PassengerDaoImpl setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        return this;
    }

    public RowMapper<Passenger> getRowMapper() {
        return rowMapper;
    }

    @Autowired
    public PassengerDaoImpl setRowMapper(RowMapper<Passenger> rowMapper) {
        this.rowMapper = rowMapper;
        return this;
    }

    @Override
    public int create(Passenger p) {
        return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, p.getId(), p.getFirstName(), p.getLastName());
    }

    @Override
    public int update(Passenger p) {
        return jdbcTemplate.update(SQL_UPDATE_EMPLOYEE, p.getFirstName(), p.getLastName(), p.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, id);
    }

    @Override
    public Passenger read(int id) {
        return jdbcTemplate.queryForObject(SQL_READ_EMPLOYEE, rowMapper, id);
    }

    @Override
    public List<Passenger> read() {
        return jdbcTemplate.query(SQL_READ_EMPLOYEES, rowMapper);
    }
}
