package OCAOverload;

public class Wolf extends Canine {
	public int age = 5;
	public double getAverageWeight(){
		return super.getAverageWeight() + 20;
	}
	
	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		
		Wolf wolf = new Wolf();
		wolf.ageDisplay();

	}
	
	public void ageDisplay(){

		//Try to access child's instance variable
		System.out.println("Child's age: " + this.age);
		
		//Try to access parent's instance variable
		System.out.println("Parent's age: " + super.age);
		
		//Try To acces "grandpa's" instance variable 
		//Does not compile, it's not possible to access grandpa's age (variable with same name)
		//System.out.println("Grandpa's age: " + super.super.age);
		
		//Try To acces "grandpa's" instance variable with different name (using this, inherited variable)
		System.out.println(this.name);
	}
}
