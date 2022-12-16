package tui;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Sale;
import model.CustomerRelated.Customer;
import model.CustomerRelated.CustomerContainer;
import model.ProductRelated.Product;
import model.ProductRelated.ProductContainer;
import model.StaffRelated.Staff;
import model.StaffRelated.StaffContainer;
import model.StaffRelated.StaffType;
import controller.SaleController;

class SaleTester {
	private Customer customerSuccess;
	private Customer customerFail;
	private Product product;
	private Staff employee;
	private SaleController saleController;
	private StaffContainer staffCon;
	private CustomerContainer customerCon;
	private ProductContainer productCon;
	private static final String CUSTOMERNAME = "Paul";
	private static final String PHONE = "89734533";
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
	private static final int MINSTOCK = 5;
	private static final int MAXSTOCK = 20;
	private static final String STAFFNAME = "Oscar";
	private static final String STAFFPHONE = "12312312";
	private static final StaffType STAFFTYPE = null;
	public SaleTester() {}
	
	@BeforeEach
	void setup() {
		customerSuccess = new Customer(CUSTOMERNAME, PHONE, EMAIL, PINCODE, CUSTOMERNUMBER, GROUP, CREDITS);
		customerFail = new Customer(CUSTOMERNAME, "87654321", EMAIL, "4321", "02", GROUP, 0);
		product = new Product(PRODUCTNAME, DESCRIPTION, CATEGORY, BARCODE, lOCATIONID, PRICE, MINSTOCK, MAXSTOCK);
		Product product2 = new Product("MaskineTester", DESCRIPTION, CATEGORY, "89234", lOCATIONID, PRICE, MINSTOCK, MAXSTOCK);
		employee = new Staff(STAFFNAME, STAFFPHONE, STAFFTYPE);
		saleController = new SaleController();
		staffCon = StaffContainer.getInstance();
		staffCon.addStaff(employee);
		customerCon = CustomerContainer.getInstance();
		customerCon.addCustomer(customerSuccess);
		customerCon.addCustomer(customerFail);
		productCon = ProductContainer.getInstance();
		productCon.addProduct(product);
		productCon.addProduct(product2);
	}
	
	@Test
	void checkIfSaleIsRegistered() {
		Sale s = saleController.registerSale(employee);
		assertTrue(s != null);
	}
	
	@Test
	void employeeAssociatedWithSale() {
		Sale s = saleController.registerSale(employee);
		assertTrue(employee != null);
		assertTrue(employee.getPhoneNumber() == employee.getPhoneNumber());
	}
	
	@Test
	void orderlineAssociationWithSaleUsingBarcode() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(BARCODE, null);
		assertTrue(s.findOrderline(p) != null);
	}
	
	@Test
	void productAssociationWithSaleUsingBarcode() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(BARCODE, null);
		assertEquals(s.findOrderline(p).getProducts().get(0), p);
	}
	
	@Test
	void OrderlineAssociationWithSaleUsingName() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(null, PRODUCTNAME);
		assertEquals(s.findOrderline(p).getProducts().get(0), p);
	}
	
	@Test
	void productAssociationWithSaleUsingName() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(null, PRODUCTNAME);
		assertEquals(s.findOrderline(p).getProducts().get(0), p);
	}
	
	 @Test
	 void orderlineIncrementQuantityWithProduct() {
		 Sale s = saleController.registerSale(employee);
		 Product p1 = saleController.identifyProduct(BARCODE, null);
		 Product p2 = saleController.identifyProduct(null, PRODUCTNAME);
		 Product p3 = saleController.identifyProduct(BARCODE, null);
		 assertTrue(s.getOrderLineList().get(0).getQuantity() == 3);
	 }
	
	@Test
	void customerAssociatedWithSale() {
		Sale s = saleController.registerSale(employee);
		Customer c = saleController.findCustomerByPhone(PHONE);
		saleController.insertPincode(PINCODE);
		assertEquals(s.getCustomer(), c);
	}
	
	@Test
	void paymentByAccountSuccess() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(BARCODE, null);
		Customer c = saleController.findCustomerByPhone(PHONE);
		saleController.insertPincode(PINCODE);

		assertTrue(saleController.paymentByAccount());
	}
	
	@Test
	void paymentByAccountFail() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(BARCODE, null);
		Customer c = saleController.findCustomerByPhone("87654321");
		saleController.insertPincode("4321");
	
		assertFalse(saleController.paymentByAccount());
	}
	
	@Test
	void saleAssociationWithID() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(null, PRODUCTNAME);
		Customer c = saleController.findCustomerByPhone(PHONE);
		saleController.insertPincode(PINCODE);
		saleController.paymentByAccount();
		assertEquals(s.getSaleNumber(), "01");
	}
	
	@Test
	void productPriceAssociatedWithSale() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(BARCODE, null);
		assertTrue(s.getTotalPrice() == p.getTotalProductPrice());
	}
	
	@Test
	void salePriceAssociationWithCustomer() {
		Sale s = saleController.registerSale(employee);
		Product p = saleController.identifyProduct(null, PRODUCTNAME);
		Customer c = saleController.findCustomerByPhone(PHONE);
		saleController.insertPincode(PINCODE);
		assertTrue(s.getTotalPrice() != p.getTotalProductPrice() && s.getTotalPrice() > 0);
	}
	
	@Test
	void detectInvalidProductInput() {
		Sale s = saleController.registerSale(employee);
		Product p1 = saleController.identifyProduct(null, null);
		Product p2 = saleController.identifyProduct("Test", null);
		Product p3 = saleController.identifyProduct(null, "slik");
		assertNull(p1);
		assertNull(p2);
		assertNull(p3);
	}

	@Test
	void multipleProductOrders() {
		Sale newSale = saleController.registerSale(employee);
		Product p1 = saleController.identifyProduct(null, PRODUCTNAME);
		Product p3 = saleController.identifyProduct(null, "MaskineTester");
		Product p2 = saleController.identifyProduct(BARCODE, null);
		for(int i = 0; i < newSale.getOrderLineList().size(); i++) {
			for(Product p : newSale.getOrderLineList().get(i).getProducts()) {
				System.out.println(p.getName());
			}
		}
		assertTrue(newSale.getOrderLineList().size() == 2);
	}
}
