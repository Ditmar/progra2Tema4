package contacts;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ManagementContacts {
	HashMap<String, Contact> table;
	private String path = "C:\\Users\\Lobo_\\programacion2\\Example9\\file\\database.txt";
	public ManagementContacts() {
		table = new HashMap<>();
		readFile();
	}
	//Leemos el archivos 
	public void readFile() {
		try {
			FileReader filereader = new FileReader(this.path);
			BufferedReader bufferreader = new BufferedReader(filereader);
			String data = "";
			while ((data = bufferreader.readLine()) != null) {
				String[] information = data.split("[;]");
				Integer age = Integer.parseInt(information[3]);
				Contact contact = new Contact(information[0], information[1], age, information[3]);
				table.put(contact.getEmail(), contact);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	//añadir contactos al hashMap
	public void storeInHardDisk() {
		try {
			FileOutputStream ouput = new FileOutputStream(this.path);
			PrintStream printFile = new PrintStream(ouput);
			for (Contact newcontact : table.values()) {
				printFile.println(newcontact.getEmail() + 
						";" + newcontact.getName() + 
						";" + newcontact.getPhoneNumber() + 
						";" + newcontact.getAge());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addContact(Contact newcontact) {
		//Insert Into file
		table.put(newcontact.getEmail(), newcontact);
		storeInHardDisk();
	}
	public ArrayList<Contact> searchContact(String name) {
		ArrayList<Contact> result = new ArrayList<>();
		Collection<Contact> list =  table.values();
		for (Contact contact : list) {
			if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(contact);
			}
		}
		return result;
	}
	public Contact removeContact(String email) {
		Contact contact =  table.remove(email);
		storeInHardDisk();
		return contact;
	}
	public void showContacts() {
		Collection<Contact> listContact = table.values();
		Integer number = 1;
		for (Contact contact : listContact) {
			System.out.println(number + ".-)" + contact.getName() 
			+ " Email: " + contact.getEmail() + " " 
			+ " Telefono: " + contact.getPhoneNumber() + " " 
			+ " Edad: " + contact.getAge());
			number++;
		}
 	}
}
