package controller;
import model.Customer;
import model.CustomerContainer;

public class CustomerController {
	
	public Customer findCustomerByPhone(String phone) {
		CustomerContainer cCon = CustomerContainer.getInstance();
		Customer c = cCon.findCustomerByPhone(phone);
	}
	
	public boolean payWithAccount(Customer acc, double price) {
		
	}

}
