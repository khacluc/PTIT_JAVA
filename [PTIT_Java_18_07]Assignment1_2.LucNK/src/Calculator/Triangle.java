/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 19, 2018.
	* @version 1.0
	*/
package Calculator;

public class Triangle extends Shape{
	private double sideA;
	private double sideB;
	private double sideC;
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	@Override
	public double getPerimeter() {
		return sideA+sideB+sideC;
	}
	@Override
	public double getArea() {
		return Math.sqrt((sideA+sideB+sideC)/2*((sideA+sideB+sideC)/2-sideA)*((sideA+sideB+sideC)/2-sideB)*((sideA+sideB+sideC)/2-sideC));
	}
	@Override
	public void printResult() {
		System.out.println("-------Triangle-----------");
		System.out.println("side A: "+ getSideA());
		System.out.println("side B: "+ getSideB());
		System.out.println("side C: "+ getSideC());
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+ getPerimeter());
	}
	

}
