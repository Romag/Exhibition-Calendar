package ua.training.model.entity;

import java.util.List;

public class Exhibition {
	int id;
	String descr;
	
	List<Exhibit> exhibits;
	List<String> exhibitNames;
	
	public Exhibition(int id, String descr, List<Exhibit> exhibits, List<String> exhibitNames) {
		super();
		this.id = id;
		this.descr = descr;
		this.exhibits = exhibits;
		this.exhibitNames = exhibitNames;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public List<Exhibit> getExhibits() {
		return exhibits;
	}
	public void setExhibits(List<Exhibit> exhibits) {
		this.exhibits = exhibits;
	}
	public List<String> getExhibitNames() {
		return exhibitNames;
	}
	public void setExhibitNames(List<String> exhibitNames) {
		this.exhibitNames = exhibitNames;
	}


}
