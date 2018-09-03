package ua.training.model.entity;

public class Exhibit {
	int id;
	String name;
	
	public Exhibit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Exhibit() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
