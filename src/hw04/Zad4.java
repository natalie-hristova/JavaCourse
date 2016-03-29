package hw04;

import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int r=1;
	
		for (int i =  0; i <=array.length-1; i++) {
			for (int j =0; j<  array[i].length; j++) {
				array[i][j]=r++;
				
			}
			array[i][array.length-1]=n++;
		
		}
		int x=n-1;
		for (int j=array.length-1 ; j>=0 ; j--){
		
			array[array.length-1][j]=x++;
		}
		 x=x-1;
		for (int i=array.length-1 ; i>0 ; i--){
		
			array[i][0]=x++;
		}
for (int i = 0; i < array.length; i++) {
	for (int j = 0; j < array[i].length; j++) {
		System.out.print(array[i][j]+ " ");
	}
	System.out.println();
	}
		
}
}
