package hw07;

public class TaskAndEmployeeDemo {
	public static void main (String []args){
		Task t1= new Task("Clean",11);
		Task t2=new Task("",26);
		Task t3=new Task("No dust",4);
		Employee e1=new Employee("Georgi",t1,6);
		Employee e2=new Employee("");
		Employee e3=new Employee("Petyr",t3,4);
		Employee e4=new Employee ("Kiril",t2,2);
		e2.setName("Ivan");
		e2.setHourLeft(5);
		e3.work();
		e1.work();
		e4.showReport();
	}

}
