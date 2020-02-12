package capgemini.firstproject.welcome;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfCubes c=new SumOfCubes();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		sc.close();
		c.sumCube(n);

	}

	private void sumCube(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n!=0) {
			int x=n%10;
			sum=sum+x*x*x;
			n=n/10;
		}
		System.out.print("Sum of cubes of digits of a number = "+ sum);
		
	}

}
