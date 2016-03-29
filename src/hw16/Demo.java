package hw16;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Demo {
	public static void main(String[] args) {
		
			String num  = JOptionPane.showInputDialog("Enter a number between 1 and 10");
			int number = Integer.parseInt(num);
			
		
		JFrame frame = new JFrame("Ecrypt/Decrypt");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new Panel(number);
		frame.add(panel);
		frame.setVisible(true);
	}
}
