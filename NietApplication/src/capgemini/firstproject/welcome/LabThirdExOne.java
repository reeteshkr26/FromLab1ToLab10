/*
 * 
 * @Author Capgemini
 * @Developer Reetesh Kumar Mandal
 * 
 */
package capgemini.firstproject.welcome;

import java.util.Arrays;
import java.util.Scanner;

public class LabThirdExOne {
	int arr[];
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		LabThirdExOne mObject=new LabThirdExOne();
		mObject.takeArray(mObject);
		System.out.print("Second Smallest Element: "+ mObject.getSecondSmallest(mObject.arr));
		
		
	}
	public void takeArray(LabThirdExOne object) {
		int n=object.sc.nextInt();
		object.arr=new int[n];
		for(int i=0;i<n;i++) {
			object.arr[i]=object.sc.nextInt();
		}
	}
	public int getSecondSmallest(int arr[]) {
		
		Arrays.parallelSort(arr);
		return arr[1];
	}

}
