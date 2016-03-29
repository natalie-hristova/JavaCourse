package hw09;

public class Person {
	protected String name;
	protected int age; 
	protected boolean isMale;
	
	Person(){
		
	}
		
	Person(String name,int age,boolean isMale){
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	protected void showPersonInfo(){
		System.out.println("Name:"+ name +"Age:"+age+"Sex:male-"+isMale);
	}
	//protected double calculateOvertime (double hours){
		//return 0;
	//}
}
