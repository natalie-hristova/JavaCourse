package hw03;

import java.util.Scanner;

public class Zad7 {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr2[0]=arr[1];
		arr2[n-1]=arr[n-2];
		for(int i=1;i<arr.length-1;i++){
			arr2[i]=(arr[i-1]+arr[i+1]);
		}
		System.out.print("{"+arr2[0]);
		for(int i =1;i<arr2.length;i++){
			System.out.print("," + arr2[i]);
	}
	System.out.print("}");
}
}