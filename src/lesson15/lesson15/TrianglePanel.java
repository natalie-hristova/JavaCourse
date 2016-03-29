package lesson15.lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TrianglePanel extends JPanel{
	
	private int side;
	
	public TrianglePanel(int side) {
		this.side = side;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		
		int[] x = {this.getWidth() / 2, this.getWidth() / 2 + side, this.getWidth() / 2};
		int[] y = {this.getHeight() / 2, this.getHeight() / 2, this.getHeight() / 2 + side};
		g.fillPolygon(x, y, 3);
		
		this.setBackground(Color.BLUE);
		
	}
}
