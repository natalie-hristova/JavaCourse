package hw16;

//import hw16.Panel.ComboBoxListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.scene.control.ComboBox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Nata extends JPanel {
		int number;
		String []ujas={"dsf","dffdg"};

		private JComboBox c;
		private JButton jb;
		JLabel jl;
		JTextArea jta;
		JTextField jtf;

	Nata (int num){
	this.number=num;
	setBackground(Color.PINK);
	
	c= new JComboBox(ujas);
	c.addActionListener(new ComboListener());
	this.add(c);
	
	jb=new JButton("dsfdfsfds");
	jb.addActionListener(new NButtonListener());
	this.add(jb);
	}
	
	class  ComboListener implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if ("Decrypt".equals(c.getSelectedItem())){
				jl.setText("x");
			}else{
				jl.setText("y");
			}
		}
	}
   class  NButtonListener implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText("fdgtrdhty");
			}
	}
  } 
