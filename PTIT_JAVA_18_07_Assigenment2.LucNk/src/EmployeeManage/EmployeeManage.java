/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 9, 2018.
	* @version 1.0
	*/

package EmployeeManage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

import Employee.Deparment;
import Employee.Emloyee;
import Employee.HourlyEmployee;
import Employee.SalariedEmployee;

public class EmployeeManage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Deparment> departments = new ArrayList<>();
		ArrayList<Emloyee> listOfEmployee = new ArrayList<>();
		/*@SuppressWarnings("rawtypes")*/
		Function function = new Function();
		int choose;
		while (true) {
			System.out.println("----------- Select -----------");
			System.out.println(" 1: Input data from the keyboard");
			System.out.println(" 2: Display employees");
			System.out.println(" 3: Classify employees");
			System.out.println(" 4: Employee Search");
			System.out.println(" 5: Report");
			System.out.println(" 0: Stop");
			System.out.println("\n Please choose");
			int check = 0;
			choose = in.nextInt();
			in.nextLine();
			switch (choose) {
			case 0:
				check = 1;
				break;
			case 1:
				System.out.println("Please enter department name: ");
				Deparment department = new Deparment();
				do {
					String name = in.nextLine();
					department.setDepartmentName(name);
					if (department.checkDepartment(departments)) {
						System.out.println("Exist departments - Please  enter department name again: ");
					}
				} while (department.checkDepartment(departments));
				function.input(department, in, listOfEmployee);
				departments.add(department);
				break;
			case 2:
				System.out.println(listOfEmployee.toString());
				break;
			case 3:
				ArrayList<SalariedEmployee> SalariedEmployees = new ArrayList<>();
				ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<>();

				for (Emloyee employee : listOfEmployee) {
					if (employee instanceof SalariedEmployee) {
						SalariedEmployees.add((SalariedEmployee) employee);
					} else {
						hourlyEmployees.add((HourlyEmployee) employee);
					}
				}
				System.out.println("List of Salary employee");
				for (SalariedEmployee employee : SalariedEmployees) {
					System.out.println(employee.toString());
				}
				System.out.println("List of Hourly employee");
				for (HourlyEmployee employee : hourlyEmployees) {
					System.out.println(employee.toString());
				}
				break;

			case 4:
				function.search(departments, in, listOfEmployee);
				break;
			case 5:

				System.out.println("List of department");
				for (int i = 0; i < departments.size(); i++) {
					departments.get(i).display();
				}
				break;

			default:
				break;
			}

			if (check == 1)
				return;

		}

	}

}
