
public class HelloWorld {
	//An object is 2 things
	//1.Actions. Methods.
	//2.Attributes. Variables
	private String Name = "Zach";
	
	//Main method 
	public static void main (String[] args)
	{
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}

	//This method says hello when called.
	private void sayHello()
	{
		//prints to the console.
		System.out.println("Hello World");
	}
}