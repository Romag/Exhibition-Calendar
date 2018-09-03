package ua.training.model.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.interfaces.ReservationDAO;
import ua.training.model.dao.mapper.ReservationMapper;
import ua.training.model.entity.Reservation;

public class JDBCReservationDAO implements ReservationDAO {
	private Connection connection;
	
	public JDBCReservationDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Reservation entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Reservation findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findAll() {
		List<Reservation> result = new ArrayList<>();
		
		ReservationMapper mapper = new ReservationMapper();
		
		try(Statement st = connection.createStatement()) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void update(Reservation entity) {
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
