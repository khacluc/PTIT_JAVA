/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 6, 2018.
	* @version 1.0
	*/
package Employee;

import java.util.ArrayList;
import java.util.List;

public class Deparment {
	private String departmentName;
	private List<Emloyee> listOfEmployee;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Emloyee> getListOfEmployee() {
		return listOfEmployee;
	}
	public void setListOfEmployee(List<Emloyee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}

	public boolean checkDepartment(ArrayList<Deparment> departments) {
		for(Deparment department: departments) {
			if(department.getDepartmentName().endsWith(this.departmentName))
				return true;
		}
		return false;
	}
	public void display() {
		System.out.println("Department [departmentName=" + departmentName + ", number of employee=" + listOfEmployee.size() + "]");
	}

}
