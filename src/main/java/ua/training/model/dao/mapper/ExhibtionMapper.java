package ua.training.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ua.training.model.entity.Exhibit;
import ua.training.model.entity.Exhibition;

public class ExhibtionMapper implements Mapper<Exhibition>{

	@Override
	public Exhibition extractFromResultSet(ResultSet rs) throws SQLException {
		Exhibition exhibition = new Exhibition();
		
		Mapper<Exhibit> exhibMapper = new ExhibitMapper();
		
		exhibition.setId(rs.getInt("id"));
		exhibition.setDescr(rs.getString("descr"));
		
		exhibition.addExhibit(exhibMapper.extractFromResultSet(rs));
		
		return exhibition;
	}

}
