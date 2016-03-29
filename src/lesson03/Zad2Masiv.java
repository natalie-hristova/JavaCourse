package lesson03;

import java.util.Scanner;

public class Zad2Masiv {
	public static void main (String []args){
		int array[]=new int[10];
	
		for (int i=0;i<array.length;i++){
			System.out.println("Enter element number" +(i+1));
		  
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			array[i]=a;
					
		}
		
		for (int i=0;i<array.length;i++){
			System.out.print(array[i] + ",");
			
		}
	}

}
