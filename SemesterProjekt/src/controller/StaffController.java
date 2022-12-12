package controller;
import model.StaffRelated.Staff;
import model.StaffRelated.StaffContainer;

public class StaffController {
	
	
	public Staff findStaffByName(String name) {
		StaffContainer sc = StaffContainer.getInstance();
		Staff s = sc.findStaffByName(name);
		return s;
	}
	

}
