package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.ExhibitionHall;

public class ExhibitionHallMapper implements Mapper<ExhibitionHall> {

	@Override
	public ExhibitionHall extractFromResultSet(ResultSet rs) throws SQLException {
		ExhibitionHall exhibHall = new ExhibitionHall();
		
		exhibHall.setId(rs.getInt("id"));
		
		return exhibHall;
	}

}
