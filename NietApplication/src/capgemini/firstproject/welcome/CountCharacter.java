package capgemini.firstproject.welcome;

public class CountCharacter {

	public static void main(String[] args) {
		CountCharacter c=new CountCharacter();
		c.countCharacter("capgemini");

	}

	private void countCharacter(String str) {
		// TODO Auto-generated method stub
		int n=str.length();
		int count[]=new int[26];
		for(int i=0;i<n;i++) {
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<n;i++) {
			if(count[str.charAt(i)-'a']!=0) {
				System.out.print(str.charAt(i));
				System.out.print(count[str.charAt(i)-'a'] + " ");
				count[str.charAt(i)-'a']=0;
			}
				
			
		}
		
	}

}
