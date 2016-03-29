package lesson22;

public class Zad1a implements Runnable{
	

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("Main "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}

}
