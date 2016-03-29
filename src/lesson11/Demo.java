package lesson11;


public class Demo {
public static void main (String []args){
	ElectronicSecuredNotepad esn1=new ElectronicSecuredNotepad(5);
	//esn1.stop();
	esn1.addText("Hahah",1);
	esn1.start();
	esn1.addText(" Ne",1);
	esn1.addText("born in 1921", 3);
	esn1.addText("Cucumber", 2);
	esn1.printAll();
	esn1.printAllPagesWithDigits();
	esn1.searchWord("in");
	
}
}
