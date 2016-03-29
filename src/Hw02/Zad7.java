package Hw02;

import java.util.Scanner;

public class Zad7 {
public static void main (String[] args){
	System.out.println("Enter number:");
	Scanner sc1=new Scanner (System.in);
	int n=sc1.nextInt();
	 int j=0,i=1;
	while(i<=n){
		if (i<n){
			j+=3;
			i++;
			System.out.print(j+ ",");
		    }else{
		j+=3;
		i++;
		System.out.print(j);
		}
		
		
		     }
		}

	}	

