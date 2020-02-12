package capgemini.firstproject.welcome;

import java.util.Scanner;

public class LabThirdExTwo {
	Scanner sc=new Scanner(System.in);
	String str[];
	public static void main(String []args) {
		LabThirdExTwo mObject=new LabThirdExTwo();
		mObject.takeStringArray();
		mObject.showStringArray(mObject.str);
		
		
	}
	private void showStringArray(String[] str2) {
		// TODO Auto-generated method stub
		int n=str2.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(str2[i].compareToIgnoreCase(str2[j])>0) {
					String temp=str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
			}	
		}
		if(n%2==1) {
			int count=0;
			for(int i=0;i<n;i++) {
				if(count<(n/2+1)) {
					str2[i]=str2[i].toUpperCase();
				}
				else {
					str2[i]=str2[i].toLowerCase();
				}
		    	count++;
			}
		}
		else {
			int count=0;
			for(int i=0;i<n;i++) {
				if(count<(n/2)) {
					str2[i]=str2[i].toUpperCase();
				}
				else {
					str2[i]=str2[i].toLowerCase();
				}
		    	count++;
			}
		}
		for (String s:str2)
			System.out.print(s + " ");
			
		
	}
	private void takeStringArray() {
		System.out.print("Enter the size of String array:");
		int n=sc.nextInt();
		str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		
	}

}
