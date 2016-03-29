package copy;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SeaChessPopUps {
	static  ColoredSymbol  x;


	public static String getName(){
		
		String name=JOptionPane.showInputDialog("Choose name");
		
		return name;
	}
	
	public static Color getColor(){
	String colorsChoice[]={"BLUE","PINK","GREEN","RED","YELLOW"};
	Color fff= null;
	String colors=(String) JOptionPane.showInputDialog(null,"Choose:",
			"Colour of the figure",JOptionPane.QUESTION_MESSAGE,null,colorsChoice,"GREEN");
	switch (colors) {
	case "BLUE" : fff = Color.BLUE;
	break;
	case "RED" : fff = Color.RED;
	break;
	case "PINK" : fff = Color.PINK;
	break;
	case "GREEN" : fff = Color.GREEN;
	break;
	case "YELLOW" : fff = Color.YELLOW;
	break;
	}
	
	return fff;
	}
	
	
	public static String getShape(){
		
	String []shapes={"X","O"};
	String form=(String) JOptionPane.showInputDialog(null,"Choose:",
			"form of the figure",JOptionPane.QUESTION_MESSAGE,null,shapes,"X");
	
	return form;
		
	}
	
		
}



