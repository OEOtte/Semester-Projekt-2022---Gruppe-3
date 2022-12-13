package tui;

import java.util.Scanner;

import controller.SaleController;
import model.Sale;
import model.CustomerRelated.Customer;

public class Tui {
	
	private SaleController sCtrl;
	private Scanner scanner;

	
	public Tui (){
	
	sCtrl = new SaleController();
	scanner = new Scanner(System.in);
	
	}
	
	public void start() {
	System.out.println("Vestbjerg byggecenter sale system");
	boolean goon = true;
	while(goon) {
	System.out.println("Create sale(s)");
	String input = scanner.nextLine().toLowerCase();
	switch(input) {
	case "s":
	createSale();
	break;
	case "x":
	exit();
	goon = false;
	break;
	default:
	System.out.println("I dont understand"+ input + "please try again");

	
	}
	
	}
	
	}

	private void createSale() {
		Sale newSale = sCtrl.registerSale(null);
		sCtrl.identifyProduct(null, null);
		Customer c = sCtrl.findCustomerByPhone("23432");
		if (c != null) {			
			sCtrl.insertPincode("1234");
			sCtrl.paymentByAccount();
		}
		System.out.println("Perfectly executed");
		
		
	}
	
	

	private void exit() {
		System.out.println("Closing system");
			
		}

}
