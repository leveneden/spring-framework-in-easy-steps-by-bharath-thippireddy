package org.example;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PassengerRowMapper implements RowMapper<Passenger> {

    @Override
    public Passenger mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Passenger()
                .setId(resultSet.getInt(1))
                .setFirstName(resultSet.getString(2))
                .setLastName(resultSet.getString(3));
    }
}
