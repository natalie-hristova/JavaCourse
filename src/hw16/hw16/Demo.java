package hw16.hw16;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Demo {
	public static void main(String[] args) {
		//int codingNumber = 0;
		//while (codingNumber > 10 || codingNumber <1) {
			String num  = JOptionPane.showInputDialog("enter coding value between 1 and 10");
			//try {
				int number = Integer.parseInt(num);
			//} catch (NumberFormatException e) {
				//JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
			//}
		//}
		
		JFrame frame = new JFrame("Ecrypt/Decrypt");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new Panel(number);
		frame.add(panel);
		frame.setVisible(true);
	}
}
