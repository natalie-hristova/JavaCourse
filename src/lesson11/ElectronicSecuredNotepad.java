package lesson11;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
	private final String password;
	private boolean isStarted;
	
	ElectronicSecuredNotepad(int page){
		super(page);
		System.out.println("Enter bb the password:");
		Scanner sc=new Scanner(System.in);
		this.password=sc.nextLine();
		this.isStarted=true;
		if (isPassStrong(this.password)){
			System.out.println("The password is strong");
		}else{
			System.out.println("The password is NOT strong");
		}
	}
	@Override
	public boolean  start(){
		System.out.println("Start");
		return isStarted=true;
	}
	@Override
	public boolean stop(){
		System.out.println("Stop");
		return isStarted=false;
	}
	@Override
	public boolean isStarted(){
			return isStarted;
	}
	@Override
	public void deleteText(int page) {
		if ( isStarted()) {
			super.deleteText(page);
		}else{
			System.out.println("Error");
		}
	
	}

	@Override
	public void addText(String text, int page) {
		if ( isStarted()) {
			super.addText(text, page);
		}else {
			System.out.println("Error");
		}
	}

	@Override
	public void addTextDelOld(String text, int page) {
		if (isStarted()==true) {
			super.addTextDelOld(text, page);
		}
	}

	@Override
	public void printAll() {
		if ( isStarted()==true) {
			super.printAll();
		}
	}
	@Override
	public void searchWord(String word){
		if (isStarted()){
		super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits(){
		if (isStarted()){
		super.printAllPagesWithDigits();
		}
	}
	public boolean isPassStrong(String pass){
		if(pass.length() >=5 && hasSmallLetter(pass) && hasBigLetter(pass) && hasNumber(pass)){
			return true;
		}else return false;
	}
	private boolean  hasSmallLetter(String pass){
		for (int i =0;i<pass.length();i++){
			if(pass.charAt(i)>'a' && pass.charAt(i)<'z'){
		return true;
		}
			}
			return false;	
	}
	private  boolean hasBigLetter(String pass){
		for (int i=0;i<pass.length();i++){
			if (pass.charAt(i)>'A' && pass.charAt(i)<'Z'){
				return true;
				}	
		}return false;
	}
		private boolean  hasNumber(String pass){
			for (int i =0;i<pass.length();i++){
				if(pass.charAt(i)>'0' && pass.charAt(i)<'9'){
			return true;
			}
				}
				return false;
	}
}
