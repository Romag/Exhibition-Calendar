package ua.training.model.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import ua.training.model.dao.interfaces.ExhibitionDAO;
import ua.training.model.entity.Exhibition;

public class JDBCExhibitionDAO implements ExhibitionDAO {
    private Connection connection;
	
	public JDBCExhibitionDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void create(Exhibition entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Exhibition findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exhibition> findAll() {
		
		return null;
	}

	@Override
	public void update(Exhibition entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}

}
