package main;

import javax.swing.JFrame;

import panels.MainPanel;

public class MainFrame {
	
	public static MainPanel mainPanel = new MainPanel();

	public static void main(String[] args) {
		JFrame f = new JFrame("TXT-Editor");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		f.add(mainPanel);
		f.pack();

		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
