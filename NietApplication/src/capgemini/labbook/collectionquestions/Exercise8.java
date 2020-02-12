package capgemini.labbook.collectionquestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		Exercise8 ex=new Exercise8();
		Scanner sc=new Scanner(System.in);
		Integer arr[];
		System.out.print("Enter the size of array: ");
		arr=new Integer[sc.nextInt()];
		System.out.println("Enter the elements of arrray:..");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Integer res[]=ex.modifyArray(arr);
		for(Integer l:res) {
			System.out.print(l+" ");
		}
		sc.close();

	}

	public Integer[] modifyArray(Integer[] arr) {
		HashSet<Integer> set=new HashSet<Integer>(Arrays.asList(arr));
		//System.out.print(set);
		ArrayList<Integer> list=new ArrayList<Integer>(set);
		Collections.reverse(list);
		//System.out.print(list);
		Integer []ar=new Integer[list.size()];
		
		return list.toArray(ar);
	}

}
