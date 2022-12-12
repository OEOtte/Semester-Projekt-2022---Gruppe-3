package model;

public class Product {
	private String name;
	private String description;
	private String category;
	private String barcode;
	private String locationID;
	private double price;
	private int minStock;
	private int maxStock;
	
	public Product() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public String getLocationID() {
		return locationID;
	}


	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getMinStock() {
		return minStock;
	}


	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}


	public int getMaxStock() {
		return maxStock;
	}


	public void setMaxStock(int maxStock) {
		this.maxStock = maxStock;
	}
	

}
