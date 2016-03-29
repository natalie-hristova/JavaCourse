package lesson12.inClass;

public class Withdraw {
	public static void main(String[] args) throws IndexOutOfBoundsException {
		Bank bank = new Bank();
		Account[] acc = new Account[5];

		for (int i = 0; i < acc.length; i++) {
			Account tmp = new Account();
			tmp.setSum(110);
			acc[i] = tmp;
		}

		bank.setAcc(acc);

		for (int i = 0; i < 10; i++) {
			try {
				bank.getAcc()[i].withdraw(i - 2);
			} catch (IllegalArgumentException e) {
				System.out.println("Cant withdraw negative ammount");
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No account to withdraw from");
				e.printStackTrace();
			}
		}
	}
}