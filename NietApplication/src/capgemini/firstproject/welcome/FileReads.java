package capgemini.firstproject.welcome;

import java.io.FileInputStream;

import java.io.IOException;

public class FileReads {

	public static void main(String[] args) {
		 try {
			FileInputStream fin=new FileInputStream("E:\\File Reader\\Myfile.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
