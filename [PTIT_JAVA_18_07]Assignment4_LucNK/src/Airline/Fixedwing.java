/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 13, 2018.
	* @version 1.0
	*/

package Airline;

public class Fixedwing extends Airplane {
	private String planeType;
	private double minNeededRunwaySize;

	public Fixedwing(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeoffWeight) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
	}

	public Fixedwing(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeoffWeight,
			String planeType, double minNeededRunwaySize) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
		this.planeType = planeType;
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public double getMinNeededRunwaySize() {
		return minNeededRunwaySize;
	}

	public void setMinNeededRunwaySize(double minNeededRunwaySize) {
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

}
