package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrimeNumber {
	
	InputStreamReader isr;
	BufferedReader buff;
	public static void main(String[] args) {
		PrintPrimeNumber ppn=new PrintPrimeNumber();
		ppn.isr=new InputStreamReader(System.in);
		ppn.buff=new BufferedReader(ppn.isr);
		ppn.checkPrime();

	}
	public void checkPrime() {
		
		try {
			int number=Integer.parseInt(buff.readLine());
			for(int num=1;num<=number;num++) {
				isPrime(num);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			
		}
		
	}
	public void isPrime(int num) {
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0 && num>1) {
			System.out.print(num + " ");
		}
		
	}

}
