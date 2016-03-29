package hw04;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j % 2 == 0) {
					array[i][j] = 1 + i + n * j;
				} else {

					for (int k = array.length; k > 0; k--) {
						array[array.length - k][j] = k + n * j;
					}
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}