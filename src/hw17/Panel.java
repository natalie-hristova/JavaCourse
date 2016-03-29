package hw17;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel {

	double number;
	int ost, sto, pet10, dva10, deset, pet, dva, edin;
	int pet10st, dva10st, desetst, petst, dvest, edna;
	private static String money[] = { "Max 100", "Max 50", "Max 20", "Max 10"};
	private JTextArea textArea, textArea2, textArea3,textArea4;
	private JTextField tf;

	public Panel(double num) {
		this.number = num * 100;
		ost = (int) (number);

		this.setBackground(Color.PINK);
		String levs = (String) JOptionPane.showInputDialog(null, "Choose:",
				"How your money will be devided", JOptionPane.QUESTION_MESSAGE,
				null, money, "Max100");

		sto = ost / 10000;
		ost = ost % 10000;
		pet10 = ost / 5000;
		ost = ost % 5000;
		dva10 = ost / 2000;
		ost = ost % 2000;
		deset = ost / 1000;
		ost = ost % 1000;
		pet = ost / 500;
		ost = ost % 500;
		dva = ost / 200;
		ost = ost % 200;
		edin = ost / 100;
		ost = ost % 100;

		pet10st = ost / 50;
		ost = ost % 50;
		dva10st = ost / 20;
		ost = ost % 20;
		desetst = ost / 10;
		ost = ost % 10;
		petst = ost / 5;
		ost = ost % 5;
		dvest = ost / 2;
		edna = ost % 2;

		textArea = new JTextArea();
		textArea.setText("Banknoti-100 leva:" + sto + "\nBanknoti- 50 leva:"
				+ pet10 + "\nBanknoti-20 leva:" + dva10 + "\nBanknoti-10 leva:"
				+ deset + "\nBanknoti-5 leva:" + pet
				+ "\nBanknoti ot po 2 leva:" + dva + "\nBanknoti-1 lev:" + edin
				+ "\nMoneti-50 stotinki:" + pet10st + "\nMoneti-20 stotinki:"
				+ dva10st + "\nMoneti- 10 stotinki:" + deset
				+ "\nMoneti- 5 stotinki:" + petst + "\nMoneti-2 stotinki:"
				+ dvest + "\nMoneti-1 stotinka:" + edna);
		textArea.setEditable(false);

		textArea2 = new JTextArea();
		textArea2.setText("Banknoti- 50 leva:" + (pet10 + 2 * sto)
				+ "\nBanknoti-20 leva:" + dva10 + "\nBanknoti-10 leva:" + deset
				+ "\nBanknoti-5 leva:" + pet + "\nBanknoti ot po 2 leva:" + dva
				+ "\nBanknoti-1 lev:" + edin + "\nMoneti-50 stotinki:"
				+ pet10st + "\nMoneti-20 stotinki:" + dva10st
				+ "\nMoneti- 10 stotinki:" + deset + "\nMoneti- 5 stotinki:"
				+ petst + "\nMoneti-2 stotinki:" + dvest
				+ "\nMoneti-1 stotinka:" + edna);
		textArea2.setEditable(false);

		textArea3 = new JTextArea();
		textArea3.setText("Banknoti-20 leva:" + (dva10 + 2 * pet10 + 5 * sto)
				+ "\nBanknoti-10 leva:" + deset + "\nBanknoti-5 leva:" + pet
				+ "\nBanknoti ot po 2 leva:" + dva + "\nBanknoti-1 lev:" + edin
				+ "\nMoneti-50 stotinki:" + pet10st + "\nMoneti-20 stotinki:"
				+ dva10st + "\nMoneti- 10 stotinki:" + deset
				+ "\nMoneti- 5 stotinki:" + petst + "\nMoneti-2 stotinki:"
				+ dvest + "\nMoneti-1 stotinka:" + edna);
		textArea3.setEditable(false);
		
		textArea4 = new JTextArea();
		textArea4.setText("Banknoti-10 leva:" + (deset+5*pet10+10*sto+2*20)
				+ "\nBanknoti-5 leva:" + pet + "\nBanknoti ot po 2 leva:" + dva
				+ "\nBanknoti-1 lev:" + edin + "\nMoneti-50 stotinki:"
				+ pet10st + "\nMoneti-20 stotinki:" + dva10st
				+ "\nMoneti- 10 stotinki:" + deset + "\nMoneti- 5 stotinki:"
				+ petst + "\nMoneti-2 stotinki:" + dvest
				+ "\nMoneti-1 stotinka:" + edna);
		textArea4.setEditable(false);

		tf = new JTextField("Entered money:"+(number/100)+", " + levs);
		tf.setEditable(false);
		this.add(tf);

		// this.add(textArea);
		if (levs.equals("Max 100")) {
			this.add(textArea);

		} else if (levs.equals("Max 50")) {
			this.add(textArea2);
		} else if (levs.equals("Max 20")) {
			this.add(textArea3);
		} else if (levs.equals("Max 10")) {
			this.add(textArea4);
		}

	}
	
}
