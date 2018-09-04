/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 31, 2018.
	* @version 1.0
	*/
package entities;

public class Car {
	private int carId;
	private String carModel;
	private int modelYear;
	private String price;
	private String mileage;
	private int makerId;
	
	public Car() {
		super();
	}

	public Car(int carId, String carModel, int modelYear, String price, String mileage, int makerId) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.modelYear = modelYear;
		this.price = price;
		this.mileage = mileage;
		this.makerId = makerId;
	}

	public Car( String carModel, int modelYear, String price, String mileage, int makerId) {
		super();
//		this.carId = carId;
		this.carModel = carModel;
		this.modelYear = modelYear;
		this.price = price;
		this.mileage = mileage;
		this.makerId = makerId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public int getMakerId() {
		return makerId;
	}

	public void setMakerId(int makerId) {
		this.makerId = makerId;
	}
	

	@Override
	public String toString() {
		return carId + "\t\t" + carModel + "\t\t" + modelYear + "\t\t"+ price + "\t\t" + mileage + "\t\t" + makerId;
	}
	

}
