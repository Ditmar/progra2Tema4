package uiRegisterContact;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import colors.MyColors;
import utils.AppDimension;

public class RegisterTemplate extends JFrame {
	private JPanel container;
	private JLabel label1, label2, label3, label4;
	private JTextField nameTxt, email, age, telf;
	private JButton btnsend;
	private Border borderTest;
	public RegisterTemplate() {
		super("Registro de Contactos");
		createInterface();
		this.setSize(AppDimension.size_register_form_width, AppDimension.size_register_form_height);
		//this.setPreferredSize(new Dimension(AppDimension.sizewindows_width, AppDimension.sizewindows_height));
		this.setLocationRelativeTo(this);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		this.setVisible(true);
	}

	private void createInterface() {
		// TODO Auto-generated method stub
		borderTest = BorderFactory.createMatteBorder(0, 0, 3, 0, MyColors.thirth);
		container = new JPanel();
		container.setPreferredSize(new Dimension(AppDimension.size_register_form_width, AppDimension.size_register_form_height));
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		container.setBackground(MyColors.primary);
		
		label1 = new JLabel("Apellidos y Nombres");
		label1.setPreferredSize(new Dimension(150, 30));
		label1.setForeground(MyColors.fourth);
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		
		nameTxt = new JTextField("");
		nameTxt.setSize(260, 40);
		nameTxt.setPreferredSize(new Dimension(200, 30));
		nameTxt.setForeground(MyColors.thirth);
		nameTxt.setBackground(MyColors.secondary);
		nameTxt.setHorizontalAlignment(SwingConstants.CENTER);
		nameTxt.setBorder(borderTest);
		
		
		label2 = new JLabel("Apellidos y Nombres");
		label2.setPreferredSize(new Dimension(150, 30));
		label2.setForeground(MyColors.fourth);
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		
		email = new JTextField("");
		email.setSize(260, 40);
		email.setPreferredSize(new Dimension(200, 30));
		email.setForeground(MyColors.thirth);
		email.setBackground(MyColors.secondary);
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setBorder(borderTest);
		
		
		label3 = new JLabel("Edad");
		label3.setPreferredSize(new Dimension(150, 30));
		label3.setForeground(MyColors.fourth);
		label3.setHorizontalAlignment(SwingConstants.LEFT);
		
		age = new JTextField("");
		age.setSize(260, 40);
		age.setPreferredSize(new Dimension(200, 30));
		age.setForeground(MyColors.thirth);
		age.setBackground(MyColors.secondary);
		age.setHorizontalAlignment(SwingConstants.CENTER);
		age.setBorder(borderTest);
		
		label4 = new JLabel("Telefono");
		label4.setPreferredSize(new Dimension(150, 30));
		label4.setForeground(MyColors.fourth);
		label4.setHorizontalAlignment(SwingConstants.LEFT);
		
		telf = new JTextField("");
		telf.setSize(260, 40);
		telf.setPreferredSize(new Dimension(200, 30));
		telf.setForeground(MyColors.thirth);
		telf.setBackground(MyColors.secondary);
		telf.setHorizontalAlignment(SwingConstants.CENTER);
		telf.setBorder(borderTest);
		
		btnsend = new JButton("Crear");
		
		
		container.add(label1);
		container.add(nameTxt);
		container.add(label2);
		container.add(email);
		container.add(label3);
		container.add(age);
		container.add(label4);
		container.add(telf);
		container.add(btnsend);
		this.add(container);
	}

	public JPanel getContainer() {
		return container;
	}

	public void setContainer(JPanel container) {
		this.container = container;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}

	public JLabel getLabel3() {
		return label3;
	}

	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}

	public JLabel getLabel4() {
		return label4;
	}

	public void setLabel4(JLabel label4) {
		this.label4 = label4;
	}

	public JTextField getNameTxt() {
		return nameTxt;
	}

	public void setNameTxt(JTextField nameTxt) {
		this.nameTxt = nameTxt;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getAge() {
		return age;
	}

	public void setAge(JTextField age) {
		this.age = age;
	}

	public JTextField getTelf() {
		return telf;
	}

	public void setTelf(JTextField telf) {
		this.telf = telf;
	}

	public JButton getBtnsend() {
		return btnsend;
	}

	public void setBtnsend(JButton btnsend) {
		this.btnsend = btnsend;
	}

	public Border getBorderTest() {
		return borderTest;
	}

	public void setBorderTest(Border borderTest) {
		this.borderTest = borderTest;
	}
	
}
