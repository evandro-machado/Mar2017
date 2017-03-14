import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceFunctionsExamples {
	public static void main(String[] args) {
		List<Person> population = generatePopulation(500);
		
		//Testing filter and count
		long countFemales = population.stream().filter(person -> person.getGender().equals("F")).count();
		long countName12 = population.stream().filter(person -> person.getName().contains("12")).count();
		System.out.println(countFemales);
		System.out.println(countName12);
		
		
		//Testing collect method
		List<Person> womenList = population.stream().filter(p -> p.getGender().equals("F")).collect(Collectors.toList());
		womenList.forEach(woman -> System.out.print(woman.getName() + "   "));
		
		//Testing map method
		List<String> womenNameLowerCaseList = population
				.stream()
				.filter(p -> p.getGender().equals("F"))
				.map(woman -> woman.getName().toLowerCase())
				.collect(Collectors.toList());
		System.out.println();
		womenNameLowerCaseList.forEach(womanName -> System.out.print(womanName + "   "));
		
	}
	
	private static List<Person> generatePopulation(int populationSize){
		List<Person> population = new ArrayList<>();
		for (int i = 0; i < populationSize; i++){
			population.add(Person.generateRandomPerson());
		}
		return population;
	}
}
