package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Square  extends JPanel {
  final int  side=100;
  int numberOfFigures;
  int distance;
  int x =0;
  Color color;
  
	Square (int numberOfFigures,int distance, Color color){
		this.numberOfFigures= numberOfFigures;
		this.distance= distance;
		this. color= color;
		}

	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0;i<=numberOfFigures;i++){
			g.setColor(color);
		g.drawRect(x+i*distance, x+i*distance, side,side);	
		}
	}
	
 }

