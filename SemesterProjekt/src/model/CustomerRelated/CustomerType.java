package model.CustomerRelated;

public class CustomerType {
	private boolean privateCustomer;
	private String group;
	public CustomerType(boolean privateCustomer, String group) {
		this.privateCustomer = privateCustomer;
		this.group = group;
	}
	public String getGroup() {
		return group;
	}
}
