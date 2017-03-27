package OCAHideStaticMethod;

public class Marsupial {
	public static boolean isBiped(){
		return false;
	}
	
	public void getMarsupialHiddenDescription(){
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
	
	public void getMarsupialOverridenDescription(){
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}
