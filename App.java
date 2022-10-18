
public class App {
	
	/* #9
	 * Create a class named App that has a main method.
	 */

	public static void main(String[] args) {
		
		
		/* #10 In this class instantiate an instance of each
		of your logger classes that implement the Logger interface.
		   #11 Test both methods on both instances, passing in Strings of your choice.
		   */
		System.out.println("Asterisk Logger Class:");// Cosmetic line
		
		Logger logger1 = new AsteriskLogger();   		//logger1 instantiates Asterisk Logger class which implements the Logger interface
		
		logger1.Log("Car");							//here we call the Log method in the Asterisk Logger class and pass on the String"Car"
		
		System.out.println(); // Line to separate the answers
		
		logger1.Error("Arizona");             //here we call the Error method in the Asterisk Logger class and pass on the String "Arizona"
		
		
		
		System.out.println();//Line to separate the answers
		System.out.println("Spaced Logger Class:"); //Cosmetic line 
		
		Logger logger2 = new SpacedLogger();			// logger2 instantiates Spaced Logger class which implements the Logger interface
		
		logger2.Log("Arizona");  // here we call the Log method in the Spaced Logger class and pass on the String "Arizona"
		logger2.Error("Arizona"); // here we call the Error method in the Spaced Logger class and pass on the String "Arizona"
				
	}

}
