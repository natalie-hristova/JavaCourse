package lesson03;

import java.util.Scanner;

public class Zad5Masiv {
	public static void main(String[] args) {
		System.out.println("Enter the length of the array:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			Scanner sc2 = new Scanner(System.in);
			int a = sc2.nextInt();
			array[i] = a;
		}
		// for (int i=0;i<array.length;i++)
		// System.out.print(array[i]+ ",");
		for (int i = 0; i < array.length/2; i++) {
			int b = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = b;
		}

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
