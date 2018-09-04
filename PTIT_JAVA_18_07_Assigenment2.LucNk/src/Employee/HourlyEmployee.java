/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 6, 2018.
	* @version 1.0
	*/
package Employee;

public class HourlyEmployee extends Emloyee{
	
	private double wage;
	private double workingHours;
	public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email, double wage, double workingHours) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.wage=wage;
		this.workingHours= workingHours;
		// TODO Auto-generated constructor stub
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "HourlyEmployee: Ssn=" + getSsn() + ", First Name=" + getFirstName() + ", Last Name=" + getLastName()
				+ ", Birth Date=" + getBirthDate() + ", Phone=" + getPhone() + ", Email=" + getEmail() + ", Wage="
				+ wage + ", Working Hours=" + getWorkingHours() + "";
	}
	@Override
	public double getSalary() {
		return this.wage*this.workingHours;
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
