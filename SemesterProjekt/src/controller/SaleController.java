package controller;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;
import model.OrderLine;
import model.Sale;
import model.SaleContainer;

public class SaleController {
	private Sale newSale;
	private Customer customer = null;
	
	/**
	   * This method is used to instantiate a new <code>Sale</code>
	   * @param employee This is used to associate an <code>Staff</code> to the <code>Sale</code>
	   * @return newSale This returns an instance of <code>Sale</code>.
	   */
	public Sale registerSale(Staff employee) {
		newSale = new Sale(employee);
		return newSale;
	}
	/**
	   * This method is used to find an instance of <code>Product</code>
	   * This method also adds & updates an instance of <code>OrderLine</code>
	   * from which it's associated with sale
	   * @param barcode This is used to find an instance of <code>Product</code>
	   * @param name This is used to find an instance of <code>Product</code>
	   * @param p This is used to find an instance of <code>OrderLine</code>
	   * from which it will create a new instance if it's null or update.
	   * @return p This returns an instance of <code>Product</code>.
	   */
	public Product identifyProduct(String barcode, String name) {
		Product p = null;
		ProductController pc = new ProductController();
		if (barcode != null) {
			p = pc.identifyProduct(barcode, null);
		} else {
			p = pc.identifyProduct(null, name);
		}
		
		if (p == null) {
			return p;
		}
		OrderLine ol = newSale.findOrderline(p);
		if (ol == null) {
			ol = new OrderLine(p);
			newSale.addOrderLine(ol);
			newSale.updatePrice(p);
			return p;
		}
		
		ol.incrementQuantity(p);
		newSale.updatePrice(p);
		return p;
	}
	
	/**
	   * This method is used to find an instance of <code>Customer</code>
	   * @param phone This is used to find a instance of <code>Customer</code>
	   * @return customer This returns an instance of <code>Customer</code>
	   */
	public Customer findCustomerByPhone(String phone) {
		CustomerController cc = new CustomerController();
		customer = cc.findCustomerByPhone(phone);
		return customer;
	}
	/**
	   * This method is used to confirm the owner of the <code>Customer</code> account
	   * @param pincode This is used to confirm the ownership of <code>Customer</code> account
	   * @return isPin This returns a boolean
	   */
	public boolean insertPincode(String pincode) {
		boolean isPin = isPincode(pincode);
		if (isPin) {
			newSale.addCustomer(customer);
			newSale.getPriceOfDiscount();
			newSale.updatePrice(customer);
		}
		return isPin;
	}
	
	private boolean isPincode(String pincode) {
		return pincode.equals(customer.getPin());
	}
	/**
	   * This method is used to finish the instance of <code>Sale</code>
	   * using the <code>Customer</code> instance, to gain credits used to 
	   * purchase the desired <code>Products</code>
	   * @return res This returns a boolean
	   */
	public boolean paymentByAccount() {
		boolean res = true;
		if (!(customer.getCredits() >= newSale.getTotalPrice())) {
			newSale.setTotalPrice(newSale.getTotalPrice() - customer.getCredits());
			customer.setCredits(0);
			res = false;
			return res;
		}
		customer.setCredits(customer.getCredits()-newSale.getTotalPrice());
		addSale(newSale);
		return res;
	}
	
	private void addSale(Sale s) {
		SaleContainer sc = SaleContainer.getInstance();
		sc.addSale(s);
	}

}
