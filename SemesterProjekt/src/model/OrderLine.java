package model;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;

import model.ProductRelated.Product;

public class OrderLine {
	private int quantity;
	private ArrayList<Product> products;
	
	/**
	   * This method is used to instantiate a new <code>OrderLine</code>
	   * @param p This is used to associate an instance of <code>Product</code> 
	   * to the new instance <code>OrderLine.products</code>
	   */
	public OrderLine(Product p) {
		products = new ArrayList<>();
		products.add(p);
		quantity = products.size();
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	   * This method is used to add an instance of <code>Product</code>
	   * to the instance <code>OrderLine.products</code>
	   */
	public void incrementQuantity(Product p) {
		products.add(p);
		quantity = products.size();
	}
	
	public int getQuantity() {
		return quantity;
	}
	/**
	   * This method is used to get the instance of <code>OrderLine.products</code>
	   * @return products This returns an instance of <code>OrderLine.products</code> 
	   */
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void removeProduct(int quantity) {
		if(quantity > products.size()) { return; }
		
		for(int i = 0; i < quantity; i++) {
			products.remove(i);
		}
	}
	
	/**
	   * This method is used to get the total price of every <code>Product</code>
	   * instance on <code>OrderLine.products</code>
	   * @return res This returns a <code>double</code> 
	   */
	public double getPriceOfEveryProduct() {
		double res = 0;
		for (int i = 0; i < products.size(); i++) {
			res += products.get(i).getTotalProductPrice();
		}
		return res;
	}

}
