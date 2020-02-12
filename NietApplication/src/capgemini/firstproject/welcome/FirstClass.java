package capgemini.firstproject.welcome;

public class FirstClass {
	int minBalance=0;

	public static void main(String[] args) {
		FirstClass mObject=new FirstClass();
		mObject.addAmount(mObject);
		mObject.withdrawAccount(mObject);
		mObject.addAmount(mObject);

	}
	public void showDetails(String message,FirstClass object) {
		System.out.println(message + " " + object.minBalance);
		
	}
	public void addAmount(FirstClass object) {
		object.minBalance = object.minBalance + 1000;
		object.showDetails("Your Updated Balance after adding", object);
		
	}
	public void withdrawAccount(FirstClass object) {
		object.minBalance = object.minBalance - 1000;
		object.showDetails("Your Updated Balance after withdraw", object);
	
	}

}
