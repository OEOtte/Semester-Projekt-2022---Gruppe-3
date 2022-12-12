package controller;
import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;
import model.Sale;
import model.SaleContainer;

public class SaleController {
	private Sale newSale;
	private Customer customer = null;
	public void registerSale(Staff employee) {
		newSale = new Sale(employee);
	}
	
	public Product identifyProduct(String barcode, String name) {
		Product p = null;
		ProductController pc = new ProductController();
		p = pc.identifyProduct(null, barcode);
		return p;
		
	}
	
	public Customer findCustomerByPhone(String phone) {
		CustomerController cc = new CustomerController();
		customer = cc.findCustomerByPhone(phone);
		return customer;
	}
	
	public boolean insertPincode(String pincode) {
		return isPincode(pincode);
	}
	
	private boolean isPincode(String pincode) {
		return pincode.equals(customer.getPin());
	}

	public boolean paymentByAccount() {
		if (customer.getCredits() < newSale.getTotalPrice()) {
			
		}
		return newSale.getTotalPrice() <= customer.getCredits();
	}
	
	public void addSale(Sale s) {
		SaleContainer sc = SaleContainer.getInstance();
		sc.addSale(s);
	}

}
