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
	private ArrayList<OrderLine> ol;
	
	public Sale(Staff employee) {
		ol = new ArrayList<>();
		this.employee = employee;
		totalPrice = 0;
		totalVAT = 0;
		customer = null;
	}
	
	public OrderLine findOrderline(Product p) {
		OrderLine helper = null;
		if (ol.size() == 0) {
			return null;
		}
		boolean found = false;
		for (int i = 0; i < ol.size() && !found; i++) {
			ArrayList<Product> products = ol.get(i).getProducts();
			if (products.get(0).getBarcode().equals(p.getBarcode())) {				
				helper = ol.get(i);
				found = true;
			}
		}
		return helper;
	}
	public ArrayList<OrderLine> getOrderLineList() {
		return ol;
	}
	
	public void addOrderLine(OrderLine o) {
		ol.add(o);
	}
	
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	
	public void updatePrice(Customer c) {
		String temp = "";
		for (int i = 1; i <= 3; i++) {
			temp = "group " + i;
			if (temp.equals(customer.getGroup())) {
				String helper = "0." + i;
				double x = Double.parseDouble(helper);
				totalPrice -= totalPrice*(x);
			}
		}
	}
	
	public void updatePrice(Product p) {
		totalPrice += p.getPrice() + p.getVat();
	}

	public void updateVAT(double VAT) {
		totalVAT += VAT;
	}
	
	public void addCustomer(Customer customer) {
		this.customer = customer;
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
	
	public void setTotalPrice(double price) {
		this.totalPrice = price;
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
//	public double getPriceOfDiscount() {
//		double res = 0;
//		for (int i = 0; i < ol.size(); i++) {
//			ArrayList<Product> temp = ol.get(i).getProducts();
//			for (int j = 0; j < temp.size(); i++) {
//				res += temp.get(j).getTotalProductPrice();
//			}
//		}
//		return res - totalPrice;
//	}
}
