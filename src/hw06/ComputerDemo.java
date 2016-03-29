package hw06;

public class ComputerDemo {
	public static void main (String[] args){
		Computer comp1=new Computer ();
		Computer comp2=new Computer();
		Computer comp3 = new Computer();
		Computer comp4= new Computer(2002,456.78,3200,430);
		Computer comp6=new Computer(2012,1009,true,38430,340,"Linux");
		
		comp1.year=2012;
		comp1.price=1009.99;
		comp1.isNotebook= false;
		comp1.hardDiskMemory=5000;
		comp1.freeMemory=800;
		comp1.operationSystem="Windows 7";
		
		
		comp2.year=2014;
		comp2.price=1009;
		comp2.isNotebook=true;
		comp2.hardDiskMemory=10000;
		comp2.freeMemory=54;
		comp2.operationSystem="Linux";
	
		comp1.useMemory(100);
		comp2.changeOperationSystem("Windows XP");
		System.out.println();
		//System.out.println(comp1.year+"\n"+comp1.price+"\n"+comp1.isNotebook+"\n"+comp1.hardDiskMemory+"\n"+comp1.freeMemory+"\n"+comp1.operationSystem);
	    comp2.comparePrice(comp6);
	    comp3.comparePrice(comp4);
	    comp1.comparePrice(comp2);
		System.out.println();
		//System.out.println(comp2.year+"\n"+comp2.price+"\n"+comp2.isNotebook+"\n"+comp2.hardDiskMemory+"\n"+comp2.freeMemory+"\n"+comp2.operationSystem);
	}
}