package hw04;

import java.util.Scanner;

public class Zad4s {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int r=1;
	
		for (int i =  0; i <=array.length-1; i++) {
		 for (int j =  array[i].length-1; j>=0; j--) {
			 array[i][j]=0;
		}
		 }
		for (int i=0;i<n/2;i++){
			for (int j = 0; j < array[i].length; j++) {
			if(array[i][j]==0);
			array[i][j]=r++;
			}	
		}
		for(int i = 1; i < array.length; i++){
			for(int j=n-1;j<=m-1;j++){
				if(array[i][j]==0);
				array[i][j]=r++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
			}
				
	}
}
