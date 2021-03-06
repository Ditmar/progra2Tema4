package uiComponents;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import contacts.Contact;
import contacts.ManagementContacts;

public class ContactsComponent {
	private ContactsTemplate template;
	private ManagementContacts contacts;
	public ContactsComponent(ManagementContacts contacts) {
		//Crea los objetos Gr?ficos
		template = new ContactsTemplate();
		this.contacts = contacts;
		loadTable();
		loadEvents();
		//Se maneja la l?gica del compoennte
	}
	private void loadEvents() {
		//Busqueda de datos
		template.getSearchTextField().addActionListener((e) -> {
			ArrayList<Contact> result = contacts.searchContact(template.getSearchTextField().getText());
			template.addTableData(result);
		});
		template.getJButtonSearch().addActionListener((e) -> {
			ArrayList<Contact> result = contacts.searchContact(template.getSearchTextField().getText());
			template.addTableData(result);
		});
	}
	public void loadTable() {
		template.addTableData(contacts.getData());
	}
	public JPanel getViewPanel() {
		return template;
	}
}
