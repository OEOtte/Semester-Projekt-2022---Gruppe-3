package controller;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;

public class ProductController {
	
	public Product identifyProduct(String barcode, String name) {
		ProductContainer pc = ProductContainer.getInstance();
		Product p = null;
		
		if (barcode != null) {
			p = pc.getProductByBarcode(barcode);
		} else if (name != null) {
			p = pc.getProductByName(name);
		}
		
		return p;
	}
}
