package OCAInterfaces;

public abstract interface IsWarmBlood {
	public static final int NUMBER_TEST = 100;
	public abstract boolean hasScales();
	public default double getTemperature(){
		return 10.0;
	}
}
