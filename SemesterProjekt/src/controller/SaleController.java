package controller;
import model.Staff;
import model.Product;
import model.Customer;

public class SaleController {
	
	public void registerSale(Staff employee) {
		
	}
	
	public Product identifyProductByBarcode(String barcode) {
		Product p = null;
		ProductController pc = new ProductController();
		p = pc.identifyProductByBarcode(barcode);
		return p;
		
	}
	
	public Product identifyProductByName(String name) {
		Product p = null;
		ProductController pc = new ProductController();
		p = pc.identifyProductByName(name);
		return p;
	}
	
	public Customer findCustomerByPhone(String phone) {
		Customer c = null;
		CustomerController cc = new CustomerControl();
		
	}
	
	public void insertPincode(String pincode) {
		
	}
	
	public boolean paymentByAccount(Customer acc) {
		
	}
	
	public void addSale(Sale s) {
		
	}

}
