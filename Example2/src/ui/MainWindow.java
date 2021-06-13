package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
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

public class MainWindow extends JFrame {
	private JPanel leftPanel;
	private JPanel rigthPanel;
	private JLabel titleLabel;
	private JLabel loginLabel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private Font titleFont;
	private Font loginfont;
	private Cursor handCursor;
	private Border borderTest;
	private Border borderDashed;
	JComboBox<String> typeUserComboBox;
	
	private ImageIcon logo;
	private ImageIcon user;
	private ImageIcon lock;
	private ImageIcon iconBtn;
	
	
	private JLabel logoIMG;
	private JLabel userImg;
	private JLabel lockImg;
	public MainWindow() {
		super("Ventana Principal");
		this.registerNewFonts();
		this.loadImages();
		
		
		
		handCursor = new Cursor(Cursor.HAND_CURSOR);
		/*
		 * Uso de Bordes
		 * */
		borderTest = BorderFactory.createMatteBorder(0, 0, 3, 0, MyColors.thirth);
		borderDashed = BorderFactory.createDashedBorder(MyColors.secondary, 2, 5 ,2 , true);
		
		
		leftPanel = new JPanel();
		leftPanel.setSize(600, 500);
		leftPanel.setLocation(0, 0);
		//#9b59b6
		//155, 89, 182
		leftPanel.setLayout(null);
		leftPanel.setBackground(MyColors.primary);
		this.add(leftPanel);
		logoIMG = new JLabel();
		logoIMG.setIcon(logo);
		logoIMG.setBounds(leftPanel.getWidth() / 2 - 256/2, 100 , 256, 256);
		leftPanel.add(logoIMG);
		
		rigthPanel = new JPanel();
		rigthPanel.setSize(400, 500);
		rigthPanel.setLocation(600, 0);
		//#34495e
		//52,73,94
		rigthPanel.setLayout(null);
		rigthPanel.setBackground(MyColors.secondary);
		this.add(rigthPanel);
		
		//Create decorator
		titleFont = new Font("ZCOOL KuaiLe", Font.BOLD, 30);
		
		titleLabel = new JLabel("Gestor de Notas");
		titleLabel.setBounds(10, 10, 350, 30);
		titleLabel.setForeground(MyColors.fourth);
		titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
		titleLabel.setFont(titleFont);
		
		leftPanel.add(titleLabel);
		
		loginfont = new Font("Dosis", Font.ITALIC, 15);
		loginLabel = new JLabel("Login De Usuario");
		loginLabel.setBounds(10, 10, 220, 30);
		loginLabel.setForeground(MyColors.fourth);
		loginLabel.setFont(loginfont);
		rigthPanel.add(loginLabel);
		
		
		usernameTextField = new JTextField("Nombre de Usuario");
		usernameTextField.setSize(260, 40);
		Integer x = (rigthPanel.getWidth() - usernameTextField.getWidth()) / 2;
		Integer y = 120;
		usernameTextField.setLocation(x, y);
		//usernameTextField.setBounds(x, y, WIDTH, HEIGHT);
		usernameTextField.setForeground(MyColors.thirth);
		usernameTextField.setBackground(MyColors.secondary);
		usernameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		
		usernameTextField.setBorder(borderTest);
		userImg = new JLabel();
		userImg.setBounds(x - (64 + 2), y - 64/2, 64, 64);
		userImg.setIcon(user);
		
		rigthPanel.add(userImg);
		
		rigthPanel.add(usernameTextField);
		
		passwordField = new JPasswordField("Nombre de Usuario");
		passwordField.setSize(260, 40);
		Integer x2 = (rigthPanel.getWidth() - passwordField.getWidth()) / 2;
		Integer y2 = 170;
		passwordField.setLocation(x2, y2);
		//usernameTextField.setBounds(x, y, WIDTH, HEIGHT);
		passwordField.setForeground(MyColors.thirth);
		passwordField.setBackground(MyColors.secondary);
		passwordField.setBorder(borderTest);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		rigthPanel.add(passwordField);
		
		lockImg = new JLabel();
		lockImg.setBounds(x2 - (64 + 2), y2, 64, 64);
		lockImg.setIcon(lock);
		rigthPanel.add(lockImg);
		
		// Combo Box
		String[] label = {"Administrador", "Director", "Secretaria"};
		typeUserComboBox = new JComboBox<>(label);
		typeUserComboBox.setSize(150, 25);
		typeUserComboBox.setLocation((rigthPanel.getWidth() - typeUserComboBox.getWidth()) / 2, 240);
		typeUserComboBox.setBackground(MyColors.primary);
		rigthPanel.add(typeUserComboBox);
		
		
		
		loginButton = new JButton("Entrar");
		loginButton.setSize(140, 60);
		loginButton.setLocation((rigthPanel.getWidth() - loginButton.getWidth()) / 2, 300);
		loginButton.setBackground(MyColors.primary);
		loginButton.setCursor(handCursor);
		loginButton.setFont(loginfont);
		loginButton.setBorder(borderDashed);
		loginButton.setIcon(this.iconBtn);
		
		loginButton.addActionListener((event) -> {
			System.out.println("CLICK!!!!");
		});
		
		rigthPanel.add(loginButton);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(this);
		this.setLayout(null);
		this.setVisible(true);
	}
	private void loadImages() {
		try {
			String path = new File(".").getCanonicalPath();
			this.logo = new ImageIcon(path + "\\resources\\images\\logo.png");
			this.user = new ImageIcon(path + "\\resources\\images\\user.png");
			this.lock = new ImageIcon(path + "\\resources\\images\\lock.png");
			this.iconBtn = new ImageIcon(path + "\\resources\\images\\icon_btn.png");
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
}
