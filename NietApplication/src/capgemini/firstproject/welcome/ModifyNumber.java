package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModifyNumber {
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		ModifyNumber mObject=new ModifyNumber();
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		try {
			int num=Integer.parseInt(mObject.buff.readLine());
			System.out.print(mObject.modifyNumber(num));
		} catch (NumberFormatException | IOException e) {
			
			e.printStackTrace();
		}

	}

	public int modifyNumber(int num) {
		StringBuffer result=new StringBuffer();
		String s=String.valueOf(num);
		
		for(int i=0;i<s.length()-1;i++) {
			result.append(String.valueOf((Math.abs(Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i+1))))));
			
		}
		
		result.append(Integer.parseInt(String.valueOf(Math.abs(Character.getNumericValue(s.charAt(s.length()-1))-Character.getNumericValue(s.charAt(0))))));
		
		return Integer.parseInt(result.toString());
	}

}
