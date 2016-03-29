package hw05;

public class ComputerDemo {
	public static void main (String[] args){
		Computer comp1 = new Computer();
		comp1.year=2012;
		comp1.price=1009.99;
		comp1.isNotebook= false;
		comp1.hardDiskMemory=5000;
		comp1.freeMemory=800;
		comp1.operationSystem="Windows 7";
		
		Computer comp2=new Computer();
		comp2.year=2014;
		comp2.price=865;
		comp2.isNotebook=true;
		comp2.hardDiskMemory=10000;
		comp2.freeMemory=54;
		comp2.operationSystem="Linux";
	
		comp1.useMemory(100);
		comp2.changeOperationSystem("Windows XP");
		System.out.println();
		System.out.println(comp1.year+"\n"+comp1.price+"\n"+comp1.isNotebook+"\n"+comp1.hardDiskMemory+"\n"+comp1.freeMemory+"\n"+comp1.operationSystem);
	
		System.out.println();
		System.out.println(comp2.year+"\n"+comp2.price+"\n"+comp2.isNotebook+"\n"+comp2.hardDiskMemory+"\n"+comp2.freeMemory+"\n"+comp2.operationSystem);
	}
}