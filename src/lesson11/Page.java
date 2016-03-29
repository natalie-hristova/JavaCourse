package lesson11;

public class Page {
	private String title;
	private String text;

	public Page() {
		this.title = "-";
		this.text = "-";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public String addTekst(String text) {
	 this.text = this.text + text;
		return this.text;
	}

	public void deleteTekst() {
		this.text = "-";
	}

	public String review() {
		return title + " " + text;
	}
	public void searchWord(String word){
		if(this.text.contains(word)){
			System.out.println(word + "  can be found in the text"+ "\n" + this.text);
		}
	}
	
	public boolean  containsDigits(){
		if(this.text.contains("1")||this.text.contains("2")||this.text.contains("3")||this.text.contains("4")||this.text.contains("5")
		  ||this.text.contains("6")||this.text.contains("7")||this.text.contains("8")||this.text.contains("9")||this.text.contains("0")){
			return true;
		}else{
			return false;	
		}
	}
}
