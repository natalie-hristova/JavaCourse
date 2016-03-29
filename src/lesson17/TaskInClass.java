package lesson17;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TaskInClass extends JPanel{
	public static void main (String args[]){
	JFrame frame=new JFrame("Layout test");
	frame.setSize(1024,768);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	JPanel jp=new JPanel();
	
	 JOptionPane.showMessageDialog(null, "Test border layout!");
	 BorderLayout l2 = new BorderLayout(50, 10);
	 //FlowLayout.RIGHT;
	// setLayout(50);
		jp.add(new JButton("Click"));
		frame.add(jp);
		frame.setVisible(true);
	}	
}
