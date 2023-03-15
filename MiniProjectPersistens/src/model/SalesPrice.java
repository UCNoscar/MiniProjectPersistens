package model;

import java.time.LocalDate;

public class SalesPrice {
	private LocalDate date;
	private int price;
	
	
	public SalesPrice (LocalDate date, int price) {
		this.date = date;
		this.price = price;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
