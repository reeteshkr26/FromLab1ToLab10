package capgemini.firstproject.welcome;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumAllIntegers {
	String str;
	InputStreamReader isr;
	BufferedReader buff;

	public static void main(String[] args) {
		
		SumAllIntegers mObject=new SumAllIntegers();
		
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
	
		
		
		mObject.sumOfIntegers();
	}

	public void sumOfIntegers() {
		int sum=0,i=0;
		try {
			str=buff.readLine();
			StringTokenizer s=new StringTokenizer(str," ");
			String in[]=str.split(" ");
			System.out.println("All inetegrs: ");
			while(s.hasMoreTokens()) {
				System.out.println(in[i]);
				sum=sum+Integer.parseInt(s.nextToken());
				i++;
			
			}
			System.out.print("Sum of all Integers: "+ sum);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
