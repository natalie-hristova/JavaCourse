package lesson15.lesson15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TrianglePanelDemo {
	public static void main(String[] args) {
		String widthStr = JOptionPane.showInputDialog("Enter width");
		int widht = Integer.parseInt(widthStr);

		String heightStr = JOptionPane.showInputDialog("Enter height");
		int height = Integer.parseInt(heightStr);

		String sideStr = JOptionPane.showInputDialog("Enter side");
		int side = Integer.parseInt(sideStr);

		JFrame window = new JFrame("Triangle Panel");
		window.setSize(widht, height);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel trianglePanel = new TrianglePanel(side);
		window.add(trianglePanel);

		window.setVisible(true);
	}
}
