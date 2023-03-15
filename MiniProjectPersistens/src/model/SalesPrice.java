package model;

import java.time.LocalDate;

public class SalesPrice {
	private LocalDate date;
	private Double price;
	
	
	public SalesPrice (LocalDate date, Double price) {
		this.date = date;
		this.price = price;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
}
