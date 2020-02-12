package capgemini.labbook.threading;

class ThreadClass implements Runnable{
	
	static int count=0;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		while(true) {
		
		try {
			System.out.print(count++);
		Thread.sleep(1000);
		
			if(count==10) {
			Thread.sleep(10000);
			count=0;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
}

public class TimerThreadClass {

	public static void main(String[] args) {
		ThreadClass tc=new ThreadClass();
		Thread t1=new Thread(tc);
		t1.start();

	}

}
