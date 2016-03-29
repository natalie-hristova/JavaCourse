package hw09;

public class PersonDemo {
	public static void main (String[]args){
		Person[] array;
		array=new Person[10];/*cikal*/ 
		Person p1=new Person();
		Person p2=new Person ("Nataly",21,false);
		Student st1=new Student("Blagoy",20,true,4.67);
		Student st2=new Student();
		Employee em1=new Employee();
		Employee em2=new Employee();
		array[0]=p1;
		array[1]=p2;
		array[2]=st1;
		array[3]=st2;
		array[4]=em1;
		array[5]=em2;
		//Person array2[]={p1,p2,st1,st2,em1,em2};
		 for (int i=0;i<array.length;i++){
			if (array[i]instanceof Student){
			((Student)array[i]).showStudentInfo();	
			}else{
				if(array[i]instanceof Employee){
					array[i].showPersonInfo();	
				}else{
					if(array[i]instanceof Person){
						array[i].showPersonInfo();	
					}
					
				}
			}
		 }
		 for (int i=0;i<array.length;i++){
				if (array[i]instanceof Employee){
				 ((Employee)array[i]).calculateOvertime(2); 
				}
	}
		
	// em1.calculateOvertime(2);
	}
}
