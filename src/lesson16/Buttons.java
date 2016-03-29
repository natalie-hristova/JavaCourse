package lesson16;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons extends JPanel {
	private JButton button1;
	private JLabel message;
		Buttons() {
			button1 = new JButton("Clean");
			add(button1);
			message = new JLabel("");
			add(message);
//			button.addActionListener((ActionListener) new ChristmasButtonListener());
	}
//	public class ChristmasButtonListener implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//	message.setText("MERRY CHRISTMAS AND HAPPY NEW YEAR");
//	}
}


