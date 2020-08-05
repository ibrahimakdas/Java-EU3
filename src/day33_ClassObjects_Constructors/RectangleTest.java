package day33_ClassObjects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		
		r1.length=5.2;
		r1.width=4.8;
		r1.x = 5;
		r1.y=10;
		r1.str="rec";
		
		
		
		Rectangle r2 = new Rectangle();
		r2.length=3.5;
		r2.width=2.7;
		
		
		System.out.println(r1.length); //who is giving me this default values?
		System.out.println(r2.width);

	}

}
