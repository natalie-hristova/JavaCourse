package lesson11a.lesson11a;

public class NotepadDemo {
	public static void main(String[] args) {
		INotepad notepad = new SecuredNotepad(10);

		notepad.addText("Hello", 1);
		notepad.addText("Hell", 2);

		notepad.print();
	}
}
