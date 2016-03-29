package hw06;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer(){
		this.isNotebook=false;
		//boolean ft=this.isNotebook;
		this.operationSystem="Win XP";
		//String os=this.operationSystem;
		//System.out.println("The fact that the comp is laptop is:" + ft);
		//System.out.println("The operating system is "+os);
	} 
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year=year;
		//int y=this.year;
		this.price=price;
		//double p=this.price;
		this.hardDiskMemory=hardDiskMemory;
		//double hdm=this.hardDiskMemory;
		this.freeMemory=freeMemory;
		//double fm=this.freeMemory;
		//System.out.println("The year is "+ y +".The price is "+p+" The hard disk memory is "+hdm+".The free memory is  "+fm);
	}
	
	Computer(int year, double price, boolean isNotebook,double hardDiskMemory, double freeMemory, String operationSystem){
		this.year=year;
	//	int y=this.year;
		this.price=price;
		//double p=this.price;
		this.isNotebook=isNotebook;
	//	boolean in=this.isNotebook;
		this.hardDiskMemory=hardDiskMemory;
		//double hdm=this.hardDiskMemory;
		this.freeMemory=freeMemory;
		//double fm=this.freeMemory;
		this.operationSystem=operationSystem;
		//String os=this.operationSystem;
		//System.out.println(y+" "+p+" "+in+" "+hdm+" "+fm+" "+os);
	}
	
	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.println("The new operation system is:" + newOperationSystem);
	}
	int comparePrice(Computer c){
		
		if(this.price==c.price){
			
			System.out.println("The prices are equal.");
		return	0;
		
		}else{
			if(this.price>c.price){
				
				System.out.println("The first on is more expensive");
				return -1;
			}else{
			
				System.out.println("The first one is cheaper");
				return 1;
			}
		 }
		
	}

	void useMemory(double memory) {
		if (freeMemory < memory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory = freeMemory - memory;
			System.out.println("You have: " + freeMemory + " free memory");
		}
	}
}