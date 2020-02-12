package capgemini.firstproject.welcome;

import java.io.*;
import java.util.Scanner;

public class CopyTextFromOneFileToAnother {

	public static void main(String[] args) {
		File f=null;
		File f2=null;
		FileInputStream fis=null;
		FileInputStream fis1=null;
		FileOutputStream fos=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			f=new File("E:\\File Reader\\Myfile1.txt");
			f2=new File("E:\\File Reader\\Myfile.txt");
			if(!f.exists()) {
				f.createNewFile();
			}
			
			//System.out.println("Enter text..");
			//char str[]=sc.nextLine().toCharArray();
			fos=new FileOutputStream(f);
			//for(int i=0;i<str.length;i++) {
				//fos.write(str[i]);
			//}
			fis=new FileInputStream(f2);
			int i=0;
			//System.out.println("Data Read from file...");
			while((i=fis.read())!=-1) {
				fos.write(i);
				
			}
			
			fis1=new FileInputStream(f);
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fos.close();
			fis.close();
			fis1.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
