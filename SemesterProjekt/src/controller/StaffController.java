package controller;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import model.StaffRelated.Staff;
import model.StaffRelated.StaffContainer;

public class StaffController {
	
	/**
	   * This method is used to find an instance of <code>Staff</code>
	   * @param name This is used to find the desired instance of <code>Staff</code>
	   * using a String as an input 
	   * @return s This returns an instance of <code>Staff</code>.
	   */
	public Staff findStaffByName(String name) {
		StaffContainer sc = StaffContainer.getInstance();
		Staff s = sc.findStaffByName(name);
		return s;
	}
	

}
