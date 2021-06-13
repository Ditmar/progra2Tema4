package ui;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import colors.MyColors;

public class MainWindow extends JFrame {
	private JPanel leftPanel;
	private JPanel rigthPanel;
	private JTextField fontField;
	private Border borderTest;
	public MainWindow() {
		super("Ventana Principal");
		borderTest = BorderFactory.createMatteBorder(0, 0, 3, 0, MyColors.thirth);
		
		leftPanel = new JPanel();
		leftPanel.setSize(600, 500);
		leftPanel.setLocation(0, 0);
		//#9b59b6
		//155, 89, 182
		leftPanel.setLayout(null);
		leftPanel.setBackground(MyColors.primary);
		
		this.add(leftPanel);
		
		
		rigthPanel = new JPanel();
		rigthPanel.setSize(400, 500);
		rigthPanel.setLocation(600, 0);
		//#34495e
		//52,73,94
		rigthPanel.setLayout(null);
		rigthPanel.setBackground(MyColors.secondary);
		this.add(rigthPanel);
		//Scroll;
		JScrollPane scroll = new JScrollPane();
		scroll.setSize(250, 300);
		scroll.setLocation((leftPanel.getWidth() - scroll.getWidth()) / 2, 150);
		leftPanel.add(scroll);
		
		//JList
		ArrayList<String> labels = new ArrayList<>();
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts =  ge.getAllFonts();
		for (Integer i = 0; i < fonts.length; i++) {
			labels.add(fonts[i].getFamily());
		}
		JList<Object> list = new JList<>(labels.toArray());
		list.setSize(0, 0);
		list.addListSelectionListener((item) -> {
			String itemName = labels.get(item.getFirstIndex());
			fontField.setText(itemName);
		});
		list.setBackground(MyColors.secondary);
		//list.setLocation((leftPanel.getWidth() - list.getWidth()) / 2, 10);
		
		scroll.getViewport().add(list);
		
		fontField = new JTextField("Nombre de Usuario");
		fontField.setSize(260, 40);
		Integer x = (leftPanel.getWidth() - fontField.getWidth()) / 2;
		Integer y = 0;
		fontField.setLocation(x, y);
		//usernameTextField.setBounds(x, y, WIDTH, HEIGHT);
		fontField.setForeground(MyColors.thirth);
		fontField.setBackground(MyColors.primary);
		fontField.setHorizontalAlignment(SwingConstants.CENTER);
		
		//fontField.setBorder(borderTest);
		leftPanel.add(fontField);
		
		
		
		/*
		 * Jtable
		 * */
		JTable table = new JTable();
		table.setLocation(0, 50);
		table.setSize(400, 600);
		DefaultTableModel model =  (DefaultTableModel)table.getModel();
		Object[] number = {"Nro"};
		Object[] ci = {"Ci"};
		Object[] name = {"Nombre"};
		Object[] lastname = {"Apellido"};
		model.addColumn("Nro", number);
		model.addColumn("Ci", ci);
		model.addColumn("Nombre", name);
		model.addColumn("Apellido", lastname);
		Object[] data1 = {"1", "1234567", "Adrian", "Morales"};
		Object[] data2 = {"2", "6678945", "Maria", "Perez"};
		
		model.addRow(data1);
		model.addRow(data2);
		/*model.setValueAt("Pedro", 1, 2);
		model.removeRow(0);*/
		rigthPanel.add(table);
		this.setLayout(null);
		this.setSize(1000, 500);
		this.setVisible(true);
	}
}
