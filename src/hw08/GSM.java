package hw08;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	GSM(String model) {
		this.model = model;
		this.outgoingCallsDuration=0;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	void insertSimCard(String simMobileNumber) {
		if ((simMobileNumber.length() == 10)
				&& simMobileNumber.startsWith("08")) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
			System.out.println("The number is correct!");
		} else {
			System.out.println("The number is Not correct");
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		System.out.println("The phone is without a sim card!");
	}

	void call(GSM receiver, double duration) {
		if (Call.isDurationValid(duration) && arePhonesSame(receiver)
				&& haveSimCard(receiver)) {

			Call c = new Call(this, receiver, duration);
			this.lastOutgoingCall = c;
			receiver.lastIncomingCall = c;
			this.outgoingCallsDuration += duration;
			System.out.println("Call works!!!");
			GSM x = c.getReceiver();
			GSM y = c.getCaller();
			double z = c.getDuration();
			System.out.println(x.getSimMobileNumber() + " "	+ y.getSimMobileNumber() + " " + z);
		}
	}

	private boolean haveSimCard(GSM receiver) {
		if (this.hasSimCard && receiver.hasSimCard) {
			System.out.println("Both of the phones have sim cards!");
			return true;
		} else {
			System.out.println("NOT both phones have sim cards!");
			return false;
		}
	}

	private boolean arePhonesSame(GSM receiver) {
		if (this.hasSimCard && receiver.hasSimCard){
			System.out.println("Both of the phones have sim cards!");
			return true;
		}else{
			System.out.println("NOT both phones have sim cards!");
			return false;	
		}
	
	}

	public double getSumForCall() {
		double sum;
		if (lastOutgoingCall!=null){
			sum = outgoingCallsDuration * lastOutgoingCall.getPriceForAMinute();
			System.out.println("The sum is :" + sum);	
			return sum;
		}else{
		
		return 0;
		}
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null) {
			GSM n = lastOutgoingCall.getCaller();
			GSM m = lastOutgoingCall.getReceiver();
			double d = lastOutgoingCall.getDuration();
			System.out.println("The caller:" + n + ",the receiver:" + m + ",the duration:" + d);
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			GSM n = lastIncomingCall.getCaller();
			GSM m = lastIncomingCall.getReceiver();
			double d = lastIncomingCall.getDuration();
			System.out.println("The caller:" + n + ",the receiver:" + m
					+ ",the duration:" + d);

		}
	}
}
