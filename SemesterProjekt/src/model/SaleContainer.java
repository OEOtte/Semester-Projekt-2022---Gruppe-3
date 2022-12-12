package model;
import java.util.ArrayList;

public class SaleContainer {
	private SaleContainer instance;
	private ArrayList<Sale> list;
	
	
	public SaleContainer getInstance() {
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
		
	}

}
