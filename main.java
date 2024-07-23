package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main extends JFrame {
	public main () {
		setSize(400,400);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label = new JLabel("Hello World !!!");
		panel.add(label);
	}
	public static void main(String[] args) {
		new main().setVisible(true);
	}
}
