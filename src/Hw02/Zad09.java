package Hw02;

import java.util.Scanner;

public class Zad09 {
	public static void main(String[] args) {
		System.out.println("Enter A and B");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ch = 1, i = A + 1, sum = 0;
		System.out.print(A * A);
		while (i <= B) {
			ch = i * i;
			if (ch % 3 != 0) {
				System.out.print("," + ch);
				sum += ch;
			} else {
				System.out.print(",skip 3");
			}
			i++;
			if (sum > 200)
				break;
		}
	}
}
