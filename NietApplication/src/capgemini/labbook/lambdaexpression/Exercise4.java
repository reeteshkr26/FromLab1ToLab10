package capgemini.labbook.lambdaexpression;

import java.util.Scanner;

class Demo{
	String name,phoneNo;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Demo d=new Demo();
		d.setName(name);
		System.out.println();
		sc.close();

	}

}
