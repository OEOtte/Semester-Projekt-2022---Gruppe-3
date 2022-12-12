package model;

import java.time.LocalDate;

public class Sale {
	private String saleNumber;
	private LocalDate localdate;
	private Staff employee;
	private Customer customer;
	private double totalPrice;
	private double totalVAT;
	
	public Sale(Staff employee) {
		this.employee = employee;
		totalPrice = 0;
		totalVAT = 0;
		customer = null;
		
	}
	
	public void addOrderLine(OrderLine o) {
		
	}
	
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	
	public void updatePrice(double price) {
		totalPrice += price;
	}
	
	public void updateVAT(double VAT) {
		totalVAT += VAT;
	}
	
	public void addCustomer() {
		
	}
	
	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public Staff getEmployee() {
		return employee;
	}

	public void setEmployee(Staff employee) {
		this.employee = employee;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalVAT() {
		return totalVAT;
	}

	public void setTotalVAT(double totalVAT) {
		this.totalVAT = totalVAT;
	}

	public String getSaleNumber() {
		return saleNumber;
	}

	

}
