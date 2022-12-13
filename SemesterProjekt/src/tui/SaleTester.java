package tui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Sale;
import model.CustomerRelated.Customer;
import model.ProductRelated.Product;
import model.StaffRelated.Staff;
import model.StaffRelated.StaffType;
import controller.SaleController;

class SaleTester {
	private Customer customer;
	private Product product;
	private Staff employee;
	private SaleController saleController;
	private static final String CUSTOMERNAME = "Paul";
	private static final String PHONE = "12345678";
	private static final String EMAIL = "Paul@";
	private static final String PINCODE = "1234";
	private static final String CUSTOMERNUMBER = "01";
	private static final String GROUP = "group 3";
	private static final double CREDITS = 500.0;
	private static final String PRODUCTNAME = "Computer";
	private static final String DESCRIPTION = "Really powerful";
	private static final String CATEGORY = "A+";
	private static final String BARCODE = "999999";
	private static final String lOCATIONID = "DIY Aalborg";
	private static final double PRICE = 250;
	private static final double VAT = 50;
	private static final int MINSTOCK = 5;
	private static final int MAXSTOCK = 20;
	private static final String STAFFNAME = "Oscar";
	private static final String PHONENUMBER = "12312312";
	private static final StaffType STAFFTYPE = null;
	public SaleTester() {}
	@BeforeEach
	void setup() {
		saleController = new SaleController();
		customer = new Customer(CUSTOMERNAME, PHONE, EMAIL, PINCODE, CUSTOMERNUMBER, GROUP, CREDITS);
		product = new Product(PRODUCTNAME, DESCRIPTION, CATEGORY, BARCODE, lOCATIONID, PRICE, VAT, MINSTOCK, MAXSTOCK);
		employee = new Staff(STAFFNAME, PHONENUMBER, STAFFTYPE);
	}
	@Test
	void addCustomerToSale() {
		Sale s = saleController.registerSale(employee);
		s.addCustomer(customer);
		assertEquals(s.getCustomer(), customer);
	}

}
