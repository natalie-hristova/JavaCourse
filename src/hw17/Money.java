package hw17;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Money {
	public static void main(String[] args) {
		
		String num  = JOptionPane.showInputDialog("Enter money");
		double number = Double.parseDouble(num);
		
	
	JFrame frame = new JFrame("Money ");
	frame.setSize(250, 350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new Panel(number);
	frame.add(panel);
	frame.setVisible(true);
}
}
