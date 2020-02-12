package capgemini.firstproject.welcome;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyException(){
		System.out.print("This is my exception...");
	}
	public MyException(String msg){
		System.out.print("This is my exception: "+msg);
	}

}
