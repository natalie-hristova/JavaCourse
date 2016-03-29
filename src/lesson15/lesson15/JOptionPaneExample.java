package lesson15.lesson15;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "Hello SoftAcad!");
		// JOptionPane.showMessageDialog(null, "This is a message",
		// "This is title", JOptionPane.ERROR_MESSAGE);
		// JOptionPane.showMessageDialog(null, "This is message with image",
		// "Test image message", JOptionPane.PLAIN_MESSAGE, new ImageIcon(
		// "D:\\info.png"));

		// int result = JOptionPane.showConfirmDialog(null, "Is today monday?");
		// System.out.println(result);
		// if (result == 0) {
		// System.out.println("Yes, today is monday");
		// } else {
		// System.out.println("No, today is not monday");
		// }
		// JOptionPane.showConfirmDialog(null, "Is today monday",
		// "Please answer the question", JOptionPane.YES_NO_CANCEL_OPTION);
		// JOptionPane.showConfirmDialog(null, "Is today monday",
		// "Please answer the question", JOptionPane.YES_NO_OPTION,
		// JOptionPane.ERROR_MESSAGE);

		// String name = JOptionPane.showInputDialog("What is your name?");
		// JOptionPane.showInputDialog("What is your name",
		// "Enter your name here...");

		// String[] cars = { "BMW", "Mercedes", "Ford", "Ferrari" };

		Car[] cars = new Car[3];
		Car ford = new Car("Ford Fiesta", 1999);
		Car bmw = new Car("BMW 530", 2005);
		Car benz = new Car("Mercedes Benz", 2010);
		cars[0] = ford;
		cars[1] = bmw;
		cars[2] = benz;

		System.out.println(ford);
		Car c = (Car) JOptionPane.showInputDialog(null,
				"What is your favourite car brand", "Choose car brand",
				JOptionPane.QUESTION_MESSAGE, null, cars, "Mercedes");
		System.out.println(c);
		c.startEngine();

	}
}
