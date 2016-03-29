package hw04;

import java.util.Scanner;

public class Zad3 {
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m:");
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int r=n*n/2-1,p=r+n,k=n*n/2-n,d=n*n-2,z=2;
	
		for (int i =  0; i <=array.length-1; i++) {
		for (int j =  array[i].length-1; j>=0; j--) {
		/*for (int i =array.length-1; i>=0; i--) {
		for (int j =0 ; j>= array[i].length-1; j++) {*/
			array[n-1][0]=1;
			array[0][m-1]=n*m;
				if(i==j){
					array[i][j]=r++;
					
				}else{
					if(i+1==j){
					
						array[i][j]=p++;
						array[j][i]=k++;
					}else{
						if(i+2==j){
							array[i][j]=d++;
							array[j][i]=z++;
						}
					}
				}
				
				
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
