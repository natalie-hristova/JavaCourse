package hw06;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		this.grade=4;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
		Student(String name,String subject,double grade,int yearInCollege,int age,boolean isDegree,double money){
			this.name=name;
			this.subject=subject;
			this. grade= grade;
			this.yearInCollege=yearInCollege;
			this.age=age;
			this.isDegree=isDegree;
			this.money=money;
		}
	
		Student(String name,String subject,int age){
			this();
			this.name=name;
			this.subject=subject;
			this.age=age;
		}
 		void upYear(){
 			if(yearInCollege<4){
 				yearInCollege++;
 			}else{
 				isDegree=true;
 			}
 			System.out.println("Year in school:"+yearInCollege+".Finshed shool-"+isDegree);
 		}
 		double receiveScholarship(double min, double amount){
 			if(grade>=min && age<=30){
 				money+=amount;
 			}
 			System.out.println(money);
 			return money;
 		}
}
