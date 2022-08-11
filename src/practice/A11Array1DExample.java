package practice;

public class A11Array1DExample {

	public static void main(String[] args) {
		int TNPopulation = 789;
		int APPopulation = 645;
		int MHPopulation = 578;
		int GJPopulation = 698;
		int HRPopulation = 367;

		int[] countryPopulation = new int[5];

		System.out.println("The Country Population is :" + countryPopulation);

		for (int i = 0; i < countryPopulation.length; i++) {
			System.out.println("The Country Population is :" + countryPopulation[i]);
		}
		// update operation
		countryPopulation[0] = 789;
		countryPopulation[1] = 645;
		countryPopulation[2] = 578;
		countryPopulation[3] = 698;
		countryPopulation[4] = 367;

		for (int i = 0; i < countryPopulation.length; i++) {
			System.out.println("The Country Population is :" + countryPopulation[i]);
		}

		// for-each loop also can be used
		// explore enhanced for loop or for each loop
	}
}
