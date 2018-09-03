package ua.training.model.entity;

public class Reservation {
	int id;
	int tickets;
	Exposition exposition;
	
	public Reservation(int id, int tickets, Exposition exposition) {
		super();
		this.id = id;
		this.tickets = tickets;
		this.exposition = exposition;
	}
	
	public Reservation() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public Exposition getExposition() {
		return exposition;
	}
	public void setExposition(Exposition exposition) {
		this.exposition = exposition;
	}
	
	
}
