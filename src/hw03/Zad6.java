package hw03;

import java.util.Scanner;

public class Zad6 {
public static void main (String[]args){
	System.out.println("Enter the length of the array 1:");
	Scanner sc=new Scanner(System.in);
	int a1=sc.nextInt();
	int [] arr1=new int[a1]; 
	System.out.println("Enter "+a1+" elements ");
		for(int i=0;i< arr1.length;i++){
		arr1[i]=sc.nextInt();
		}
	System.out.println("Enter the length of the array 2:");
	int a2=sc.nextInt();
	int [] arr2=new int[a2];
	System.out.println("Enter "+a2+" elements ");
	for(int i=0;i< arr2.length;i++){
		arr2[i]=sc.nextInt();
		}
	int br=0;
	if(a1==a2){
		System.out.println("Both of the arrays have the same length");
		for(int i=0;i<arr1.length;i++){
			if (arr1[i]!=arr2[i]){
				br++;
				}
		}
				if(br==0){
					System.out.println("The arrays are the same");
				}else{
					System.out.println("The arrays are different");				}
				
		}
			
 else {
		System.out.println("The lenghts of the 2 arrays are different");
		if (a2<a1){
       
		for(int i=0;i<arr2.length;i++){
		if	(arr1[i]!=arr2[i]){
			br++;
		}
		}
		if (br==0){
			System.out.println("The elements are the same until "+a2);}
		else{
			System.out.println("The elements are different");
		}
		}else{
		    
			for(int i=0;i<arr1.length;i++){
			if	(arr1[i]!=arr2[i]){
				br++;
			}
			}
			if (br==0){
				System.out.println("The elements are the same until "+a1);}
			else{
				System.out.println("The elements are different");
			}
		}
	}
}
}

			


