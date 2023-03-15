package model;

import java.time.LocalDate;

public class SaleOrder {
	private LocalDate date;
	private Boolean deliveryStatus;
	private LocalDate deliveryDate;
	private LocalDate paymentDue;
	
	
	
	public SaleOrder (LocalDate date, Boolean deliveryStatus, LocalDate deliveryDate, LocalDate paymentDue) {
		this.date = date;
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.paymentDue = paymentDue;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Boolean getDeliveryStatus() {
		return deliveryStatus;
	}



	public void setDeliveryStatus(Boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}



	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}



	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}



	public LocalDate getPaymentDue() {
		return paymentDue;
	}



	public void setPaymentDue(LocalDate paymentDue) {
		this.paymentDue = paymentDue;
	}
	
	
}
