package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayWordsOfText {
	FileInputStream fis;
	InputStreamReader isr;
	BufferedReader buff;
	public static void main(String args[]) {
		int countChar=0,countWord=0,countLine=0,countParagraph=1,whiteSpace=0,countSentence=0;
		 DisplayWordsOfText d=new DisplayWordsOfText();
		try {
			d.fis=new FileInputStream("E:\\File Reader\\Myfile.txt");
			d.isr=new InputStreamReader(d.fis);
			d.buff=new BufferedReader(d.isr);
			String line;
			while((line=d.buff.readLine())!=null) {
				countLine++;
				if(line.equals("")) {
					countParagraph++;
					
				}
				if(!line.equals("")) {
					countChar +=line.length();
					String s[]=line.split(" ");
					countWord +=s.length;
					whiteSpace +=countWord-1;
					String sen[]=line.split("[!?:.]+");
					countSentence +=sen.length;
				}
			}
			
			System.out.print("No. of characters: "+ countChar+"\n");
			System.out.print("No. of words: "+ countWord+"\n");
			System.out.print("No. of line: "+ countLine+"\n");
			System.out.print("No. of whitespace: "+ whiteSpace+"\n");
			System.out.print("No. of paragraph: "+ countParagraph+"\n");
			System.out.print("No. of sentence: "+ countSentence+"\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
		finally {
			try {
				d.buff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
