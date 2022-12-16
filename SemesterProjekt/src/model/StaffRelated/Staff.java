package model.StaffRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
public class Staff {
	private String name;
	private String phoneNumber;
	private StaffType staffType;
	
	public Staff(String name, String phoneNumber, StaffType staffType) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.staffType = staffType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
}