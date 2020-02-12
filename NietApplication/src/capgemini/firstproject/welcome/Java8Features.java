package capgemini.firstproject.welcome;

public interface Java8Features {
	
	default void show() {
		System.out.println("This is new features..");
	}
	static void display() {
		System.out.println("This is also a new feature with java 8..");
	}
	
	/*public static void main(String args[]) {
		Java8Features.display();
		
	}*/

}
