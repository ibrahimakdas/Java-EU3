package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.plus(2, 4));
		
		System.out.println(Calculator.plus(2, 4));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('4'));
		
		

	}

}
