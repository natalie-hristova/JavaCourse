package lesson16;

import hw15.EncryptionPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Numbers {
	public static void main (String args[]){
		
		String number=JOptionPane.showInputDialog("Number from 1 to 10");
		int number1 = Integer.parseInt(number);
		
		JFrame frame = new JFrame("DECRIPTION");
		frame.setSize(1024,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel= new EncryptionPanel();
		frame.setVisible(true);
		          
		JPanel panel=new JPanel();
		frame.add(panel);
		String act[]={"Encrypt","Decrypt"};
		String sh=(String) JOptionPane.showInputDialog(null,"Choose:",
				"Shapes",JOptionPane.QUESTION_MESSAGE,null,act,"Encrypt");
		if (sh.equals("Encrypt")){
			//make butonn"encrypt"
		}else{
			//make buton "discypt"
		}
		String simbols=JOptionPane.showInputDialog("Text to " + sh);
//		panel.add(sh);
//		frame.add(symbols);
		
		JButton button = new JButton(sh);
		button.setSize(10,78);
		frame.add(button);
		frame.setVisible(true);
		button.setEnabled(true);
		
		JButton button2 = new JButton("Clear");
		button2.setSize(45,45);
		frame.add(button2);
		frame.setVisible(true);
		button.setEnabled(true);
	}

}
