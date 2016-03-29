package lesson14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Triangle  extends JPanel{
	int wigth;
	int heigth;
	int p1;
	int p2;
	
	Triangle (int wigth,int heigth,int p1,int p2){
		this.wigth=wigth;
		this.heigth=heigth;
		this.p1=p1;
		this.p2=p2;
	}

	protected void paintComponent(Graphics graphics){
		super.paintComponent(graphics);
		graphics.setColor(Color.BLUE);

		int[] x = {wigth/2,p1 ,wigth/2};
		int[] y = {heigth/2,heigth/2,p2};
		graphics.setColor(Color.RED);
		graphics.fillPolygon(x, y, 3);
		//Color c=new Color.RED;
		
		//g.drawTriangle(wigth/2,heigth/2,wigth/2,p1,heigth/2,p2);
	}
	
}


