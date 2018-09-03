package ua.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Exhibition {
	private int id;
	private String  descr;
	
	private List<Exhibit> exhibits;
	
	public Exhibition(int id, String descr, List<Exhibit> exhibits, List<String> exhibitNames) {
		super();
		this.id = id;
		this.descr = descr;
		this.exhibits = exhibits;
	}
	public Exhibition() {
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
	public void addExhibit(Exhibit exhib) {
		if(exhibits == null) exhibits = new ArrayList<Exhibit>();
		exhibits.add(exhib);
	}



}
