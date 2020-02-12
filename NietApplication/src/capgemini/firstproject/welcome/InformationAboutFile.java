package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class InformationAboutFile {
	InputStreamReader isr;
	BufferedReader buff;
	

	public static void main(String[] args) {
		InformationAboutFile mObject=new InformationAboutFile();
		mObject.isr=new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		
		try {
			String fileName=mObject.buff.readLine();
			File f=new File(fileName);
			mObject.infoAboutFile(f);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public void infoAboutFile(File f) {
		System.out.print("File Name: "+ f.getName()+"\n");
		System.out.print("The File is: "+ (f.exists()?"exist":"does not exist")+"\n");
		System.out.print("Is readable: "+ f.canRead()+"\n");
		System.out.print("Is writable: "+ f.canWrite()+"\n");
		System.out.print("File Size: "+ f.length()+ " bytes"+"\n");
		System.out.print("Is directory: "+ f.isDirectory()+"\n");
		
	}

}
