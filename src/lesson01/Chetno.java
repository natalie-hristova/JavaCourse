package lesson01;

import java.util.Scanner;

public class Chetno {
	public static void main (String [] args) {
		System.out.println("Vavedi chislo:");
		Scanner vavedeno=new Scanner(System.in);
		double x=vavedeno.nextDouble();
		{
			if (x%2==0)
			{
				System.out.println("Chisloto e chetno");
			}	else {
					System.out.println("Chisloto e nechetno");
			}
		}
	}

}
