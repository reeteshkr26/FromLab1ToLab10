package capgemini.labbook.threading;

import java.io.*;

class CopyDataThread extends Thread{
	FileInputStream fis;
	FileOutputStream fos;
	CopyDataThread(FileInputStream fis,FileOutputStream fos){
		this.fis=fis;
		this.fos=fos;
	}
	public void run() {
		int i=0,count=0;
		try {
			while((i=fis.read())!=-1) {
				fos.write(i);
				count++;
				if(count==10) {
					System.out.println("10 characters are copied!!");
					count=0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class FileProgram {

	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			fis=new FileInputStream("E:\\File Reader\\source.txt");
			fos=new FileOutputStream("E:\\File Reader\\target.txt");
			CopyDataThread cdt=new CopyDataThread(fis,fos);
			Thread t1=new Thread(cdt);
			t1.start();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		

	}

}
