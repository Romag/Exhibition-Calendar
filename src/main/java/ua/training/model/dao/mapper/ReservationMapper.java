package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.Exposition;
import ua.training.model.entity.Reservation;

public class ReservationMapper implements Mapper<Reservation> {

	@Override
	public Reservation extractFromResultSet(ResultSet rs) throws SQLException {
		Reservation res = new Reservation();
		
		Mapper<Exposition> expMapper = new ExpositionMapper();
		
		res.setId(rs.getInt("id"));
		res.setTickets(rs.getInt("tickets"));
		
		res.setExposition(expMapper.extractFromResultSet(rs));
		
		return res;
	}
	
}
