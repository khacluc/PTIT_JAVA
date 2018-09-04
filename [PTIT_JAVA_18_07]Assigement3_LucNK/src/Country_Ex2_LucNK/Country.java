/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 11, 2018.
	* @version 1.0
	*/

package Country_Ex2_LucNK;

public class Country {
	protected String code;
	protected String name;
	protected String total;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Country(String code, String name, String total) {
		super();
		this.code = code;
		this.name = name;
		this.total = total;
	}

	public Country() {
		super();
	}

	public void display() {
		System.out.println("Country Code: " + code);
		System.out.println("Country Name: " + name);
		System.out.println("Total Area: " + total);
	}
}
