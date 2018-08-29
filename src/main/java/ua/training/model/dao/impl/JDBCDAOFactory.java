package ua.training.model.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.interfaces.ExhibitionDAO;

public class JDBCDAOFactory extends DAOFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();
	
	@Override
	public ExhibitionDAO createExhibitionDAO() {
		return new JDBCExhibitionDAO(getConnection());
	}

    private Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
