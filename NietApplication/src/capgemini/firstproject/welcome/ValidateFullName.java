package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidateFullName {
	String firstName;
	String lastName;
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		ValidateFullName vObject=new ValidateFullName();
		vObject.isr=new InputStreamReader(System.in);
		vObject.buff=new BufferedReader(vObject.isr);
		
		vObject.checkFullName();	

	}
	public void checkFullName() {
		
		try {
			System.out.print("Enter your First Name: ");
			firstName=buff.readLine();
			System.out.print("Enter your Last Name: ");
			lastName=buff.readLine();
			if(firstName.equals(" ") || lastName.equals(" ")) {
				throw new MyException("Invalid Full Name");
			}
		} catch (IOException | MyException e) {
			
			//e.printStackTrace();
		}
	}

}
