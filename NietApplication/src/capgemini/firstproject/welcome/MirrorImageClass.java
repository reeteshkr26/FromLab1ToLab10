package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorImageClass {
	StringBuffer actualImage;
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		MirrorImageClass mObject=new MirrorImageClass();
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		mObject.actualImage=new StringBuffer();
		try {
			System.out.print("Enter image: ");
			String s=mObject.buff.readLine();
			
			System.out.print(s+"|"+mObject.findMirrorImage(s));
			
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		

	}

	public String findMirrorImage(String s) {
		
	
			actualImage.append(s);
			return actualImage.reverse().toString();
			
		
	
		
	}

}
