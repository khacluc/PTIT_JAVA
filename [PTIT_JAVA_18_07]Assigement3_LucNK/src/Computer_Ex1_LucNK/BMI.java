/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 10, 2018.
	* @version 1.0
	*/
package Computer_Ex1_LucNK;

public class BMI {
	private double weight, height;
	private double bmiNum;
	private String bmistatus;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public BMI(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
		
		this.bmiNum = weight / (weight* height);
		if(this.bmiNum < 20) {
			this.bmistatus = "Standard";
		}
			else if(this.bmiNum >= 20 && this.bmiNum <=40){
				this.bmistatus= "fat";
			}
			else if(this.bmiNum > 40) {
				this.bmistatus= "very fat";
			}
		}
	public void diplay() {
		System.out.println("BMI Number: "+ this.bmiNum);
		System.out.println("BMI status: "+ this.bmistatus);
	}

}
