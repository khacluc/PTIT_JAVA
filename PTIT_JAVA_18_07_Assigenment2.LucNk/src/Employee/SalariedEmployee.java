/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 6, 2018.
	* @version 1.0
	*/

package Employee;

public class SalariedEmployee extends Emloyee{
	
	private double commissionRate;
	private double grossSales;
	private double basicSalary;
	public SalariedEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email,double commisstionRate,double grossRate,double basicSalary) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.commissionRate= commissionRate;
		this.grossSales= grossSales;
		this.basicSalary= basicSalary;
		// TODO Auto-generated constructor stub
	}

	

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "SalariedEmployee: Ssn=" + getSsn() + ", First Name=" + getFirstName() + ", Last Name=" + getLastName() + ", Birth Date="
				+ getBirthDate() + ", Phone=" + getPhone() + ", Email=" + getEmail() + "Commisstion Rate=" + getCommissionRate() + ", Gross Sales=" + getGrossSales() + ", basicSalary="
				+ getBasicSalary() + "";
	}
	
	@Override
	public double getSalary() {
		return this.basicSalary + this.commissionRate * this.grossSales;
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		
	}

}
