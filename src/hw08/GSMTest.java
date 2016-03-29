package hw08;

public class GSMTest {
public static void main (String[] args){
	
	//Call c0=new Call(6);
	//Call c4=new Call(10);
	GSM gsm1=new GSM("Asha");
	GSM gsm2=new GSM("NEXUS");
	GSM gsm3=new GSM("Xperia");
	GSM gsm4=new GSM("Sony");
	GSM gsm5=new GSM("Xperia X");
	
	

	gsm1.insertSimCard("0897654");
	gsm2.insertSimCard("0888720060");
	gsm3.insertSimCard("0888723460");
	gsm4.insertSimCard("0888744460");
	gsm3.call(gsm2,23);
	gsm3.getSumForCall();
	gsm4.call(gsm2,73);
	gsm4.getSumForCall();
	gsm4.printInfoForTheLastOutgoingCall();
	gsm4.printInfoForTheLastIncomingCall();
	gsm5.removeSimCard();
	
	
}
}
