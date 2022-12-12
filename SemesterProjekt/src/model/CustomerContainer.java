package model;

import java.util.ArrayList;

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
	
	public Customer findCustomerbyPhone(String phone) {
		Customer customer = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPhone() == phone) {
				customer = list.get(i);
				i = list.size();
			}
		}
		return customer;
	}

}
