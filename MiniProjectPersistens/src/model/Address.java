package model;

public class Address {
	private String address;
	private int zipcode;
	private String city;
	private String country;


public Address(String address, int zipcode, String city, String country) {
	this.address = address;
	this.zipcode = zipcode;
	this.city = city;
	this.country = country;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getZipcode() {
	return zipcode;
}


public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


}
