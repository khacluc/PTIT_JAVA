/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 6, 2018.
	* @version 1.0
	*/

package Employee;

public abstract class Emloyee implements Payable {
	private String ssn, firstName, lastName, birthDate, phone, email;

	public abstract void Employee();

	public Emloyee(String ssn, String firstName, String lastName, String birthDate, String phone, String email) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
	}


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void display() {

	}

	@Override
	public double getPaymentAmount() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee: Ssn=" + getSsn() + ", First Name=" + getFirstName() + ", LastName=" + getLastName()
				+ ", Birth Date=" + getBirthDate() + ", Phone=" + getPhone() + ", Email=" + getEmail() + "";
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
