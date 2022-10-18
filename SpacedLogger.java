
public class SpacedLogger implements Logger {             // Spaced Logger Class that implements the Logger Interface

	
	
	/* #6 & 7
	 * The Log Method should add spaces between each
	 * character of the String argument passed into its
	 * methods.
	 */
	@Override
	public void Log(String str) {						//This is the Log Method and takes a String as an Argument
														
		StringBuilder letters = new StringBuilder(str);	//-->We create a StringBuilder names letters and pass the given String
		int x= str.length();							//-->integer "x" holds the length of the given String
		for (int i = 0; i < x ; i++) {					//-->for loop that runs until i is less than the length of the String
			if(i %2 != 0) {	//Checks for an ODD number    -->The string starts at index 0, an even number. We want the next character(an odd#)
														//to be a space..therefore we want every odd# to be a SPACE
				letters.insert(i, " ");					//at every ODD index, a SPACE will be INSERTED, extending the String.
				x++;									//Since the String is extending by 1 index after each iteration of the forLoop
				}										//we also increase x(length of the string) by one after each iteration.
			}											//
		System.out.println(letters.toString());			//Converts the StringBuilder named "letters" to a real String and prints out 
														//
	}// End of Log Method		

	
	/* #8
	 * The error method should do the same as the Log Method,
	 * but with “ERROR:” preceding the spaced out input
	 */
	@Override
	public void Error(String str) {						//This is the Error Method and takes a String as an Argument
														
		StringBuilder letters = new StringBuilder(str);	 //
		int x= str.length();							 //
		for (int i = 0; i < x ; i++) {					 //This part is the same as the Log method above, that prints
			if(i %2 != 0) {							     //out the given String with spaces in between each character.
				letters.insert(i, " ");					 //
				x++;									 //
				}										
			}											
		System.out.println(letters.insert(0, "ERROR: "));//We add ERROR:_ before the spaced-out given String and Print out
		
	}// End of Error Method

}
