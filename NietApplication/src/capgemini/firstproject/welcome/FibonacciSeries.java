package capgemini.firstproject.welcome;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FibonacciSeries {
	InputStreamReader isr;
	BufferedReader buff;
	
	public static void main(String args[]) {
		FibonacciSeries fib=new FibonacciSeries();
		fib.isr=new InputStreamReader(System.in);
		fib.buff=new BufferedReader(fib.isr);
		
		//fib.findFibonacciSeries();
		for(int i=1;i<=6;i++) {
			System.out.print(fib.findFib(i)+" ");
		}
		
	}

	public void findFibonacciSeries() {
		int a=1,b=1;
		try {
			int n=Integer.parseInt(buff.readLine());
			System.out.print(a+" "+b+" ");
			for(int i=1;i<n;i++) {
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int findFib(int n) {
		if(n<=1) {
			return n;
		}
		return findFib(n-1)+findFib(n-2);
	}

}
