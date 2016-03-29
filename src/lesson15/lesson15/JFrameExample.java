package lesson15.lesson15;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JPanel panel = new JPanel();
		JPanel panel = new DrawingPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}
