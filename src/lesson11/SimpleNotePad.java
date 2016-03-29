package lesson11;


public class SimpleNotePad implements INotepad {
	private Page[] pages;
	
	 public SimpleNotePad(int page){
		 pages = new Page[page];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
			}
	}
	@Override
    public void deleteText(int p) {
		if(arePagesCorrect(p)){
			pages[p-1].deleteTekst();
		}
	
		
	}

	@Override
	public void addText(String text,int page) {
		if(arePagesCorrect(page)){
		pages[page-1].addTekst(text);
		}
	}

	@Override
	public void  addTextDelOld(String text,int page) {
		if(arePagesCorrect(page)){
		pages[page-1].setText(text);
		}
	}

	@Override
	public void printAll() {
		for (int i=0;i<pages.length;i++){
			System.out.println(pages[i].review());
		}	
	}
	@Override
	public void searchWord(String word){
		for (int i=0;i<pages.length;i++){
			pages[i].searchWord(word);
		}
	}
	@Override
	public void printAllPagesWithDigits(){
		for (int i=0;i<pages.length;i++){
			if (pages[i]. containsDigits()){
				System.out.println(pages[i].getText());
			}
		}
	}
	public boolean arePagesCorrect(int page){
		if (page>0 && pages.length>page ){
			return true;
		}else{
			return false;
		}
	}

}
