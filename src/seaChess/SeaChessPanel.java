package seaChess;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SeaChessPanel extends JPanel {
	public static final int NUMBER = 3;
	public static final int FONT_SIZE = 75;
	static JButton buttons[][];
	private static Font font = new Font("Arial", Font.BOLD, FONT_SIZE);
	private static Player player1;
	private static Player player2;
	private static Player lastMove;


	public SeaChessPanel() {

		this.setLayout(new GridLayout(3, 3));
		buttons = new JButton[NUMBER][NUMBER];
		player1 = new Player();
		if (player1.getName().equals("")) {
			player1.setName("player1");
		}

		player2 = new Player();
		if (player2.getName().equals("")) {
			player2.setName("player2");
		}
		while (player1.getName().equals(player2.getName())) {
			JOptionPane.showMessageDialog(getComponentPopupMenu(), "Please,change the name!");
			player2.setName(SeaChessPopUps.getName());
		}
		while (player2.areSymbolsTheSame(player1.getColoredSymbol())) {
			JOptionPane.showMessageDialog(getComponentPopupMenu(), "Please,change the color or the type of symbol!");
			player2.setColor(SeaChessPopUps.getColor());
			player2.setShape(SeaChessPopUps.getShape());
		}

		lastMove = player2;
		FieldListener fieldListener = new FieldListener();
		for (int i = 0; i < NUMBER; i++) {
			for (int j = 0; j < NUMBER; j++) {
				buttons[i][j] = new JButton("");
				add(buttons[i][j]);
				buttons[i][j].setBackground(Color.black);
				buttons[i][j].addMouseListener(fieldListener);

			}
		}
		
	}

	public static void chosenSymbolAndColor(JButton button, ColoredSymbol cs) {
		button.setFont(font);
		button.setForeground(cs.getColor());
		button.setText(cs.getShape());

	}

	private class FieldListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			JButton button = (JButton) e.getSource();

			if (isButtonFree(button)) {

				if (isPlayer1Last()) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						chosenSymbolAndColor(button, player2.getColoredSymbol());
					}

				} else {
					if (e.getButton() == MouseEvent.BUTTON1) {
						chosenSymbolAndColor(button, player1.getColoredSymbol());

					}

				}

			}
			if (areRows(player1) || areColumbs(player1) || areDiagonals(player1)) {
				System.out.println(player1.getName() + " wins");

			} else if (areRows(player2) || areColumbs(player2) || areDiagonals(player2)) {
				System.out.println(player2.getName() + " wins");
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		public boolean isPlayer1Last() {
			if (lastMove.equals(player1)) {
				lastMove = player2;
				return true;
			} else {
				lastMove = player1;
				return false;
			}
		}

		public boolean isButtonFree(JButton jb) {
			if (jb.getText().equals("")) {
				return true;
			} else {
				JOptionPane.showMessageDialog(getComponentPopupMenu(), "The box has already been used!");
				return false;
			}
		}

	}

	public boolean areRows(Player player) {
		for (int i = 0; i < 3; i++) {
			if (cmpColSymbol(player.getColoredSymbol(), buttons[i][0].getForeground(), buttons[i][0].getText())
					&& cmpColSymbol(player.getColoredSymbol(), buttons[i][1].getForeground(), buttons[i][1].getText())
					&& cmpColSymbol(player.getColoredSymbol(), buttons[i][2].getForeground(),
							buttons[i][2].getText())) {

				return true;
			}
		}
		return false;

	}

	public boolean areColumbs(Player player) {
		for (int i = 0; i < 3; i++) {
			if (cmpColSymbol(player.getColoredSymbol(), buttons[0][i].getForeground(), buttons[0][i].getText())
					&& cmpColSymbol(player.getColoredSymbol(), buttons[1][i].getForeground(), buttons[1][i].getText())
					&& cmpColSymbol(player.getColoredSymbol(), buttons[2][i].getForeground(),
							buttons[2][i].getText())) {

				return true;
			}
		}
		return false;
	}

	public boolean areDiagonals(Player player) {
		int x = 0, y = 0;
		for (int i = 0; i < 3; i++) {
			if (cmpColSymbol(player.getColoredSymbol(), buttons[i][i].getForeground(), buttons[i][i].getText()))
				if(i==1){
					x++;
					y++;
				}
				else 
					x++;
			else if (cmpColSymbol(player.getColoredSymbol(), buttons[i][2 - i].getForeground(),
					buttons[i][2 - i].getText())){
				y++;
			
		}
			}System.out.println(y);
		if (x == 3 || y == 3)
			return true;
		else
			return false;
	}

	public boolean cmpColSymbol(ColoredSymbol sym1, Color col, String shape) {
		if (sym1.getColor().equals(col) && sym1.getShape().equals(shape))
			return true;
		else
			return false;
	}

}
