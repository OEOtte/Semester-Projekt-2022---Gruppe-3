package controller;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;

public class ProductController {
	
	public Product identifyProduct(String barcode, String name) {
		ProductContainer pc = ProductContainer.getInstance();
		
		Product product = pc.getProductByBarcode(barcode);
		
		if (name != null) {
			product = pc.getProductByName(name);
		}
		
		return product;
	}
}
