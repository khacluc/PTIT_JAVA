/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 19, 2018.
	* @version 1.0
	*/
package Calculator;

public class Rectangle extends Shape{
	private double width;
	private double length;	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}
	@Override
	public double getArea() {
		return length*width;
	}
	@Override
	public void printResult() {
		System.out.println("-------Rectangle-----------");
		System.out.println("width: "+ getWidth());
		System.out.println("length: "+ getLength());
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+ getPerimeter());
	}
	

}
