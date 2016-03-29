package lesson22;

public class Zad1 {
	public static void main(String[] args) throws InterruptedException {

		Thread[] tr = new Thread[5];
//		tr[5]={tr1,tr2,tr3,tr4,tr5};
		for (int i = 0; i <5; i++) {
			tr[i]=new Thread();
			tr[i].start();
			{
				for (int j = 1; j < 5; j++) {
					System.out.println("Method run " + i);
					Thread.sleep(100);
				}
			}
		}
	}
}
