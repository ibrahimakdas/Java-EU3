package day33_ClassObjects_Constructors;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 17, 'M', 2019, "Java", "Cybertek");
		Student s2 = new Student("Mary", 25, 'F', 2017, "JS", "Cybertek");
		
		s1.attendLab();
		s2.attendLecture();
				

	}

}
