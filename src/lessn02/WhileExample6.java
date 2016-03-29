package lessn02;

import java.util.Scanner;

public class WhileExample6 {
	public static void  main (String[] args){
		System.out.println("Enter number:");
		Scanner sc1=new Scanner (System.in);
		int n=sc1.nextInt();
		int i=0;
		int j=1;
	
		while (i<n){
			System.out.println(i);
			int tmp=i+j;
			i=j;
			j= tmp;	
		}
		}
}
