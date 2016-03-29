package Hw02;

import java.util.Scanner;

public class Zad8 {
public static void main (String[] args){
	System.out.println("Enter number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=1;
	int p=n-1;
	do{
	    for(int i=1;i<=n;i++)
	    System.out.print(p+ " ");
	    System.out.println();
	    p+=2;
	    k++;
	}while (k<=n);

}
}

