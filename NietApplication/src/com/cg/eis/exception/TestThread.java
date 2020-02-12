package com.cg.eis.exception;

class Chat{
	boolean flag=false;
	public synchronized void question(String msg) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=true;
		notify();
		
	}
    public synchronized void answer(String msg) {
    	if(!flag) {
    		try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
    	}
    	System.out.println(msg);
    	flag=false;
		notify();
		
	}
	
}
class T1 implements Runnable{
	Chat mChat;
	String s1[]= {"hi","how are u?","will u marry me?","bye"};

	public T1(Chat mChat) {
		this.mChat=mChat;
		new Thread(this,"Question").start();
		
	}

	@Override
	public void run() {
		for(int i=0;i<s1.length;i++) {
			mChat.question(s1[i]);
		}
		
	}
	
}
class T2 implements Runnable{
	Chat mChat;
	String s2[]= {"hello","i m good","Fuck off","Bhand me jao"};

	public T2(Chat mChat) {
		this.mChat=mChat;
		new Thread(this,"Answer").start();
	}

	@Override
	public void run() {
		for(int i=0;i<s2.length;i++) {
			mChat.answer(s2[i]);
		}
		
	}
	
}

public class TestThread {

	public static void main(String[] args) {
		Chat mChat=new Chat();
		new T1(mChat);
		new T2(mChat);

	}

}
