package capgemini.labbook.collectionquestions;



import java.util.*;


public class Exercise6 {

	public static void main(String[] args) {
		Exercise6 ex=new Exercise6();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	
		hm.put(1,19);
		hm.put(2,40);
		hm.put(3,20);
		hm.put(4,18);
		hm.put(5,15);
		hm.put(6,16);
	
		
		List<Integer> eligible=ex.voterList(hm);
		System.out.print(eligible);

	}

	private List<Integer> voterList(HashMap<Integer, Integer> hm) {
		List<Integer> list=new ArrayList<Integer>();
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			if(hm.get(m.getKey())>=18) {
				list.add((Integer) m.getKey());
			}
		
		}
		return list;
		
	}

	

	

}
