import java.util.*;
class Address {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String pin;
	private String mobileNo;
	private String email;

	AddressBook(String firstName, String lastName, String city, String state, String pin, String mobileNo,String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
public class Adderess_Book {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Address add[] = new Address[10];
		int count = 0;
		String firstName;
		String lastName;
		String city;
		String state;
		String pin;
		String mobileNo;
		String email;
		int choice=0;

	}
}
