package hw09;

public class Employee extends Person{
	static double daySalary=34.5;
	static final  int DAY_WORK_HOURS=8;
	double b; 
	Employee(){
		super();
		super.name="Ivan";
		super.age=23;
		super.isMale=true;
	}
		//@Override
		protected double calculateOvertime (double hours){
			if(super.age<18){
				b=0;
				System.out.println(b);
				return 0;
		
			}else{
				b =(daySalary/DAY_WORK_HOURS) *hours*1.5;
				System.out.println(b);
				return b;
			}
		
		}
		//protected void showEmployeeInfo(){
			//System.out.println("Name: " + super.name+" Age :"+super.age+"Sex:male-"+isMale+"Money:"+b);
		//}
		@Override
		protected void showPersonInfo(){
			System.out.println("Name: " + super.name+" Age :"+super.age+"Sex:male-"+isMale+" Money:"+b);
		}
}
