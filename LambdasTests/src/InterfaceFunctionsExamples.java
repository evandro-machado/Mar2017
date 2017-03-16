import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
		
		//Testing Collectors.partitioningBy()
		Map<Boolean, List<Person>> result = population.stream().collect(Collectors.partitioningBy(p -> p.getGender().equals("M")));
		System.out.println("All men: ");
		List<Person> menList = result.get(Boolean.TRUE);
		menList.forEach(man -> System.out.println("Name: " + man.getName() + " Gender: " + man.getGender()));
		System.out.println("All women: ");
		List<Person> womenListReturn = result.get(Boolean.FALSE);
		womenListReturn.forEach(woman -> System.out.println("Name: " + woman.getName() + " Gender: " + woman.getGender()));
		
		//Testing groupingBy
		Map<Integer, List<Person>> groupResult = population.stream().collect(Collectors.groupingBy(p -> p.getAge()));
		List<List<Person>> groupedPopulationList = new ArrayList<>();
		groupResult.forEach((k, v) -> groupedPopulationList.add(v));
		Optional<List<Person>> sameAgeMaxPopulation = groupedPopulationList.stream().max((list1, list2) -> Integer.valueOf(list1.size()).compareTo(Integer.valueOf(list2.size())));
		sameAgeMaxPopulation.get().forEach(person -> System.out.println(person.getAge()));
		System.out.println("Max population of the same age is: " + sameAgeMaxPopulation.get().size());
		
		//To use palallelism it is necessary to write, instead of stream(), parallelStream()
	}
	
	private static List<Person> generatePopulation(int populationSize){
		List<Person> population = new ArrayList<>();
		for (int i = 0; i < populationSize; i++){
			population.add(Person.generateRandomPerson());
		}
		return population;
	}
}
