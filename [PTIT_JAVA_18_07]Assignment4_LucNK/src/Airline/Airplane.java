/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 13, 2018.
	* @version 1.0
	*/

package Airline;

public class Airplane {
	private String ID, model;
	private double cruiseSpeed, emptyWeight, maxTakeoffWeight;

	public Airplane(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeoffWeight) {
		super();
		ID = iD;
		this.model = model;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeoffWeight = maxTakeoffWeight;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(double cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public double getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public double getMaxTakeoffWeight() {
		return maxTakeoffWeight;
	}

	public void setMaxTakeoffWeight(double maxTakeoffWeight) {
		this.maxTakeoffWeight = maxTakeoffWeight;
	}

}
