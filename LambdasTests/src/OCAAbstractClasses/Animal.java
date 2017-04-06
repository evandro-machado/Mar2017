package OCAAbstractClasses;

public abstract class Animal {
	protected int age = 20;
	
	public void eat(){
		System.out.println("Animal is eating");
		System.out.println(age);
	}
	
	public abstract String getName();
}
