
public class Calculator {
	public static Double calculate(Double operator1, Double operator2, DoubleOperator operator){
		return operator.apply(operator1, operator2);
	}
}
