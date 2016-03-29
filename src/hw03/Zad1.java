package hw03;

import java.util.Scanner;

public class Zad1 {
public static void main (String[] args){
	System.out.println("Enter the length of tha array:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for (int i=1;i<=arr.length;i++){
		System.out.println("Enter the element numer"+i);
		Scanner sc2=new Scanner(System.in);
		int a=sc2.nextInt();
		arr[i-1]=a;
	}
	int m=arr[0];
	for (int i=1;i<arr.length;i++){
		if (arr[i]%3==0){
			if (m>arr[i])
				m=arr[i];
		}
		
	}
	System.out.println("The smallest number,which devisor is 3 is:"+ m);
}
}
