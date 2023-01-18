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
	
	/**
	   * This method is used to instantiate test data for <code>Tui</code>
	   */
	
	public static void writeData() {
	CustomerContainer cc = CustomerContainer.getInstance();
	ProductContainer pc = ProductContainer.getInstance();
	StaffContainer sc = StaffContainer.getInstance();
	
	Customer customer1 = new Customer("Oscar", "20202020", "@Oscar", "1234", "01", "group 1", 500);
	Customer customer2 = new Customer("Niels", "90909090", "@Niels", "1337", "02", "group 3", 10000);
	Customer customer3 = new Customer("Philip", "42042069", "@Philip", "6969", "03", "group 1", 1000);
	Customer customer4 = new Customer("Oliver", "69696969", "@Oliver", "6666", "04", "group 2", 3000);
	Customer customer5 = new Customer("Uffe", "20609906", "@Uffe", "4353", "05", "group 2", 50);
	Customer customer6 = new Customer("Ole", "43432212", "@Ole", "9534", "06", "group 1", 30000);
	Customer customer7 = new Customer("Eif", "99999999", "@Eif", "5432", "07", "group 1", 300);
	Customer customer8 = new Customer("Istvan", "62849901", "@Istvan", "1234", "08", "group 3", 5000);
	Customer customer9 = new Customer("Torben", "42001337", "@Torben", "4321", "09", "group 2", 7500);
	Customer customer10 = new Customer("Giana", "52879903", "@Giana", "9876", "10", "group 1", 3500);
	cc.addCustomer(customer1);
	cc.addCustomer(customer2);
	cc.addCustomer(customer3);
	cc.addCustomer(customer4);
	cc.addCustomer(customer5);
	cc.addCustomer(customer6);
	cc.addCustomer(customer7);
	cc.addCustomer(customer8);
	cc.addCustomer(customer9);
	cc.addCustomer(customer10);
	Product p1 = new Product("kost", "Rød og stor", "Haveredskaber", "0123", "TIMBER Vestbjerg", 100.0, 10, 100);
	Product p2 = new Product("planker", "birk, 2x4 meter", "Træ produkt", "0999", "TIMBER Vestbjerg", 100.0, 5, 50);
	Product p3 = new Product("gravko", "maskine, 3x4 meter", "Maskine produkt", "0499", "TIMBER Vestbjerg", 1000.0, 5, 50);
	Product p4 = new Product("hammer", "Guld", "Håndredskab", "0321", "TIMBER Vestbjerg", 500.0, 5, 75);
	Product p5 = new Product("saks", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 50.0, 10, 1000);
	Product p6 = new Product("stol", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 450.0, 10, 1000);
	Product p7 = new Product("tape", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 50.0, 10, 1000);
	Product p8 = new Product("gorilla tape", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 100.0, 10, 1000);
	Product p9 = new Product("bord", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 700.0, 10, 1000);
	Product p10 = new Product("skrank", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 1000.0, 10, 1000);
	Product p11 = new Product("bestik 5stk", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 25.0, 10, 1000);
	Product p12 = new Product("fliser 50stk", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 250.0, 10, 1000);
	Product p13 = new Product("skralde poser", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 10.0, 10, 1000);
	Product p14 = new Product("cement 1kg", "Rød", "Håndredskab", "0666", "TIMBER Vestbjerg", 150.0, 10, 1000);
	pc.addProduct(p1);
	pc.addProduct(p2);
	pc.addProduct(p3);
	pc.addProduct(p4);
	pc.addProduct(p5);
	pc.addProduct(p6);
	pc.addProduct(p7);
	pc.addProduct(p8);
	pc.addProduct(p9);
	pc.addProduct(p10);
	pc.addProduct(p11);
	pc.addProduct(p12);
	pc.addProduct(p13);
	pc.addProduct(p14);
	Staff employee1 = new Staff("Paul", "98766666", null);
	Staff employee2 = new Staff("Blicher ", "65243878", null);
	sc.addStaff(employee1);
	sc.addStaff(employee2);
	}
}
