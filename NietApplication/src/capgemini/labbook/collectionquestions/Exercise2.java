package capgemini.labbook.collectionquestions;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exercise2 ex=new Exercise2();
		char ch[]=sc.next().toCharArray();
		HashMap<Character,Integer>hm=ex.countCharacter(ch);
	
		System.out.print(hm);
		sc.close();

	}

	private HashMap<Character, Integer> countCharacter(char[] ch) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		int count[]=new int[26];
		for(int i=0;i<ch.length;i++) {
			count[ch[i]-'a']++;
		}
		for(int i=0;i<ch.length;i++) {
			if(count[ch[i]-'a']!=0) {
				hm.put(ch[i], count[ch[i]-'a']);
				count[ch[i]-'a']=0;
			}
		}
		
		return hm;
	}

}
