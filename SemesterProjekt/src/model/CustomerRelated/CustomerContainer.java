package model.CustomerRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;
import java.util.List;

public class CustomerContainer {
	private static CustomerContainer instance;
	private ArrayList<Customer> list;
	
	public static CustomerContainer getInstance() {
		if(instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}
	
	private CustomerContainer() {
		list = new ArrayList<>();
	}
	/**
	   * This method is used to find an instance of <code>Customer</code>
	   * @param phone This is used to iterate trough all the instanciated customers
	   * to find the desired <code>Customer</code>
	   * instance
	   * @return c This returns an instance of <code>Customer</code>.
	   */
	
	public Customer findCustomerbyPhone(String phone) {
		Customer customer = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPhone().equals(phone)) {
				customer = list.get(i);
				i = list.size();
			}
		}
		return customer;
	}
	
	public void addCustomer(Customer c) {
		list.add(c);
	}
	public List<Customer> getContainerWithEveryCustomer() {
		return list;
	}
}
