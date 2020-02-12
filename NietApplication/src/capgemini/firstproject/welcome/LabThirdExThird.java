package capgemini.firstproject.welcome;

import java.util.Scanner;

public class LabThirdExThird {
	int arr[];
	Scanner sc=new Scanner(System.in);
	public static void main() {
		LabThirdExThird mObject=new LabThirdExThird();
		mObject.takeArray();
		mObject.sc.close();
		mObject.getSorted(mObject.arr);
	}
	private void getSorted(int[] arr2) {
		// TODO Auto-generated method stub
		int j=0;
		for (int a:arr2) {
			int x=0;
			while(a!=0) {
				int y=a%10;
				x=10*x+y;
				a=a/10;
			}
			arr2[j]=x;
			j++;
		}
		for(int a:arr2)
			System.out.print(a + " ");		
		
	}
	private void takeArray() {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of an Array:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the numbers in array of n size:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();	
	}

}
