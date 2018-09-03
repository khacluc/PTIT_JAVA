/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 19, 2018.
	* @version 1.0
	*/

package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorManage {
	public static void main(String[] args) {
		double width;
		double length;
		double radius;
		double sideA;
		double sideB;
		double sideC;
		Scanner input = new Scanner(System.in);
		System.out.println("=====Calculator Shape Progarmer=====");
		System.out.println("Please input side width of Rectangle:");
		width = input.nextDouble();
		System.out.println("Please input side length of Rectangle:");
		length = input.nextDouble();
		System.out.println("Please input radius of Circle:");
		radius = input.nextDouble();
		System.out.println("Please input side A of Triangle:");
		sideA = input.nextDouble();
		System.out.println("Please input side B of Triangle:");
		sideB = input.nextDouble();
		System.out.println("Please input side C of Triangle:");
		sideC = input.nextDouble();
		
	/*	Rectangle rectengle = new Rectangle(width, length);
		rectengle.printResult();
		Cricle cricle = new Cricle(radius);
		cricle.printResult();
		Triangle triangle = new Triangle(sideA, sideB, sideC);
		triangle.printResult();*/
		
		ArrayList<Shape> listShap = new ArrayList<>();
		Shape rectengle = new Rectangle(width, length);
		Shape cricle = new Cricle(radius);
		Shape triangle = new Triangle(sideA, sideB, sideC);
		listShap.add(rectengle);
		listShap.add(cricle);
		listShap.add(triangle);
		
		for(Shape shap: listShap) {
			shap.printResult();
		}

	}

}
