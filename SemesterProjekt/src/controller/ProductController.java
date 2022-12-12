package controller;
import model.Product;
import model.ProductContainer;

public class ProductController {
	
	public Product identifyProductByName(String name) {
		Product product = null;
		ProductContainer pc = ProductContainer.getInstance();
		product = pc.getProductByName(name);
		return product;
	}
	
	public Product identifyProductByBarCode(String barCode) {
		
	}

}
