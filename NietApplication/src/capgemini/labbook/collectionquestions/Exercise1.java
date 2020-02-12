package capgemini.labbook.collectionquestions;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 ex=new Exercise1();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(0, 5);
		hm.put(1, 2);
		hm.put(2, 8);
		hm.put(3, 3);
		hm.put(4, 1);
		List<Integer> res=ex.getSorted(hm);
		System.out.print(res);

	}

	private List<Integer> getSorted(HashMap<Integer, Integer> hm) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			list.add((Integer) (m.getValue()));
		}
		Collections.sort(list);
		return list;
	}

}
