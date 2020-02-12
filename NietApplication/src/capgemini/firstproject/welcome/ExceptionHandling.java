package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10,b=5;
		InputStreamReader isr;
		BufferedReader br;
		
		
		
			
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			
			String e;
			try {
				e = br.readLine();
				int p=Integer.parseInt(e);
				if(p>0) {
					System.out.print(p);
				}
				else {
					try {
						throw new MyException("msg");
					} catch (MyException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
	
		
		
		

	}

}
