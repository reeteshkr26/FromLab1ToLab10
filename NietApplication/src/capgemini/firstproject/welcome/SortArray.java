package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArray {
	int arr[];
	InputStreamReader isr;
	BufferedReader buff;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray mObject=new SortArray();
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		mObject.takeArray(mObject.buff);
		
		mObject.getSorted(mObject.arr);

	}
	public void getSorted(int[] arr2) {
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
		Arrays.parallelSort(arr2);
		System.out.println("Arrays in sorted order");
		for(int a:arr2)
			System.out.print(a + " ");		
		
	}
	public void takeArray(BufferedReader buff) {
		// TODO Auto-generated method stub
		int n;
		try {
			System.out.print("Enter the size of an Array:");
			n = Integer.parseInt(buff.readLine());
			arr=new int[n];
			
			System.out.println("Enter the numbers in array of n size:");
			for(int i=0;i<n;i++)
					arr[i]=Integer.parseInt(buff.readLine());
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			try {
				buff.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//e.printStackTrace();
		}
		
	
				
	}

}
