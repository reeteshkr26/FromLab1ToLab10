package capgemini.labbook.collectionquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise4 ex=new Exercise4();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("reg1", 70);
		hm.put("reg2", 90);
		hm.put("reg3", 80);
		hm.put("reg4", 100);
		hm.put("reg5", 85);
		
		HashMap<String, String> m=ex.getStudents(hm);
		
		System.out.print(m);

	}

	private HashMap<String, String> getStudents(HashMap<String, Integer> hm) {
		HashMap<String,String> students=new HashMap<String,String>();
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			if(hm.get(m.getKey())>=70 && hm.get(m.getKey())<80) {
				students.put((String) m.getKey(), "Bronze");
			}
			if(hm.get(m.getKey())>=80 && hm.get(m.getKey())<90) {
				students.put((String) m.getKey(), "Silver");
			}
			if(hm.get(m.getKey())>=90) {
				students.put((String) m.getKey(), "Gold");
			}
		}
		return students;
	}

}
