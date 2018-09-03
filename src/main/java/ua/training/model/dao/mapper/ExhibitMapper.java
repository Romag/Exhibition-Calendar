package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.Exhibit;

public class ExhibitMapper implements Mapper<Exhibit> {

	@Override
	public Exhibit extractFromResultSet(ResultSet rs) throws SQLException {
		Exhibit exhibit = new Exhibit();
		
		exhibit.setId(rs.getInt("id"));
		exhibit.setName(rs.getString("name"));
		
		return exhibit;
	}

}
