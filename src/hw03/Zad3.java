package hw03;

import java.util.Scanner;

public class Zad3 {
public static void main(String[]agrs){
	int arr[]=new int[10];
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	arr[0]=a;
	arr[1]=a;
		for (int i=2;i<arr.length;i++){
		arr[i]=arr[i-1]+arr[i-2];
	}
		for (int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
} 
}
