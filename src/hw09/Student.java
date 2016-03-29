package hw09;

public class Student extends Person {
	private double score;
	
	Student(){
		//Vazmojno e 
	}
	Student(String name, int age, boolean isMale, double score){
		super(name,age,isMale);
		this.score=score;
	}
	public void setScore(double score){
		if (score>=2 && score<=6){
			this.score=score;
		}	
	}
	public double getScore(){
		return score;
	}
	void showStudentInfo(){
		showPersonInfo();
	System.out.println(" Score:"+score);
	}
	//@Override
	//protected void showPersonInfo(){
	//	System.out.println("Name: " + super.name+" Age :"+super.age+"Sex:male-"+isMale+" Score:"+score);
	//}
	
	
}
