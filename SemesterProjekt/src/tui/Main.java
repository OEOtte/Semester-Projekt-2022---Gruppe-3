package tui;

import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;

public class Main {
	public static void main(String[] args) {
		Tui tui = new Tui();
		tui.start();
	}
	
	public static void writeData() {
	CustomerContainer cc = CustomerContainer.getInstance();
	Customer c = new Customer("bo", "20202020", "@Bo", "1234", "01", "group 1", 1000);
	cc.addCustomer(c);
	}
}
