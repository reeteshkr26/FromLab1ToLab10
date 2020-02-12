package capgemini.labbook.collectionquestions;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 ex=new Exercise3();
		int arr[]= {2,3,6,8,5};
		Map<Integer,Integer> map=ex.getSquares(arr);
		System.out.print(map);

	}

	private Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			m.put(arr[i], arr[i]*arr[i]);
		}
		return m;
	}

}
