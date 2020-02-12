package capgemini.labbook.lambdaexpression;

import java.util.*;


public class Exercise1 {
	
	interface FunctionAdd{
		
		int operation(int x, int y);
		
	}
	 private int operate(int a, int b, FunctionAdd fobj) 
	    { 
	        return fobj.operation(a, b); 
	    }

	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner(System.in);
		
		
		Exercise1 ex=new Exercise1();
		
		FunctionAdd add=((int a,int b)->a+b);
		
		System.out.println(ex.operate(sc.nextInt(), sc.nextInt(), add));
		sc.close();
		

	}

}
