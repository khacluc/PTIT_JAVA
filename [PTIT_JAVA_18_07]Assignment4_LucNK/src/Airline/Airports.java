/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 13, 2018.
	* @version 1.0
	*/
package Airline;

import java.util.List;

public class Airports {
	private String ID, name;
	private double runwaySize, maxfixedWingParkingPlace, maxRotatedWingParkingPlace;
	private List<Helicopters> listOfFixedWingAirplaneID;
	private List<Fixedwing> listOfHelicoptersID;
	public Airports(String iD, String name, double runwaySize, double maxfixedWingParkingPlace,
			double maxRotatedWingParkingPlace, List<Helicopters> listOfFixedWingAirplaneID,
			List<Fixedwing> listOfHelicoptersID) {
		super();
		ID = iD;
		this.name = name;
		this.runwaySize = runwaySize;
		this.maxfixedWingParkingPlace = maxfixedWingParkingPlace;
		this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
		this.listOfFixedWingAirplaneID = listOfFixedWingAirplaneID;
		this.listOfHelicoptersID = listOfHelicoptersID;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRunwaySize() {
		return runwaySize;
	}
	public void setRunwaySize(double runwaySize) {
		this.runwaySize = runwaySize;
	}
	public double getMaxfixedWingParkingPlace() {
		return maxfixedWingParkingPlace;
	}
	public void setMaxfixedWingParkingPlace(double maxfixedWingParkingPlace) {
		this.maxfixedWingParkingPlace = maxfixedWingParkingPlace;
	}
	public double getMaxRotatedWingParkingPlace() {
		return maxRotatedWingParkingPlace;
	}
	public void setMaxRotatedWingParkingPlace(double maxRotatedWingParkingPlace) {
		this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
	}
	public List<Helicopters> getListOfFixedWingAirplaneID() {
		return listOfFixedWingAirplaneID;
	}
	public void setListOfFixedWingAirplaneID(List<Helicopters> listOfFixedWingAirplaneID) {
		this.listOfFixedWingAirplaneID = listOfFixedWingAirplaneID;
	}
	public List<Fixedwing> getListOfHelicoptersID() {
		return listOfHelicoptersID;
	}
	public void setListOfHelicoptersID(List<Fixedwing> listOfHelicoptersID) {
		this.listOfHelicoptersID = listOfHelicoptersID;
	}
	
	

}
