package uiRegisterContact;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import contacts.Contact;
import contacts.ManagementContacts;
import myevents.OnLoadTable;

public class RegisterContactComponent {
	RegisterTemplate template;
	ManagementContacts contacts;
	private OnLoadTable event;
	public RegisterContactComponent(ManagementContacts contacts) {
		template = new RegisterTemplate();
		this.contacts = contacts;
		loadEvents();
	}
	public void registerOnLoad(OnLoadTable event) {
		this.event = event;
	}
	private void loadEvents() {
		// TODO Auto-generated method stub
		template.getBtnsend().addActionListener((e) -> {
			//Creamos el OBjeto Contactos
			Contact contac = new Contact(
					template.getEmail().getText().toString(), 
					template.getNameTxt().getText().toString(), 
					Integer.parseInt(template.getAge().getText()), 
					template.getTelf().getText().toString());
			this.contacts.addContact(contac);
			this.event.loadTable();
			JOptionPane.showMessageDialog(template, "Contacto Creado!", "Alerta", 1);
			template.setVisible(false);
			
		});
		
	}
	public JFrame getViewPanel() {
		return template;
	}
}
