package lesson01;

public class VariablesExample {
	public static void main (String [] args ) {
		int age;
		age=27;
		long n=10l;
		double d=314;
		float test=10f;
		 
		boolean isMonday=false;
		
		int ch= 5;
		int sh=6;
		
		System.out.println("My age is" + age + n);
		age=18;
		isMonday= true;
		System.out.println("My age is " + age +".Is today Monday?" + isMonday);
		int sum= 0;
				sum= 4 * 5 + age;
		System.out.println (sum);
		System.out.println (ch + sh);
		
	}

}
