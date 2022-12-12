package controller;
import model.Product;
import model.ProductContainer;

public class ProductController {
	
	public Product identifyProduct(String name, String barcode) {
		ProductContainer pc = ProductContainer.getInstance();
		Product product = null;
		if(name == null) {
			product = pc.getProductByBarcode(barcode);
		} else if(barcode == null) {
			product = pc.getProductByName(name);
		}
		return product;
	}
	

}
