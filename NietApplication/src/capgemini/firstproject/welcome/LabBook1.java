package capgemini.firstproject.welcome;

public class LabBook1 {
	int natural_number=3;

	public static void main(String[] args) {
		LabBook1 mObject=new LabBook1();
		//mObject.showSum();
		System.out.println("Sum of first N natural numbers which are divisible "
				+ "by 3 or 5 is "+mObject.calculateSum(mObject.natural_number));
		System.out.println("difference between the sum of the squares and the square of the "
				+ "sum of the first n natural numbers is "+mObject.calculateDifference(mObject.natural_number));

	}
	
	public int calculateSum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum +i;
			}
		}
		return sum;
	}
	public int calculateDifference(int number) {
		int sqr_sum=0,ntr_sum=0;
		for(int i=1;i<=number;i++) {
			sqr_sum=sqr_sum+i*i;
			ntr_sum=ntr_sum+i;
		}
		return ((ntr_sum*ntr_sum)-sqr_sum);
	}

}
