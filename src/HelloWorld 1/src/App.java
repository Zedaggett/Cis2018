	//App is the entry point to our application
public class App {
	
	public static void main (String[] args)
	{
		User u1 = new User();
		u1.setFirstName("George");
		u1.setLastName("John");
		u1.setEmail("George@john.com");
		u1.setUserName("Gjohn");
		
		System.out.println(u1.getUserName());
		
		User u2 = new User();
		u2.setFirstName("Zachary");
		u2.setLastName("Daggett");
		u2.setEmail("zach@daggett.com");
		u2.setUserName("Zdaggett");
		
		System.out.println(u2.getUserName());
		
		User u3 = new User();
		u3.setFirstName("Ryan");
		u3.setLastName("Parrish");
		u3.setEmail("ryan@parrish.com");
		u3.setUserName("Rparrish");
		
		System.out.println(u3.getUserName());
		
		User u4 = new User();
		u4.setFirstName("Theo");
		u4.setLastName("LeComte");
		u4.setEmail("theo@lecomte.com");
		u4.setUserName("Tlecomte");
		
		System.out.println(u4.getUserName());
		
		
		User u5 = new User();
		
		
		
		//call a service that returns hundreds of users
		
		//for loop
		for(int x = 0; x < 100; x++)
		{
			System.out.println(x);
		}// increment counter 
	}
	
}
