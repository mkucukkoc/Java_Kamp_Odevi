package Kamp÷devi;

public class Student extends User{

	String aldigiDers;

	public Student(int id, String firstName, String lastName, int tcNo, String aldigiDers) {
		super(id, firstName, lastName, tcNo);
		this.aldigiDers = aldigiDers;
	}
	 public String getAldigiDers() {
		return aldigiDers;
	}

	public void setAldigiDers(String aldigiDers) {
		this.aldigiDers = aldigiDers;
	}

}
