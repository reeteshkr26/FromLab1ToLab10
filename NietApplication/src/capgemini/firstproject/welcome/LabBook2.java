package capgemini.firstproject.welcome;

public class LabBook2 {
	int number=32;

	public static void main(String[] args) {
		LabBook2 mObject=new LabBook2();
		if(mObject.checkNumber(mObject.number))
			System.out.println(mObject.number +" is said to be an increasing order");
		else
			System.out.println(mObject.number +" is not said to be an increasing order");
		
		if(mObject.checkNumberPow(mObject.number))
			System.out.println(mObject.number +" is power of 2");
		else
			System.out.println(mObject.number +" is not power of 2");
		

	}
	public boolean checkNumber(int number) {
		String s=Integer.toString(number);
		int f=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				f=1;
				break;
			}
		}
		if(f==1) 
			return false;
		else
			return true;
	}
	public boolean checkNumberPow(int number) {
		int f=0;
		while(number!=1) {
			
			if(number%2!=0) {
				f=1;
				break;
			}
			
			number=number/2;
			
		}
		
		if(f==1) 
			return false;
		
		else
			return true;
	}

}
