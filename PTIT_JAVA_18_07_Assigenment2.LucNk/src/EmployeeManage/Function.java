/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 9, 2018.
	* @version 1.0
	*/

package EmployeeManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Employee.Deparment;
import Employee.Emloyee;
import Employee.HourlyEmployee;
import Employee.SalariedEmployee;

public class Function {
	public void input(Deparment departments, Scanner in,List<Emloyee> listOfEmployee ) {
		int check =0;
		while(true) {
			
			ArrayList<Emloyee> employees = new ArrayList<>();
			System.out.println("Please enter choose type of employee: ");
			System.out.println("0. Exit");
			System.out.println("1. Salaried Employee");
			System.out.println("2. Hourly Employee");
			int choose = in .nextInt();
			in.nextLine();
			switch(choose) {
			case 0: check =1; break;
			case 1: 
				SalariedEmployee SalariedEmployee = new SalariedEmployee(null, null, null, null, null, null, choose, choose, choose);
				System.out.println("Please enter information salary employee");
				System.out.print("SNN: "); SalariedEmployee.setSsn(in.nextLine());
				System.out.print("First name: "); SalariedEmployee.setFirstName(in.nextLine());
				System.out.print("Last name: "); SalariedEmployee.setLastName(in.nextLine());
				System.out.println("Birth date: "); 
				String birth = null;
				do {
					birth = in.nextLine();
					if(!Validation.checkBirthDate(birth)) {
						System.out.println("Error defaut of date time (dd/MM/yyyy): ");
					}
				}while(!Validation.checkBirthDate(birth));
				SalariedEmployee.setBirthDate(birth);
				System.out.println("Phone: "); 
				String phone;
				do {
					phone = in.nextLine();
					if(!Validation.checkPhone(phone)) {
						System.out.println("Error defaut of phone ((012)-123-1234): ");
					}
				}while(!Validation.checkPhone(phone));
				SalariedEmployee.setPhone(phone);
				
				
				System.out.println("Email: "); 
				String email;
				do {
					email = in.nextLine();
					if(!Validation.checkEmail(email)) {
						System.out.println("Error defaut of email (xxxxxxx@xxx.xxx): ");
					}
				}while(!Validation.checkEmail(email));
				SalariedEmployee.setEmail(email);
				System.out.println("Enter commission rate: ");
				SalariedEmployee.setCommissionRate(in.nextDouble());
				System.out.println("Enter gross sales: ");
				SalariedEmployee.setGrossSales(in.nextDouble());
				System.out.println("Enter basic salary: ");
				SalariedEmployee.setBasicSalary(in.nextDouble());
				listOfEmployee.add(SalariedEmployee);
				employees.add(SalariedEmployee);
				in.nextLine();
				break;
			case 2: 
				HourlyEmployee hourlyEmployee = new HourlyEmployee(null, null, null, null, null, null, choose, choose);
				System.out.println("Please enter information");
				System.out.print("SNN: "); hourlyEmployee.setSsn(in.nextLine());
				System.out.print("First name: "); hourlyEmployee.setFirstName(in.nextLine());
				System.out.print("Last name: "); hourlyEmployee.setLastName(in.nextLine());
				System.out.println("Birth date: "); 
				String birth1;
				do {
					birth1 = in.nextLine();
					if(!Validation.checkBirthDate(birth1)) {
						System.out.println("Error defaut of date time (dd/MM/yyyy): ");
					}
				}while(!Validation.checkBirthDate(birth1));
				hourlyEmployee.setBirthDate(birth1);
				System.out.println("Phone: "); 
				String phone1;
				do {
					phone1 = in.nextLine();
					if(!Validation.checkPhone(phone1)) {
						System.out.println("Error defaut of phone ((012)-123-1234): ");
					}
				}while(!Validation.checkPhone(phone1));
				hourlyEmployee.setPhone(phone1);
				
				
				System.out.println("Email: "); 
				String email1;
				do {
					email1 = in.nextLine();
					if(!Validation.checkEmail(email1)) {
						System.out.println("Error defaut of email (xxxxxxx@xxx.xxx): ");
					}
				}while(!Validation.checkEmail(email1));
				hourlyEmployee.setEmail(email1);
				System.out.println("Wage: "); hourlyEmployee.setWage(in.nextDouble());
				System.out.println("Working hours: ");
				hourlyEmployee.setWorkingHours(in.nextDouble());
				employees.add(hourlyEmployee);
				listOfEmployee.add(hourlyEmployee);
				in.hasNextLine();
				break;
			default: break;
			}
			departments.setListOfEmployee(employees);
			if(check == 1) {
			//	System.out.println(departments.getDepartmentName());
				break;
			}
			
		}
		public void search(ArrayList<Deparment> departments, Scanner in,List<Emloyee> listOfEmployee ) {
			while(true) {
				int check1 =0;
				System.out.println("Please enter to choose type to search: ");
				System.out.println("1.Search by name of department");
				System.out.println("2.Search by name of employee");
				System.out.println("0.Exit");
				int choose = in.nextInt();
				in.nextLine();
				int test =0;
				switch(choose) {
				case 0: check1 =1; break;
				case 1: 	
					System.out.println("Please enter name of department: ");
					String name = in.nextLine();
					for(int i=0; i< departments.size(); i++) {
						if(name.equals(departments.get(i).getDepartmentName())) {
							System.out.println(departments.get(i).getListOfEmployee());
							test =1;
						}
					}
					if(test ==0) System.out.println("Not exist department!");
					break;
				case 2: System.out.println("Please enter name of employee: ");
					test =0;
					String nameEmp = in.nextLine();
					for(Emloyee employee : listOfEmployee) {
						if(nameEmp.equals(employee.getFirstName()+" "+employee.getLastName())) {
							System.out.println(employee.toString());
							test =1;
						}
					}
					if(test ==0) System.out.println("Not exist employee!");
					
					break;
				}
				
				
				if(check1==1) break;
				
				
			}
		}
	}
}
