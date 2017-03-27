package OCAHideStaticMethod;

public class Kangaroo extends Marsupial {
	public static boolean isBiped() {
		return true;
	}
	
	public void getKangarooHiddenDescription(){
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	public void getKangarooOverridenDescription(){
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		System.out.println("Testing hidden methods:");
		
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialHiddenDescription();
		joey.getKangarooHiddenDescription();
		System.out.println("Testing overriden methods:");
		joey.getMarsupialOverridenDescription();
		joey.getKangarooOverridenDescription();
		
	}
}
