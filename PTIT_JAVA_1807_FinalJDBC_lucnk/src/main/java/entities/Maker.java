/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 31, 2018.
	* @version 1.0
	*/

package entities;

public class Maker {
	private int makerId;
	private String makerName;
	private String country;
	
	public Maker() {
		super();
	}
	
	
	public Maker(int makerId, String makerName, String country) {
		super();
		this.makerId = makerId;
		this.makerName = makerName;
		this.country = country;
	}

	

	public int getMakerId() {
		return makerId;
	}


	public void setMakerId(int makerId) {
		this.makerId = makerId;
	}


	public String getMakerName() {
		return makerName;
	}


	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return makerId + "\t\t" + makerName + "\t\t" + country ;
	}
	 

}
