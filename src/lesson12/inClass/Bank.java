package lesson12.inClass;

public class Bank {
	Account[] acc;
	
	Bank () {
		Account [] acc = new Account [5];
	}

	public void setAcc(Account[] acc) {
		this.acc = acc;
	}

	public Account[] getAcc() {
		return acc;
	}
}