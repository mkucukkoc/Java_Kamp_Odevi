package Kamp÷devi;

public class User {
	private int id;
	private String  firstName;
	private String lastName;
	private int tcNo;
	public User(int id, String firstName, String lastName, int tcNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getTcNo() {
		return tcNo;
	}
	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}
}
