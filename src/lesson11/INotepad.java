package lesson11;

public interface INotepad {

	 void addText(String text,int page);
	 void addTextDelOld(String text,int page);
	 void deleteText(int page);
	 void printAll();
	 void searchWord(String word);
	 void printAllPagesWithDigits();
	 
}
