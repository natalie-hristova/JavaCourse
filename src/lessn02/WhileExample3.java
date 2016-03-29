package lessn02;

import java.util.Scanner;

public class WhileExample3 {
	public static void main (String[] args){
		System.out.println ("Enter number:");
		Scanner sc1=new Scanner (System.in);
		int n=sc1.nextInt ();
		int i=0;
		while (i<=n){
			if (i%7==0)
					System.out.print(i+ ",");
			i++;
		}
		
		
	}

}
