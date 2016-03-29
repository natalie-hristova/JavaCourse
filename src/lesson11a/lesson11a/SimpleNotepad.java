package lesson11a.lesson11a;

public class SimpleNotepad implements INotepad {
	private Page[] pages;

	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages >= 0) {
			pages = new Page[numberOfPages];
			for (int i = 0; i < pages.length; i++) {
				pages[i] = new Page();
			}
		}
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (isValidPageNumber(pageNumber)) {
			// Page tempPage = pages[page - 1];
			// tempPage.addText(text);
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void setText(String text, int pageNumber) {
		if (isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].setText(text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void print() {
		for (Page page : pages) {
			System.out.println(page.review());
		}
		// for (int i = 0; i < pages.length; i++) {
		// Page page = pages[i];
		// page.review();
		// }
	}

	private boolean isValidPageNumber(int pageNumber) {
		return pageNumber > 0 && pageNumber <= pages.length;
	}
}
