/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 10, 2018.
	* @version 1.0
	*/
package Computer_Ex1_LucNK;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		Function funtion = new Function();
		Operator opr = new Operator();
		System.out.println("===== Calculator Program =====");
		System.out.println("1. Normal Calculator ");
		System.out.println("2. BMI Calculator ");
		System.out.println("3. Exit ");
		System.out.println("Please choice one option: ");
		int choose;
		choose = in.nextInt();
		
		while(true) {
			try {
				if(choose>0 && choose < 4) {
					break;
				}
				else {
					System.out.println("Please choose 1 / 2 / 3 ");
					choose= in.nextInt();
					}
				
			}catch (InputMismatchException e) {
				System.out.println("Please choose 1 / 2 / 3");
				in.nextLine();
			}
		}
		switch (choose) {
		case 1:
			System.out.println("------ Normal Calculator---------");
			double memory = funtion.inputNumber();
			opr= funtion.intputOperator();
			double num2= funtion.inputNumber();
			memory = funtion.calculate(memory, opr, num2);
			while(true) {
				System.out.println("memory :"+ memory);
				opr= funtion.intputOperator();
				if(opr.getOperator().equals("=")) {
					System.out.println("result :"+ memory);
					break;
				}
				num2= funtion.inputNumber();
				memory = funtion.calculate(memory, opr, num2);
				
			}
		case 2:
			System.out.println("--------------BMI calculator-----------");
			double weight = funtion.inputWeight();
			double height = funtion.inputHeight();
			BMI bmi = funtion.calculateBMI(weight, height);
			bmi.diplay();
		case 3:
			System.out.println("Exit");
			break;

		default:
			break;
		}
		
		
		
	}


}
