package capgemini.labbook.collectionquestions;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 ex=new Exercise5();
		int arr[]= {10,6,2,11,8,4,9};
		int small=ex.getSecondSmallest(arr);
		System.out.println(small);

	}

	private int getSecondSmallest(int[] arr) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(i, arr[i]);
		}
		Collections.sort(list);
		return list.get(1);
	}

}
