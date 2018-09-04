/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 13, 2018.
	* @version 1.0
	*/
package Airline;

public class Helicopters extends Airplane{
	private double range;
	
	

	public Helicopters(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeoffWeight) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
		
	}

	public Helicopters(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeoffWeight,
			double range) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
		this.range = range;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}
	
	

}
