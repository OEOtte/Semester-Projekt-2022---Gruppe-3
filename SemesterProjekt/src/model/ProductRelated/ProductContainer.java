package model.ProductRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;

public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<Product> list;
	
	public static ProductContainer getInstance() {
		if(instance == null) {
			instance = new ProductContainer();
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
			if(list.get(i).getName().equals(name)) {
				product = list.get(i);
				i = list.size();
			}
		}
		return product;
	}
	
	public Product getProductByBarcode(String barcode) {
		Product product = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBarcode().equals(barcode)) {
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
