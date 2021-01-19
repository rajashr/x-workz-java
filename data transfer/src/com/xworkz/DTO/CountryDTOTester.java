package com.xworkz.DTO;

import java.util.Arrays;

public class CountryDTOTester {

	public static void main(String[] args) {
		// initialised properties using setter method
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setContinent("India is subContinent of Asia");
		System.out.println(countryDTO.getContinent());
		countryDTO.setName("INDIA");
		System.out.println(countryDTO.getName());
		countryDTO.setPopulation(1380004385l);
		System.out.println(countryDTO.getPopulation());
		countryDTO.setPresident("Ram Nath Kovind");
		System.out.println(countryDTO.getPresident());
		countryDTO.setPrimeMinister("NRENDRA MODI");
		System.out.println(countryDTO.getPrimeMinister());
		System.out.println(countryDTO.getLanguages());
		System.out.println(countryDTO.getStates());
		String[] language = new String[3];
		language[0] = "Kannada";
		language[1] = "Hindi";
		language[2] = "Telugu";
		countryDTO.setLanguages(language);
		System.out.println(Arrays.toString(language));
		String[] state = new String[5];
		state[0] = "Karnataka";
		state[1] = "Goa";
		state[2] = "Arunachal pradesh";
		state[3] = "Andhra pradesh";
		System.out.println(Arrays.toString(state));

		// initialising properties using constructor
		CountryDTO countryDTO1 = new CountryDTO("Russia", "Europe and Asia");
		System.out.println(countryDTO1.getContinent());
		System.out.println(countryDTO1.getName());
		countryDTO1.setPopulation(145934462l);
		System.out.println(countryDTO1.getPopulation());
		countryDTO1.setPresident("Vladimir Putin");
		System.out.println(countryDTO1.getPresident());
		countryDTO1.setPrimeMinister("Mikhail Mishustin");
		System.out.println(countryDTO1.getPrimeMinister());
		String[] language1 = new String[2];
		language1[0] = "Russian";
		language1[1] = "German";
		countryDTO1.setLanguages(language1);
		System.out.println(Arrays.toString(language1));
		String[] state1 = new String[2];
		state1[0] = "Altai";
		state1[1] = "Komi";
		countryDTO1.setStates(state1);
		System.out.println(Arrays.toString(state1));

		// initialising the properties using constructor

		CountryDTO countryDTO2 = new CountryDTO(state, 1380004385l, "Narendra modi", "Ram Nath Kovind");
		System.out.println(Arrays.toString(countryDTO2.getStates()));
		System.out.println(countryDTO2.getPopulation());
		System.out.println(countryDTO2.getPresident());
		System.out.println(countryDTO2.getPrimeMinister());
		countryDTO2.setName("India");
		System.out.println(countryDTO2.getName());
		String[] language2 = new String[5];
		language2[0] = "Malayalam";
		language2[1] = "Konkani";
		language2[2] = "Bodo";
		language2[3] = "Tamil";
		language2[4] = "Bangla";
		countryDTO2.setLanguages(language2);
		System.out.println(Arrays.toString(language2));

		// initialising using parameterised constructor
		CountryDTO countryDTO3 = new CountryDTO("Russian", "Europe", state1, 145934462l, "Mikhail Mishustin");
		System.out.println(countryDTO3.getName());
		System.out.println(countryDTO3.getPopulation());
		System.out.println(countryDTO3.getPrimeMinister());
		System.out.println(countryDTO3.getContinent());
		System.out.println(Arrays.toString(countryDTO3.getStates()));
		String[] language3 = new String[5];
		language3[0] = "Chuvash";
		language3[1] = "Mordvin";
		language3[2] = "Chechen";
		language3[3] = "Tatar";
		language3[4] = "Ukrainian";
		countryDTO3.setLanguages(language3);
		System.out.println(Arrays.toString(countryDTO3.getLanguages()));

		// lets initialise all the properties in single constructor
		CountryDTO countryDTO4 = new CountryDTO("India", "subcontinent of Asia", state, 1380004385l, "Narendra Modi",
				"Ram Nath Kovind", language);
		System.out.println(countryDTO4.getContinent());
		System.out.println(countryDTO4.getName());
		System.out.println(countryDTO4.getPopulation());
		System.out.println(countryDTO4.getPresident());
		System.out.println(countryDTO4.getPrimeMinister());
		System.out.println(Arrays.toString(state));
		System.out.println(Arrays.toString(countryDTO4.getLanguages()));

	}

}
