package KampÖdevi;

public class UserManager {

public void add(User user)
{
System.out.println(user.getFirstName()+"User eklendi..");	
}
public void addMultiple (User[] users) 
{
	for(User user : users) 
		{
		add(user);
		}
}
}
