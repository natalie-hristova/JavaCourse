package hw01;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers: ");
		Scanner scanner1 = new Scanner(System.in);
		double A = scanner1.nextDouble();
		double B = scanner1.nextDouble();
		// System.out.println (A+B);
		System.out.println("Enter third number");
		Scanner scanner3 = new Scanner(System.in);
		double C = scanner3.nextDouble();

		{
			if (((C < B) && (C > A)) || ((C > B) && (C < A))) {
				System.out.println("The third number is between the other two");
			} else {
				System.out.println("The third number is NOT between the other two");
			}

		}
	}
}
