package lesson18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator  extends JPanel{
		JTextArea jt;
		ButtonsPanel button;
		
		public Calculator(){
			this.setLayout(new BorderLayout());
			jt=new JTextArea(2,50);
			jt.setEditable(false);
			this.add(jt, BorderLayout.NORTH);
			button=new ButtonsPanel();
			this.add(button,BorderLayout.CENTER);
		}
		
//	private  class digitsListener  implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			
//		}
//	}
//	
//	private class clear implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e){
//			
//		}
//	}
}




