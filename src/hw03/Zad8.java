package hw03;

import java.util.Scanner;

public class Zad8 {
	public static void main(String[] args) {
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
        int []arr=new int[n];
        int br2=1,br=1,a=arr[0];
       
        for (int i=0;i<arr.length;i++){
        	arr[i]=sc.nextInt();
         }
        System.out.print("The longest row of the same numbers:");
		for (int i=0;i<arr.length-1;i++){
			if (arr[i] == arr[i+1]) {
				br++;

				if (br > br2) {
					a = arr[i];
					br2 = br;
				}
			} else {
				br=1;
			}
		}
		for (int j=0; j<br2; j++) {
			System.out.print(a+ " ");
		}

	}
}

