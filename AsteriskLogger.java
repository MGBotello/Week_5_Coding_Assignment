
public class AsteriskLogger implements Logger {                // Asterisk Logger Class that implements the Logger Interface

	
	/* #4
	 * The log method should print out the String 
	 * it receives between 3 asterisks on either 
	 * side of the String 
	 */
	
	@Override
	public void Log(String str) {					// Log Method and takes a String as an argument
		System.out.println("***" + str + "***");	// this prints 3 *, then the given String and finally the last 3 *
	}// end of Log Method
	
	
	
	/* #5
	 * The error method on the should print the String 
	 * it receives inside a box of asterisks, with the 
	 * String preceded by the word “ERROR:”.
	 */
	@Override
	public void Error(String str) {								//-->This is the Error Method and takes a String as an Argument
		for (int i = 1; i <=str.length() + 13 ; i++) {			//-->This loop prints out an asterisk a total of 13 plus the length
			System.out.print("*");								//of the String. Its 13 because ***ERROR:_*** is 13 characters
		}														//plus the number of characters on the given string
		System.out.println();// line to separate answers
		System.out.println("***" + "Error: " + str + "***");    //-->Next print are the 3*, followed by ERROR:_, + the given String,
																//followed by the last 3*
		for (int i = 1; i <=str.length() + 13 ; i++) {			//-->  The last Row of asterisks is the same as the firts row 
			System.out.print("*");								//
		}System.out.println();	// Line to separate answers on the console
	}// End of Error Method

}
