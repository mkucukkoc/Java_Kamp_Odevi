package Kamp÷devi;

public class Instructor extends User {
	 String verdigiDers;

	public Instructor(int id, String firstName, String lastName, int tcNo, String verdigiDers) {
		super(id, firstName, lastName, tcNo);
		this.verdigiDers = verdigiDers;
	}
	public String getVerdigiDers() {
		return verdigiDers;
	}
	public void setVerdigiDers(String verdigiDers) {
		this.verdigiDers = verdigiDers;
	}
}
