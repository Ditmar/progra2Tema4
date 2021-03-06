package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import colors.MyColors;

public class MainWindow extends JFrame {

	public MainWindow() {
		super("Ventana Principal");
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		//this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		
		for (int i = 0; i < 45; i++) {
			JButton button = new JButton("Button " + i);
			this.add(button);
		}
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(this);
		
		this.setVisible(true);
	}
}
