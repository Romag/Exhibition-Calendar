package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.Exhibition;
import ua.training.model.entity.ExhibitionHall;
import ua.training.model.entity.Exposition;

public class ExpositionMapper implements Mapper<Exposition> {

	@Override
	public Exposition extractFromResultSet(ResultSet rs) throws SQLException {
		Exposition expo = new Exposition();
		
		Mapper<Exhibition> exhibMapper = new ExhibtionMapper();
		Mapper<ExhibitionHall> exhibHallMapper = new ExhibitionHallMapper();
		
		expo.setId(rs.getInt("id"));
		expo.setDate(rs.getTimestamp("date").toLocalDateTime());
		expo.setTickets(rs.getInt("tickets"));
		
		expo.setExhibition(exhibMapper.extractFromResultSet(rs));
		expo.setExhibitionHall(exhibHallMapper.extractFromResultSet(rs));
		
		return expo;
	}

}
