package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidateAge {
	int age;
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		
		ValidateAge vObject=new ValidateAge();
		vObject.isr=new InputStreamReader(System.in);
		vObject.buff=new BufferedReader(vObject.isr);
		
		vObject.checkAge();
	}

	private void checkAge() {
		try {
			System.out.print("Enter your Age: ");
			age=Integer.parseInt(buff.readLine());
			
			if(age<15) {
				throw new MyException("Invalid Age of a person..");
			}
			else {
				System.out.print("Age of a person is "+ age);
			}
		} catch (IOException | MyException e) {
			
			//e.printStackTrace();
		}
		
	}

}
