/*
 * 
 * @Author Capgemini
 * @Developer Reetesh Kumar Mondal
 * @Description This class is performing the banking process
 * @Created 27/01/2020
 * @Version 1.0
 * @Status release Beta
 * 
 */

package capgemini.firstproject.welcome;

import java.util.Scanner;

public class FirstAssignment {
	double sbi_account_balance=0;
	//int withdraw_amount=0;
	int no_of_transactions=0;
	int no_of_add_amount=0;
	int no_of_withdraw_amount=0;
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String args[]) {
		FirstAssignment mObject=new FirstAssignment();

		mObject.bankSelection(mObject, mObject.sc);
		mObject.bankSelection(mObject, mObject.sc);
		mObject.bankSelection(mObject, mObject.sc);
		mObject.bankSelection(mObject, mObject.sc);
		
		
		mObject.sc.close();
	}
	
	//Initiating banking process
	public void bankSelection(FirstAssignment object, Scanner sc) {
		System.out.print("**********Select Bank************");
		System.out.println();
		System.out.println("1. State Bank of India \n 2. Axis Bank \n 3. HDFC Bank \n 4. Union Bank of India");
		System.out.println("*******************************");
		System.out.print("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("    Welcome to State Bank of India    ");
			selectOperation(object,sc);
			
			break;
		case 2:
			System.out.println("    Welcome to Axis Bank         ");
			selectOperation(object,sc);
			break;
		case 3:
			System.out.println("    Welcome to HDFC Bank         ");
			selectOperation(object,sc);
			break;
		case 4:
			System.out.println("    Welcome to Union Bank of India       ");
			selectOperation(object,sc);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}
	public void selectOperation(FirstAssignment object, Scanner sc) {
		System.out.println("Select Operation \n 1. Add Amount \n2. Withdraw Amount \n");
		System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			addAmount(object,sc);
			break;
		case 2:
			withdrawAmount(object,sc);
			break;
		default:
			break;
		}
	}
	public void addAmount(FirstAssignment object, Scanner sc) {
		System.out.print("Enter your amount which is want to add in your bank account= ");
		double amount=sc.nextDouble();
		String msg="";
		object.sbi_account_balance=object.sbi_account_balance + amount;
		object.no_of_add_amount = object.no_of_add_amount + 1;
		if(object.no_of_add_amount==4) {
			object.sbi_account_balance=object.sbi_account_balance + 0.015*object.sbi_account_balance;
		}
		msg=amount + " credited in your account..";
		object.no_of_transactions++;
		showDetails(msg,object);
		
		
	}
	public void withdrawAmount(FirstAssignment object, Scanner sc) {
		System.out.print("Enter your amount which is want to withdraw from your bank account= ");
		double amount=sc.nextDouble();
		String msg="";
		
		//minimum account balance=1000.0
		
		if(object.sbi_account_balance>amount && object.sbi_account_balance>1000.0) {
			object.sbi_account_balance=object.sbi_account_balance-amount;
			object.no_of_withdraw_amount = object.no_of_withdraw_amount + 1;
			
			if(object.no_of_withdraw_amount==4) {
				object.sbi_account_balance=object.sbi_account_balance- 0.025*object.sbi_account_balance;
			}
			msg=amount + " debited from your account..";
		}
		else {
			msg="Transaction not allowed..";
		}
		object.no_of_transactions++;
		showDetails(msg,object);
		
	}
	public void showDetails(String message,FirstAssignment object) {
		System.out.println("Transaction no. \t Description \t Account Balance ");
		System.out.println(object.no_of_transactions + "\t"+ message + "\t" + object.sbi_account_balance);
		
	}

}
