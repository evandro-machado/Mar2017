package OCAInterfaces;

public class TestWarmBlood implements IsWarmBlood {
	public boolean hasScales(){
		return false;
	}
	
	public static void main(String[] args) {
		TestWarmBlood test = new TestWarmBlood();
		System.out.println(test.hasScales());
		System.out.println(test.getTemperature());
		System.out.println(TestWarmBlood.NUMBER_TEST);
	}
}
