package Car;
//Creating an instances of Car object
public class CarInstance {

	public static void main (String[] args) {
		
		//Gathering Car(s) info
		Car c1 = new Car();
		c1.setColor("Yellow");
		c1.setMake("Toyota");
		c1.setModel("Corolla");
		c1.setModel("1991");
		
		Car c2 = new Car();
		c2.setColor("Red");
		c2.setMake("Dodge");
		c2.setModel("Neon");
		c2.setYear("1993");
		
		Car c3 = new Car();
		c3.setColor("Orange");
		c3.setMake("Scion");
		c3.setModel("XD");
		c3.setYear("2008");
		
		Car c4 = new Car();
		c4.setColor("Black");
		c4.setMake("Chevrolet");
		c4.setModel("Impala");
		c4.setYear("2011");
		
		//Printing info to Console
		System.out.println(c1.getColor());
		System.out.println(c1.getMake());
		System.out.println(c1.getModel());
		System.out.println(c1.getYear());
		
		System.out.println(c2.getColor());
		System.out.println(c2.getMake());
		System.out.println(c2.getModel());
		System.out.println(c2.getYear());
		
		System.out.println(c3.getColor());
		System.out.println(c3.getMake());
		System.out.println(c3.getModel());
		System.out.println(c3.getYear());
		
		System.out.println(c4.getColor());
		System.out.println(c4.getMake());
		System.out.println(c4.getModel());
		System.out.println(c4.getYear());
	
	//Loop demonstration
	//Create X variable, give attributes to X
	//Give X a hundreths decimal (x++)
	//Print to console
	for (int x = 0; x < 100; x++) {
		System.out.println(x);
	}
}
}