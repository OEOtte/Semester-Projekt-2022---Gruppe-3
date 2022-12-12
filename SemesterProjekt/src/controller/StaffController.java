package controller;
import model.Staff;
import model.StaffContainer;

public class StaffController {
	
	
	public Staff findStaffByName(String name) {
		StaffContainer sc = StaffContainer.getInstance();
		Staff s = sc.findStaffByName(name);
		return s;
	}
	

}
