package day45_exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(4/0);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Happened");
			
		}catch(NullPointerException e) {
			
			System.out.println("NullpointerException Happened");
			
		}catch(RuntimeException e) {
			
			e.printStackTrace();
		}
		
	}
}
