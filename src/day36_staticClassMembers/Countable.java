package day36_staticClassMembers;

public class Countable {
	
	static int instanceCount;  //instance vriable
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}
