package controller;
import model.Product;
import model.ProductContainer;

public class ProductController {
	
	public Product identifyProductByName(String name) {
		ProductContainer pc = ProductContainer.getInstance();
		Product product = null;
		product = pc.getProductByName(name);
		return product;
	}
	
	public Product identifyProductByBarcode(String barCode) {
		Product res = null;
		ProductContainer pc = ProductContainer.getInstance();
		res = pc.getProductByBarcode(barCode);
		return res;
	}

}
