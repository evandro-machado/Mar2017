package OCAHideStaticMethod;

public class Panda extends Bear {
	public static void eat(){
		//super.eat(); // Doesn't find parent's method and doesn't compile.
		System.out.println("Panda bear is chewing.");
	}
	
//	public void eat(){
//		System.out.println();
//	}   Doesn't compile because it doesn't have static on method's declaration

	
	public void eat(String food){ //Compiles because it has a different method signature.
		System.out.println("Panda bear is eating " + food);
	}
	
	public static void main(String[] args) {
		Panda.eat();
	}
}
