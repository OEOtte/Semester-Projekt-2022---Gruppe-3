package model.ProductRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;
import java.util.List;

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
//	 * This method is used to find an instance of <code>Product</code> by name
//	   * @param phone This is used to iterate trough all the instanciated products
//	   * to find the desired <code>product</code>
//	   * instance
//	   * @return c This returns an instance of <code>product</code>.
//	   */
	
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
	
//	 * This method is used to find an instance of <code>Product</code> by barcode
//	   * @param phone This is used to iterate trough all the instanciated products
//	   * to find the desired <code>product</code>
//	   * instance
//	   * @return c This returns an instance of <code>product</code>.
//	   */
	
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
	public List<Product> getContainerOfEveryProduct() {
		return list;
	}
}
