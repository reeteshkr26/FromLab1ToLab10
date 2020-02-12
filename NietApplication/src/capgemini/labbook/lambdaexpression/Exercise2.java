package capgemini.labbook.lambdaexpression;

public class Exercise2 {

	interface MyInterface {
		void stringFormat(char[] str);
		
	}
	public static void main(String[] args) {
		
		Exercise2 ex=new Exercise2();
		String s1="Hello";
		MyInterface f=((char[] s)->{for(char c:s) System.out.print(c+" ");});
		f.stringFormat(s1.toCharArray());

	}

}
