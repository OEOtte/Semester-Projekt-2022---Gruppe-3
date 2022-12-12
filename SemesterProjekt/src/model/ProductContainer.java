package model;

import java.util.ArrayList;

public class ProductContainer {
	
	private static ProductContainer instance;
	private ArrayList<Product> list;
	
	public ProductContainer getInstance() {
		if(instance == null) {
			list = new ArrayList<>();
			return instance;
		}
		return instance;
	}
	
	private ProductContainer() {
		list = new ArrayList<>();
	}
	
	public Product getProductByName(String name) {
		Product product = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName() == name) {
				product = list.get(i);
				i = list.size();
			}
		}
		return product;
	}
	
	public Product getProductByBarcode(String barcode) {
		Product product = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBarCode() == barcode) {
				product = list.get(i);
				i = list.size();
			}
		}
		return product;
	}
	
	public void addProduct(Product p) {
		list.add(p);
	}

}
