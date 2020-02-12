package capgemini.labbook.lambdaexpression;

import java.util.Scanner;

interface MyInterface{
	public boolean authenticate(String uName, String password);
	
}

public class Exercise3 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyInterface m=(uName,password)->{
				if(uName.equals("abcd@1234") && password.equals("12345")) {
					return true;
				}
				else {
					return false;
				}
				
		};
		System.out.print(m.authenticate(sc.next(), sc.next()));
		sc.close();
	
		

	}

}
