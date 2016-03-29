package hw08;

public class Call {
	private static double priceForAMinute;
	private GSM caller;
	private GSM receiver;
	private double duration;
	
	Call(double duration){
		this.duration=duration;
		this.priceForAMinute=0.21;
	}
	
	Call(GSM caller, GSM receiver, double duration){
		this(duration);
		this.receiver=receiver;
		this. caller= caller;
	}
	public double getPriceForAMinute(){
		return priceForAMinute;
	}
	
	public void setCaller(GSM caller){
		this.caller=caller;
	}
	public GSM getCaller(){
		return caller;
	}
	public void setReceiver(GSM receiver){
		this.receiver=receiver;
	}
	public GSM getReceiver(){
		return receiver;
	}
	public void setDuration(double duration){
		if (isDurationValid(duration)){
			this.duration=duration;
		}else{
		System.out.println("The entered number is not correct!");
		}	
	} 
	public double getDuration(){
		return duration;
	}
	

	public static boolean isDurationValid(double duration) {
		if (duration > 0 && duration < 120) {
			return true;
		}else {
			return false;
		}
	}
}

