package uiControlComponents;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import colors.MyColors;
import utils.AppDimension;

public class ControlTemplate extends JPanel{
	private JPanel container;
	private JButton addContact;
	private JButton removeContact;
	public ControlTemplate() {
		createInterface();
	}
	private void createInterface() {
		container = new JPanel();
		container.setPreferredSize(new Dimension(AppDimension.sizepanel_rigth_width, AppDimension.sizepanel_rigth_height));
		container.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 5));
		container.setBackground(MyColors.secondary);
		
		addContact = new JButton("Agregar Nuevo Contacto");
		removeContact = new JButton("Eliminar Contacto");
		container.add(addContact);
		container.add(removeContact);
		this.add(container);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public JPanel getContainer() {
		return container;
	}
	public void setContainer(JPanel container) {
		this.container = container;
	}
	public JButton getAddContact() {
		return addContact;
	}
	public void setAddContact(JButton addContact) {
		this.addContact = addContact;
	}
	public JButton getRemoveContact() {
		return removeContact;
	}
	public void setRemoveContact(JButton removeContact) {
		this.removeContact = removeContact;
	}
	
}
