package tui;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;
import model.StaffRelated.Staff;
import model.StaffRelated.StaffContainer;

public class Main {
	public static void main(String[] args) {
		writeData();
		Tui tui = new Tui();
		tui.start();
	}
	
//	 * This method is used to create test data for our TUI.
	
	public static void writeData() {
	CustomerContainer cc = CustomerContainer.getInstance();
	ProductContainer pc = ProductContainer.getInstance();
	StaffContainer sc = StaffContainer.getInstance();
	
	Customer customer1 = new Customer("Oscar", "20202020", "@Oscar", "1234", "01", "group 1", 500);
	Customer customer2 = new Customer("Niels", "90909090", "@Niels", "1337", "02", "group 3", 10000);
	Customer customer3 = new Customer("Philip", "42042069", "@Philip", "6969", "03", "group 1", 1000);
	Customer customer4 = new Customer("Oliver", "69696969", "@Oliver", "6666", "04", "group 2", 3000);
	cc.addCustomer(customer1);
	cc.addCustomer(customer2);
	cc.addCustomer(customer3);
	cc.addCustomer(customer4);
	Product p1 = new Product("kost", "Rød og stor", "Haveredskaber", "0123", "DIY Vestbjerg", 100.0, 10, 100);
	Product p2 = new Product("planker", "birk, 2x4 meter", "Træ produkt", "0999", "TIMBER Vestbjerg", 100.0, 5, 50);
	Product p3 = new Product("tvangs blander", "Grå, 10x20 meter", "Udlejnings redskab", "0420", "TIMBER Vestbjerg", 1000.0, 1, 5);
	Product p4 = new Product("boremaskine", "Guld, batteri", "Håndredskab", "0321", "DIY Vestbjerg", 500.0, 5, 75);
	Product p5 = new Product("saks", "Rød", "Håndredskab", "0666", "DIY Vestbjerg", 50.0, 10, 1000);
	pc.addProduct(p1);
	pc.addProduct(p2);
	pc.addProduct(p3);
	pc.addProduct(p4);
	pc.addProduct(p5);
	Staff employee1 = new Staff("Paul", "98766666", null);
	Staff employee2 = new Staff("Blicher ", "65243878", null);
	sc.addStaff(employee1);
	sc.addStaff(employee2);
	}
}
