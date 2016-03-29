package lesson11a.lesson11a;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private final String password;

	public SecuredNotepad(int numberOfPages) {
		super(numberOfPages);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Creating security. Enter password:");

		String password = scanner.nextLine();

		this.password = password;
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (isPasswordCorrect()) {
			super.addText(text, pageNumber);
		}
	}

	@Override
	public void setText(String text, int pageNumber) {
		if (isPasswordCorrect()) {
			super.setText(text, pageNumber);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isPasswordCorrect()) {
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void print() {
		if (isPasswordCorrect()) {
			super.print();
		}
	}

	private boolean isPasswordCorrect() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter password:");

		String password = scanner.nextLine();

		return this.password.equals(password);
	}
}
