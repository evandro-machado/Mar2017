package OCAAbstractClasses;

public class Lion extends BigCat {
	protected int age = 10;
	
	public void getAge(){
		System.out.println(age);
	}
	
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}

	public String getName() {
		return "Lion";
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		lion.getAge();
	}
}
