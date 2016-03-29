package lesson18;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo {
	public static void main (String []args){
	JFrame frame = new JFrame("Calculator");
	frame.setSize(200, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	JPanel panel = new Calculator();
	frame.add(panel);
	frame.setVisible(true);
	}
}
