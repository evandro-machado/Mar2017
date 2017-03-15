import java.util.Random;

public class Person {
	private String name;
	private String gender;
	private Integer age;
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public static Person generateRandomPerson(){
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(20);
		String gender = randomNumber > 5 ? "F" : "M";
		int age = randomNumber;
		String name = gender + age;
		
		return new Person(name, gender, age);
	}
}
