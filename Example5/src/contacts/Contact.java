package contacts;

public class Contact {
	private String email;
	private String name;
	private Integer age;
	private String phoneNumber;
	public Contact(String email, String name, Integer age, String phoneNumber) {
		this.email = email;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
