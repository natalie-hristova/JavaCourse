package lesson11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotePad {
	private final String password;
	Page pages[];

	public SecuredNotepad(int page) {
		super(page);
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);
		this.password = sc.nextLine();
	}

	@Override
	public void deleteText(int page) {
		if (isPasswordCorrect()) {
			super.deleteText(page);
		}
	}

	@Override
	public void addText(String text, int page) {
		if (isPasswordCorrect()) {
			super.addText(text, page);
		}
	}

	@Override
	public void addTextDelOld(String text, int page) {
		if (isPasswordCorrect()) {
			super.addTextDelOld(text, page);
		}
	}

	@Override
	public void printAll() {
		if (isPasswordCorrect()) {
			super.printAll();
		}
	}

	public boolean isPasswordCorrect() {
		System.out.println("Enter the pasword for check:");
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		if (this.password.equals(pass)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void searchWord(String word){
		if (isPasswordCorrect()){
		super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits(){
		if (isPasswordCorrect()){
		super.printAllPagesWithDigits();
		}
	}
	}
