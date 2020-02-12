package com.cg.eis.exception;

public class TestDemo {

	public static void main(String[] args) {
		RunnableDemo r1=new RunnableDemo("Thread-1");
		Thread t1=new Thread(r1);
		t1.start();
		
		RunnableDemo r2=new RunnableDemo("Thread-2");
		Thread t2=new Thread(r2);
		t2.start();

	}

}
class RunnableDemo extends Thread{
	private String threadName;
	RunnableDemo(String name){
		threadName=name;
	}
	
	public void run() {
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Thread "+threadName + " "+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread "+threadName + " "+e);
		}
	}
}
