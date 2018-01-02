class Thing{
	public static final int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	
	//static variable
	public static int count = 0;
	
	//instance variable using count to assign unique ID
	public int id; //good practice is to use private or protected for identification
	
	//constructor no param
	public Thing() {
		
		id = count; //id is incremented each time constructor is run. id can be used as a unique tracker for each Thing() object
		count++;
	}
	
	public void showName(){
		System.out.println("Object id: " + id + ". " + description + ": " + name);
	}
	
	//static method
	public static void showInfo(){
		System.out.println(description);
	}
}

//static variables are often known as class variables due to their association with the class

//Static methods: static variables can be accessed from static classes. Can't access non-static references from static variables

//Instance methods: can access static variables in the same(?) class.  

public class StaticFinal {

	public static void main(String[] args) {
		
		//using description from class directly
		Thing.description = "I am a thing";
//		System.out.println(Thing.description);
		
		Thing.showInfo();//running static method directly from class
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		//count increments after each Thing() is called so the count is up 2
		
		thing1.name = "Ryne";
		thing2.name = "Akina";
		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
	}

}
