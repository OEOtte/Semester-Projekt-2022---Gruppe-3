package model.CustomerRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
public class Customer {
	private String name;
	private String phone;
	private String email;
	private String pincode;
	private String customerNumber;
	private String group;
	private double credits;
	
	public Customer(String name, String phone, String email, String pincode, String customerNumber, String group, double credits) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.pincode = pincode;
		this.customerNumber = customerNumber;
		this.group = group;
		this.credits = credits;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPin() {
		return pincode;
	}
	public void setPin(String pin) {
		this.pincode = pin;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
