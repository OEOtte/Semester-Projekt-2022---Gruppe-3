package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sale {
	private String saleNumber;
	private LocalDate orderDate;
	private Staff employee;
	private Customer customer;
	private double totalPrice;
	private double totalVAT;
	private ArrayList<OrderLine> ol = new ArrayList<>();
	
	public Sale(Staff employee) {
		this.employee = employee;
		totalPrice = 0;
		totalVAT = 0;
		customer = null;
		
	}
	
	public void addOrderLine(OrderLine o) {
		ol.add(o);
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
	
	public boolean findOrderLine(Product p) {
		for(int i = 0; i < ol.size(); i++) {
			//if(ol.get(i) == p.getBarcode())
		}
		return true;
	}
	
	public LocalDate getLocaldate() {
		return orderDate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.orderDate = localdate;
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
