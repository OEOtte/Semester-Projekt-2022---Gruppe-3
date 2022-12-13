package controller;
import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;
import model.OrderLine;
import model.Sale;
import model.SaleContainer;

public class SaleController {
	private Sale newSale;
	private Customer customer = null;
	
	public Sale registerSale(Staff employee) {
		newSale = new Sale(employee);
		return newSale;
	}
	
	public Product identifyProduct(String barcode, String name) {
		Product p = null;
		ProductController pc = new ProductController();
		p = pc.identifyProduct(null, barcode);
		OrderLine ol = newSale.findOrderline(p);
		if (ol == null) {
			ol = new OrderLine(p);
		}
		ol.incrementQuantity(p);
		return p;
	}
	
	public Customer findCustomerByPhone(String phone) {
		CustomerController cc = new CustomerController();
		customer = cc.findCustomerByPhone(phone);
		return customer;
	}
	
	public boolean insertPincode(String pincode) {
		boolean isPin = isPincode(pincode);
		if (isPin) {
			newSale.addCustomer(customer);
			newSale.updatePrice(customer);
		}
		return isPin;
	}
	
	private boolean isPincode(String pincode) {
		return pincode.equals(customer.getPin());
	}

	public boolean paymentByAccount() {
		if (!(customer.getCredits() < newSale.getTotalPrice())) {
			customer.setCredits(customer.getCredits()-newSale.getTotalPrice());
			addSale(newSale);
			return true;
		}
		customer.setCredits(newSale.getTotalPrice()-customer.getCredits());
		return false;
	}
	
	public void addSale(Sale s) {
		SaleContainer sc = SaleContainer.getInstance();
		sc.addSale(s);
	}

}
