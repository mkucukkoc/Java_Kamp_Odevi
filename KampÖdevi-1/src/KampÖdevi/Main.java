package KampÖdevi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student(1, "Mustaf", "Kucukkoc", 381, "Data Minning");
		Instructor instructor =new Instructor(2, "Ali Osman", "Kucukkoc", 325, "Distrubed Systems");
        UserManager manager =new UserManager();
       User[] users= {student,instructor};
        manager.add(instructor);
        manager.add(student);
        manager.addMultiple(users);
	}

}
