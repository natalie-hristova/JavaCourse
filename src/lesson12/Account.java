package lesson12;

public class Account {

	 private double sum;
	
	Account(double sum){
		this.sum=sum;
	}
	public boolean isNegative(double sum){
		if(sum<0){
			return true;
		}return false;
	}
}
