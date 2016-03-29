package Hw02;

import java.util.Scanner;

public class Zad6 {
	public static void main (String[] args){
		System.out.println("Enter number:");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println("The sum is:" +sum);
	}


}
