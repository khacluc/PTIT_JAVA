/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 19, 2018.
	* @version 1.0
	*/
package Calculator;

public class Cricle extends Shape{
	private double radius;

	public Cricle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void printResult() {
		System.out.println("----------Circle-----------");
		System.out.println("radius: "+ getRadius());
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+ getPerimeter());
	}
	

}
