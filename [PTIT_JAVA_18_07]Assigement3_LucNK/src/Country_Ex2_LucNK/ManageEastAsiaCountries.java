/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 11, 2018.
	* @version 1.0
	*/

package Country_Ex2_LucNK;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ManageEastAsiaCountries {
	Scanner s = new Scanner(System.in);
		private List<EastAsiaCountries> listCountry;

		public ManageEastAsiaCountries() {
			super();
			this.listCountry = new ArrayList<>();
		}

		public void addCountryInformation(EastAsiaCountries country) throws Exception {
			if (listCountry.size() == 11)
				throw new Exception("1. Input the information of 11 countries in East Asia");
			for (Country c : listCountry) {
				if (country.getCode().equals(c.getCode()))
					throw new Exception("Data information of 11 countries:");
			}
			listCountry.add(country);
		}

		public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
			if (listCountry.size() == 0)
				throw new Exception("Not imformation countries.");
			return listCountry.get(listCountry.size() - 1);
		}

		public List<EastAsiaCountries> searchInformationByName(String name) throws Exception {
			List<EastAsiaCountries> list = new ArrayList<>();
			for (EastAsiaCountries country : listCountry) {
				if (country.getName().equals(name))
					list.add(country);
			}

			if (list.size() == 0)
				throw new Exception("Not search imformation countries.");
			else
				return list;
		}

		public List<EastAsiaCountries> sortInformationByAscendingOrder() {
			listCountry.sort((first, second) -> {
				return first.getName().compareTo(second.getName());
			});
			return listCountry;

		}
}
