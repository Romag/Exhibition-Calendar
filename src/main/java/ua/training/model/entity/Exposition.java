package ua.training.model.entity;

import java.time.LocalDateTime;

public class Exposition {
	int id;
	LocalDateTime date;
	int tickets;
	
	Exhibition exhibition;
	ExhibitionHall exhibitionHall;
	
	
	public Exposition(int id, LocalDateTime date, int tickets, Exhibition exhibition, ExhibitionHall exhibitionHall) {
		super();
		this.id = id;
		this.date = date;
		this.tickets = tickets;
		this.exhibition = exhibition;
		this.exhibitionHall = exhibitionHall;
	}
	
	public Exposition() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public Exhibition getExhibition() {
		return exhibition;
	}
	public void setExhibition(Exhibition exhibition) {
		this.exhibition = exhibition;
	}
	public ExhibitionHall getExhibitionHall() {
		return exhibitionHall;
	}
	public void setExhibitionHall(ExhibitionHall exhibitionHall) {
		this.exhibitionHall = exhibitionHall;
	}

	
}
