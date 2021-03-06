package uiControlComponents;

import javax.swing.JPanel;

import contacts.ManagementContacts;
import myevents.OnLoadEventCreate;
import ui.MainWindow;
import uiRegisterContact.RegisterContactComponent;

public class ControlComponent {
	private ControlTemplate template;
	private RegisterContactComponent registerComponent;
	private ManagementContacts contacts;
	private OnLoadEventCreate create;
	public ControlComponent(ManagementContacts contacts) {
		template = new ControlTemplate();
		this.contacts = contacts;
		loadComponents();
		loadEvents();
	}
	public void registerOnEventCreate(OnLoadEventCreate create) {
		this.create = create;
	}
	private void loadComponents() {
		// TODO Auto-generated method stub
		registerComponent = new RegisterContactComponent(this.contacts);
		
	}
	public RegisterContactComponent getRegisterComponent() {
		return registerComponent;
	}
	private void loadEvents() {
		// TODO Auto-generated method stub
		template.getAddContact().addActionListener((e) -> {
			loadComponents();
			registerComponent.registerOnLoad(() -> {
				this.create.call();
			});
			registerComponent.getClass();
		});
	}
	public JPanel getViewPanel() {
		return template;
	}
}
