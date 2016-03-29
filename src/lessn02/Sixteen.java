package lessn02;

public class Sixteen {

	public static void main(String[] args) {
		int i = 0;
		while (i < 16) {
			System.out.print(i/4 + (i % 4) * 4 + 1 + " ");

			if (i%4 == 3) {
				System.out.println();
			}

			i++;
		}
	}
}

