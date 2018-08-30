package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.User;

public class UserMapper {
	
	public User extractFromResultSet(ResultSet rs) throws SQLException {
		User user = new User();
		
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setCreationTime(rs.getTimestamp("create_time").toLocalDateTime());
		
		return user;
	}
	
	
}
