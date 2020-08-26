package day40_accessmodifiers_final;

public class MethodHidingTest {

	public static void main(String[] args) {}

}

class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
	
}
