package hw04;

import java.util.Scanner;

public class Zad3a {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int [][]array=new int [n][m];
		int f=1;
		for (int i=n-1;i>=0;i--){
			for (int j=0;j<m && j<n-i;j++){
				f++;
				array[j+i][j]=f;
				//System.out.print(f);
			
			}
			
		}
		for (int j=m-1;j>0;j--){
			for (int i=0; i < j && i<m;i++){
				
				array[i][i+m-j]=f++;
		    }
		}
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array[i].length-1; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
			}
				
	}
}
