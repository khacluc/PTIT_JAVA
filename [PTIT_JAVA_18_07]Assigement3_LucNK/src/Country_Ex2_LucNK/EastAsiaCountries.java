/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 11, 2018.
	* @version 1.0
	*/
package Country_Ex2_LucNK;

public class EastAsiaCountries extends Country{
	private String terrain;

	public EastAsiaCountries(String code, String name, String total, String terrain) {
		super(code, name, total);
		this.terrain = terrain;
	}
	public void display() {
		System.out.println(code + "    " + name + "    " + total + "    " + terrain);
		
	}
}
