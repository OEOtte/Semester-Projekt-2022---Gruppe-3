package model.StaffRelated;
/**
 * @author Gruppe 3
 * @version 2022-12-15
 */
import java.util.ArrayList;

public class StaffContainer {
	private static StaffContainer instance;
	private ArrayList<Staff> sl;
	
	public static StaffContainer getInstance() {
		if(instance == null) {
			instance = new StaffContainer();
		}
		return instance;
	}
	
	private StaffContainer() {
		sl = new ArrayList<>();
	}
	
	public void addStaff(Staff s) {
		sl.add(s);
	}
	
//	 * This method is used to find an instance of <code>Staff</code>
//	   * @param phone This is used to iterate trough all the instanciated Staffs
//	   * to find the desired <code>Staff</code>
//	   * instance
//	   * @return c This returns an instance of <code>Staff</code>.
//	   */
	
	public Staff findStaffByName(String name) {
		Staff s = null;
		for(int i = 0; i < sl.size(); i++) {
			if((sl.get(i).getName()).equals(name)) {
				s = sl.get(i);
				i = sl.size();
			}
		}
		return s;
	}
	
	

}
