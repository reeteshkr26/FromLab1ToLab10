package capgemini.firstproject.welcome;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateClass {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		DateClass mObject=new DateClass();
		long milli=System.currentTimeMillis();
		
		LocalDate pdate = LocalDate.of(2012, 01, 01);
		LocalDate now = LocalDate.now(); 
		 Period diff = Period.between(pdate, now);
		 
		 
	   //  System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    //diff.getYears(), diff.getMonths(), diff.getDays());
		//System.out.print(d);
	     
	     Pattern p = Pattern.compile("^(.+)@(.+)$");//. represents single character
	     Matcher m = p.matcher("puja@gmail.com");
	     boolean b = m.matches();

	     //2nd way
	     boolean b2=Pattern.compile(".s").matcher("as").matches();

	     //3rd way
	     boolean b3 = Pattern.matches(".s", "as");

	    // System.out.println(b+" "+b2+" "+b3);
	     
	     String name=c.next();
	     String suffix="_job";
	     if(name.endsWith(suffix) && name.length()-suffix.length()>=8) {
	    	 System.out.print("true");
	     }
	     else {
	    	 System.out.print("false");
	     }
	    /* Pattern p1=Pattern.compile("._job");
	     Matcher m1=p1.matcher("_job");
	     boolean b4=m1.matches();
	     System.out.println(b4);*/

	}

}
