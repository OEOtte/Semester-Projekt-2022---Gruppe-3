package model;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
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
	private double moneySaved;
	private ArrayList<OrderLine> ol;
	/**
	   * This method is used to instantiate a new <code>Sale</code>
	   * @param employee This is used to associate an instance of <code>Staff</code> 
	   * to the new instance <code>Sale</code>
	   */
	public Sale(Staff employee) {
		ol = new ArrayList<>();
		this.employee = employee;
		totalPrice = 0;
		totalVAT = 0;
		customer = null;
		moneySaved = 0;
	}
	/**
	   * This method is used to find an instance of <code>OrderLine</code>
	   * @param p This is used to find a specific instance of <code>OrderLine</code> in <code>Sale.ol</code> 
	   * @return helper This returns an instance of <code>OrderLine</code> 
	   */
	public OrderLine findOrderline(Product p) {
		OrderLine helper = null;
		if (ol.size() == 0) {
			return helper;
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
	/**
	   * This method is used to get an instance of <code>Sale.ol</code>
	   * @return ol This returns an instance of <code>Sale.ol</code> 
	   */
	public ArrayList<OrderLine> getOrderLineList() {
		return ol;
	}
	/**
	   * This method is used to add a instance of <code>OrderLine</code> to <code>Sale.ol</code>
	   * @param o This is used to add an instance of <code>OrderLine</code>
	   * to <code>Sale.ol</code>
	   */
	public void addOrderLine(OrderLine o) {
		ol.add(o);
	}
	
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	
	/**
	   * This method is used to update the total price of <code>Sale.ol</code>
	   * using <code>Customer</code> c's group discount
	   */
	public void updatePrice(Customer c) {
		double x = 0;
		String temp = "";
		for (int i = 1; i <= 3; i++) {
			temp = "group " + i;
			if (temp.equals(customer.getGroup())) {
				String helper = "0." + i;
				x = Double.parseDouble(helper);
				totalPrice -= totalPrice*(x);
			}
		}
		updatePrice(x);
		updateVAT(totalPrice);
	}
	
	/**
	   * This method is used to update the discounted price of <code>Product</code>
	   * @param x This is used to increment the discount calcutlated in <code>Sale.updatePrice(Customer c)</code>
	   */
	private void updatePrice(double x) {
		for(int i = 0; i < ol.size(); i++) {
			ArrayList<Product> products = ol.get(i).getProducts();
			for(int j = 0; j < products.size(); j++) {
				double res = x * products.get(j).getPrice();
				products.get(j).setFinalPrice(products.get(j).getPrice() - res);
			}
		}
	}
	/**
	   * This method is used to update the totalPrice for <code>Sale</code>
	   * @param p This is used to get the <code>Products</code> methods 
	   * to update the new total price
	   */
	public void updatePrice(Product p) {
		totalPrice += (p.getPrice() + p.getVat());
	}
	
	/**
	   * This method is used to update the finalVat on <code>Product</code>
	   * @param x This is used to update vat to the discounted price on <code>Product</code>
	   */
	public void updateVAT(double x) {
		for(int i = 0; i < ol.size(); i++) {
			ArrayList<Product> products = ol.get(i).getProducts();
			for(int j = 0; j < products.size(); j++) {
				double res = x * products.get(j).getPrice();
				products.get(j).setFinalVat(products.get(j).getPrice() - res);
			}
		}
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
	
	/**
	   * This method is used to get the totalVAT of <code>Sale.ol</code>
	   * @return totalVAT This returns a sum of every <code>Product</code> VAT
	   */
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
	/**
	   * This method is used to get how much money you saved on <code>Sale</code>
	   * @return moneySaved This returns a double with the total amount of money you saved
	   */
	public double getPriceOfDiscount() {
		double price = 0;
		price = getTotalPrice();
		String temp = "";
		for (int i = 1; i <= 3; i++) {
			temp = "group " + i;
			if (temp.equals(customer.getGroup())) {
				String helper = "0." + i;
				double x = Double.parseDouble(helper);
				moneySaved = price*(x);
			}
		}
		return moneySaved;
	}
	
	public double getMoneySaved() {
		return moneySaved;
	}
}
