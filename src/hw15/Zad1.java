package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import lesson15.lesson15.Car;

public class Zad1 {
	
	public static void main(String[] args) {
		
	    String shape[]={"Square","Circle"};
		String sh=(String) JOptionPane.showInputDialog(null,"Choose:",
				"Shapes",JOptionPane.QUESTION_MESSAGE,null,shape,"Circle");
		
		String number=JOptionPane.showInputDialog("Enter the number of shapes you want");
		int number1 = Integer.parseInt(number);
		
		String dist=JOptionPane.showInputDialog("Enter the distance:");
		int distance=Integer.parseInt(dist);
		
		
		String c[]={"BLUE","RED","BLACK","GREEN","ORANGE"};
		String colors=(String) JOptionPane.showInputDialog(null,"Choose:",
				"Color",JOptionPane.QUESTION_MESSAGE,null,c,"GREEN");
				Color colorsChoice = null;
		switch (colors) {
			case "BLUE" : colorsChoice = Color.BLUE;
			break;
			case "RED" : colorsChoice = Color.RED;
			break;
			case "BLACK" : colorsChoice = Color.BLACK;
			break;
			case "GREEN" : colorsChoice = Color.GREEN;
			break;
			case "ORANGE" : colorsChoice = Color.ORANGE;
			break;
			default : colorsChoice = Color.BLACK;
			}
		
		JFrame frame = new JFrame("Drawing program");
		frame.setSize(1024,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		if (sh.equals("Square")){
			Square sq=new Square(number1,distance,colorsChoice);
	
			frame.add(sq);
		}else {
			 Circle cir=new Circle(number1,distance,colorsChoice);

			frame.add(cir);
		}
		
}
	
	
}
