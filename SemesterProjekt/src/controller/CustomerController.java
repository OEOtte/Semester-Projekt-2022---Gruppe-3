package controller;
import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;

public class CustomerController {
	
	public Customer findCustomerByPhone(String phone) {
		CustomerContainer cCon = CustomerContainer.getInstance();
		Customer c = cCon.findCustomerbyPhone(phone);
		return c;
	}
}