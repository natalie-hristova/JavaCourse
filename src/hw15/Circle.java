package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel{
	final int RADIUS=250;
	int numbers;
	int distance;
	Color color;
	
	Circle(int numbers,int distance,Color color){
	this.numbers=numbers;
	this.distance=distance;
	this.color=color;
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x =0;
		for(int i=0;i<=numbers;i++){
		g.setColor(color);
		g.drawOval(x+i*distance, x+i*distance, RADIUS,RADIUS);	
		}
}
	}
