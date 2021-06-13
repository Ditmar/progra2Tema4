import java.util.ArrayList;
import java.util.Scanner;

import contacts.Contact;
import contacts.ManagementContacts;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer option = -1;
		ManagementContacts managementContact = new ManagementContacts();
		
		do {
			System.out.println("1.- Añadir Contacto");
			System.out.println("2.- Buscar Contacto");
			System.out.println("3.- Eliminar Contacto");
			System.out.println("4.- Mostrar Todos");
			System.out.println("5.- Salir");
			option = Integer.parseInt(scanner.nextLine());
			switch (option) {
				case 1: {
					System.out.println("Estas creando un Contacto");
					System.out.println("Nombre");
					String name = scanner.nextLine();
					System.out.println("Email");
					String email = scanner.nextLine();
					System.out.println("Edad");
					Integer age = Integer.parseInt(scanner.nextLine());
					System.out.println("Telefono/Celular");
					String phoneNumber = scanner.nextLine();
					Contact contact = new Contact(email, name, age, phoneNumber);
					managementContact.addContact(contact);
					break;
				}
				case 2: {
					//Buscar
					System.out.println("Busca contactos por nombre");
					String name = scanner.nextLine();
					ArrayList<Contact> results = managementContact.searchContact(name);
					Integer number = 1;
					for (Contact contact : results) {
						System.out.println(number + ".-)" + contact.getName() 
						+ " Email: " + contact.getEmail() + " " 
						+ " Telefono: " + contact.getPhoneNumber() + " " 
						+ " Edad: " + contact.getAge());
						number++;
					}
					break;
				}
				case 3: {
					System.out.println("Inserte el email para eliminar el contacto");
					String email = scanner.nextLine();
					Contact contact = managementContact.removeContact(email);
					System.out.println("Se eliminó a:");
					System.out.println(contact.getName() 
					+ " Email: " + contact.getEmail() + " " 
					+ " Telefono: " + contact.getPhoneNumber() + " " 
					+ " Edad: " + contact.getAge());
					break;
				}
				case 4: {
					managementContact.showContacts();
					break;
				}
			}
		} while (option != 5);
		System.out.println("Terminado!");
	}
}
