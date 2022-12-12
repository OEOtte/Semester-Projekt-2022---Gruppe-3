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
	
	public Product identifyProductByBarCode(String barCode) {
		Product res = null;
		return res;
	}

}
