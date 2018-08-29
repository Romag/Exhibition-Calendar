package ua.training.model.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.training.model.dao.interfaces.UserDAO;
import ua.training.model.dao.mapper.UserMapper;
import ua.training.model.entity.User;

public class JDBCUserDAO implements UserDAO {
	private Connection connection;
	
	public JDBCUserDAO (Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		List<User> result = new ArrayList<>();
	
		UserMapper userMapper = new UserMapper();
		
		String query = "SELECT * "
				+ "FROM user;";
		
		try (Statement statement = connection.createStatement()) {
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				result.add(userMapper.extractFromResultSet(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
