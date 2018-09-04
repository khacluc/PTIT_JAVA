/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 12, 2018.
	* @version 1.0
	*/
package Country_Ex2_LucNK;

import java.util.List;
import java.util.Scanner;

public class CountryTest {
	public static void main(String[] args) {
		ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
		try (Scanner scanner = new Scanner(System.in)) {
			int choose = 0;
			do {
				System.out.println("========================================");
				System.out.println("1. Input the information of 11 countries in East Asia");
				System.out.println("2. Display the information of country you've just input");
				System.out.println("3. Search the information of country by user-entered name");
				System.out.println("4. Display the information of countries sorted name in ascending order");
				System.out.println("5. Exit");
				System.out.print(" Please choose: ");
				choose = Integer.parseInt(scanner.nextLine());

				switch (choose) {
				case 0:
					break;
				case 1:
					System.out.println("Enter code of country: ");
					String countryCode = scanner.nextLine();
					System.out.println("Enter name of country: ");
					String countryName = scanner.nextLine();
					System.out.println("Enter total area: ");
					String totalArea = scanner.nextLine();
					System.out.println("Enter terrain of country: ");
					String terrainCountry = scanner.nextLine();
					EastAsiaCountries country = new EastAsiaCountries(countryCode, countryName, totalArea,
							terrainCountry);
					try {
						manager.addCountryInformation(country);
					} catch (Exception e) {
						System.out.println(e);
					}

					break;
				case 2:
					System.out.println("ID    " + "Name    " + "Total Area    " + "Terrain");
					try {
						EastAsiaCountries eastAsiaCountry = manager.getRecentlyEnteredInformation();
						eastAsiaCountry.display();
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				case 3:
					System.out.print("Nhap ten nuoc: ");
					String name = scanner.nextLine();
					try {
						List<EastAsiaCountries> countries = manager.searchInformationByName(name);
						System.out.println("ID    " + "Name    " + "Total Area    " + "Terrain");
						for(EastAsiaCountries asiaCountry: countries) {
							asiaCountry.display();
						}
					} catch (Exception e) {
						System.out.println(e);
					}

					break;
				case 4:
					List<EastAsiaCountries> listCountries = manager.sortInformationByAscendingOrder();
					System.out.println("ID    " + "Name    " + "Total Area    " + "Terrain");
					for (EastAsiaCountries temp : listCountries) {
						temp.display();
					}
					break;
				default:
					System.out.println("Please choose:");
					break;
				}

			} while (choose != 0);
		}

	}

}
