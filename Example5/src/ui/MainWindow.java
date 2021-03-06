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
import contacts.ManagementContacts;
import uiComponents.ContactsComponent;
import uiControlComponents.ControlComponent;
import utils.AppDimension;

public class MainWindow extends JFrame {
	JPanel leftPanel;
	JPanel rigthPanel;
	ContactsComponent contactComponent;
	ControlComponent controlComponent;
	ManagementContacts contacts;
	public MainWindow() {
		super("Ventana Principal");
		this.registerNewFonts();
		this.loadImages();
		this.loadComponents();
		
		
		
		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, AppDimension.sizepanel_left_height));
		leftPanel.setLocation(0, 0);
		//#9b59b6
		//155, 89, 182
		leftPanel.setLayout(new FlowLayout());
		leftPanel.setBackground(MyColors.primary);
		leftPanel.add(contactComponent.getViewPanel());
		this.add(leftPanel);
		
		
		rigthPanel = new JPanel();
		rigthPanel.setPreferredSize(new Dimension(AppDimension.sizepanel_rigth_width, AppDimension.sizepanel_rigth_height));
		rigthPanel.setLocation(600, 0);
		//#34495e
		//52,73,94
		rigthPanel.setLayout(new FlowLayout());
		rigthPanel.setBackground(MyColors.secondary);
		rigthPanel.add(controlComponent.getViewPanel());
		this.add(rigthPanel);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(AppDimension.sizewindows_width, AppDimension.sizewindows_height);
		//this.setPreferredSize(new Dimension(AppDimension.sizewindows_width, AppDimension.sizewindows_height));
		this.setLocationRelativeTo(this);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		this.setVisible(true);
	}
	private void loadImages() {
		try {
			String path = new File(".").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void registerNewFonts() {
			
			try {
				String path = new File(".").getCanonicalPath();
				GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
				ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(path + "\\resources\\fonts\\Dosis-VariableFont_wght.ttf")));
				ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(path + "\\resources\\fonts\\ZCOOLKuaiLe-Regular.ttf")));
				
				
			} catch (FontFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	private void loadComponents() {
		contacts = new ManagementContacts();
		contactComponent = new ContactsComponent(contacts);
		controlComponent = new ControlComponent(contacts);
		controlComponent.registerOnEventCreate(() -> {
			contactComponent.loadTable();
		});
	}
}
