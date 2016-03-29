package lesson18;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
	
	final int NUMBERS=10;
	private JButton[] digits;
	JButton plus;
	JButton minus;
	JButton multiply;
	JButton result;
	JButton clear;
	JButton devide;
	 
	public ButtonsPanel(){
		this.setLayout(new GridLayout(4, 4, 5, 5));
		digits = new JButton[NUMBERS]; 
		
		initializeButtons();
		addButtons();
		
		}
	
	private void addButtons() {
		this.add(digits[7]);
		this.add(digits[8]);
		this.add(digits[9]);
		this.add(plus);
		
		this.add(digits[4]);
		this.add(digits[5]);
		this.add(digits[6]);
		this.add(minus);
		
		this.add(digits[1]);
		this.add(digits[2]);
		this.add(digits[3]);
		this.add(multiply);
		
		this.add(digits[0]);
		this.add(clear);
		this.add(result);
		this.add(devide);

}
	void initializeButtons(){
		for (int i=0;i<digits.length;i++) {
			digits[i]=new JButton(Integer.toString(i));
		}
	
	plus = new JButton("+");
//	plus.addActionListener(new PlusListener());
	minus = new JButton("-");
	multiply = new JButton("*");
	devide = new JButton("/");
	clear = new JButton("C");
	result = new JButton("=");
	}
}
