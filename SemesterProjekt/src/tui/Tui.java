package tui;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;
import java.util.Scanner;

import controller.CustomerController;
import controller.ProductController;
import controller.SaleController;
import controller.StaffController;
import model.OrderLine;
import model.Sale;
import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;

public class Tui {
	
	private SaleController sCtrl;
	private Scanner scanner;
	private StaffController sc;
	private ProductController pc;
	private CustomerController cc;
	private Staff em1;
	private Staff em2;
	
	public Tui (){
		pc = new ProductController();
		cc = new CustomerController();
		sc = new StaffController();
		sCtrl = new SaleController();
		scanner = new Scanner(System.in);
		em1 = sc.findStaffByName("Paul");
		em2 = sc.findStaffByName("Blicher");
	}
	
	public void start() {
		System.out.println("Vestbjerg byggecenter system");
		boolean goon = true;
		while(goon) {
			System.out.println("    For DIY centeret indtast (d)");
			System.out.println("    For TIMBER centeret indtast (t)");
			System.out.println("    For at afslut indtast (x)");
			System.out.println();
			System.out.print("Indtast input her: ");
			String input = scanner.nextLine().toLowerCase();
			switch(input) {
				case "d":
					System.out.println();
					diyCenter();
					System.out.println("Ikke implementeret");
					break;
				case "t":
					System.out.println();
					timberCenter();
					System.out.println();
					break;
				case "x":
					exit();
					goon = false;
					break;
				default:
				System.out.println("Ugyldig input: "+ input);
			}
		}
	}
	
	

	private void diyCenter() {
		System.out.println();
		System.out.println("Paul er din expedient");
		System.out.println("     Opret en ny Ordre (1)");
		System.out.println("     Gå tilbage (2)");
		String input = scanner.nextLine();
		switch(input) {
		case "1":
			createDIYSale(em1);
			break;
		case "2":
			System.out.println();
			break;
		default:
			System.out.println("Kan kun tage imod '1' eller '2'");
		}
	}

	private void createDIYSale(Staff employee) {
		// TODO Auto-generated method stub
		
	}

	private void timberCenter() {
		System.out.println("Blicher er din expedient");
		System.out.println("     Opret en ny Ordre (1)");
		System.out.println("     Gå tilbage (2)");
		String input = scanner.nextLine();
		switch(input) {
		case "1":
			createTimberSale(em2);
			break;
		case "2":
			System.out.println();
			break;
		default:
			System.out.println("Kan kun tage imod '1' eller '2'");
		}
	}

	private void createTimberSale(Staff employee) {
		Sale newSale = sCtrl.registerSale(employee);
		addProducts();
		System.out.println("Har du en konto ? (ja), (nej)");
		String input = scanner.nextLine();
		switch (input) {
			case "ja":
				Customer c = findCustomer();
				boolean found = confirmAccount(c);
				while (!found) {
					found = confirmAccount(c);
					if (!found) {System.out.println("Forkert pinkode... prøv igen");}
				}
				break;
			case "nej":
				System.out.println("Metode ikke implementeret");
				break;
			default:
				System.out.println("Kan kun tage imod 'ja' eller 'nej'");
		}
		System.out.println("Din konto er nu tilføjet til salget");
		System.out.println();
		System.out.println("Vil du betale med din konto? (ja), (nej)");
		String input2 = scanner.next();
		switch(input2) {
			case "ja":
				boolean success = sCtrl.paymentByAccount();
				if (!success) {System.out.println("Ikke nok kredit på kontoen");}
			break;
			case "nej":
				System.out.println("Metode ikke implemeneteret");
			break;
			default:
				System.out.println("Kan kun tage imod 'ja' eller 'nej'");
		}
		System.out.println();
		System.out.println("Tak for at handle hos Vestbjerg byggecenter!");
		printOrder(newSale);
	}

	private void addProducts() {
		Product p = null;
		while (p == null) {
			p = timberSale();
			if (p == null) { System.out.println("Det du indtastede findes ikke... Prøv igen"); }
		}
		System.out.println(p.getName() + " Blev tilføjet til salget");
		System.out.println();
		System.out.println("Vil du tilføje flere produkter? (ja), (nej)");
		String input = scanner.nextLine();
		switch (input) {
			case "ja":
				addProducts();
				break;
			case "nej":
			break;
			default:
				System.out.println("Kan kun tage imod 'ja' eller 'nej'");
		}
		
	}

	private boolean confirmAccount(Customer c) {
		System.out.println();
		System.out.print("Indtast pinkode: ");
		String input = scanner.nextLine();
		return sCtrl.insertPincode(input);
	}

	private Customer findCustomer() {
		Customer c = null;
		while (c == null) {
			c = findByNumber();
			if (c == null ) {System.out.println("Ingen kontoer har det nummer... prøv igen");}
		}
		return c;
	}

	private Customer findByNumber() {
		System.out.println();
		System.out.print("Indtast telefonnummer: ");
		String input = scanner.nextLine();
		Customer helper = cc.findCustomerByPhone(input);
		if (helper == null) {
			return null;
		}
		Customer c = sCtrl.findCustomerByPhone(input);
		return c;
	}

	private Product timberSale() {
		System.out.print("Søg efter produkt: ");
		String input = scanner.nextLine();
		input.toLowerCase();
		Product helper = pc.identifyProduct(null, input);
		if (helper == null) {
			return null;
		}
		Product p = sCtrl.identifyProduct(null, input);
		return p;
	}
	
	private void printOrder(Sale newSale) {
		double totalPrice = 0;
		System.out.println();
		System.out.println("Produkt navn  |  Antal   |   Pris inkl moms  |    Moms");
		for (int i = 0; i < newSale.getOrderLineList().size(); i++) {
			System.out.println("_________________________________________________________");
			String temp = newSale.getOrderLineList().get(i).getProducts().get(0).getName();
			int quantity = newSale.getOrderLineList().get(i).getQuantity();
			String space = "          ";
			StringBuilder sb = new StringBuilder(space);
			if (temp.length() >= 14) {
				space = "   ";
			}
			while(temp.length() > 7 && temp.length() < 14) {
				sb.deleteCharAt(0);
			}
			while (temp.length() < 7) {
				temp += " ";
			}
			double totalMoms = 0;
			ArrayList<Product> helper = newSale.getOrderLineList().get(i).getProducts();
			for (int j = 0; j < helper.size(); j++) {
				totalMoms += helper.get(j).getVat();
			}
			System.out.println("   " + temp + space + quantity + "           " + newSale.getOrderLineList().get(i).getPriceOfEveryProduct() + 
					"             " + totalMoms);
			totalPrice = newSale.getOrderLineList().get(i).getPriceOfEveryProduct();
		}
		int discount = 0;
		String temp = "";
		for (int i = 1; i <= 3; i++) {
			temp = "group " + i;
			if (temp.equals(newSale.getCustomer().getGroup())) {
				discount = Integer.parseInt(i + "" + 0);
			}
		}
		System.out.println("_________________________________________________________");
		System.out.println("   Rabat: " + discount + "%" + "                    " + newSale.getMoneySaved());
		System.out.println("_________________________________________________________");
		System.out.println("                                   Total pris: " + (totalPrice - newSale.getMoneySaved()));
		System.out.println("                                   Salgsnummer: " + newSale.getSaleNumber());
		System.out.println();
	}
	
	private void exit() {
		System.out.println("Thanks for using Vestbjerg byggecenter sale system!");
	}
}
