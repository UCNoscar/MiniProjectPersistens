package model;

public class Customer {
	private int id;
	private String name;
	private String phoneno;
	private String email;
	private Address address;


public Customer (int id, String name, String phoneno, String email, Address address) {
	this.id = id;
	this.name = name;
	this.phoneno = phoneno;
	this.email = email;
	this.address = address;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPhoneno() {
	return phoneno;
}


public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}
}