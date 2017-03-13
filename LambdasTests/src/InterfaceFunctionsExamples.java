import java.util.ArrayList;
import java.util.List;

public class InterfaceFunctionsExamples {
	public static void main(String[] args) {
		List<Person> population = generatePopulation(500);
		
		//Testing filter and count
		long countFemales = population.stream().filter(person -> person.getGender().equals("F")).count();
		long countName12 = population.stream().filter(person -> person.getName().contains("12")).count();
		System.out.println(countFemales);
		System.out.println(countName12);
	}
	
	private static List<Person> generatePopulation(int populationSize){
		List<Person> population = new ArrayList<>();
		for (int i = 0; i < populationSize; i++){
			population.add(Person.generateRandomPerson());
		}
		return population;
	}
}
