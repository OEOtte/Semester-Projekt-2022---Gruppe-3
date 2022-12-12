package model;
import java.util.ArrayList;

public class SaleContainer {
	private static SaleContainer instance;
	private ArrayList<Sale> list;
	
	
	public static SaleContainer getInstance() {
		if(instance == null) {
			instance = new SaleContainer();
			return instance;
		}
		return instance;
	}
	
	private SaleContainer() {
		list = new ArrayList<>();
	}
	
	public void addSale(Sale s) {
		list.add(s);
	}

}
