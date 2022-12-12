package model;

import java.time.LocalDate;
import java.util.ArrayList;

import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;

public class Sale {
	private String saleNumber;
	private LocalDate orderDate;
	private Staff employee;
	private Customer customer;
	private double totalVAT;
	private double totalPrice;
	private ArrayList<OrderLine> ol = new ArrayList<>();
	
	public Sale(Staff employee) {
		this.employee = employee;
		totalPrice = 0;
		totalVAT = 0;
		customer = null;
	}
	
	public boolean findOrderline(Product p) {
		if (ol == null) {
			return false;
		}
		for (int i = 0; i < ol.size(); i++) {
			ArrayList<Product> temp = ol.get(i).getProducts();
			temp.get(i).equals(p);
		}
		return false;
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
		for (int i = 0; i < ol.size(); i++) {
			ArrayList<Product> temp = ol.get(i).getProducts();
			for (int j = 0; j < temp.size(); j++) {
				totalPrice += temp.get(j).getTotalProductPrice();
			}
		}
		return totalPrice;
	}

	public double getTotalVAT() {
		for (int i = 0; i < ol.size(); i++) {
			ArrayList<Product> temp = ol.get(i).getProducts();
			for (int j = 0; j < temp.size(); j++) {
				totalVAT += temp.get(j).getVat();
			}
		}
		return totalVAT;
	}

	public String getSaleNumber() {
		return saleNumber;
	}
}
