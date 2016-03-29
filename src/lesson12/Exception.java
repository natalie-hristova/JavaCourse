package lesson12;

public class Exception {
	public static void main (String []args){
		
		int array[]={1,2,3,4};
	
		
		try{
			System.out.println(array[4]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("There is not such element.");
			//e.printStackTrace();
		}
}
}
