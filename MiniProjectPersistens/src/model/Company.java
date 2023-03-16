package model;

public class Company extends Customer {
	private String CVR;
	private double discountPercent;

	public Company(int id, String name, String phoneno, String email, Address address, String CVR) {
		super(id, name, phoneno, email, address);
		this.CVR = CVR;
		this.discountPercent = 0.1;
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
