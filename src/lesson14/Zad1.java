package lesson14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Zad1 extends JPanel {
	public static void main(String[] args) {
		// JOptionPane jp=new JOptionPane();
		String x = JOptionPane.showInputDialog("Enter the width:");
		String y = JOptionPane.showInputDialog("Enter the height:");
		String k1 = JOptionPane.showInputDialog("Enter one point:");
		String k2 = JOptionPane.showInputDialog("Enter the other point:");

		int wigth = Integer.parseInt(x);
		int heigth = Integer.parseInt(y);
		int p1 = Integer.parseInt(k1);
		int p2 = Integer.parseInt(k2);
		// Graphics n;

		System.out.println(x);
		System.out.println(y);

		JFrame frame = new JFrame("Drawing program");
		frame.setBackground(Color.BLUE);
		frame.setSize(wigth, heigth);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		Triangle triangle = new Triangle(wigth, heigth, p1, p2);
		
		frame.add(triangle);
	}
}
