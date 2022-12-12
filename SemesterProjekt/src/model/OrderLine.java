package model;

import java.util.ArrayList;

public class OrderLine {
	private int quantity;
	private ArrayList<Product> products;
	
	public OrderLine(Product p) {
		products = new ArrayList<>();
		products.add(p);
		quantity = products.size();
		
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void incrementQuantity(Product p) {
		products.add(p);
		quantity = products.size();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void removeProduct(int quantity) {
		if(!(quantity > products.size())) {
			for(int i = 0; i < quantity; i++)
				products.remove(i);
			}
		}
		

}
