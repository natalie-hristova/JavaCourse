package hw16;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	private int number;
	
	private static final int COLS = 10;
	private static final int ROWS = 8;

	private static String modes [] = { "Encrypt","Decrypt" };
	
	private JComboBox combo;
	private JLabel label;
	private JTextField textField;
	private JButton encryptButton;
	private JButton clearButton;
	private JTextArea textArea;

	
	public Panel(int number) {
		this.number = number;
		setBackground(Color.PINK);
		
		
		combo = new JComboBox(modes);
		combo.addActionListener(new ComboBoxListener());
		this.add(combo);
		
		label = new JLabel("Text to encrypt");	
		this.add(label);
		
		textField = new JTextField(COLS);
		this.add(textField);
		
		encryptButton = new JButton("Encrypt");
		encryptButton.addActionListener(new EncryptButtonListener());
		this.add(encryptButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ClearButtonListener());
		this.add(clearButton);
		
		textArea = new JTextArea(ROWS, COLS);
		this.add(textArea);
		

		}
	
	private class ComboBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (isDecrypt()) {
				label.setText("Text to decrypt");
				encryptButton.setText("Decrypt");
			} else {
				label.setText("Text to encrypt");
				encryptButton.setText("Encrypt");
			}
		}
	}
	
	private class EncryptButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String text  = encrypt(textField.getText(), isDecrypt());
			textArea.setText(text);
		}
	}
	
	private class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	}
	

	private String encrypt (String text, boolean decrypt) {
		String textToReturn = "";
		char temp;
		for(int i = 0; i < text.length(); i++) {
			temp = text.charAt(i);
			if (decrypt) {
				temp -= number + i;
			} else {
				temp += number + i;
			}
			textToReturn += temp;
		}
		
		return textToReturn;
	}
	
	private boolean isDecrypt() {
		return "Decrypt".equals(combo.getSelectedItem());
	}
}
