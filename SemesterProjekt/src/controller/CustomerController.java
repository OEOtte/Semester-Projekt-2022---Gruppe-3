package controller;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;

public class CustomerController {
	/**
	   * This method is used to find an instance of <code>Customer</code>
	   * @param phone This is used to find the desired <code>Customer</code>
	   * instance
	   * @return c This returns an instance of <code>Customer</code>.
	   */
	public Customer findCustomerByPhone(String phone) {
		CustomerContainer cCon = CustomerContainer.getInstance();
		Customer c = cCon.findCustomerbyPhone(phone);
		return c;
	}
}