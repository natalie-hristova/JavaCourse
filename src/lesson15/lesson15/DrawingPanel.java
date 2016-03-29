package lesson15.lesson15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	public static final int FONT_SIZE = 30;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// draw line
		g.drawLine(100, 100, 300, 300);
		g.drawRect(300, 400, 200, 100);
		// Color newColor = new Color(213, 34, 2);
		g.setColor(Color.BLUE);
		g.drawLine(400, 115, 500, 115);
		g.drawOval(2, 2, 100, 30);
		g.setColor(Color.RED);

		g.fillRect(115, 407, 50, 60);
		// int[] x = { 300, 320, 400 };
		// int[] y = { 300, 400, 300 };
		// g.drawPolygon(x, y, 3);

		int[] x = { 300, 400, 320, 200 };
		int[] y = { 300, 300, 400, 350 };
		g.drawPolygon(x, y, 4);

		Font newFont = new Font(g.getFont().getName(), Font.ITALIC, FONT_SIZE);
		g.setFont(newFont);
		g.drawString("SoftAcad", 600, 500);

	}
}
