package ua.training.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.interfaces.ExhibitionDAO;
import ua.training.model.dao.interfaces.UserDAO;

public class JDBCDAOFactory extends DAOFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();
	
	@Override
	public ExhibitionDAO createExhibitionDAO() {
		return new JDBCExhibitionDAO(getConnection());
	}

	@Override
	public UserDAO createUserDAO() {
		return new JDBCUserDAO(getConnection());
	}
	
    private Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
    }


}
