package uiComponents;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import colors.MyColors;
import contacts.Contact;
import utils.AppDimension;

public class ContactsTemplate extends JPanel{
	private JTextField searchTextField;
	private JButton JButtonSearch, styleList, styleGrid;
	private JPanel panelSearch;
	private JPanel panelView;
	private JPanel listContainer;
	private JTable table;
	private Integer numberrow = 1;
	public ContactsTemplate()  {
		createInterface();
	}
	private void createInterface() {
		//Armar los elementos visuales
		//Crear un panel para el textfiel 
		panelSearch = new JPanel();
		panelSearch.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, 30));
		panelSearch.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelSearch.setBackground(MyColors.primary);
		//crear El formulario de busqueda
		searchTextField = new JTextField();
		searchTextField.setPreferredSize(new Dimension(400, 30));
		JButtonSearch = new JButton("Buscar");
		panelSearch.add(searchTextField);
		panelSearch.add(JButtonSearch);
		
		
		panelView = new JPanel();
		panelView.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, 30));;
		panelView.setLayout(new FlowLayout());
		panelView.setBackground(MyColors.primary);
		styleList = new JButton("Ver Lista");
		styleGrid = new JButton("Ver En Grid");
		panelView.add(styleList);
		panelView.add(styleGrid);
		
		listContainer = new JPanel();
		listContainer.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, 100));
		listContainer.setLayout(new FlowLayout());
		listContainer.setBackground(MyColors.primary);
		table = createTable();
		ScrollPane scroll = new ScrollPane();
		scroll.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, 500));
		listContainer.add(scroll.add(table));
		
		
		this.add(panelSearch);
		this.add(panelView);
		this.add(listContainer);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public void addTableData(ArrayList<Contact> dataRow) {
		numberrow = 1;
		DefaultTableModel model =  (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		Object[] number = {"Nro"};
		Object[] email = {"Email"};
		Object[] name = {"Nombre"};
		Object[] age = {"Edad"};	
		Object[] telf = {"Telf."};
		model.setColumnCount(0);
		model.addColumn("Nro", number);
		model.addColumn("Email", email);
		model.addColumn("Nombre", name);
		model.addColumn("Edad", age);
		model.addColumn("Telf.", telf);
		dataRow.forEach((data) -> {
			Object[] row = new Object[5];
			row[0] = numberrow;
			row[1] = data.getEmail();
			row[2] = data.getName();
			row[3] = data.getAge();
			row[4] = data.getPhoneNumber();
			model.addRow(row);
			numberrow++;
		});
	}
	public void addTableData(HashMap<String, Contact> dataRow) {
		numberrow = 1;
		DefaultTableModel model =  (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		Object[] number = {"Nro"};
		Object[] email = {"Email"};
		Object[] name = {"Nombre"};
		Object[] age = {"Edad"};	
		Object[] telf = {"Telf."};
		model.setColumnCount(0);
		model.addColumn("Nro", number);
		model.addColumn("Email", email);
		model.addColumn("Nombre", name);
		model.addColumn("Edad", age);
		model.addColumn("Telf.", telf);
		dataRow.forEach((key, data) -> {
			Object[] row = new Object[5];
			row[0] = numberrow;
			row[1] = data.getEmail();
			row[2] = data.getName();
			row[3] = data.getAge();
			row[4] = data.getPhoneNumber();
			model.addRow(row);
			numberrow++;
		});
	}
	private JTable createTable() {
		JTable table = new JTable();
		table.setLocation(0, 50);
		table.setPreferredSize(new Dimension(AppDimension.sizepanel_left_width, 600));
		return table;
	}
	public JTextField getSearchTextField() {
		return searchTextField;
	}
	public void setSearchTextField(JTextField searchTextFiled) {
		this.searchTextField = searchTextFiled;
	}
	public JButton getJButtonSearch() {
		return JButtonSearch;
	}
	public void setJButtonSearch(JButton jButtonSearch) {
		JButtonSearch = jButtonSearch;
	}
	public JButton getStyleList() {
		return styleList;
	}
	public void setStyleList(JButton styleList) {
		this.styleList = styleList;
	}
	public JButton getStyleGrid() {
		return styleGrid;
	}
	public void setStyleGrid(JButton styleGrid) {
		this.styleGrid = styleGrid;
	}
	public JPanel getPanelSearch() {
		return panelSearch;
	}
	public void setPanelSearch(JPanel panelSearch) {
		this.panelSearch = panelSearch;
	}
	public JPanel getPanelView() {
		return panelView;
	}
	public void setPanelView(JPanel panelView) {
		this.panelView = panelView;
	}
	public JPanel getListContainer() {
		return listContainer;
	}
	public void setListContainer(JPanel listContainer) {
		this.listContainer = listContainer;
	}
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	
}
