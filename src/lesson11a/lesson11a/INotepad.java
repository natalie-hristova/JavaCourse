package lesson11a.lesson11a;

public interface INotepad {
	void addText(String text, int page);

	void setText(String text, int page);

	void deleteText(int page);

	void print();
}
