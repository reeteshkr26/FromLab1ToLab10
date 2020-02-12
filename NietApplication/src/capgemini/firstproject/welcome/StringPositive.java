package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPositive {
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		
		StringPositive mObject=new StringPositive();
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		System.out.print(mObject.checkStringPositive());
		

	}
	public boolean checkStringPositive() {
		String str;
		boolean res=false;
		try {
			 str=buff.readLine();
			 for(int i=0;i<str.length()-1;i++) {
				 if(str.charAt(i)>str.charAt(i+1)) {
					 res=false;
					 break;
				 }
				 else {
					 res=true;
				 }
			 }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
