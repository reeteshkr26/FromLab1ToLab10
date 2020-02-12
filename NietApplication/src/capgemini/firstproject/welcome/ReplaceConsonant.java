package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceConsonant {
	String str;
	InputStreamReader isr;
	BufferedReader buff;
	
	public static void main(String[] args) {
		ReplaceConsonant mObject=new ReplaceConsonant();
		
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		try {
		mObject.str=mObject.buff.readLine();
		System.out.print(mObject.alterString(mObject.str));
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public String alterString(String str2) {
		char s[]=str2.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(s[i]!=' ') {
			if(!checkVowel(s[i])) {
				if(s[i]=='z') {
					s[i]='b';
				}
				else {
					s[i]=(char) (s[i]+1);
					if(checkVowel(s[i])) {
						s[i]=(char)(s[i]+1);
					}
				}
			}

		}
		}
		return String.valueOf(s);
	}
	public boolean checkVowel(char c) {
		if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
			return false;
		}
		return true;
	}

}
