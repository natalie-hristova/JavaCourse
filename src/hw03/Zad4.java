package hw03;

import java.util.Scanner;

public class Zad4 {
	public static void main (String [] args){
		System.out.println("Enter the length of the array:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int [n];
		int br=0;
		for(int i=0;i<array.length;i++){
			System.out.println("Enter element number"+(i+1));
			array[i] = sc.nextInt();
		}
			for (int i=0;i<array.length/2;i++){
			if(array[i]!=array[array.length-1-i])
				br++;}
			if(br==0){
				System.out.println("The array is specular.");
			} else {
			System.out.println("The array is NOT specular.");
			
		   }
		}
	  } 
	



