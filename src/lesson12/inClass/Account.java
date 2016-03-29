package lesson12.inClass;

public class Account {
	private double sum;

	
	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public void withdraw(int sum) {
		if(sum<0) {
			throw new IllegalArgumentException();
		}
		System.out.println("Withdrawing " + sum);
		this.sum -= sum;
	}
}