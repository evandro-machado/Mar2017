import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
		
		//Testing min and max
		Optional<Person> youngestPerson = population.stream().min((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		Optional<Person> oldestPerson = population.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		System.out.println();
		System.out.println("Youngest person's name: " + youngestPerson.get().getName() + " age: " + youngestPerson.get().getAge());
		System.out.println("Oldest person's name: " + oldestPerson.get().getName() + " age: " + oldestPerson.get().getAge());		
	
		//Testing Collectors methods
		Double average = population.stream().collect(Collectors.averagingDouble(person -> person.getAge()));
		System.out.println("The average is: " + average);
	}
	
	private static List<Person> generatePopulation(int populationSize){
		List<Person> population = new ArrayList<>();
		for (int i = 0; i < populationSize; i++){
			population.add(Person.generateRandomPerson());
		}
		return population;
	}
}
