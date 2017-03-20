import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaOCATest {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		System.out.println("Animals that can hop:");
		print(animals, a -> a.canHop());
		System.out.println("Animals that can swim:");
		print(animals, a-> a.canSwim());
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker){
		for(Animal animal : animals){
			if(checker.test(animal)){
				System.out.print(animal + " ");
			}
		}
		System.out.println();
	}
}
