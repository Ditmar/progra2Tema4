package ui;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	public MainWindow() {
		super("Ventana Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 716);
		this.setLocationRelativeTo(this);
		this.setLayout(null);
		this.setVisible(true);
	}
}
