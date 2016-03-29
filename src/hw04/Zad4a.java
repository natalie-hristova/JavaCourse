package hw04;

import java.util.Scanner;

public class Zad4a {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int r=1,end=array.length-1,beg=0;
		
		for(int k=0;k<n-1;k++){
		for (int i =  beg; i <=end; i++) {
				array[beg][i]=r++;
		}
		for (int i=beg+1;i<=end;i++){
			array[i][end]=r++;
		}
		for (int i=end-1;i>=beg+1;i--){
			array[end][i]=r++;
		}
		for (int i=end;i>beg;i--){
			array[i][beg]=r++;
		}
		end--;
		beg++;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			
			System.out.println();
	}
}
	}
