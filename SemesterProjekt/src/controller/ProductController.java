package controller;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;

public class ProductController {
	/**
	   * This method is used to find an instance of <code>Product</code>
	   * Where it can find the desired <code>Product</code> instance from either input
	   * @param barcode This is used to find the desired instance of <code>Product</code>
	   * using <code>barcode</code> as an input
	   * @param name This is used to find the desired instance of <code>Product</code>
	   * using <code>name</code> as an input 
	   * @return p This returns an instance of <code>Product</code>.
	   */
	public Product identifyProduct(String barcode, String name) {
		ProductContainer pc = ProductContainer.getInstance();
		Product p = null;
		
		if (barcode != null) {
			p = pc.getProductByBarcode(barcode);
			return p;
		} else if (name != null) {
			p = pc.getProductByName(name);
			return p;
		}
		
		return p;
	}
}
