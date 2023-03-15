package model;

public class Company {

	private String CVR;
	private double discountPercent;
	
	
	public Company (String CVR, double discountPercent) {
		this.CVR = CVR;
		this.discountPercent = discountPercent;
	}


	public String getCVR() {
		return CVR;
	}


	public void setCVR(String cVR) {
		CVR = cVR;
	}


	public double getDiscountPercent() {
		return discountPercent;
	}


	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
}
