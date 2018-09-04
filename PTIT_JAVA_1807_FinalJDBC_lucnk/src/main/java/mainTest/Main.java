/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 27, 2018.
	* @version 1.0
	*/

package mainTest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.MakerDao;
import entities.Car;
import entities.Maker;
import function.Function;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Scanner sc = new Scanner(System.in);

			Function userDao = new Function();
			System.out.println("===================================================================");

			while (true) {
				System.out.println("==================================MENU====================================");
				System.out.println("==========================================================================");
				System.out.println("1. insert a car into database");
				System.out.println("2. delete 'ford' maker from database");
				System.out.println("3. update price of the cars. if mileage > 100, 5% discount");
				System.out.println("4. Find maker(s) that dad the most expensive car");
				System.out.println("5. Return number of models, that were made by 'Toyota' in 2015");
				System.out.println("6. Find maker(s), that didn't make any new car in 2015");
				System.out.println("7. between the average of price of Toyota's cars in 2015 and the average of price of Toyota's cars in 2016");
				System.out.println("8. Exit");
				System.out.println("==========================================================================");
				System.out.print("Your choice: ");

				String s = sc.nextLine();
				int choose;
				while (true) {
					try {
						choose = Integer.parseInt(s);
						if (choose > 0 && choose < 8) {
							break;
						}
					} catch (NullPointerException e) {

						System.out.println("Please again: ");
						s = sc.nextLine();

					}
				}

				switch (choose) {
				case 1:

					Car ca = new Car("Green", 2015, "0.5f", "140", 130);
					if (userDao.insertCar(ca)) {
						System.out.println("Insert successfully!");
					} else {
						System.out.println("Insert fail!");
					}
					break;
				case 2:
					Function.deleteMaker();

					break;
				case 3:
					Function.updateCar();

					break;
				case 4:
					for (Maker maker1 : Function.findMakerMaxPrice()) {
						System.out.println("Name: " + maker1.getMakerName());
					}
					break;
				case 5:
					for (Car car : Function.findCar()) {
						System.out.println("Model 2015 in Toyota: " + car.getCarModel());
					}
					break;
				case 6:

					for (Maker maker : Function.findMaker()) {
						System.out.println("Maker did not new car in 2015: " + maker.getMakerName());
					}

				case 7:

					for (Car car1 : Function.findCar()) {
						String a= car1.getPrice();
						System.out.println("AVG: " + car1.getPrice() + ", " + "Year: " + car1.getModelYear());
					}

				}
			}
	}
}
