package hw06;

public class College {
	public static void main (String [] args){
	Student st1=new Student();
	Student st2=new Student("Polina","OIF",21);
	Student st3=new Student("Vesko","KSI",20);
	Student st4=new Student("Blagoy","KSI",4.92,2,25,false,5);
	Student st5=new Student("Omo","KSI",5.73,4,32,false,34);
	Student st6=new Student ("Natalie","CE",3.07,4,20,true,0.5);
	//Student
	Student[] studenti={new Student(),new Student("Petyr","KSI",29)};
	StudentGroup stgr1=new StudentGroup("KSI",studenti,4);
	StudentGroup stgr2= new StudentGroup("KSI");
	StudentGroup stgr3= new StudentGroup("OIF");
	
	st1.upYear();
	st2.receiveScholarship(3,45.5);
	st3.upYear();
	st4.receiveScholarship(4.5,45.5);
	st5.receiveScholarship(4, 45.9);
	st6.upYear();
	stgr1.addStudent(st1);
	stgr2.addStudent(st4);
	stgr2.addStudent(st3);
	stgr3.addStudent(st5);
	stgr3.addStudent(st1);
	stgr2.theBestStudent();
	stgr2.printStudentsInGroup();
	stgr2.emptyGroup();
	}

}
