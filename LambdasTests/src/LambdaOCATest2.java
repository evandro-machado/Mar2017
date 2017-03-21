interface Climb {
	boolean isTooHigh(int height, int limit);
}

public class LambdaOCATest2 {
	public static void main(String[] args) {
		check((h, l) -> h > l, 5);
		check((h, l) -> h > l, 11);
	}
	
	private static void check(Climb climb, int height){
		if(climb.isTooHigh(height, 10)){
			System.out.println("Too high!");
		} else{
			System.out.println("Ok!");
		}
	}
}
