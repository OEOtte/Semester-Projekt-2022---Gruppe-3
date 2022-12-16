package model;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
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
		if (list.size() <= 9) {
			s.setSaleNumber("0" + list.size());
		} else {
			s.setSaleNumber("" + list.size());
		}
	}
}
