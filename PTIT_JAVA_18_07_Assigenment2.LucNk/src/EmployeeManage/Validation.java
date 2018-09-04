/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 9, 2018.
	* @version 1.0
	*/
package EmployeeManage;

public class Validation {
public static boolean checkBirthDate (String date) {
		
		return date.matches(Constants.BDATE_PATTERN);
	}
	
	public static boolean checkEmail(String email) {
		return email.matches(Constants.EMAIL_PATTERN);
	}
	
	public static boolean checkPhone(String phone) {
		return phone.matches(Constants.PHONE_PATTERN);
	}

}
