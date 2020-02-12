package capgemini.labbook.collectionquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Exercise7 ex=new Exercise7();
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.print("Enter the size of array: ");
		arr=new int[sc.nextInt()];
		System.out.println("Enter the elements of arrray:..");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Integer[] res=ex.getSorted(arr);
		for(Integer i:res)
			System.out.print(i+" ");
		
		sc.close();

	}

	private Integer[] getSorted(int[] arr) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		StringBuffer buf=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			buf.append(String.valueOf(arr[i]));
			list.add(Integer.parseInt(buf.reverse().toString()));
			buf.delete(0, buf.length());
		}
		Integer a[]=new Integer[list.size()];
		
		Collections.sort(list);	
		return list.toArray(a);
	}

}
