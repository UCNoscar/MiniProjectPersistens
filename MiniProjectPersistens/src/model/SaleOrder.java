package model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class SaleOrder {
	private LocalDate date;
	private Boolean deliveryStatus;
	private LocalDate deliveryDate;
	private LocalDate paymentDue;
	private Customer customer;
	private double total;
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private List<SaleOrderLine> SOLs;

	public SaleOrder() {
		this.date = LocalDate.now();
		SOLs = new LinkedList<>();
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<SaleOrderLine> getSOLs() {
		return SOLs;
	}

	public void setSOLs(List<SaleOrderLine> sOLs) {
		SOLs = sOLs;
	}
	
	
}