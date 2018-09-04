/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 10, 2018.
	* @version 1.0
	*/

package Computer_Ex1_LucNK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {

	public Operator checkOperator(String operator) {
		Operator op = new Operator();
		List<String> list = new ArrayList<>();
		list.add("+");
		list.add("-");
		list.add("*");
		list.add("/");
		list.add("^");
		list.add("=");

		for (String str : list) {
			if (str.equals(operator)) {
				op.setOperator(operator);
				return op;
			}

		}
		return null;
	}

	public Operator intputOperator() {
		Operator op1 = new Operator();
		Scanner in = new Scanner(System.in);
		System.out.println("Please Operator: ");
		String str = in.nextLine();
		while (true) {
			try {
				op1 = checkOperator(str);
				if (op1.getOperator() != null)
					return op1;

			} catch (NullPointerException e) {
				System.out.println("Please input: + , - , * , / , ^ ");
				str = in.nextLine();

			}
		}

	}

	public double inputNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please number: ");
		String s = in.nextLine();
		while (true) {
			try {
				double num = Double.parseDouble(s);
				return num;

			} catch (NumberFormatException e) {
				System.out.println("Enter number: ");
				s = in.nextLine();

			}
		}

	}

	public double calculate(double a, Operator operator, double b) {
		String key = operator.getOperator();
		switch (key) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			if (b == 0) {
				System.out.println("Arithmetic Exception");
				return 0;
			} else
				return a / b;
		case "^":
			return Math.pow(a, b);
		default:
			return 0;
		}
	}

	public double inputWeight() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Weight (kg) : ");
		String s = in.nextLine();
		while (true) {
			try {
				double weight = Double.parseDouble(s);
				return weight;
			} catch (NullPointerException e) {
				System.out.println("BMI degit: ");
				s = in.nextLine();
			}
		}
	}

	public double inputHeight() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Height (cm) : ");
		String s = in.nextLine();
		while (true) {
			try {
				double height = Double.parseDouble(s);
				return height;
			} catch (NullPointerException e) {
				System.out.println("BMI degit: ");
				s = in.nextLine();
			}
		}
	}

	public BMI calculateBMI(double weight, double height) {

		BMI bmi = new BMI(weight, height);
		return bmi;
	}
}
